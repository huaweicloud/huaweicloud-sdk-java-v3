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

package com.huaweicloud.sdk.core.impl;

import com.huaweicloud.sdk.core.http.HttpResponse;
import com.huaweicloud.sdk.core.utils.HttpUtils;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author HuaweiCloud_SDK
 */
public class DefaultHttpResponse implements HttpResponse {

    private static final Logger logger = LoggerFactory.getLogger(DefaultHttpResponse.class);

    private final Response response;

    private String strBody;

    private byte[] byteBody;

    private DefaultHttpResponse(Response response) {
        this.response = response;
        try {
            if (shouldReadBody()) {
                strBody = response.body().string();
            } else if (shouldReadBodyAsByte()) {
                byteBody = response.body().bytes();
            }
        } catch (IOException e) {
            logger.error("Read http response body error!", e);
        }
    }

    private boolean shouldReadBody() {
        if (Objects.isNull(response.body())) {
            return false;
        }

        if (Objects.isNull(response.body().contentType()) && response.body().contentLength() <= 0) {
            return false;
        } else {
            return HttpUtils.isTextBasedContentType(response.body().contentType().toString());
        }
    }

    private boolean shouldReadBodyAsByte() {
        if (Objects.isNull(response.body())) {
            return false;
        }

        if (Objects.isNull(response.body().contentType()) && response.body().contentLength() <= 0) {
            return false;
        } else {
            return HttpUtils.isBsonContentType(response.body().contentType().toString());
        }
    }

    static DefaultHttpResponse wrap(Response response) {
        return new DefaultHttpResponse(response);
    }

    @Override
    public int getStatusCode() {
        return response.code();
    }

    @Override
    public String getContentType() {
        return Objects.isNull(response.body()) || Objects.isNull(response.body().contentType())
                ? null
                : response.body().contentType().toString();
    }

    @Override
    public long getContentLength() {
        return Objects.isNull(this.response.body()) || this.response.body().contentLength() < 0
                ? 0
                : this.response.body().contentLength();
    }

    @Override
    public Map<String, List<String>> getHeaders() {
        return DefaultHttpUtils.headersToMap(response.headers());
    }

    @Override
    public String getBodyAsString() {
        return strBody;
    }

    @Override
    public byte[] getBodyAsBytes() {
        return byteBody;
    }

    @Override
    public InputStream getBody() {
        return response.body().byteStream();
    }

    @Override
    public String getHeader(String name) {
        return response.header(name);
    }
}