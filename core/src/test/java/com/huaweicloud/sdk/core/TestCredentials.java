/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
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
package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;
import org.junit.Assert;
import org.junit.Test;

public class TestCredentials {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNullAk() {
        new BasicCredentials().withAk(null).withSk("sk");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullSk() {
        new GlobalCredentials().withAk("ak").withSk(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullAkSk() {
        new GlobalCredentials().withAk(null).withSk(null);
    }

    @Test
    public void testWithValidAkSk() {
        BasicCredentials credentials = new BasicCredentials().withAk("ak").withSk("sk");
        Assert.assertEquals("ak", credentials.getAk());
        Assert.assertEquals("sk", credentials.getSk());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullAk() {
        BasicCredentials credentials = new BasicCredentials();
        credentials.setAk(null);
        credentials.setSk("sk");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullSk() {
        BasicCredentials credentials = new BasicCredentials();
        credentials.setAk("ak");
        credentials.setSk(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullAkSk() {
        BasicCredentials credentials = new BasicCredentials();
        credentials.setAk(null);
        credentials.setSk(null);
    }

    @Test
    public void testSetValidAkSk() {
        BasicCredentials credentials = new BasicCredentials();
        credentials.setAk("ak");
        credentials.setSk("sk");
        Assert.assertEquals("ak", credentials.getAk());
        Assert.assertEquals("sk", credentials.getSk());
    }
}
