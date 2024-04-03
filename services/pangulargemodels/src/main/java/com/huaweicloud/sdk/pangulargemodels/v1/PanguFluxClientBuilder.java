/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
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

package com.huaweicloud.sdk.pangulargemodels.v1;

import org.springframework.http.HttpHeaders;

import java.util.function.Consumer;

public class PanguFluxClientBuilder {
    private String panguEndpoint;

    private String projectId;

    private String deploymentId;

    private Consumer<HttpHeaders> headersConsumer;

    public PanguFluxClientBuilder withPanguEndpoint(String panguEndpoint) {
        this.panguEndpoint = panguEndpoint;
        return this;
    }

    public PanguFluxClientBuilder withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public PanguFluxClientBuilder withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    public PanguFluxClientBuilder withAuthToken(String authToken) {
        this.headersConsumer = httpHeaders -> {
            httpHeaders.set("x-auth-token", authToken);
            httpHeaders.set("Inference-Type", "stream");
        };
        return this;
    }

    public PanguLargeModelsFluxClient build() {
        return new PanguLargeModelsFluxClient(panguEndpoint, projectId, deploymentId, headersConsumer);
    }
}
