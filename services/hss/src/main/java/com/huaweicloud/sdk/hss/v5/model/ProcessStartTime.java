package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**: 进程启动时间 **取值范围**: 最小值0，最大值9223372036854775807 
 */
public class ProcessStartTime {

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
        sb.append("class ProcessStartTime {\n");
        sb.append("}");
        return sb.toString();
    }

}
