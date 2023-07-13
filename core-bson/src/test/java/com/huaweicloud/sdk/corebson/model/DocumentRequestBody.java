/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import org.bson.Document;

/**
 * DocumentRequestBody
 *
 * @since 2022-11-18
 */
public class DocumentRequestBody {
    private Document doc;

    public DocumentRequestBody(Document doc) {
        this.doc = doc;
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }
}
