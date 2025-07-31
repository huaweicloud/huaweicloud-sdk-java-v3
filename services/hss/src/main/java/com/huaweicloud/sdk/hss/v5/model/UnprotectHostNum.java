package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**: 未防护服务器数 **取值范围**: 0到2147483647 
 */
public class UnprotectHostNum {

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
        sb.append("class UnprotectHostNum {\n");
        sb.append("}");
        return sb.toString();
    }

}
