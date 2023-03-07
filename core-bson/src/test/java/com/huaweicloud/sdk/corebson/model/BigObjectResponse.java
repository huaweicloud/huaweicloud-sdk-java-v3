/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * BigObjectResponse
 *
 * @since 2022-11-18
 */
public class BigObjectResponse extends SdkBsonDocResponse {
    private String bigStr;


    public String getBigStr() {
        return bigStr;
    }

    public void setBigStr(String bigStr) {
        this.bigStr = bigStr;
    }

    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(BigObjectResponse.class).decode(reader, DecoderContext.builder().build());
    }
}
