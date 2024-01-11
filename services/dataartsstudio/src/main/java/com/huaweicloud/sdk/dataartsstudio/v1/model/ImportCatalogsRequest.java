package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ImportCatalogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action-id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip-exist")

    private Boolean skipExist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ImportCatalogsRequestBody body;

    public ImportCatalogsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ImportCatalogsRequest withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * 需要执行的动作
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public ImportCatalogsRequest withSkipExist(Boolean skipExist) {
        this.skipExist = skipExist;
        return this;
    }

    /**
     * 是否需要覆盖更新已有的主题
     * @return skipExist
     */
    public Boolean getSkipExist() {
        return skipExist;
    }

    public void setSkipExist(Boolean skipExist) {
        this.skipExist = skipExist;
    }

    public ImportCatalogsRequest withBody(ImportCatalogsRequestBody body) {
        this.body = body;
        return this;
    }

    public ImportCatalogsRequest withBody(Consumer<ImportCatalogsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ImportCatalogsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ImportCatalogsRequestBody getBody() {
        return body;
    }

    public void setBody(ImportCatalogsRequestBody body) {
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
        ImportCatalogsRequest that = (ImportCatalogsRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.actionId, that.actionId)
            && Objects.equals(this.skipExist, that.skipExist) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, actionId, skipExist, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportCatalogsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    skipExist: ").append(toIndentedString(skipExist)).append("\n");
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
