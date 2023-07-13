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

package com.huaweicloud.sdk.core.ssl;

import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

/**
 * @author HuaweiCloud_SDK
 */
public class IgnoreSSLVerificationFactory {
    private static final Logger logger = LoggerFactory.getLogger(IgnoreSSLVerificationFactory.class);

    private static final HostnameVerifier HOST_VERIFIER = (hostname, sslSession) -> true;
    private static final X509TrustManager TRUST_ALL_MANAGER = new X509TrustManager() {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) {
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[] {};
        }
    };

    /**
     * The utility class should hide the public constructor
     */
    private IgnoreSSLVerificationFactory() {

    }

    public static X509TrustManager getTrustAllManager() {
        return TRUST_ALL_MANAGER;
    }

    public static HostnameVerifier getHostnameVerifier() {
        return HOST_VERIFIER;
    }

    public static SSLContext getSSLContext() {
        return getSSLContext(RandomUtils.getDefaultSecureRandom());
    }

    public static SSLContext getSSLContext(SecureRandom secureRandom) {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, new TrustManager[] {TRUST_ALL_MANAGER}, secureRandom);
            return sslContext;
        } catch (NoSuchAlgorithmException e) {
            logger.error("Init SSL Context Error", e);
            throw new SdkException("Init SSL Context Error", e);
        } catch (KeyManagementException e) {
            logger.error("Init SSL KeyManagement Error", e);
            throw new SdkException("Init SSL KeyManagement Error", e);
        }
    }

}