package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**: 启用、停用 **约束限制**: 必填 **取值范围**: - 1：启用 - 0：停用  **默认取值**: 不涉及 
 */
public class EnableM {

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
        sb.append("class EnableM {\n");
        sb.append("}");
        return sb.toString();
    }

}
