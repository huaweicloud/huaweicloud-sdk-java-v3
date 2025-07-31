package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 用户目录 **取值范围**： 字符长度1-256位 
 */
public class UserHomeDir {

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
        sb.append("class UserHomeDir {\n");
        sb.append("}");
        return sb.toString();
    }

}
