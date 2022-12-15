/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocRequest;

import org.bson.BsonWriter;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * BasicRequest
 *
 * @since 2022-11-18
 */
public class BasicRequest extends SdkBsonDocRequest {
    private BasicRequestBody body;

    /**
     * withBody
     *
     * @param body body
     * @return BasicRequest
     */
    public BasicRequest withBody(BasicRequestBody body) {
        this.body = body;
        return this;
    }

    public BasicRequestBody getBody() {
        return body;
    }

    public void setBody(BasicRequestBody body) {
        this.body = body;
    }

    @Override
    protected void encodeBody(CodecRegistry codecRegistry, BsonWriter writer) {
        codecRegistry.get(BasicRequestBody.class).encode(writer, this.getBody(), EncoderContext.builder().build());
    }
}
