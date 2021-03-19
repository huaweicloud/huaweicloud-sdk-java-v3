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

package com.huaweicloud.sdk.core.exchange;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * @author HuaweiCloud_SDK
 */
public class SdkExchange {
    private ApiReference apiReference;

    private ApiTimer apiTimer;

    private Map<String, Object> attributes;

    public ApiReference getApiReference() {
        return apiReference;
    }

    public SdkExchange withApiReference(Consumer<ApiReference> consumer) {
        if (Objects.isNull(this.apiReference)) {
            this.apiReference = new ApiReference();
        }
        consumer.accept(this.apiReference);
        return this;
    }

    public SdkExchange withApiReference(ApiReference apiReference) {
        this.apiReference = apiReference;
        return this;
    }

    public void setApiReference(ApiReference apiReference) {
        this.apiReference = apiReference;
    }

    public ApiTimer getApiTimer() {
        return apiTimer;
    }

    public SdkExchange withApiTimer(Consumer<ApiTimer> consumer) {
        if (Objects.isNull(this.apiTimer)) {
            this.apiTimer = new ApiTimer();
        }
        consumer.accept(this.apiTimer);
        return this;
    }

    public SdkExchange withApiTimer(ApiTimer apiTimer) {
        this.apiTimer = apiTimer;
        return this;
    }

    public void setApiTimer(ApiTimer apiTimer) {
        this.apiTimer = apiTimer;
    }

    public <T> T getAttribute(String name) {
        return Objects.isNull(attributes) ? null : (T) attributes.get(name);
    }

    public <T> SdkExchange addAttribute(String name, T t) {
        if (Objects.isNull(attributes)) {
            attributes = new HashMap<>();
        }
        this.attributes.put(name, t);
        return this;
    }

}
