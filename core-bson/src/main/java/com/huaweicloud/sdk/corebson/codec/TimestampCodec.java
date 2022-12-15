/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.codec;

import org.bson.BsonReader;
import org.bson.BsonTimestamp;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

import java.sql.Timestamp;

/**
 * TimestampCodec
 *
 * @since 2022-11-18
 */
public class TimestampCodec implements Codec<Timestamp> {
    /**
     * TimestampCodec
     *
     * @param registry registry
     */
    public TimestampCodec(CodecRegistry registry) {}

    @Override
    public void encode(BsonWriter writer, Timestamp value, EncoderContext encoderContext) {
        writer.writeTimestamp(new BsonTimestamp(value.getTime()));
    }

    @Override
    public Timestamp decode(BsonReader reader, DecoderContext decoderContext) {
        return new Timestamp(reader.readTimestamp().getValue());
    }

    @Override
    public Class<Timestamp> getEncoderClass() {
        return Timestamp.class;
    }
}
