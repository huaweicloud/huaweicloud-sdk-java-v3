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

package com.huaweicloud.sdk.core.exchange;

public class ApiReference {
    private String name;
    private String method;
    private String uri;

    public String getName() {
        return name;
    }

    public ApiReference withName(String name) {
        this.name = name;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public ApiReference withMethod(String method) {
        this.method = method;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public ApiReference withUri(String uri) {
        this.uri = uri;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
