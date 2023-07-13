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

import com.huaweicloud.sdk.core.exception.SdkException;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ProgressInputStream extends FilterInputStream {

    private boolean readFlag;
    private final ProgressManager progressManager;
    private final boolean endFlag;

    public ProgressInputStream(InputStream in, ProgressManager progressManager) {
        this(in, progressManager, true);
    }

    public ProgressInputStream(InputStream in, ProgressManager progressManager, boolean endFlag) {
        super(in);
        this.progressManager = progressManager;
        this.endFlag = endFlag;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    protected final void abortWhileThreadIsInterrupted() {
        if (Thread.interrupted()) {
            throw new SdkException("Abort io due to thread interrupted");
        }
    }

    @Override
    public synchronized void mark(int a) {
        abortWhileThreadIsInterrupted();
    }

    @Override
    public synchronized void reset() {
        throw new SdkException("UnRepeatable");
    }

    @Override
    public long skip(long n) throws IOException {
        abortWhileThreadIsInterrupted();
        return super.skip(n);
    }

    @Override
    public int available() throws IOException {
        abortWhileThreadIsInterrupted();
        return super.available();
    }

    @Override
    public void close() throws IOException {
        try {
            super.close();
            abortWhileThreadIsInterrupted();
        } finally {
            if (endFlag) {
                this.progressManager.progressEnd();
            }
        }
    }

    @Override
    public int read() throws IOException {
        abortWhileThreadIsInterrupted();
        return super.read();
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        abortWhileThreadIsInterrupted();
        if (!this.readFlag) {
            this.readFlag = true;
            this.progressManager.progressStart();
        }
        int bytes = super.read(b, off, len);
        this.progressManager.progressChanged(bytes);
        return bytes;
    }

}
