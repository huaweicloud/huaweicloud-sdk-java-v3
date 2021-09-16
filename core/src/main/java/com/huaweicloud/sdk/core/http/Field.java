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

import java.util.Optional;

/**
 * @param <ReqT> 字段类型
 * @author HuaweiCloud_SDK
 */
public interface Field<ReqT, FieldT> {
    String getName();

    LocationType getLocation();

    Class<FieldT> getFieldType();

    Class<?> getInnerContainerType();

    FieldExistence getExistence();

    /**
     * 参数是否出现过，对于http query参数，返回内容可能是null值，但是客户确实设置过，
     * 例如一个整型 intValue， 调用方传递intValue= ，这种情况值会被读取为null，通过这个方法，识别是否传递过值。
     *
     * @param request
     * @return
     */
    boolean isValueProvided(ReqT request);

    /**
     * 读取请求中指定字段的值，校验请求参数是否满足 FieldExistence 的限制
     *
     * @param request 请求
     * @return 可为空的字段值
     */
    Optional<FieldT> readValue(ReqT request);

    /**
     * 读取请求中指定字段的值，同时不校验请求参数是否满足 FieldExistence 的限制
     *
     * @param request 请求
     * @return 可为空的字段值
     */
    Optional<FieldT> readValueNoValidation(ReqT request);

    void writeValue(ReqT request, FieldT value, Class<FieldT> clazz);

    /**
     * 内部会做类型校验
     *
     * @param request
     * @param value
     * @param clazz
     */
    void writeValueSafe(ReqT request, Object value, Class<?> clazz);
}
