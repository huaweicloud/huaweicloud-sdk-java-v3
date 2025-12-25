package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRetrieveScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retrieve_script_id")

    private String retrieveScriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateRetrieveScriptRequestBody body;

    public UpdateRetrieveScriptRequest withWorkspaceId(String workspaceId) {
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

    public UpdateRetrieveScriptRequest withRetrieveScriptId(String retrieveScriptId) {
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

    public UpdateRetrieveScriptRequest withBody(UpdateRetrieveScriptRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateRetrieveScriptRequest withBody(Consumer<UpdateRetrieveScriptRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateRetrieveScriptRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateRetrieveScriptRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateRetrieveScriptRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRetrieveScriptRequest that = (UpdateRetrieveScriptRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.retrieveScriptId, that.retrieveScriptId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, retrieveScriptId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRetrieveScriptRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    retrieveScriptId: ").append(toIndentedString(retrieveScriptId)).append("\n");
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
