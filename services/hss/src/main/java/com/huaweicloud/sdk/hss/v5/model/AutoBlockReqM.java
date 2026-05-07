package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 是否自动阻断告警 **约束限制**： 必填 **取值范围**： - 0：不自动阻断告警 - 1：自动阻断告警  **默认取值**： 不涉及 
 */
public class AutoBlockReqM {

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
        sb.append("class AutoBlockReqM {\n");
        sb.append("}");
        return sb.toString();
    }

}
