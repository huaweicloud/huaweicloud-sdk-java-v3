package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPoolsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaceId")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelSelector")

    private String labelSelector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ListPoolsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。[获取方法请参见[查询工作空间列表](ListWorkspace.xml)。](tag:hc,hk) 未创建工作空间时默认值为“0”，存在创建并使用的工作空间，以实际取值为准。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：0。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListPoolsRequest withLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }

    /**
     * **参数解释**：资源池标签筛选。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return labelSelector
     */
    public String getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
    }

    public ListPoolsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：资源池状态。 **约束限制**：不涉及。 **取值范围**：可选值如下： - created: 创建成功的资源池。 - failed：创建失败的资源池，创建失败的资源池记录保留3天。 - creating：创建中的资源池 **默认取值**：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPoolsRequest that = (ListPoolsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.labelSelector, that.labelSelector) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, labelSelector, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPoolsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
