package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * - **参数解释**：客户端ID。 - **约束限制**：不涉及。 - **取值范围**：长度为[1,64]的字母、数字、下划线(_)、中划线(-)、点(.)的组合。 - **默认取值**：null。 
 */
public class ClientId {

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
        sb.append("class ClientId {\n");
        sb.append("}");
        return sb.toString();
    }

}
