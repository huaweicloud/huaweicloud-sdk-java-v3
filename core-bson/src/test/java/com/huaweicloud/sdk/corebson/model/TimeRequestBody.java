/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import java.time.OffsetDateTime;

/**
 * TimeRequestBody
 *
 * @since 2022-11-18
 */
public class TimeRequestBody {
    private OffsetDateTime time;
    public TimeRequestBody(OffsetDateTime time) {
        this.time = time;
    }

    public OffsetDateTime getTime() {
        return time;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }
}
