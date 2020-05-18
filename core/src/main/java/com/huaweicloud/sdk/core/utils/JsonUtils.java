/*
 * Copyright 2020 Huawei Technologies Co.,Ltd.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.huaweicloud.sdk.core.exception.SdkException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The type Json utils.
 */
public class JsonUtils {

    /**
     *
     */
    private static final Logger logger = LoggerFactory.getLogger(JsonUtils.class);

    /**
     * ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER:
     * 是否允许JSON字符串包含非引号控制字符（值小于32的ASCII字符，包含制表符和换行符）
     * <p>
     * 其他类型解释说明参考：
     * https://fasterxml.github.io/jackson-core/javadoc/2.7/com/fasterxml/jackson/core/JsonParser.Feature.html
     */
    private static ObjectMapper objectMapperIgnoreUnknown = initializeBaseMapper();

    private static ObjectMapper initializeBaseMapper() {
        ObjectMapper mapper = new ObjectMapper()
            //反序列化时未知字段忽略
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
            .configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false)
            .registerModule(new JavaTimeModule())
            .registerModule(new Jdk8Module())
            .setFilterProvider(new SimpleFilterProvider().setFailOnUnknownId(false));

        DeserializationConfig readConfig = mapper.getDeserializationConfig()
            //是否允许JSON字符串包含非引号控制字符
            .with(JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS);

        SerializationConfig writeConfig = mapper.getSerializationConfig()
            //中文统一转换为采用/uxxx的形式
            .with(JsonWriteFeature.ESCAPE_NON_ASCII);
        return mapper.setConfig(readConfig).setConfig(writeConfig);
    }

    public static ObjectMapper getDefaultMapper() {
        return objectMapperIgnoreUnknown;
    }


    /**
     * To json string.
     *
     * @param object the object
     * @return the string
     */
    public static String toJSON(Object object) {
        try {
            return objectMapperIgnoreUnknown.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            logger.error("[Method toJSON] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    public static String toJSON(ObjectMapper mapper, Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            logger.error("[Method toJSON] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * To object t.
     *
     * @param <T>   the type parameter
     * @param json  the json
     * @param clazz the clazz
     * @return the t
     */
    public static <T> T toObject(String json, Class<T> clazz) {
        try {
            return StringUtils.isEmpty(json) ? null : objectMapperIgnoreUnknown.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            logger.error("[Method toObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * To object t.
     *
     * @param <T>  the type parameter
     * @param json the json
     * @param type the clazz
     * @return the t
     */
    public static <T> T toObject(String json, TypeReference<T> type) {
        try {
            return StringUtils.isEmpty(json) ? null : objectMapperIgnoreUnknown.readValue(json, type);
        } catch (JsonProcessingException e) {
            logger.error("[Method toObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> Map<String, T> toMapObject(String json, Class<T> clazz) {
        try {
            return StringUtils.isEmpty(json)
                ? null : objectMapperIgnoreUnknown.readValue(json,
                objectMapperIgnoreUnknown.getTypeFactory().constructMapType(Map.class, String.class, clazz));
        } catch (JsonProcessingException e) {
            logger.error("[Method toListObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * 将一个对象转换成为一个通用的map对象结构
     *
     * @param o
     * @return
     */
    public static Map<String, Object> objectToMap(Object o) {
        return objectToMap(objectMapperIgnoreUnknown, o);
    }

    /**
     * 将一个对象转换成为一个通用的map对象结构
     *
     * @param o
     * @return
     */
    public static Map<String, Object> objectToMap(ObjectMapper mapper, Object o) {
        Objects.requireNonNull(o, "input of objectToMap cannot be null");
        try {
            return mapper.readValue(
                mapper.writeValueAsString(o),
                mapper.getTypeFactory().constructMapType(Map.class, String.class, Object.class));
        } catch (JsonProcessingException e) {
            logger.error("[Method objectToMap] Occur Internal Error", e);
            throw new SdkException(e);
        }
    }

    /**
     * @param json
     * @param clazz
     * @param <T>
     * @return
     * @throws
     */
    public static <T> List<T> toListObject(String json, Class<T> clazz) {
        try {
            return StringUtils.isEmpty(json)
                ? null : objectMapperIgnoreUnknown.readValue(json,
                objectMapperIgnoreUnknown.getTypeFactory().constructParametricType(List.class, clazz));
        } catch (JsonProcessingException e) {
            logger.error("[Method toListObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * To object t.
     *
     * @param <T>   the type parameter
     * @param json  the json
     * @param clazz the clazz
     * @return the t
     */
    public static <T> T toObjectIgnoreUnknown(String json, Class<T> clazz) {
        try {
            return StringUtils.isEmpty(json) ? null : objectMapperIgnoreUnknown.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            logger.error("[Method toObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * To object t.
     * toListObjectIgnoreUnknownByStrict
     *
     * @param <T>  the type parameter
     * @param json the json
     * @param type the clazz
     * @return the t
     */
    public static <T> T toObjectIgnoreUnknown(String json, TypeReference<T> type) {
        try {
            return StringUtils.isEmpty(json) ? null : objectMapperIgnoreUnknown.readValue(json, type);
        } catch (JsonProcessingException e) {
            logger.error("[Method toObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    //------------------below method is strict mode ------------------------

    /**
     * @param json
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T toObjectByStrict(String json, Class<T> clazz) {
        try {
            return StringUtils.isEmpty(json) ? null : objectMapperIgnoreUnknown.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            logger.error("[Method toObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * @param json
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T toObjectByStrict(String json, TypeReference<T> type) {
        try {
            return StringUtils.isEmpty(json) ? null : objectMapperIgnoreUnknown.readValue(json, type);
        } catch (JsonProcessingException e) {
            logger.error("[Method toObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * To object t.
     *
     * @param <T>   the type parameter
     * @param json  the json
     * @param clazz the clazz
     * @return the t
     */
    public static <T> T toObjectIgnoreUnknownByStrict(String json, Class<T> clazz) {
        try {
            return StringUtils.isEmpty(json) ? null : objectMapperIgnoreUnknown.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            logger.error("[Method toObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * To object t.
     *
     * @param <T>  the type parameter
     * @param json the json
     * @param type the clazz
     * @return the t
     */
    public static <T> T toObjectIgnoreUnknownByStrict(String json, TypeReference<T> type) {
        try {
            return StringUtils.isEmpty(json) ? null : objectMapperIgnoreUnknown.readValue(json, type);
        } catch (JsonProcessingException e) {
            logger.error("[Method toObject] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * To list object list.
     *
     * @param <T>   the type parameter
     * @param json  the json
     * @param clazz the clazz
     * @return the list
     */
    public static <T> List<T> toListObjectIgnoreUnknownByStrict(String json, Class<T> clazz) {
        try {
            return StringUtils.isEmpty(json) ? null : objectMapperIgnoreUnknown.readValue(json,
                    objectMapperIgnoreUnknown.getTypeFactory().constructParametricType(List.class, clazz));
        } catch (JsonProcessingException e) {
            logger.error("[Method toListObjectIgnoreUnknownByStrict] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * To object Map<String, Map<String, Object>>.
     *
     * @param json the json
     * @return the Map<String, Map<String, Object>>
     */
    public static Map<String, Map<String, Object>> toStrMapToStrObjMap(String json) {
        return JsonUtils.toObjectIgnoreUnknown(json, new TypeReference<Map<String, Map<String, Object>>>() {
        });
    }

    /**
     * To json string.
     *
     * @param mapperFilterName the mapper filter name
     * @param resultMapper     the result mapper
     * @param exceptPropertys  the except propertys
     * @return the string
     */
    public static String toJSON(String mapperFilterName, Object resultMapper, Set<String> exceptPropertys) {
        try {
            if (exceptPropertys == null) {
                return objectMapperIgnoreUnknown.writeValueAsString(resultMapper);
            } else {
                SimpleBeanPropertyFilter simpleBeanPropertyFilter
                    = SimpleBeanPropertyFilter
                    .serializeAllExcept(exceptPropertys.toArray(new String[exceptPropertys.size()]));//NOPMD
                FilterProvider filterProvider
                    = new SimpleFilterProvider().addFilter(mapperFilterName, simpleBeanPropertyFilter);
                return objectMapperIgnoreUnknown.writer(filterProvider).writeValueAsString(resultMapper);
            }
        } catch (JsonProcessingException e) {
            logger.error("[Method toJSON] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * @param resultMapper
     * @return
     */
    public static byte[] toJSONAsBytes(Object resultMapper) {
        try {
            return objectMapperIgnoreUnknown.writeValueAsBytes(resultMapper);
        } catch (JsonProcessingException e) {
            logger.error("[Method toJSONAsBytes] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    /**
     * To json as bytes byte [ ]. only used by the framework return http-response without Exception
     *
     * @param mapperFilterName the mapper filter name
     * @param resultMapper     the result mapper
     * @param exceptPropertys  the except propertys
     * @return the byte [ ]
     */
    public static byte[] toJSONAsBytes(String mapperFilterName, Object resultMapper, Set<String> exceptPropertys) {
        try {
            if (exceptPropertys == null) {
                return objectMapperIgnoreUnknown.writeValueAsBytes(resultMapper);
            } else {
                SimpleBeanPropertyFilter simpleBeanPropertyFilter
                    = SimpleBeanPropertyFilter
                    .serializeAllExcept(exceptPropertys.toArray(new String[exceptPropertys.size()]));//NOPMD
                FilterProvider filterProvider
                    = new SimpleFilterProvider().addFilter(mapperFilterName, simpleBeanPropertyFilter);
                return objectMapperIgnoreUnknown.writer(filterProvider).writeValueAsBytes(resultMapper);
            }
        } catch (JsonProcessingException e) {
            logger.error("[Method toJSONAsBytes] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

    public static <T> T fromStream(InputStream is, Class<T> clazz) {
        try {
            return objectMapperIgnoreUnknown.readValue(is, clazz);
        } catch (IOException e) {
            logger.error("[Method fromStream] Occur Internal Error {}", e);
            throw new SdkException(e);
        }
    }

}
