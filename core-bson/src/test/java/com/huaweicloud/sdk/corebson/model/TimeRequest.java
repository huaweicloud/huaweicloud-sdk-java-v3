/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocRequest;
import org.bson.BsonWriter;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * TimeRequest
 *
 * @since 2022-11-18
 */
public class TimeRequest extends SdkBsonDocRequest {
    private TimeRequestBody body;

    /**
     * withBody
     *
     * @param body body
     * @return TimeRequest
     */
    public TimeRequest withBody(TimeRequestBody body) {
        this.body = body;
        return this;
    }

    public TimeRequestBody getBody() {
        return body;
    }

    public void setBody(TimeRequestBody body) {
        this.body = body;
    }

    @Override
    protected void encodeBody(CodecRegistry codecRegistry, BsonWriter writer) {
        codecRegistry.get(TimeRequestBody.class).encode(writer, this.getBody(), EncoderContext.builder().build());
    }
}
