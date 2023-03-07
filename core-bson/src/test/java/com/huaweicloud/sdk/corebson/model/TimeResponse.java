/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonDateTime;
import org.bson.BsonReader;
import org.bson.BsonTimestamp;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * TimeResponse
 *
 * @since 2022-11-18
 */
public class TimeResponse extends SdkBsonDocResponse {

    private BsonTimestamp timestamp;
    private BsonDateTime datetime;

    public TimeResponse() {}

    public TimeResponse(BsonTimestamp timestamp, BsonDateTime datetime) {
        this.timestamp = timestamp;
        this.datetime = datetime;
    }

    public BsonDateTime getDatetime() {
        return datetime;
    }
    public void setDatetime(BsonDateTime datetime) {
        this.datetime = datetime;
    }
    public BsonTimestamp getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(BsonTimestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(TimeResponse.class).decode(reader, DecoderContext.builder().build());
    }

}
