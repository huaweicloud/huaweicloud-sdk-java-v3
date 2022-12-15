/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.codec;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * OffsetDateTimeCodec
 * serialize or deserialize OffsetDateTimeCodec class
 *
 * @since 2022-11-15
 */
public class OffsetDateTimeCodec implements Codec<OffsetDateTime> {
    public OffsetDateTimeCodec(CodecRegistry registry){}

    @Override
    public void encode(BsonWriter writer, OffsetDateTime value, EncoderContext encoderContext) {
        writer.writeDateTime(Timestamp.valueOf(value.toLocalDateTime()).getTime());
    }

    @Override
    public OffsetDateTime decode(BsonReader reader, DecoderContext decoderContext) {
        ZoneOffset offset = OffsetDateTime.now().getOffset();
        LocalDateTime localDateTime = Instant.ofEpochMilli(reader.readDateTime()).atOffset(offset).toLocalDateTime();
        return OffsetDateTime.of(localDateTime, offset);
    }

    @Override
    public Class<OffsetDateTime> getEncoderClass() {
        return OffsetDateTime.class;
    }
}
