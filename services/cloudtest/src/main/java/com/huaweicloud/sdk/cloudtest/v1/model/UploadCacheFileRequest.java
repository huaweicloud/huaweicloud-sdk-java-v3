package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UploadCacheFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    private Boolean override;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_type")

    private String parentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_uri")

    private String parentUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UploadCacheFileRequestBody body;

    public UploadCacheFileRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目uuid
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UploadCacheFileRequest withOverride(Boolean override) {
        this.override = override;
        return this;
    }

    /**
     * 是否覆盖同名文件
     * @return override
     */
    public Boolean getOverride() {
        return override;
    }

    public void setOverride(Boolean override) {
        this.override = override;
    }

    public UploadCacheFileRequest withParentType(String parentType) {
        this.parentType = parentType;
        return this;
    }

    /**
     * 附件挂载资源类型
     * @return parentType
     */
    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public UploadCacheFileRequest withParentUri(String parentUri) {
        this.parentUri = parentUri;
        return this;
    }

    /**
     * 附件挂载资源Uri
     * @return parentUri
     */
    public String getParentUri() {
        return parentUri;
    }

    public void setParentUri(String parentUri) {
        this.parentUri = parentUri;
    }

    public UploadCacheFileRequest withBody(UploadCacheFileRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadCacheFileRequest withBody(Consumer<UploadCacheFileRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UploadCacheFileRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadCacheFileRequestBody getBody() {
        return body;
    }

    public void setBody(UploadCacheFileRequestBody body) {
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
        UploadCacheFileRequest that = (UploadCacheFileRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.override, that.override)
            && Objects.equals(this.parentType, that.parentType) && Objects.equals(this.parentUri, that.parentUri)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, override, parentType, parentUri, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadCacheFileRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
        sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
        sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
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
