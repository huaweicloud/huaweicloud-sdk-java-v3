/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

/**
 * BigObjectRequestBody
 *
 * @since 2022-11-18
 */
public class BigObjectRequestBody {
    private String bigStr;

    public BigObjectRequestBody(String bigStr) {
        this.bigStr = bigStr;
    }

    public String getBigStr() {
        return bigStr;
    }

    public void setBigStr(String bigStr) {
        this.bigStr = bigStr;
    }
}
