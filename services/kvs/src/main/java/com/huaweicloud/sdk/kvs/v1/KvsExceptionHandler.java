/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2024. All rights reserved.
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

package com.huaweicloud.sdk.kvs.v1;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.ExceptionHandler;
import com.huaweicloud.sdk.core.exception.SdkErrorMessage;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.http.HttpResponse;
import org.bson.BsonBinaryReader;
import org.bson.BsonReader;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.nio.ByteBuffer;
import java.util.Objects;

import static com.mongodb.MongoClient.getDefaultCodecRegistry;

public class KvsExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (httpResponse.getStatusCode() >= Constants.StatusCode.CLIENT_ERROR) {
            throw ServiceResponseException.mapException(
                    httpResponse.getStatusCode(), parseErrorMessage(httpResponse.getBodyAsBytes(), httpResponse));
        }
    }

    private SdkErrorMessage parseErrorMessage(byte[] buf, HttpResponse httpResponse) {
        if (buf == null) {
            return null;
        }
        BsonReader reader = new BsonBinaryReader(ByteBuffer.wrap(buf, 0, buf.length));
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(pojoCodecProvider)
        );
        SdkErrorMessage sdkErrorMessage = (SdkErrorMessage) decodeBody(codecRegistry, reader);

        if (Objects.isNull(sdkErrorMessage.getRequestId()) && Objects.nonNull(httpResponse.getHeader("X-Request-Id"))) {
            sdkErrorMessage.setRequestId(httpResponse.getHeader("X-Request-Id"));
        }

        return sdkErrorMessage;
    }

    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(SdkErrorMessage.class).decode(reader, DecoderContext.builder().build());
    }
}