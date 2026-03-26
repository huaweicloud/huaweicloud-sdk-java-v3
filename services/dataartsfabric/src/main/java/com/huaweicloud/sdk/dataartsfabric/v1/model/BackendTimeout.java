package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * - **参数解释**：Ray Service独立Api设置的接口超时时间。 - **约束限制**：不涉及。 - **取值范围**：[0,600000]。 - **默认取值**：60000。
 */
public class BackendTimeout {

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
        sb.append("class BackendTimeout {\n");
        sb.append("}");
        return sb.toString();
    }

}
