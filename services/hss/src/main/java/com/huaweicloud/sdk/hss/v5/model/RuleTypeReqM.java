package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 规则类型 **约束限制**： 必填 **取值范围**： - black_hash：黑hash  **默认取值**： 不涉及 
 */
public class RuleTypeReqM {

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
        sb.append("class RuleTypeReqM {\n");
        sb.append("}");
        return sb.toString();
    }

}
