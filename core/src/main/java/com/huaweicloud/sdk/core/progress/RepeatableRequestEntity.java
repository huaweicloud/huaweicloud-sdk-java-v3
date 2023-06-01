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

import com.huaweicloud.sdk.core.Constants;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

public class RepeatableRequestEntity extends RequestBody implements Closeable {

    private static final Logger logger = LoggerFactory.getLogger(RepeatableRequestEntity.class);

    private final String contentType;
    private long contentLength = -1;

    private final AtomicLong bytesWritten = new AtomicLong(0);
    private InputStream inputStream;

    private static final int WRITE_BUFFER_SIZE = Constants.DEFAULT_CHUNK_SIZE;

    public RepeatableRequestEntity(InputStream is, String contentType, long contentLength) {
        if (is == null) {
            throw new IllegalArgumentException("InputStream cannot be null");
        }
        this.inputStream = is;
        this.contentLength = contentLength;
        this.contentType = contentType;

        if (!(this.inputStream instanceof MayRepeatableInputStream)) {
            this.inputStream = new MayRepeatableInputStream(is, Constants.DEFAULT_WRITE_BUFFER_STREAM);
        }
        this.inputStream.mark(0);
    }

    @Override
    public long contentLength() {
        return this.contentLength;
    }

    public boolean isRepeatable() {
        return this.inputStream == null || this.inputStream.markSupported();
    }

    protected void writeToBIO(BufferedSink out) throws IOException {
        byte[] tmp = new byte[WRITE_BUFFER_SIZE];
        int count;
        if (this.contentLength < 0) {
            count = this.inputStream.read(tmp);
            while (count != -1) {
                bytesWritten.addAndGet(count);
                out.write(tmp, 0, count);
                count = this.inputStream.read(tmp);
            }
        } else {
            // consume no more than length
            long remaining = this.contentLength;
            while (remaining > 0) {
                count = inputStream.read(tmp, 0, (int) Math.min(WRITE_BUFFER_SIZE, remaining));
                if (count == -1) {
                    break;
                }
                out.write(tmp, 0, count);
                bytesWritten.addAndGet(count);
                remaining -= count;
            }
        }
    }

    @Override
    public MediaType contentType() {
        return MediaType.parse(
                this.contentType == null ? Constants.MEDIATYPE.APPLICATION_OCTET_STREAM : this.contentType);
    }

    @Override
    public void writeTo(BufferedSink sink) throws IOException {

        long start = System.currentTimeMillis();
        if (bytesWritten.get() > 0) {
            inputStream.reset();
            bytesWritten.set(0);
        }

        this.writeToBIO(sink);
        if (logger.isInfoEnabled()) {
            logger.info("write data end, cost " + (System.currentTimeMillis() - start) + " ms");
        }
    }

    @Override
    public void close() throws IOException {
        if (this.inputStream != null) {
            this.inputStream.close();
        }
    }

}
