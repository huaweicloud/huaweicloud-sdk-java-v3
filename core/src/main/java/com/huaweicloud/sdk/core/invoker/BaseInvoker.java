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

package com.huaweicloud.sdk.core.invoker;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exchange.SdkExchange;
import com.huaweicloud.sdk.core.http.HttpRequestDef;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.Consumer;

/**
 * @param <ReqT>
 * @param <ResT>
 * @param <DerivedT>
 * @author HuaweiCloud_SDK
 */
public class BaseInvoker<ReqT, ResT, DerivedT extends BaseInvoker<ReqT, ResT, DerivedT>> {

    SdkExchange exchange;

    HcClient hcClient;

    HttpRequestDef<ReqT, ResT> meta;

    ReqT req;

    Map<String, String> extraHeader;

    public BaseInvoker(ReqT req, HttpRequestDef<ReqT, ResT> meta, HcClient hcClient) {
        exchange = new SdkExchange().withApiReference(apiReference -> apiReference.withName(meta.getName())
            .withMethod(meta.getMethod().toString())
            .withUri(meta.getUri()));
        this.hcClient = hcClient;
        this.meta = meta;
        this.req = req;
    }

    /**
     * 重新构造一个临时鉴权对象进行重置
     */
    public <T extends ICredential> DerivedT replaceCredentialWhen(Class<T> clazz, Consumer<T> func) {
        ICredential credential = hcClient.getCredential().deepClone();
        if (clazz.isAssignableFrom(credential.getClass())) {
            func.accept((T) credential);
            hcClient = hcClient.overrideCredential(credential);
        }
        return (DerivedT) this;
    }

    /**
     * 在http请求中增加header
     */
    public DerivedT addHeader(String headerKey, String headerValue) {
        if (Objects.isNull(extraHeader)) {
            extraHeader = new TreeMap<>();
        }
        extraHeader.put(headerKey, headerValue);
        return (DerivedT) this;
    }

    public DerivedT withExchange(Consumer<SdkExchange> func) {
        if (Objects.nonNull(func)) {
            func.accept(exchange);
        }
        return (DerivedT) this;
    }

}
