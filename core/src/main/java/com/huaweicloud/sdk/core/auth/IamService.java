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

package com.huaweicloud.sdk.core.auth;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.utils.ExceptionUtils;
import com.huaweicloud.sdk.core.utils.JsonUtils;

public class IamService {
    public static final String DEFAULT_IAM_ENDPOINT = "https://iam.myhuaweicloud.com";
    private static final String KEYSTONE_LIST_PROJECTS_URI = "/v3/projects";
    private static final String KEYSTONE_LIST_AUTH_DOMAINS_URI = "/v3/auth/domains";

    static class KeystoneListProjectResponse {
        @JsonProperty(value = "projects")
        private List<Project> projects;

        static class Project {
            private String id;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }

        public List<Project> getProjects() {
            return projects;
        }

        public void setProjects(List<Project> projects) {
            this.projects = projects;
        }
    }

    public static HttpRequest getKeystoneListProjectsRequest(String regionId, String iamEndpoint) {
        return HttpRequest.newBuilder()
            .withEndpoint(iamEndpoint)
            .withPath(KEYSTONE_LIST_PROJECTS_URI)
            .withMethod(HttpMethod.GET)
            .addQueryParam("name", Arrays.asList(regionId))
            .build();
    }

    public static String keystoneListProjects(HttpClient httpClient, HttpRequest httpRequest) {
        HttpResponse httpResponse = httpClient.syncInvokeHttp(httpRequest);

        if (httpResponse.getStatusCode() >= 400) {
            throw ServiceResponseException.mapException(httpResponse.getStatusCode(),
                ExceptionUtils.extractErrorMessage(httpResponse));
        }

        KeystoneListProjectResponse response = JsonUtils.toObject(
            httpResponse.getBodyAsString(), KeystoneListProjectResponse.class);
        if (Objects.isNull(response) || Objects.isNull(response.getProjects()) || response.getProjects().size() == 0) {
            throw new SdkException("No project id found.");
        }

        if (response.getProjects().size() == 1) {
            return response.getProjects().get(0).id;
        } else {
            throw new SdkException("Multiple project ids have been returned, "
                + "please specify one when initializing credentials.");
        }
    }

    static class KeystoneListAuthDomainsResponse {
        @JsonProperty(value = "domains")
        private List<Domain> domains;

        static class Domain {
            private String id;
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public List<Domain> getDomains() {
            return domains;
        }

        public void setDomains(List<Domain> domains) {
            this.domains = domains;
        }
    }

    public static HttpRequest getKeystoneListAuthDomainsRequest(String iamEndpoint) {
        return HttpRequest.newBuilder()
            .withEndpoint(iamEndpoint)
            .withPath(KEYSTONE_LIST_AUTH_DOMAINS_URI)
            .withMethod(HttpMethod.GET)
            .build();
    }

    public static String keystoneListAuthDomains(HttpClient httpClient, HttpRequest httpRequest) {
        HttpResponse httpResponse = httpClient.syncInvokeHttp(httpRequest);

        if (httpResponse.getStatusCode() >= 400) {
            throw ServiceResponseException.mapException(httpResponse.getStatusCode(),
                ExceptionUtils.extractErrorMessage(httpResponse));
        }

        KeystoneListAuthDomainsResponse response = JsonUtils.toObject(
            httpResponse.getBodyAsString(), KeystoneListAuthDomainsResponse.class);
        if (Objects.nonNull(response) && Objects.nonNull(response.getDomains()) && response.domains.size() > 0) {
            return response.getDomains().get(0).id;
        } else {
            throw new SdkException("No domain id found.");
        }
    }
}
