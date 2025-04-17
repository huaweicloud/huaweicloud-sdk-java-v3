package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 资源维度，必须以字母开头，多维度用\&quot;,\&quot;分割，只能包含0-9/a-z/A-Z/_/-，每个维度的最大长度为32, 事件告警模板DimensionName为空
 */
public class DimensionNameAllowEmpty {

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
        sb.append("class DimensionNameAllowEmpty {\n");
        sb.append("}");
        return sb.toString();
    }

}
