package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;

/**
 * **参数解释**： 告警阈值的比较条件。 **取值范围**： 只能是&gt;、&#x3D;、&lt;、&gt;&#x3D;、&lt;&#x3D;、!&#x3D;。 
 */
public class ComparisonOperatorResp {

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
        sb.append("class ComparisonOperatorResp {\n");
        sb.append("}");
        return sb.toString();
    }

}
