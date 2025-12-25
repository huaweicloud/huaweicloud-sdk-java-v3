package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowRetrieveScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retrieve_script_id")

    private String retrieveScriptId;

    public ShowRetrieveScriptRequest withWorkspaceId(String workspaceId) {
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

    public ShowRetrieveScriptRequest withRetrieveScriptId(String retrieveScriptId) {
        this.retrieveScriptId = retrieveScriptId;
        return this;
    }

    /**
     * 检索脚本ID
     * @return retrieveScriptId
     */
    public String getRetrieveScriptId() {
        return retrieveScriptId;
    }

    public void setRetrieveScriptId(String retrieveScriptId) {
        this.retrieveScriptId = retrieveScriptId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRetrieveScriptRequest that = (ShowRetrieveScriptRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.retrieveScriptId, that.retrieveScriptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, retrieveScriptId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRetrieveScriptRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    retrieveScriptId: ").append(toIndentedString(retrieveScriptId)).append("\n");
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
