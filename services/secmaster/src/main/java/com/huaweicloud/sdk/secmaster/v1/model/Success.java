package com.huaweicloud.sdk.secmaster.v1.model;

import java.util.Objects;

/**
 * **参数解释**: 是否成功 **取值范围**: - true  成功 - false 失败
 */
public class Success {

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
        sb.append("class Success {\n");
        sb.append("}");
        return sb.toString();
    }

}
