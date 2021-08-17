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

import java.util.function.Consumer;

/**
 * @author HuaweiCloud_SDK
 */
public class KeystoneCreateProjectRequestBody {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")
    private KeystoneCreateProjectOption project = null;

    public KeystoneCreateProjectRequestBody withProject(KeystoneCreateProjectOption project) {
        this.project = project;
        return this;
    }

    public KeystoneCreateProjectRequestBody withProject(Consumer<KeystoneCreateProjectOption> projectSetter) {
        if (this.project == null) {
            this.project = new KeystoneCreateProjectOption();
            projectSetter.accept(this.project);
        }

        return this;
    }

    public KeystoneCreateProjectOption getProject() {
        return project;
    }

    public void setProject(KeystoneCreateProjectOption project) {
        this.project = project;
    }

}

