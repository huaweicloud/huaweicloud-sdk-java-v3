package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释** 维度名，多个维度按字母序逗号分开 **约束限制** 不涉及 **取值范围** 字符串长度[1,131] **默认取值** 不涉及 
 */
public class MetricDimensionName {

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
        sb.append("class MetricDimensionName {\n");
        sb.append("}");
        return sb.toString();
    }

}
