package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 是否开启告警通知
 */
public class NotificationEnabled {

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
        sb.append("class NotificationEnabled {\n");
        sb.append("}");
        return sb.toString();
    }

}
