/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocRequest;

import org.bson.BsonWriter;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * BigObjectRequest
 *
 * @since 2022-11-18
 */
public class BigObjectRequest extends SdkBsonDocRequest {
    private BigObjectRequestBody body;

    /**
     * withbody
     *
     * @param body body
     * @return BigObjectRequest
     */
    public BigObjectRequest withbody(BigObjectRequestBody body) {
        this.body = body;
        return this;
    }

    public BigObjectRequestBody getBody() {
        return body;
    }

    @Override
    protected void encodeBody(CodecRegistry codecRegistry, BsonWriter writer) {
        codecRegistry.get(BigObjectRequestBody.class).encode(writer, this.getBody(), EncoderContext.builder().build());
    }
}
