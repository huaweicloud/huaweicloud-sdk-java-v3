package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UploadAgentFileRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires")

    private Integer expires;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_image")

    private Boolean isImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UploadAgentFileRequestBody body;

    public UploadAgentFileRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**： 空间ID，当前资源所属工作空间  **取值范围**： 由英文，数字，“-”，“_”组成，不超过64位字符
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public UploadAgentFileRequest withExpires(Integer expires) {
        this.expires = expires;
        return this;
    }

    /**
     * 访问授权过期时间（天）
     * minimum: 1
     * maximum: 180
     * @return expires
     */
    public Integer getExpires() {
        return expires;
    }

    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    public UploadAgentFileRequest withIsImage(Boolean isImage) {
        this.isImage = isImage;
        return this;
    }

    /**
     * 是否是图片上传
     * @return isImage
     */
    public Boolean getIsImage() {
        return isImage;
    }

    public void setIsImage(Boolean isImage) {
        this.isImage = isImage;
    }

    public UploadAgentFileRequest withBody(UploadAgentFileRequestBody body) {
        this.body = body;
        return this;
    }

    public UploadAgentFileRequest withBody(Consumer<UploadAgentFileRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UploadAgentFileRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UploadAgentFileRequestBody getBody() {
        return body;
    }

    public void setBody(UploadAgentFileRequestBody body) {
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
        UploadAgentFileRequest that = (UploadAgentFileRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.expires, that.expires)
            && Objects.equals(this.isImage, that.isImage) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, expires, isImage, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadAgentFileRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
        sb.append("    isImage: ").append(toIndentedString(isImage)).append("\n");
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
