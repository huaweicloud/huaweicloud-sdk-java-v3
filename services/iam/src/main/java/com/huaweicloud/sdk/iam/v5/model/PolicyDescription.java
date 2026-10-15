package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 身份策略描述信息。  **约束限制**： 不涉及。  **取值范围**： 长度范围为[0,1000]。  **默认取值**： 不涉及。 
 */
public class PolicyDescription {

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
        sb.append("class PolicyDescription {\n");
        sb.append("}");
        return sb.toString();
    }

}
