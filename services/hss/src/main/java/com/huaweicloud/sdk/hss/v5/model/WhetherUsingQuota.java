package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 是否使用病毒查杀按次计费配额 **取值范围**： 0（未使用）、1（已使用） 
 */
public class WhetherUsingQuota {

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
        sb.append("class WhetherUsingQuota {\n");
        sb.append("}");
        return sb.toString();
    }

}
