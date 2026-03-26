package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * - **参数解释**：是否开启Ray Service独立Api功能。 - **约束限制**：不涉及。 - **取值范围**：开启true，关闭false。 - **默认取值**：false。 
 */
public class EnableIndependentApi {

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
        sb.append("class EnableIndependentApi {\n");
        sb.append("}");
        return sb.toString();
    }

}
