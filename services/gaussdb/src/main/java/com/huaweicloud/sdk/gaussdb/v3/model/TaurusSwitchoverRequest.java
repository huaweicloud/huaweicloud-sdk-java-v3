package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaurusSwitchoverRequest
 */
public class TaurusSwitchoverRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private Boolean force;

    public TaurusSwitchoverRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 只读节点ID，倒换后为主节点。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TaurusSwitchoverRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * **参数解释**：  是否进行强制倒换。强制倒换将导致主节点重启，未提交的事务会被中断，请在业务低峰期执行该操作。  **约束限制**：  不涉及。  **取值范围**：  - true：强制倒换。 - false：普通倒换。  **默认取值**：  false。
     * @return force
     */
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaurusSwitchoverRequest that = (TaurusSwitchoverRequest) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, force);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaurusSwitchoverRequest {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
