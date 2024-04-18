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
import com.huaweicloud.sdk.core.auth.ISigningKey;
import com.huaweicloud.sdk.core.auth.P256SHA256Signer;
import com.huaweicloud.sdk.core.auth.SM2SM3Signer;
import com.huaweicloud.sdk.core.auth.SM3AKSKSigner;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

/**
 * Test the validation of signature with AK/SK
 */
public class TestAKSKSigner {
    private static final String CONTENT_TYPE = "application/json";

    private static final String X_SDK_DATE = "20191115T033655Z";

    private static final String AK = "AccessKey";

    private static final String SK = "SecretKey";

    @Test
    public void testHmacSHA256SigningKey() {
        AKSKSigner signer = AKSKSigner.getInstance();
        ISigningKey signingKey = signer.getSigningKey(new BasicCredentials().withAk(AK).withSk(SK));
        byte[] data = "HelloWorld".getBytes(StandardCharsets.UTF_8);
        byte[] sig = signingKey.sign(data);
        Assert.assertTrue(signingKey.verify(sig, data));
    }

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

        Map<String, String> header = AKSKSigner.getInstance().sign(httpRequest, credentials);
        Assert.assertEquals("SDK-HMAC-SHA256 "
                        + "Access=AccessKey, "
                        + "SignedHeaders=host;x-sdk-date, "
                        + "Signature=fd95e7da6f695cfb4cabbb9d6b0968aec155bc576b064835282473539ae9ea1d",
                header.get("Authorization"));
        Assert.assertEquals(header.get("Host"), "service.region.example.com");
    }

    @Test
    public void testAKSKSigner2() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest.HttpRequestBuilder requestBuilder = HttpRequest.newBuilder();
        HttpRequest httpRequest = requestBuilder
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.POST)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpc/123")
                .withBodyAsString("{\"key\":\"value\"}")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .build();

        Map<String, String> header = AKSKSigner.getInstance().sign(httpRequest, credentials);
        Assert.assertEquals("SDK-HMAC-SHA256 "
                        + "Access=AccessKey, "
                        + "SignedHeaders=host;x-sdk-date, "
                        + "Signature=b5649aa774f6cac7437631662f08815fc65c70e40e486df6db2436ce68902771",
                header.get("Authorization"));
        Assert.assertEquals(header.get("Host"), "service.region.example.com");
    }

    @Test
    public void testAKSKSigner3() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest.HttpRequestBuilder requestBuilder = HttpRequest.newBuilder();
        HttpRequest httpRequest = requestBuilder
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.GET)
                .addHeader("Host", "example.com")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .build();

        Map<String, String> header = AKSKSigner.getInstance().sign(httpRequest, credentials);
        Assert.assertEquals("SDK-HMAC-SHA256 "
                        + "Access=AccessKey, "
                        + "SignedHeaders=host;x-sdk-date, "
                        + "Signature=919ad8b75d4ad49da0d377e63ee21c4a7a54b752f6bf2878b4adbe9c19927da6",
                header.get("Authorization"));
        Assert.assertEquals(header.get("Host"), "example.com");
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
        Assert.assertEquals("SDK-HMAC-SHA256 Access=AccessKey, "
                        + "SignedHeaders=host;x-sdk-date, "
                        + "Signature=fbfa53d70fa0dec48f511be2e9e522172f9dca6d56f8856d12d7e575b978d9be",
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
                        + "Credential=AccessKey/20191115/region-id-1/service, "
                        + "SignedHeaders=host;x-sdk-date, "
                        + "Signature=c63981314b17efeca4c2577e3e22ecfd3831e0c87eb87277271e32587207dd2c",
                derivedHeaders.get("Authorization"));
    }

    @Test
    public void testDerivedAKSKSigner2() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest basicRequest = HttpRequest.newBuilder()
                .withEndpoint("https://service.test-region-1.myhuaweicloud.com")
                .withMethod(HttpMethod.POST)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpc/123")
                .withBodyAsString("{\"key\":\"value\"}")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .build();

        Map<String, String> headers = signForDerivedAuth(basicRequest, credentials);
        Assert.assertEquals("SDK-HMAC-SHA256 Access=AccessKey, "
                        + "SignedHeaders=host;x-sdk-date, "
                        + "Signature=f65c535f8f86d95e963fbd795d6d41dbf59e675a8b4ae161356cf8cd93f1ec4c",
                headers.get("Authorization"));

        HttpRequest exclusiveRequest = HttpRequest.newBuilder()
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.POST)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpc/123")
                .withBodyAsString("{\"key\":\"value\"}")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .build();
        credentials.processDerivedAuthParams("service", "region-id-1");

        Map<String, String> derivedHeaders = signForDerivedAuth(exclusiveRequest, credentials);
        Assert.assertEquals("V11-HMAC-SHA256 "
                        + "Credential=AccessKey/20191115/region-id-1/service, "
                        + "SignedHeaders=host;x-sdk-date, "
                        + "Signature=e69d85082ec803f89f2e93b500106ae69cd5667c866d6aa6f3e44fc66558d8fb",
                derivedHeaders.get("Authorization"));
    }

    @Test
    public void testDerivedAKSKSigner3() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest exclusiveRequest = HttpRequest.newBuilder()
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.GET)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpcs")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .addHeader("Host", "example.com")
                .build();
        credentials.processDerivedAuthParams("service", "region-id-1");

        Map<String, String> derivedHeaders = signForDerivedAuth(exclusiveRequest, credentials);
        Assert.assertEquals("V11-HMAC-SHA256 "
                        + "Credential=AccessKey/20191115/region-id-1/service, "
                        + "SignedHeaders=host;x-sdk-date, "
                        + "Signature=5ba93d159e81cf6b1550585721ac2e2223793cee3a06f1c9fb245985608d5d0f",
                derivedHeaders.get("Authorization"));
        Assert.assertEquals("example.com", derivedHeaders.get("Host"));
    }

    @Test
    public void testHmacSM3SigningKey() {
        SM3AKSKSigner signer = SM3AKSKSigner.getInstance();
        ISigningKey signingKey = signer.getSigningKey(new BasicCredentials().withAk(AK).withSk(SK));
        byte[] data = "HelloWorld".getBytes(StandardCharsets.UTF_8);
        byte[] sig = signingKey.sign(data);
        Assert.assertTrue(signingKey.verify(sig, data));
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

        Map<String, String> headers = SM3AKSKSigner.getInstance().sign(requestBuilder.build(), credentials);
        Assert.assertEquals("SDK-HMAC-SM3 Access=AccessKey, "
                        + "SignedHeaders=head-name;host;x-sdk-date, "
                        + "Signature=f3e3163b5eb173f957858427dbec0486c3bf338a3f2b795dab2979bc6724850a",
                headers.get("Authorization"));
    }

    @Test
    public void testSM3AKSKSigner2() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest.HttpRequestBuilder requestBuilder = HttpRequest.newBuilder();
        requestBuilder
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.POST)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpc/123")
                .withBodyAsString("{\"key\":\"value\"}")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .addHeader("head-name", "head-value");

        Map<String, String> headers = SM3AKSKSigner.getInstance().sign(requestBuilder.build(), credentials);
        Assert.assertEquals("SDK-HMAC-SM3 Access=AccessKey, "
                        + "SignedHeaders=head-name;host;x-sdk-date, "
                        + "Signature=62c9f0b539fcaa65dcc9acfc6e52c51e5abc6ede158f9fef336b111c8c1db24b",
                headers.get("Authorization"));
    }

    @Test
    public void testP256SHA256SigningKey() {
        P256SHA256Signer signer = P256SHA256Signer.getInstance();
        ISigningKey signingKey = signer.getSigningKey(new BasicCredentials().withAk(AK).withSk(SK));
        byte[] data = "HelloWorld".getBytes(StandardCharsets.UTF_8);
        byte[] sig = signingKey.sign(data);
        Assert.assertTrue(signingKey.verify(sig, data));
    }

    @Test
    public void testP256SHA256Signer() {
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

        Map<String, String> header = P256SHA256Signer.getInstance().sign(httpRequest, credentials);
        Assert.assertTrue(header.get("Authorization").startsWith("SDK-ECDSA-P256-SHA256"));
        Assert.assertEquals(header.get("Host"), "service.region.example.com");
    }

    @Test
    public void testP256SHA256Signer2() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest.HttpRequestBuilder requestBuilder = HttpRequest.newBuilder();
        HttpRequest httpRequest = requestBuilder
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.POST)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpc/123")
                .withBodyAsString("{\"key\":\"value\"}")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .build();

        Map<String, String> header = P256SHA256Signer.getInstance().sign(httpRequest, credentials);
        Assert.assertTrue(header.get("Authorization").startsWith("SDK-ECDSA-P256-SHA256"));
        Assert.assertEquals(header.get("Host"), "service.region.example.com");
    }

    @Test
    public void testSM2SM3SigningKey() {
        P256SHA256Signer signer = SM2SM3Signer.getInstance();
        ISigningKey signingKey = signer.getSigningKey(new BasicCredentials().withAk(AK).withSk(SK));
        byte[] data = "HelloWorld".getBytes(StandardCharsets.UTF_8);
        byte[] sig = signingKey.sign(data);
        Assert.assertTrue(signingKey.verify(sig, data));
    }

    @Test
    public void testSM2SM3Signer() {
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

        Map<String, String> header = SM2SM3Signer.getInstance().sign(httpRequest, credentials);
        Assert.assertTrue(header.get("Authorization").startsWith("SDK-SM2-SM3"));
        Assert.assertEquals(header.get("Host"), "service.region.example.com");
    }

    @Test
    public void testSM2SM3Signer2() {
        BasicCredentials credentials = new BasicCredentials()
                .withAk(AK)
                .withSk(SK);

        HttpRequest.HttpRequestBuilder requestBuilder = HttpRequest.newBuilder();
        HttpRequest httpRequest = requestBuilder
                .withEndpoint("https://service.region.example.com")
                .withMethod(HttpMethod.POST)
                .withContentType(CONTENT_TYPE)
                .withPath("/v1/77b6a44cba5143ab91d13ab9a8ff44fd/vpc/123")
                .withBodyAsString("{\"key\":\"value\"}")
                .addHeader("X-Sdk-Date", X_SDK_DATE)
                .build();

        Map<String, String> header = SM2SM3Signer.getInstance().sign(httpRequest, credentials);
        Assert.assertTrue(header.get("Authorization").startsWith("SDK-SM2-SM3"));
        Assert.assertEquals(header.get("Host"), "service.region.example.com");
    }

    private static <T extends AbstractCredentials<T>> Map<String, String>
    signForDerivedAuth(HttpRequest httpRequest, T credentials) {
        if (AbstractCredentials.DEFAULT_DERIVED_PREDICATE.apply(httpRequest)) {
            return DerivedAKSKSigner.getInstance().sign(httpRequest, credentials);
        } else {
            return AKSKSigner.getInstance().sign(httpRequest, credentials);
        }
    }
}
