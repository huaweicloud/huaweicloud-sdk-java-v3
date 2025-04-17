package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 告警屏蔽的更新时间，UNIX时间戳，单位毫秒。
 */
public class NotificationMaskUpdateTime {

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
        sb.append("class NotificationMaskUpdateTime {\n");
        sb.append("}");
        return sb.toString();
    }

}
