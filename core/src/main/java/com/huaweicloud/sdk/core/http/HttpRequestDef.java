/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
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

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @param <ReqT>
 * @param <ResT>
 * @author HuaweiCloud_SDK
 */
public interface HttpRequestDef<ReqT, ResT> {
    /**
     * Builder of HttpRequestDef
     *
     * @param method http request method
     * @param r request type
     * @param t response type
     * @param <BuilderReqT> BuilderReqT
     * @param <BuilderRespT> BuilderRespT
     * @return .
     */
    static <BuilderReqT, BuilderRespT> Builder<BuilderReqT, BuilderRespT> builder(HttpMethod method,
        Class<BuilderReqT> r, Class<BuilderRespT> t) {
        Builder<BuilderReqT, BuilderRespT> builder = new Builder<>(method, r, t);
        builder.impl.requestClass = r;
        builder.impl.responseClass = t;
        builder.impl.method = method;
        return builder;
    }

    Builder<ReqT, ResT> builder();

    @JsonIgnore
    Class<ResT> getResponseType();

    @JsonIgnore
    HttpMethod getMethod();

    /**
     * Content type could be null
     */
    @JsonIgnore
    String getContentType();

    @JsonIgnore
    String getUri();

    @JsonIgnore
    String getName();

    @JsonIgnore
    List<Field<ReqT, ?>> getRequestFields();

    @JsonIgnore
    <T> Field<ReqT, T> getRequestField(String name);

    boolean hasRequestField(String name);

    @JsonIgnore
    List<Field<ResT, ?>> getResponseFields();

    @JsonIgnore
    Field<ResT, ?> getResponseField(String name);

    boolean hasResponseField(String name);

    class Builder<R, T> {
        Impl<R, T> impl;

        public Builder(HttpMethod method, Class<R> r, Class<T> t) {
            this.impl = new Impl<>();
            impl.requestClass = r;
            impl.responseClass = t;
            impl.method = method;
        }

        public Builder(Impl<R, T> impl) {
            this.impl = impl;
        }

        public HttpRequestDef<R, T> build() {
            // verify path
            impl.requestFields = Collections.unmodifiableList(impl.requestFields);
            impl.requestFieldsMap = impl.requestFields.stream()
                .collect(Collectors.toMap(Field::getName, Function.identity()));
            impl.responseFields = Collections.unmodifiableList(impl.responseFields);
            impl.responseFieldsMap = impl.responseFields.stream()
                .collect(Collectors.toMap(Field::getName, Function.identity()));
            return impl;
        }

        public Builder<R, T> withUri(String path) {
            impl.uri = path;
            return this;
        }

        public Builder<R, T> withName(String name) {
            impl.name = name;
            return this;
        }

        public Builder<R, T> withContentType(String contentType) {
            impl.contentType = contentType;
            return this;
        }

        public <FieldT> Builder<R, T> withRequestField(Field<R, FieldT> field) {
            impl.requestFields.add(field);
            return this;
        }

        public <FieldT> Builder<R, T> withRequestField(String name,
            LocationType locationType,
            FieldExistence existence,
            Class<FieldT> fieldType,
            Consumer<FieldImpl<R, FieldT>> setter) {
            FieldImpl<R, FieldT> field = new FieldImpl<>(name, locationType, existence, fieldType);
            setter.accept(field);
            impl.requestFields.add(field);
            return this;
        }

        public <FieldT> Builder<R, T> withResponseField(Field<T, FieldT> field) {
            impl.responseFields.add(field);
            return this;
        }

        public <FieldT> Builder<R, T> withResponseField(String name, LocationType locationType,
            FieldExistence existence, Class<FieldT> fieldType, Consumer<FieldImpl<T, FieldT>> setter) {
            FieldImpl<T, FieldT> field = new FieldImpl<T, FieldT>(name, locationType, existence, fieldType);
            setter.accept(field);
            impl.responseFields.add(field);
            return this;
        }

        /**
         * 场景：
         * 定义了返回值，但是body是空的，例如返回202的场景。 代码生成工具只生成占位函数，实现在这里定义，减少工具和版本的耦合。
         *
         * @param nameOfCode code name
         * @return .
         */
        public Builder<R, T> withResponseVoidBody(String nameOfCode, BiConsumer<T, VoidBody> writer) {
            return withResponseField(nameOfCode, LocationType.Body, FieldExistence.NULL_IGNORE, VoidBody.class,
                field -> field.withMarshaller(response -> new VoidBody(), writer));
        }
    }

    class Impl<R, T> implements HttpRequestDef<R, T> {
        Class<R> requestClass;

        Class<T> responseClass;

        String name;

        String uri;

        HttpMethod method;

        String contentType;

        List<Field<R, ?>> requestFields = new ArrayList<>();

        Map<String, Field<R, ?>> requestFieldsMap;

        List<Field<T, ?>> responseFields = new ArrayList<>();

        Map<String, Field<T, ?>> responseFieldsMap;

        @Override
        public Class<T> getResponseType() {
            return responseClass;
        }

        @Override
        public HttpMethod getMethod() {
            return method;
        }

        @Override
        public List<Field<R, ?>> getRequestFields() {
            return requestFields;
        }

        @Override
        public String getContentType() {
            return contentType;
        }

        @Override
        public String getUri() {
            return uri;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public <T> Field<R, T> getRequestField(String name) {
            if (requestFieldsMap == null) {
                throw new IllegalAccessError("design issue. never happy");
            }
            Field<R, T> f = (Field<R, T>) requestFieldsMap.get(name);
            Objects.requireNonNull(f,
                "getRequestField name not exist. " + "this function is used for machine usage. so in strict mode");
            return f;
        }

        @Override
        public List<Field<T, ?>> getResponseFields() {
            return responseFields;
        }

        @Override
        public Field<T, ?> getResponseField(String name) {
            if (responseFieldsMap == null) {
                throw new IllegalAccessError("design issue. never happy");
            }
            Field<T, ?> f = responseFieldsMap.get(name);
            Objects.requireNonNull(f,
                "getResponseField " + name + " not exist. this function is used for machine usage. so in strict mode");
            return f;
        }

        @Override
        public boolean hasRequestField(String name) {
            if (requestFieldsMap == null) {
                throw new IllegalAccessError("design issue. never happy");
            }
            return requestFieldsMap.containsKey(name);
        }

        @Override
        public boolean hasResponseField(String name) {
            if (responseFieldsMap == null) {
                throw new IllegalAccessError("design issue. never happy");
            }
            return responseFieldsMap.containsKey(name);
        }

        @Override
        public Builder<R, T> builder() {
            Builder<R, T> builder = new Builder(this);
            return builder;
        }
    }
}
