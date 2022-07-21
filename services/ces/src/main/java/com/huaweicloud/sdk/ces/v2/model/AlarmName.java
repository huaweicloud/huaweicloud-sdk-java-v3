package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 告警名称, 只能包含0-9/a-z/A-Z/_/-或汉字，长度1-128
 */
public class AlarmName {

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
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
        sb.append("class AlarmName {\n");
        sb.append("}");
        return sb.toString();
    }

}
