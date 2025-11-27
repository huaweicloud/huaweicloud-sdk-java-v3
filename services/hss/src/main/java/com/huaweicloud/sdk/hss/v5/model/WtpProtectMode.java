package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**: 防护模式 **约束限制**: 不涉及 **取值范围**: - alarm：告警模式 - block：拦截模式  **默认取值**: alarm 
 */
public class WtpProtectMode {

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
        sb.append("class WtpProtectMode {\n");
        sb.append("}");
        return sb.toString();
    }

}
