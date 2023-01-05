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

import com.huaweicloud.sdk.core.HttpListener;
import com.huaweicloud.sdk.core.auth.SigningAlgorithm;
import com.huaweicloud.sdk.core.utils.RandomUtils;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.internal.Util;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author HuaweiCloud_SDK
 */
public class HttpConfig {
    private static final int DEFAULT_CONNECTION_TIMEOUT = 60;

    private int timeout = DEFAULT_CONNECTION_TIMEOUT;

    private boolean ignoreSSLVerification = false;

    private boolean ignoreRequiredValidation = false;

    private String proxyUsername;

    private String proxyPassword;

    private String proxyHost;

    private int proxyPort;

    private SSLSocketFactory sslSocketFactory;

    private X509TrustManager trustManager;

    private List<HttpListener> httpListeners = new ArrayList<>();

    private SigningAlgorithm signingAlgorithm = SigningAlgorithm.getDefault();

    private SecureRandom secureRandom = RandomUtils.getDefaultSecureRandom();

    private ConnectionPool connectionPool = new ConnectionPool(5, 5L, TimeUnit.MINUTES);

    private ExecutorService executorService = new ThreadPoolExecutor(
            0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS,
            new SynchronousQueue<>(), Util.threadFactory("OkHttp Dispatcher", false));

    private Dispatcher dispatcher = new Dispatcher(executorService);


    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public HttpConfig withTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public HttpConfig withExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public boolean isIgnoreSSLVerification() {
        return this.ignoreSSLVerification;
    }

    public void setIgnoreSSLVerification(boolean ignoreSSLVerification) {
        this.ignoreSSLVerification = ignoreSSLVerification;
    }

    public HttpConfig withIgnoreSSLVerification(boolean ignoreSSLVerification) {
        this.ignoreSSLVerification = ignoreSSLVerification;
        return this;
    }

    public boolean isIgnoreRequiredValidation() {
        return ignoreRequiredValidation;
    }

    public void setIgnoreRequiredValidation(boolean ignoreRequiredValidation) {
        this.ignoreRequiredValidation = ignoreRequiredValidation;
    }

    public HttpConfig withIgnoreRequiredValidation(boolean ignoreRequiredValidation) {
        this.ignoreRequiredValidation = ignoreRequiredValidation;
        return this;
    }

    public String getProxyUsername() {
        return proxyUsername;
    }

    public void setProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
    }

    public HttpConfig withProxyUsername(String proxyUsername) {
        this.proxyUsername = proxyUsername;
        return this;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public HttpConfig withProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
        return this;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public HttpConfig withProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
        return this;
    }

    public int getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
    }

    public HttpConfig withProxyPort(int proxyPort) {
        this.proxyPort = proxyPort;
        return this;
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return sslSocketFactory;
    }

    public void setSSLSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    public HttpConfig withSSLSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
        return this;
    }

    public X509TrustManager getX509TrustManager() {
        return trustManager;
    }

    public void setX509TrustManager(X509TrustManager trustManager) {
        this.trustManager = trustManager;
    }

    public HttpConfig withX509TrustManager(X509TrustManager trustManager) {
        this.trustManager = trustManager;
        return this;
    }

    public static HttpConfig getDefaultHttpConfig() {
        return new HttpConfig();
    }

    public List<HttpListener> getHttpListeners() {
        return httpListeners;
    }

    public void setHttpListeners(List<HttpListener> httpListeners) {
        this.httpListeners = httpListeners;
    }

    public HttpConfig withHttpListeners(List<HttpListener> httpListeners) {
        this.httpListeners = httpListeners;
        return this;
    }

    public HttpConfig addHttpListener(HttpListener httpListener) {
        if (Objects.isNull(httpListener)) {
            return this;
        }
        httpListeners.add(httpListener);
        return this;
    }

    public ConnectionPool getConnectionPool() {
        return connectionPool;
    }

    public void setConnectionPool(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public HttpConfig withConnectionPool(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
        return this;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public HttpConfig withDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
        return this;
    }

    public SigningAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
    }

    public void setSigningAlgorithm(SigningAlgorithm signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    public HttpConfig withSigningAlgorithm(SigningAlgorithm signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    public SecureRandom getSecureRandom() {
        return secureRandom;
    }

    public void setSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
    }

    public HttpConfig withSecureRandom(SecureRandom secureRandom) {
        this.secureRandom = secureRandom;
        return this;
    }
}
