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
import com.huaweicloud.sdk.core.auth.SM3AKSKSigner;
import com.huaweicloud.sdk.core.auth.SigningAlgorithm;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.impl.DefaultHttpClient;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * Test the validation of signature with AK/SK
 */
public class TestAKSKSigner {
    private static final String CONTENT_TYPE = "application/json";

    private static final String X_SDK_DATE = "20191115T033655Z";

    private static final String AK = "testAK";

    private static final String SK = "testSK";

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
        Assert.assertEquals("SDK-HMAC-SHA256 "
                        + "Access=testAK, "
                        + "SignedHeaders=content-type;host;x-sdk-date, "
                        + "Signature=1ce02ffed91dfc294aed8863aaf0fec29ccbf2f45ddcca7f120baabddba29782",
                header.get("Authorization"));
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
        Assert.assertEquals("SDK-HMAC-SHA256 Access=testAK, "
                        + "SignedHeaders=content-type;host;x-sdk-date, "
                        + "Signature=756d8ba92a76b376c5cc61caabb5a315233406273c6f1e32ae95923a7ebfddc7",
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
                        + "Credential=testAK/20191115/region-id-1/service, "
                        + "SignedHeaders=content-type;host;x-sdk-date, "
                        + "Signature=f383be0871d77fb7d56d2e6199c6b632dc5628b2f6ef9e50f08c118e8400f0f6",
                derivedHeaders.get("Authorization"));
    }

    @Test
    public void testSM3AKSKSigner() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest.HttpRequestBuilder requestBuilder = HttpRequest.newBuilder();
        requestBuilder
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.GET)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpcs")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .addHeader("head-name", "head-value")
                .addQueryParam("limit", Collections.singletonList("2"))
                .addQueryParam("marker", Collections.singletonList("13551d6b-755d-4757-b956-536f674975c0"));

        Map<String, String> headers = SM3AKSKSigner.sign(requestBuilder.build(), credentials);
        Assert.assertEquals("SDK-HMAC-SM3 Access=testAK, "
                        + "SignedHeaders=content-type;head-name;host;x-sdk-date, "
                        + "Signature=116eb16e71c3f2daeb08eeac73e13ad6963964ad26f696dc9dfbfc41bebafbea",
                headers.get("Authorization"));

        String body = "{\"str\": \"value\", "
                + "\"list\": [\"item1\", \"item2\"], "
                + "\"dict\": {\"k1\": \"v1\", \"k2\": \"v2\"}}";
        headers = SM3AKSKSigner.sign(requestBuilder.withBodyAsString(body).build(), credentials);

        String expected = "SDK-HMAC-SM3 Access=testAK, "
                + "SignedHeaders=content-type;head-name;host;x-sdk-date, "
                + "Signature=b58e5e97cf5f339eb5f8e2ad54aaedc66d1502f57068f28cd45987c7204bfc59";

        Assert.assertEquals(expected, headers.get("Authorization"));

        HttpConfig httpConfig = HttpConfig.getDefaultHttpConfig().withSigningAlgorithm(SigningAlgorithm.HMAC_SM3);
        if (Objects.nonNull(httpConfig.getSigningAlgorithm())) {
            requestBuilder.withSigningAlgorithm(httpConfig.getSigningAlgorithm());
        }
        HttpRequest processAuthRequest = credentials.syncProcessAuthRequest(requestBuilder.build(),
                new DefaultHttpClient(httpConfig));
        Assert.assertEquals(expected, processAuthRequest.getHeader("Authorization"));
    }

    private static <T extends AbstractCredentials<T>> Map<String, String>
    signForDerivedAuth(HttpRequest httpRequest, T credentials) {
        if (AbstractCredentials.DEFAULT_DERIVED_PREDICATE.apply(httpRequest)) {
            return DerivedAKSKSigner.sign(httpRequest, credentials);
        } else {
            return AKSKSigner.sign(httpRequest, credentials);
        }
    }
}
