/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.corebson.model;

import org.bson.BsonDateTime;
import org.bson.BsonTimestamp;
import java.util.Objects;

/**
 * TimeRequestBody
 *
 * @since 2022-11-18
 */
public class TimeRequestBody {
    private BsonTimestamp timestamp;
    private BsonDateTime datetime;

    public TimeRequestBody(BsonTimestamp timestamp, BsonDateTime datetime) {
        this.timestamp = timestamp;
        this.datetime = datetime;
    }

    public BsonDateTime getDatetime() {
        return datetime;
    }
    public void setDatetime(BsonDateTime datetime) {
        this.datetime = datetime;
    }
    public BsonTimestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BsonTimestamp timestamp) {
        this.timestamp = timestamp;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        TimeResponse that = (TimeResponse) o;
        return Objects.equals(timestamp, that.getTimestamp()) && Objects.equals(datetime, that.getDatetime());
    }
    @Override
    public int hashCode() {
        return Objects.hash(timestamp, datetime);
    }
}
