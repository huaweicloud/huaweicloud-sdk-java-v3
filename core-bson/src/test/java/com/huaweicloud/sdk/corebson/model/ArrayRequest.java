/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocRequest;

import org.bson.BsonWriter;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * ArrayRequest
 *
 * @since 2022-11-18
 */
public class ArrayRequest extends SdkBsonDocRequest {
    private ArrayRequestBody body;

    /**
     * withBody
     *
     * @param body body
     * @return ArrayRequest
     */
    public ArrayRequest withBody(ArrayRequestBody body) {
        this.body = body;
        return this;
    }

    public ArrayRequestBody getBody() {
        return body;
    }

    public void setBody(ArrayRequestBody body) {
        this.body = body;
    }

    @Override
    protected void encodeBody(CodecRegistry codecRegistry, BsonWriter writer) {
        codecRegistry.get(ArrayRequestBody.class).encode(writer, this.getBody(), EncoderContext.builder().build());
    }
}