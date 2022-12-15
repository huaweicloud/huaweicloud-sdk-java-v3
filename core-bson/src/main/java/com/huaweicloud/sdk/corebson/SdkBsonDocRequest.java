/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson;

import com.huaweicloud.sdk.core.SdkStreamRequest;
import com.huaweicloud.sdk.corebson.codec.CustomCodecProvider;
import org.bson.BsonBinaryWriter;
import org.bson.BsonWriter;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.io.BasicOutputBuffer;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;

/**
 * SdkBsonDocRequest
 *
 * @since 2022-11-18
 */
public abstract class SdkBsonDocRequest extends SdkStreamRequest {
    /**
     * getInputStreamOfBody
     *
     * @return InputStream
     */
    @Override
    public InputStream extractBody() {
        BasicOutputBuffer output = new BasicOutputBuffer();
        BsonWriter writer = new BsonBinaryWriter(output);
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                CodecRegistries.fromProviders(new CustomCodecProvider()),
                getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(pojoCodecProvider)
                );
        encodeBody(codecRegistry, writer);
        return new ByteArrayInputStream(output.getInternalBuffer(),0, output.size());
    }

    /**
     * encodeOutput
     *
     * @param codecRegistry codecRegistry
     * @param writer writer
     */
    protected abstract void encodeBody(CodecRegistry codecRegistry, BsonWriter writer);
}


