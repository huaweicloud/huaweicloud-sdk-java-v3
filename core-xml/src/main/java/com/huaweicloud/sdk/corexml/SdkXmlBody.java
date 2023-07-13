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

package com.huaweicloud.sdk.corexml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.huaweicloud.sdk.core.SdkSerializable;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.utils.StringUtils;

public class SdkXmlBody<T extends SdkXmlBody<T>> implements SdkSerializable<T> {
    @Override
    public String serialize() {
        return XmlUtils.toXML(this);
    }

    @Override
    @SuppressWarnings("unchecked")
    public T deserialize(String xml) {
        if (StringUtils.isEmpty(xml)) {
            return (T) this;
        }
        try {
            return XmlUtils.getDefaultMapper().readerForUpdating(this).readValue(xml);
        } catch (JsonProcessingException e) {
            throw new SdkException("Failed to deserialize", e);
        }
    }
}
