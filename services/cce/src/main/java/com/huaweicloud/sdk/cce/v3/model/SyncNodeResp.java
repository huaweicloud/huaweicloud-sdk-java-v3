package com.huaweicloud.sdk.cce.v3.model;

import java.util.Objects;

/**
 * **参数解释**： 固定值\&quot;Sync node success\&quot;，表示同步节点成功。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
 */
public class SyncNodeResp {

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
        sb.append("class SyncNodeResp {\n");
        sb.append("}");
        return sb.toString();
    }

}
