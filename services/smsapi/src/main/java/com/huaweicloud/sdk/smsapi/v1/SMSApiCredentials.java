/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2020-2022. All rights reserved.
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

package com.huaweicloud.sdk.smsapi.v1;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.smsapi.utils.SmsAkSkSigner;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/**
 * Description: 短信数据面接口自定义鉴权算法，不使用IAM鉴权
 * <p>
 * User: HuaweiCloud_SDK
 * Date: 2024/10/29 14:38
 */
public class SMSApiCredentials implements ICredential {
    // ak就是AppKey
    private String ak;

    // sk就是AppSecret
    private String sk;

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.completedFuture(this.syncProcessAuthRequestCustom(httpRequest));

    }

    public HttpRequest syncProcessAuthRequestCustom(HttpRequest httpRequest) {
        HttpRequest.HttpRequestBuilder builder = httpRequest.builder();
        if (!Objects.nonNull(httpRequest.getContentType())) {
            builder.addHeader(Constants.CONTENT_TYPE, Constants.MEDIATYPE.APPLICATION_X_WWW_FORM_URLENCODED);
        }

        Map<String, String> headers = SmsAkSkSigner.sign(httpRequest,
                new BasicCredentials().withAk(ak).withSk(sk));
        builder.addHeaders(headers);
        return builder.build();
    }

    @Override
    public SMSApiCredentials deepClone() {
        return new SMSApiCredentials()
                .withAk(this.ak)
                .withSk(this.sk);
    }

    public SMSApiCredentials withAk(String ak) {
        this.ak = ak;
        return this;
    }

    public SMSApiCredentials withSk(String sk) {
        this.sk = sk;
        return this;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }
}


