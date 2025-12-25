package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAopWorkflowInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_topology")

    private Boolean showTopology;

    public ShowAopWorkflowInstanceRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**: 工作空间ID **取值范围**: 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowAopWorkflowInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 流程实例的ID **约束限制**: 不涉及
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowAopWorkflowInstanceRequest withShowTopology(Boolean showTopology) {
        this.showTopology = showTopology;
        return this;
    }

    /**
     * **参数解释**: 是否查询流程拓扑图的信息 - true 查询 - false 不查询  **约束限制**: 不涉及               **取值范围**: - true - false  **默认值**:  false
     * @return showTopology
     */
    public Boolean getShowTopology() {
        return showTopology;
    }

    public void setShowTopology(Boolean showTopology) {
        this.showTopology = showTopology;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAopWorkflowInstanceRequest that = (ShowAopWorkflowInstanceRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.showTopology, that.showTopology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, instanceId, showTopology);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAopWorkflowInstanceRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    showTopology: ").append(toIndentedString(showTopology)).append("\n");
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
