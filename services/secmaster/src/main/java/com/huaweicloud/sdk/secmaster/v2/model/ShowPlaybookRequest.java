package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPlaybookRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_id")

    private String playbookId;

    public ShowPlaybookRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowPlaybookRequest withPlaybookId(String playbookId) {
        this.playbookId = playbookId;
        return this;
    }

    /**
     * ID of playbook
     * @return playbookId
     */
    public String getPlaybookId() {
        return playbookId;
    }

    public void setPlaybookId(String playbookId) {
        this.playbookId = playbookId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPlaybookRequest that = (ShowPlaybookRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.playbookId, that.playbookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, playbookId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlaybookRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
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
