package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteV2EndpointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force")

    private Boolean force;

    public DeleteV2EndpointRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：**参数解释**：工作空间ID，可通过[获取工作空间ID](aidatalake_02_0044.xml)获取。 **约束限制**：不涉及。  **取值范围**：长度为32-36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public DeleteV2EndpointRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**：端点ID，可通过[查询端点列表](ListV2Endpoints.xml)获取端点ID。 **约束限制**：不涉及。  **取值范围**：长度为32-36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public DeleteV2EndpointRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * **参数解释**：强制删除。 **约束限制**：当配置为true时，不管任何情况强制删除。 **取值范围**：   - true：强制删除。   - false：非强制删除。 **默认取值**：false。
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
        DeleteV2EndpointRequest that = (DeleteV2EndpointRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.force, that.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, endpointId, force);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteV2EndpointRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
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
