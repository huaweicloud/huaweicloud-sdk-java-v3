package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpsKeyViewExecuteNodeResult
 */
public class OpsKeyViewExecuteNodeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distributed_id")

    private String distributedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    public OpsKeyViewExecuteNodeResult withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**: 节点ID。 **取值范围**: 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public OpsKeyViewExecuteNodeResult withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**: 节点名称。 **取值范围**: 不涉及。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public OpsKeyViewExecuteNodeResult withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释**: 节点角色。 **取值范围**: - master：主节点。 - slave：备节点。 - secondary：日志节点。 - readreplica：只读节点。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public OpsKeyViewExecuteNodeResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 节点类型。 **取值范围**: - CN：CN组件。 - DN：DN组件。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OpsKeyViewExecuteNodeResult withDistributedId(String distributedId) {
        this.distributedId = distributedId;
        return this;
    }

    /**
     * **参数解释**: 分布ID。 **取值范围**: 不涉及。
     * @return distributedId
     */
    public String getDistributedId() {
        return distributedId;
    }

    public void setDistributedId(String distributedId) {
        this.distributedId = distributedId;
    }

    public OpsKeyViewExecuteNodeResult withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释**: 组件ID。 **取值范围**: 不涉及。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public OpsKeyViewExecuteNodeResult withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * **参数解释**: 描述信息。 **取值范围**: 不涉及。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsKeyViewExecuteNodeResult that = (OpsKeyViewExecuteNodeResult) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.role, that.role) && Objects.equals(this.type, that.type)
            && Objects.equals(this.distributedId, that.distributedId)
            && Objects.equals(this.componentId, that.componentId) && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, nodeName, role, type, distributedId, componentId, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsKeyViewExecuteNodeResult {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    distributedId: ").append(toIndentedString(distributedId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
