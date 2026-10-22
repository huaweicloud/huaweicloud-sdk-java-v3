package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：网络连接的ID。 **取值范围**：长度为1~64的英文、数字、中划线组合。 
 */
public class ConnectionId {

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
        sb.append("class ConnectionId {\n");
        sb.append("}");
        return sb.toString();
    }

}
