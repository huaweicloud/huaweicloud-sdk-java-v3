package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteIpdIssueRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_permanent_delete")

    private Boolean isPermanentDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_project_id")

    private String srcProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<String> body = null;

    public BatchDeleteIpdIssueRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目32位ID，项目唯一标识。通过查询IPD项目列表获取，响应消息体中的id字段的值就是项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BatchDeleteIpdIssueRequest withIsPermanentDelete(Boolean isPermanentDelete) {
        this.isPermanentDelete = isPermanentDelete;
        return this;
    }

    /**
     * 是否永久删除
     * @return isPermanentDelete
     */
    public Boolean getIsPermanentDelete() {
        return isPermanentDelete;
    }

    public void setIsPermanentDelete(Boolean isPermanentDelete) {
        this.isPermanentDelete = isPermanentDelete;
    }

    public BatchDeleteIpdIssueRequest withSrcProjectId(String srcProjectId) {
        this.srcProjectId = srcProjectId;
        return this;
    }

    /**
     * 工作项的提出项目ID
     * @return srcProjectId
     */
    public String getSrcProjectId() {
        return srcProjectId;
    }

    public void setSrcProjectId(String srcProjectId) {
        this.srcProjectId = srcProjectId;
    }

    public BatchDeleteIpdIssueRequest withBody(List<String> body) {
        this.body = body;
        return this;
    }

    public BatchDeleteIpdIssueRequest addBodyItem(String bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public BatchDeleteIpdIssueRequest withBody(Consumer<List<String>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<String> getBody() {
        return body;
    }

    public void setBody(List<String> body) {
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
        BatchDeleteIpdIssueRequest that = (BatchDeleteIpdIssueRequest) obj;
        return Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.isPermanentDelete, that.isPermanentDelete)
            && Objects.equals(this.srcProjectId, that.srcProjectId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, isPermanentDelete, srcProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteIpdIssueRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isPermanentDelete: ").append(toIndentedString(isPermanentDelete)).append("\n");
        sb.append("    srcProjectId: ").append(toIndentedString(srcProjectId)).append("\n");
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
