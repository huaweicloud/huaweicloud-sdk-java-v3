/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
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

package com.huaweicloud.sdk.meeting.v1.model;

public enum TenantSceneEnum {

    /**
     * 但租户
     */
    SINGLE_TENANT(0),

    /**
     * APPID鉴权方式
     */
    MULTI_TENANT(1);

    /**
     * Comment for <code>value</code><br>
     * 枚举值
     */
    private final int type;

    private TenantSceneEnum(int type) {
        this.type = type;
    }

    /**
     * <p>获取命令对象值 .</p>
     */
    public int getValue() {
        return type;
    }

    public Integer getIntegerValue() {
        return this.type;
    }
}
