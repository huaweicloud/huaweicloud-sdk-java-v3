package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： Agent状态 **取值范围**: - installed：已安装。 - not_installed：未安装。 - online：在线。 - offline：离线。 - install_failed：安装失败。 - installing：安装中。 - not_online：不在线的（除了在线以外的所有状态，仅作为查询条件）。 
 */
public class AgentStatus {

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
        sb.append("class AgentStatus {\n");
        sb.append("}");
        return sb.toString();
    }

}
