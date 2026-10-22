package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：Endpoint状态。 **取值范围**：   - CREATING：创建中。   - RUNNING：运行中。   - CREATE_FAILED：创建失败。   - DELETING：删除中。   - DELETED：已删除。   - UPDATING：更新中。   - UPDATE_FAILED：更新失败。   - DELETE_FAILED：删除失败。   - FROZEN：冻结。   - TRIAL_ENDED：试用结束。   - ON_DEMAND_FROZEN：按需冻结。 
 */
public class V2EndpointStatus {

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
        sb.append("class V2EndpointStatus {\n");
        sb.append("}");
        return sb.toString();
    }

}
