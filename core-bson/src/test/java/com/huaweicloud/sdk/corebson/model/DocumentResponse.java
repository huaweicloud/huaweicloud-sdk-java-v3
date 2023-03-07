/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import com.huaweicloud.sdk.corebson.SdkBsonDocResponse;

import org.bson.BsonReader;
import org.bson.Document;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.configuration.CodecRegistry;

/**
 * DocumentResponse
 *
 * @since 2022-11-18
 */
public class DocumentResponse extends SdkBsonDocResponse {
    private Document doc;

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }
    @Override
    protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
        return codecRegistry.get(DocumentResponse.class).decode(reader, DecoderContext.builder().build());
    }

}
