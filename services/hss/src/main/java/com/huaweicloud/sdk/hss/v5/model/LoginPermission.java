package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**: 是否允许登录 **约束限制**: 不涉及 **取值范围**: - true：是 - false：否  **默认取值**: 不涉及 
 */
public class LoginPermission {

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
        sb.append("class LoginPermission {\n");
        sb.append("}");
        return sb.toString();
    }

}
