package com.huaweicloud.sdk.modelarts.v1.model;

import java.util.Objects;

/**
 * **参数解释**：工作空间ID。 **约束限制**：不涉及。 **取值范围**：0或长度为32的字符串。 **默认取值**：0。 
 */
public class WorkspaceId {

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
        sb.append("class WorkspaceId {\n");
        sb.append("}");
        return sb.toString();
    }

}
