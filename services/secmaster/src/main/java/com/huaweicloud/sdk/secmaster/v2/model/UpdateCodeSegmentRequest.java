package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCodeSegmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_segment_id")

    private String codeSegmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCodeSegmentRequestBody body;

    public UpdateCodeSegmentRequest withWorkspaceId(String workspaceId) {
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

    public UpdateCodeSegmentRequest withCodeSegmentId(String codeSegmentId) {
        this.codeSegmentId = codeSegmentId;
        return this;
    }

    /**
     * 代码片段 ID
     * @return codeSegmentId
     */
    public String getCodeSegmentId() {
        return codeSegmentId;
    }

    public void setCodeSegmentId(String codeSegmentId) {
        this.codeSegmentId = codeSegmentId;
    }

    public UpdateCodeSegmentRequest withBody(UpdateCodeSegmentRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCodeSegmentRequest withBody(Consumer<UpdateCodeSegmentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCodeSegmentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCodeSegmentRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCodeSegmentRequestBody body) {
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
        UpdateCodeSegmentRequest that = (UpdateCodeSegmentRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.codeSegmentId, that.codeSegmentId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, codeSegmentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCodeSegmentRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    codeSegmentId: ").append(toIndentedString(codeSegmentId)).append("\n");
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
