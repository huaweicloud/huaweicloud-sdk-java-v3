/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.codec;

import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

import java.sql.Timestamp;
import java.time.OffsetDateTime;

/**
 * OffsetDateTimeCodecProvider
 *
 * @since 2022-11-15
 */
public class CustomCodecProvider implements CodecProvider {
    @Override
    @SuppressWarnings("unchecked")
    public <T> Codec<T> get(Class<T> clazz, CodecRegistry registry) {
        if (clazz == OffsetDateTime.class) {
            return (Codec<T>) new OffsetDateTimeCodec(registry);
        } else if (clazz == Timestamp.class) {
            return (Codec<T>) new TimestampCodec(registry);
        } else {
            // return null when not a provider for the requested class
            return null;
        }
    }
}
