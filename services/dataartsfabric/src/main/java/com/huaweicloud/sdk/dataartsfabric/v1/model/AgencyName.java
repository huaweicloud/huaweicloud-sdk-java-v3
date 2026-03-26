package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * - **参数解释**：授予Ray Service的委托名称。 - **约束限制**：不超过64位。 - **取值范围**：不涉及。 - **默认取值**：null。
 */
public class AgencyName {

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
        sb.append("class AgencyName {\n");
        sb.append("}");
        return sb.toString();
    }

}
