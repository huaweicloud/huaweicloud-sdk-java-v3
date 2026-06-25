package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteNodePoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepool_name")

    private String nodepoolName;

    public DeleteNodePoolRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public DeleteNodePoolRequest withNodepoolName(String nodepoolName) {
        this.nodepoolName = nodepoolName;
        return this;
    }

    /**
     * **参数解释**：节点池名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return nodepoolName
     */
    public String getNodepoolName() {
        return nodepoolName;
    }

    public void setNodepoolName(String nodepoolName) {
        this.nodepoolName = nodepoolName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNodePoolRequest that = (DeleteNodePoolRequest) obj;
        return Objects.equals(this.poolName, that.poolName) && Objects.equals(this.nodepoolName, that.nodepoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolName, nodepoolName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNodePoolRequest {\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    nodepoolName: ").append(toIndentedString(nodepoolName)).append("\n");
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
