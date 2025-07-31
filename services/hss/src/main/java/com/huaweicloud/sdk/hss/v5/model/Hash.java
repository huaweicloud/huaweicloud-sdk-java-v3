package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**: 事件白名单SHA256 **约束限制**: 不涉及 **取值范围**: 字符长度0-512位 **默认取值**: 不涉及
 */
public class Hash {

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
        sb.append("class Hash {\n");
        sb.append("}");
        return sb.toString();
    }

}
