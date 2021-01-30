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

package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.exchange.SdkExchange;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public interface HttpListener {

    interface RequestListener {
        String httpMethod();

        String uri();

        Map<String, List<String>> headers();

        Optional<String> body();

        SdkExchange exchange();
    }

    interface ResponseListener {
        String httpMethod();

        String uri();

        Map<String, List<String>> headers();

        Optional<String> body();

        int statusCode();

        SdkExchange exchange();
    }

    default void preRequest(RequestListener requestListener) {
    }

    default void postResponse(ResponseListener responseListener) {
    }

    static HttpListener forRequestListener(Consumer<RequestListener> func) {
        return new HttpListener() {
            @Override
            public void preRequest(RequestListener requestListener) {
                func.accept(requestListener);
            }
        };
    }

    static HttpListener forResponseListener(Consumer<ResponseListener> func) {
        return new HttpListener() {
            @Override
            public void postResponse(ResponseListener requestListener) {
                func.accept(requestListener);
            }
        };
    }
}
