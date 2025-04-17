package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 多个指标名称，用逗号隔开
 */
public class MultiMetricName {

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
        sb.append("class MultiMetricName {\n");
        sb.append("}");
        return sb.toString();
    }

}
