/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;

import java.time.OffsetDateTime;

/**
 * TimeResponse
 *
 * @since 2022-11-18
 */
public class TimeResponse extends SdkBsonDocResponse {
    private OffsetDateTime time;

    public OffsetDateTime getTime() {
        return time;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(TimeResponse.class).decode(reader, DecoderContext.builder().build());
    }

    @Override
    protected void fillBody(Object obj) {

    }
}
