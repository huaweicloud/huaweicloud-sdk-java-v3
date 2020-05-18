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

package com.huaweicloud.sdk.core.http;

public class HttpConfig {

    private int timeout = 60;

    private boolean ignoreSSLVerification = false;

    private String proxyUsername;

    private String proxyPassword;

    private String proxyHost;

    private int proxyPort;

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

    public static HttpConfig getDefaultHttpConfig() {
        return new HttpConfig();
    }
}
