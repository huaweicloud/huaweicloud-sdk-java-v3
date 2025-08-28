package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeletePoolCascadeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    public DeletePoolCascadeRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释**：后端服务器组ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeletePoolCascadeRequest that = (DeletePoolCascadeRequest) obj;
        return Objects.equals(this.poolId, that.poolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePoolCascadeRequest {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
