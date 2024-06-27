package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateBasicAwByIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_id")

    private String awId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateBasicAwReq body;

    public UpdateBasicAwByIdRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，固定长度32位字符（字母和数字）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateBasicAwByIdRequest withAwId(String awId) {
        this.awId = awId;
        return this;
    }

    /**
     * AW的ID
     * @return awId
     */
    public String getAwId() {
        return awId;
    }

    public void setAwId(String awId) {
        this.awId = awId;
    }

    public UpdateBasicAwByIdRequest withBody(UpdateBasicAwReq body) {
        this.body = body;
        return this;
    }

    public UpdateBasicAwByIdRequest withBody(Consumer<UpdateBasicAwReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateBasicAwReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateBasicAwReq getBody() {
        return body;
    }

    public void setBody(UpdateBasicAwReq body) {
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
        UpdateBasicAwByIdRequest that = (UpdateBasicAwByIdRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.awId, that.awId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, awId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBasicAwByIdRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    awId: ").append(toIndentedString(awId)).append("\n");
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
