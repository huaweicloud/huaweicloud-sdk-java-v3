package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 主机状态 **取值范围**: - ACTIVE：正在运行。 - SHUTOFF：关机。 - BUILDING：创建中。 - ERROR：故障。 
 */
public class HostStatus {

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
        sb.append("class HostStatus {\n");
        sb.append("}");
        return sb.toString();
    }

}
