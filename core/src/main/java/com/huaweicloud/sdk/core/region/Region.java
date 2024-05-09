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

package com.huaweicloud.sdk.core.region;

import java.util.Arrays;
import java.util.List;

/**
 * @author HuaweiCloud_SDK
 */
public class Region {
    private String id;

    private List<String> endpoints;

    public Region(String id, String endpoint) {
        this.id = id;
        this.endpoints = Arrays.asList(endpoint);
    }

    public Region(String id, String... endpoints) {
        this.id = id;
        this.endpoints = Arrays.asList(endpoints);
    }

    public Region() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @deprecated As of 3.1.27, because of the support of the multi-endpoint feature,
     * use {@link #getEndpoints()} instead
     */
    @Deprecated
    public String getEndpoint() {
        return endpoints.isEmpty() ? null : endpoints.get(0);
    }

    /**
     * @deprecated As of 3.1.27, because of the support of the multi-endpoint feature,
     * use {@link #setEndpoints(List<String> endpoints)} instead
     */
    @Deprecated
    public void setEndpoint(String endpoint) {
        if (endpoints.isEmpty()) {
            endpoints.add(endpoint);
        } else {
            endpoints.set(0, endpoint);
        }
    }

    public List<String> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * @deprecated As of 3.1.27, because of the support of the multi-endpoint feature,
     * use {@link #withEndpointsOverride(List<String> endpoints)} instead
     */
    @Deprecated
    public Region withEndpointOverride(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    public Region withEndpointsOverride(List<String> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

}
