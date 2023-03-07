/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson;

import com.huaweicloud.sdk.core.SdkStreamResponse;
import org.bson.BsonBinaryReader;
import org.bson.BsonReader;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.io.BufferedInputStream;
import java.io.InputStream;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;

/**
 * SdkBsonDocResponse
 *
 * @since 2022-11-18
 */
public abstract class SdkBsonDocResponse extends SdkStreamResponse {
    @Override
    public Object parseBody(InputStream input) {
        return getBodyFromInputStream(input);
    }

    /**
     * getBodyFromInputStream
     *
     * @param input http response body
     * @return Object
     */
    public Object getBodyFromInputStream(InputStream input) {
        InputStreamBsonInput bsonInput = new InputStreamBsonInput(new BufferedInputStream(input));
        BsonReader reader = new BsonBinaryReader(bsonInput);
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(pojoCodecProvider)
        );
        return decodeBody(codecRegistry, reader);
    }

    /**
     * decodeInput
     *
     * @param codecRegistry codecRegistry
     * @param reader        reader
     * @return Object
     */
    protected abstract Object decodeBody(CodecRegistry codecRegistry, BsonReader reader);
}
