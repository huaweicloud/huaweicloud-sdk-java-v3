/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import java.util.List;

/**
 * ArrayRequestBody
 *
 * @since 2022-11-18
 */
public class ArrayRequestBody {
    private List<String> strArray;

    public ArrayRequestBody(List<String> strArray) {
        this.strArray = strArray;
    }

    public List<String> getStrArray() {
        return strArray;
    }

    public void setStrArray(List<String> strArray) {
        this.strArray = strArray;
    }
}
