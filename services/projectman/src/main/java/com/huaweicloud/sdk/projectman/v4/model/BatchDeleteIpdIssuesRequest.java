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
public class BatchDeleteIpdIssuesRequest {

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

    public BatchDeleteIpdIssuesRequest withProjectId(String projectId) {
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

    public BatchDeleteIpdIssuesRequest withIsPermanentDelete(Boolean isPermanentDelete) {
        this.isPermanentDelete = isPermanentDelete;
        return this;
    }

    /**
     * **参数解释**： 是否永久删除。 **约束限制**： 不涉及。 **取值范围**： - true：彻底删除工作项（适用于回收站中的工作项，彻底删除后不可恢复）。 - false：将工作项移入回收站。 **默认取值**： false。
     * @return isPermanentDelete
     */
    public Boolean getIsPermanentDelete() {
        return isPermanentDelete;
    }

    public void setIsPermanentDelete(Boolean isPermanentDelete) {
        this.isPermanentDelete = isPermanentDelete;
    }

    public BatchDeleteIpdIssuesRequest withSrcProjectId(String srcProjectId) {
        this.srcProjectId = srcProjectId;
        return this;
    }

    /**
     * **参数解释**： 当工作项类型为RR或Bug时，工作项的提出项目ID。通过[查询IPD项目列表](ShowIpdProjectList.xml)获取，响应消息体中的**id**字段的值就是项目ID。 **约束限制**： 归属项目和提出项目一致时可不传。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return srcProjectId
     */
    public String getSrcProjectId() {
        return srcProjectId;
    }

    public void setSrcProjectId(String srcProjectId) {
        this.srcProjectId = srcProjectId;
    }

    public BatchDeleteIpdIssuesRequest withBody(List<String> body) {
        this.body = body;
        return this;
    }

    public BatchDeleteIpdIssuesRequest addBodyItem(String bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public BatchDeleteIpdIssuesRequest withBody(Consumer<List<String>> bodySetter) {
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
        BatchDeleteIpdIssuesRequest that = (BatchDeleteIpdIssuesRequest) obj;
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
        sb.append("class BatchDeleteIpdIssuesRequest {\n");
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
