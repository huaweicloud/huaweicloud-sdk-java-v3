package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchTransferIpdWorkItemFlowRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_recover")

    private Boolean isRecover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private WorkItemFlowVO body;

    public BatchTransferIpdWorkItemFlowRequest withProjectId(String projectId) {
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

    public BatchTransferIpdWorkItemFlowRequest withIsRecover(Boolean isRecover) {
        this.isRecover = isRecover;
        return this;
    }

    /**
     * **参数解释**： 是否覆盖对应字段。 **约束限制**： 不涉及 **取值范围**： true:本开关开启时，当前弹窗的相应字段值将覆盖全部所选工作项的对应字段值。 false:本开关关闭时，除「当前责任人」之外，所选工作项的对应字段如果已经有值，将保持原状，不会被当前弹窗的相应字段值覆盖。 **默认取值**： false。
     * @return isRecover
     */
    public Boolean getIsRecover() {
        return isRecover;
    }

    public void setIsRecover(Boolean isRecover) {
        this.isRecover = isRecover;
    }

    public BatchTransferIpdWorkItemFlowRequest withBody(WorkItemFlowVO body) {
        this.body = body;
        return this;
    }

    public BatchTransferIpdWorkItemFlowRequest withBody(Consumer<WorkItemFlowVO> bodySetter) {
        if (this.body == null) {
            this.body = new WorkItemFlowVO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public WorkItemFlowVO getBody() {
        return body;
    }

    public void setBody(WorkItemFlowVO body) {
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
        BatchTransferIpdWorkItemFlowRequest that = (BatchTransferIpdWorkItemFlowRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.isRecover, that.isRecover)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, isRecover, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTransferIpdWorkItemFlowRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isRecover: ").append(toIndentedString(isRecover)).append("\n");
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
