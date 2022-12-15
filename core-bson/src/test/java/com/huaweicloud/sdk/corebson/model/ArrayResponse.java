/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;

import java.util.List;

/**
 * ArrayResponse
 *
 * @since 2022-11-18
 */
public class ArrayResponse extends SdkBsonDocResponse {
    private List<String> strArray;

    public List<String> getStrArray() {
        return strArray;
    }

    public void setStrArray(List<String> strArray) {
        this.strArray = strArray;
    }

    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(ArrayResponse.class).decode(reader, DecoderContext.builder().build());
    }

    @Override
    protected void fillBody(Object obj) {

    }
}
