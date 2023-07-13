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

package com.huaweicloud.sdk.core.progress;

public abstract class ProgressManager {

    protected final long totalBytes;
    protected long  startCheckpoint;
    protected long  lastCheckpoint;
    protected final long intervalBytes;
    protected final ProgressListener progressListener;

    public ProgressManager(long totalBytes, ProgressListener progressListener, long intervalBytes) {
        this.totalBytes = totalBytes;
        this.progressListener = progressListener;
        long now = System.currentTimeMillis();
        this.startCheckpoint = now;
        this.lastCheckpoint = now;
        this.intervalBytes = intervalBytes;
    }

    public void progressStart() {
        long now = System.currentTimeMillis();
        this.startCheckpoint = now;
        this.lastCheckpoint = now;
    }

    public final void progressChanged(int bytes) {
        if (this.progressListener == null || bytes <= 0) {
            return;
        }
        this.doProgressChanged(bytes);
    }

    public abstract void progressEnd();

    protected abstract void doProgressChanged(int bytes);
}
