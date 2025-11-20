package com.huaweicloud.sdk.cce.v3.model;

import java.util.Objects;

/**
 * **参数解释**： 固定值\&quot;Start to batch sync nodes\&quot;，表示批量同步节点成功。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
 */
public class SyncNodesResp {

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
        sb.append("class SyncNodesResp {\n");
        sb.append("}");
        return sb.toString();
    }

}
