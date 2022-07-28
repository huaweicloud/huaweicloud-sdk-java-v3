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

package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.auth.AKSKSigner;
import com.huaweicloud.sdk.core.auth.AbstractCredentials;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.DerivedAKSKSigner;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

/**
 * Test the validation of signature with AK/SK
 */
public class TestAKSKSigner {
    private static final String CONTENT_TYPE = "application/json";

    private static final String X_SDK_DATE = "20191115T033655Z";

    private static final String AK = "QTWAOYTTINDUT2QVKYUC";

    private static final String SK = "MFyfvK41ba2giqM7Uio6PznpdUKGpownRZlmVmHc";

    @Test
    public void testAKSKSigner() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest.HttpRequestBuilder requestBuilder = HttpRequest.newBuilder();
        HttpRequest httpRequest = requestBuilder
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.GET)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpcs")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .addQueryParam("limit", Collections.singletonList("2"))
                .addQueryParam("marker", Collections.singletonList("13551d6b-755d-4757-b956-536f674975c0"))
                .build();

        Map<String, String> header = AKSKSigner.sign(httpRequest, credentials);

        Assert.assertEquals(
                header.get("Authorization"),
                "SDK-HMAC-SHA256 "
                        + "Access=QTWAOYTTINDUT2QVKYUC, "
                        + "SignedHeaders=content-type;host;x-sdk-date, "
                        + "Signature=7be6668032f70418fcc22abc52071e57aff61b84a1d2381bb430d6870f4f6ebe");
        Assert.assertEquals(header.get("Host"), "service.region.example.com");
    }

    @Test
    public void testDerivedAKSKSigner() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest basicRequest = HttpRequest.newBuilder()
                .withEndpoint("https://service.test-region-1.myhuaweicloud.com")
                .withMethod(HttpMethod.GET)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpcs")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .build();

        Map<String, String> headers = signForDerivedAuth(basicRequest, credentials);
        Assert.assertEquals("SDK-HMAC-SHA256 Access=QTWAOYTTINDUT2QVKYUC, "
                        + "SignedHeaders=content-type;host;x-sdk-date, "
                        + "Signature=4a30e690c3032a1975323588d79e858f188834f91df411a47ada7def6ad8081f",
                headers.get("Authorization"));

        HttpRequest exclusiveRequest = HttpRequest.newBuilder()
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.GET)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpcs")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .build();
        credentials.processDerivedAuthParams("service", "region-id-1");
        Map<String, String> derivedHeaders = signForDerivedAuth(exclusiveRequest, credentials);
        Assert.assertEquals("V11-HMAC-SHA256 "
                        + "Credential=QTWAOYTTINDUT2QVKYUC/20191115/region-id-1/service, "
                        + "SignedHeaders=content-type;host;x-sdk-date, "
                        + "Signature=34d69dec633c079bba13e0f72d9788b9431e0291b4a563a3e801c46d10750e29",
                derivedHeaders.get("Authorization"));
    }

    private static Map<String, String> signForDerivedAuth(HttpRequest httpRequest, AbstractCredentials<?> credentials) {
        if (AbstractCredentials.DEFAULT_DERIVED_PREDICATE.apply(httpRequest)) {
            return DerivedAKSKSigner.sign(httpRequest, credentials);
        } else {
            return AKSKSigner.sign(httpRequest, credentials);
        }
    }
}
