/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

/**
 * DocumentRequestBody
 *
 * @since 2022-11-18
 */
public class DocumentRequestBody {
    private BasicType doc;

    public DocumentRequestBody(BasicType doc) {
        this.doc = doc;
    }

    public BasicType getDoc() {
        return doc;
    }

    public void setDoc(BasicType doc) {
        this.doc = doc;
    }
}
