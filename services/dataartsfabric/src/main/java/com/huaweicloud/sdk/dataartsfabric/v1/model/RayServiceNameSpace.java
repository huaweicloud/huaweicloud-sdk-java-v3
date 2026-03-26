package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * - **参数解释**：RayService命名空间。 - **约束限制**：不涉及。 - **取值范围**：长度为16位，均为ray-svc-xxx格式。 - **默认取值**：null。 
 */
public class RayServiceNameSpace {

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
        sb.append("class RayServiceNameSpace {\n");
        sb.append("}");
        return sb.toString();
    }

}
