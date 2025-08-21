package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 资源维度。 **约束限制**： 事件告警模板dimension_name为空。 **取值范围**： 必须以字母开头，多维度用\&quot;,\&quot;分割，只能包含0-9/a-z/A-Z/_/-，每个维度的最大长度为32。字符串最大长度为131。 **默认取值**： 不涉及。 
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
