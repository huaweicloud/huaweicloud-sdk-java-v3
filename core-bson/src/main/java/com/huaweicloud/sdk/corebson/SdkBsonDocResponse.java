/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson;

import com.huaweicloud.sdk.core.SdkStreamResponse;
import com.huaweicloud.sdk.corebson.codec.CustomCodecProvider;
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
    public void parseBody(InputStream input) {
        Object obj = getBodyFromInputStream(input);
        fillBody(obj);
    }

    /**
     * 子类实现fillBody方法，set自己的body值
     * @param obj
     */
    protected abstract void fillBody(Object obj);

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
                CodecRegistries.fromProviders(new CustomCodecProvider()),
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
