package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePlaybookActionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyActionInfo body;

    public UpdatePlaybookActionRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * ID of workspace
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UpdatePlaybookActionRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * version Id value
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public UpdatePlaybookActionRequest withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * ID of action
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public UpdatePlaybookActionRequest withBody(ModifyActionInfo body) {
        this.body = body;
        return this;
    }

    public UpdatePlaybookActionRequest withBody(Consumer<ModifyActionInfo> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyActionInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyActionInfo getBody() {
        return body;
    }

    public void setBody(ModifyActionInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePlaybookActionRequest updatePlaybookActionRequest = (UpdatePlaybookActionRequest) o;
        return Objects.equals(this.workspaceId, updatePlaybookActionRequest.workspaceId)
            && Objects.equals(this.versionId, updatePlaybookActionRequest.versionId)
            && Objects.equals(this.actionId, updatePlaybookActionRequest.actionId)
            && Objects.equals(this.body, updatePlaybookActionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, versionId, actionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePlaybookActionRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
