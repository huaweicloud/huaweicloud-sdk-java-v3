package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**: 指标维度, 多维度逗号分隔。。 **取值范围**: 必须以字母开头，只能包含0-9/a-z/A-Z/_/-/,。每个维度必须以字母开头，每个维度长度最短1，最长32，多个维度直接用,分割。 
 */
public class MetricDimensionStrResp {

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
        sb.append("class MetricDimensionStrResp {\n");
        sb.append("}");
        return sb.toString();
    }

}
