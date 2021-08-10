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

package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** @author HuaweiCloud_SDK */
public class Project {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_domain")
    private Boolean isDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")
    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")
    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")
    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")
    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")
    private String name;

    public Project withIsDomain(Boolean isDomain) {
        this.isDomain = isDomain;
        return this;
    }

    /** false.
     *
     * @return isDomain */
    public Boolean getIsDomain() {
        return isDomain;
    }

    public void setIsDomain(Boolean isDomain) {
        this.isDomain = isDomain;
    }

    public Project withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 项目描述信息。
     *
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Project withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /** 项目是否可用。
     *
     * @return enabled */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Project withId(String id) {
        this.id = id;
        return this;
    }

    /** 项目ID。
     *
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Project withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /** 如果查询自己创建的项目，则此处返回所属区域的项目ID。 如果查询的是系统内置项目，如cn-north-4，则此处返回账号ID。
     *
     * @return parentId */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Project withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 项目所属账号ID。
     *
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Project withName(String name) {
        this.name = name;
        return this;
    }

    /** 项目名称。
     *
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
