package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：联邦名称。 **约束限制**：不涉及。 **取值范围**：长度为1~63个字符。 **默认取值**：不涉及。
 */
public class FederationName {

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
        sb.append("class FederationName {\n");
        sb.append("}");
        return sb.toString();
    }

}
