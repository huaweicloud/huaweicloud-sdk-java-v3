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

package com.huaweicloud.sdk.core.http;

import com.huaweicloud.sdk.core.exception.SdkException;

import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * @param <R>
 * @param <FieldT>
 */
public class FieldImpl<R, FieldT> implements Field<R, FieldT> {
    String name;
    LocationType locationType;
    FieldExistence existence;
    Class<FieldT> fieldType;
    Function<R, Boolean> isValueProvidedFunc;
    Function<R, FieldT> valueReader;
    BiConsumer<R, FieldT> writer;
    Class<?> innerContainerType;

    public FieldImpl(String name, LocationType locationType, FieldExistence existence, Class<FieldT> fieldType) {
        this.name = Objects.requireNonNull(name, "name cannot be null");
        this.locationType = Objects.requireNonNull(locationType, "locationType cannot be null");
        this.existence = Objects.requireNonNull(existence, "existence cannot be null");
        this.fieldType = Objects.requireNonNull(fieldType, "fieldType cannot be null");
        this.isValueProvidedFunc = null;
        this.valueReader = null;
        this.writer = null;
    }

    public <T> FieldImpl<R, FieldT> withInnerContainerType(Class<T> innerContainerType) {
        this.innerContainerType = innerContainerType;
        return this;
    }

    public FieldImpl<R, FieldT> withReader(Function<R, FieldT> valueReader) {
        Objects.requireNonNull(valueReader, "valueReader cannot be null");
        this.valueReader = valueReader;
        return this;
    }

    public FieldImpl<R, FieldT> withWriter(BiConsumer<R, FieldT> writer) {
        this.writer = writer;
        return this;
    }

    public FieldImpl<R, FieldT> withMarshaller(Function<R, FieldT> valueReader, BiConsumer<R, FieldT> writer) {
        return this.withReader(valueReader).withWriter(writer);
    }

    public FieldImpl<R, FieldT> withValueProvideTest(Function<R, Boolean> valuePresenceTester) {
        this.isValueProvidedFunc = valuePresenceTester;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocationType getLocation() {
        return locationType;
    }

    @Override
    public FieldExistence getExistence() {
        return existence;
    }

    @Override
    public Optional<FieldT> readValue(R request) {
        FieldT value = valueReader.apply(request);
        if (value == null) {
            if (existence == FieldExistence.NULL_IGNORE) {
                return Optional.empty();
            } else {
                throw new SdkException("request field " + name + " read null value. existence is: "
                    + existence.toString());
            }
        } else {
            if (existence == FieldExistence.NON_NULL_NON_EMPTY
                && value.getClass() == String.class && ((String) value).isEmpty()) {
                throw new SdkException("request field " + name + " read empty value. not allowed by "
                    + existence.toString());
            }
            return Optional.of(value);
        }
    }

    @Override
    public boolean isValueProvided(R request) {
        if (isValueProvidedFunc != null) {
            return isValueProvidedFunc.apply(request);
        } else {
            throw new SdkException("isValueProvided bad call");
        }
    }

    @Override
    public void writeValue(R request, FieldT value, Class<FieldT> clazz) {
        // 由于可能存在外部转型，因此输入类型并不能完全值得信任
        writeValueSafe(request, value, clazz);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void writeValueSafe(R request, Object value, Class<?> clazz) {
        if (fieldType.isAssignableFrom(clazz)) {
            writer.accept(request, (FieldT) value);
        } else {
            FieldT enumValue = tryFindEnumField(request, value, clazz)
                .orElseThrow(() ->
                    new SdkException("input value " + value + " with class "
                        + clazz.getSimpleName()
                        + " is not compatible with expected class "
                        + fieldType.getSimpleName()));
            writer.accept(request, enumValue);
        }
    }

    /**
     * 如果客户端请求对应到服务端的path变量定义为enum，则会走到这个分支。允许这种兼容
     *
     * @param request 最终提交给服务器的request包装对象
     * @param value   取值
     * @param clazz   输入的取值的类型
     * @param <T>     输入取值类型参数
     * @return 如果是enum且匹配上了值，则返回匹配的enum field，否则返回empty。
     */
    private <T> Optional<FieldT> tryFindEnumField(R request, Object value, Class<T> clazz) {
        if (fieldType.isEnum() && clazz.isAssignableFrom(String.class)) {
            FieldT[] enumValues = fieldType.getEnumConstants();
            if (enumValues != null) {
                for (FieldT enumValue : enumValues) {
                    if (enumValue.toString().equals(value)) {
                        return Optional.of(enumValue);
                    }
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public Class<FieldT> getFieldType() {
        return fieldType;
    }

    @Override
    public Class<?> getInnerContainerType() {
        return this.innerContainerType;
    }

}
