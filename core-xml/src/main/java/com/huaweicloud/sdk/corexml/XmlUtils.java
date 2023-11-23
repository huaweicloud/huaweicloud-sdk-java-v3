/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
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

package com.huaweicloud.sdk.corexml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Json utils.
 *
 * @author HuaweiCloud_SDK
 */
public final class XmlUtils {
    private static final Logger logger = LoggerFactory.getLogger(XmlUtils.class);

    private static final ObjectMapper OBJECT_MAPPER_IGNORE_UNKNOWN = initializeBaseMapper();

    private XmlUtils() {
    }

    private static ObjectMapper initializeBaseMapper() {
        JacksonXmlModule xmlModule = new JacksonXmlModule();
        xmlModule.setDefaultUseWrapper(false);

        ObjectMapper mapper = new XmlMapper(xmlModule).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                        false)
                .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                .configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .registerModule(new JavaTimeModule())
                .registerModule(new Jdk8Module())
                .setFilterProvider(new SimpleFilterProvider().setFailOnUnknownId(false));

        DeserializationConfig readConfig = mapper.getDeserializationConfig()
                .with(JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS);

        SerializationConfig writeConfig = mapper.getSerializationConfig().with(JsonWriteFeature.ESCAPE_NON_ASCII);
        return mapper.setConfig(readConfig).setConfig(writeConfig);
    }

    public static ObjectMapper getDefaultMapper() {
        return OBJECT_MAPPER_IGNORE_UNKNOWN;
    }

    public static String toXML(Object object) {
        try {
            return OBJECT_MAPPER_IGNORE_UNKNOWN.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            logger.error("[Method toXML] Internal Error occurs: ", e);
            throw new SdkException(e);
        }
    }

    public static <T> T toObject(String xml, Class<T> clazz) {
        try {
            return StringUtils.isEmpty(xml) ? null : OBJECT_MAPPER_IGNORE_UNKNOWN.readValue(xml, clazz);
        } catch (JsonProcessingException e) {
            logger.error("[Method toObject] Internal Error occurs: ", e);
            throw new SdkException(e);
        }
    }

}
