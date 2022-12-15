/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocRequest;

import org.bson.BsonWriter;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * DocumentRequest
 *
 * @since 2022-11-18
 */
public class DocumentRequest extends SdkBsonDocRequest {
    private DocumentRequestBody body;

    /**
     * withBody
     *
     * @param body body
     * @return DocumentRequest
     */
    public DocumentRequest withBody(DocumentRequestBody body) {
        this.body = body;
        return this;
    }

    public DocumentRequestBody getBody() {
        return body;
    }

    public void setBody(DocumentRequestBody body) {
        this.body = body;
    }

    @Override
    protected void encodeBody(CodecRegistry codecRegistry, BsonWriter writer) {
        codecRegistry.get(DocumentRequestBody.class).encode(writer, this.getBody(), EncoderContext.builder().build());
    }
}
