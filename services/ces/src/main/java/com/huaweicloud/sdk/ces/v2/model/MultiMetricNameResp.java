package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释** 多个指标名称 **取值范围** 长度为[1,1080]个字符，多个指标名称之间用逗号隔开 
 */
public class MultiMetricNameResp {

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
        sb.append("class MultiMetricNameResp {\n");
        sb.append("}");
        return sb.toString();
    }

}
