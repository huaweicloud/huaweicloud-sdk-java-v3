package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteMessageNotificationPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_policy_id")

    private String messagePolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public DeleteMessageNotificationPolicyRequest withMessagePolicyId(String messagePolicyId) {
        this.messagePolicyId = messagePolicyId;
        return this;
    }

    /**
     * 消息通知策略ID
     * @return messagePolicyId
     */
    public String getMessagePolicyId() {
        return messagePolicyId;
    }

    public void setMessagePolicyId(String messagePolicyId) {
        this.messagePolicyId = messagePolicyId;
    }

    public DeleteMessageNotificationPolicyRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Workspace的ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteMessageNotificationPolicyRequest that = (DeleteMessageNotificationPolicyRequest) obj;
        return Objects.equals(this.messagePolicyId, that.messagePolicyId)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messagePolicyId, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMessageNotificationPolicyRequest {\n");
        sb.append("    messagePolicyId: ").append(toIndentedString(messagePolicyId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
