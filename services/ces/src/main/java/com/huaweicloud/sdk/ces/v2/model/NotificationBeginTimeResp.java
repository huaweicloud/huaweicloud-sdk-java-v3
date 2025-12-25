package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 告警通知开启时间。如 00:00    **取值范围**： 只能包含数字、“:”，长度为[1,64]个字符。 
 */
public class NotificationBeginTimeResp {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationBeginTimeResp {\n");
        sb.append("}");
        return sb.toString();
    }

}
