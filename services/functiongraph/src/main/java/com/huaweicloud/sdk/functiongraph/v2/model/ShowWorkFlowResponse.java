package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowWorkFlowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_urn")

    private String workflowUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_stream_id")

    private String ltsStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private CreateWorkflowRequestBody definition;

    public ShowWorkFlowResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识ID，流程定义ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowWorkFlowResponse withWorkflowUrn(String workflowUrn) {
        this.workflowUrn = workflowUrn;
        return this;
    }

    /**
     * 唯一标识ID，流程URN
     * @return workflowUrn
     */
    public String getWorkflowUrn() {
        return workflowUrn;
    }

    public void setWorkflowUrn(String workflowUrn) {
        this.workflowUrn = workflowUrn;
    }

    public ShowWorkFlowResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 流程创建时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowWorkFlowResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 流程修改时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ShowWorkFlowResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 流程创建者
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ShowWorkFlowResponse withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * 快速函数流日志组ID，仅快速模式函数流且日志级别不为NONE时
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public ShowWorkFlowResponse withLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
        return this;
    }

    /**
     * 快速函数流日志流ID，仅快速模式函数流且日志级别不为NONE时返回。
     * @return ltsStreamId
     */
    public String getLtsStreamId() {
        return ltsStreamId;
    }

    public void setLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
    }

    public ShowWorkFlowResponse withDefinition(CreateWorkflowRequestBody definition) {
        this.definition = definition;
        return this;
    }

    public ShowWorkFlowResponse withDefinition(Consumer<CreateWorkflowRequestBody> definitionSetter) {
        if (this.definition == null) {
            this.definition = new CreateWorkflowRequestBody();
            definitionSetter.accept(this.definition);
        }

        return this;
    }

    /**
     * Get definition
     * @return definition
     */
    public CreateWorkflowRequestBody getDefinition() {
        return definition;
    }

    public void setDefinition(CreateWorkflowRequestBody definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWorkFlowResponse showWorkFlowResponse = (ShowWorkFlowResponse) o;
        return Objects.equals(this.id, showWorkFlowResponse.id)
            && Objects.equals(this.workflowUrn, showWorkFlowResponse.workflowUrn)
            && Objects.equals(this.createdTime, showWorkFlowResponse.createdTime)
            && Objects.equals(this.updatedTime, showWorkFlowResponse.updatedTime)
            && Objects.equals(this.createdBy, showWorkFlowResponse.createdBy)
            && Objects.equals(this.ltsGroupId, showWorkFlowResponse.ltsGroupId)
            && Objects.equals(this.ltsStreamId, showWorkFlowResponse.ltsStreamId)
            && Objects.equals(this.definition, showWorkFlowResponse.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workflowUrn, createdTime, updatedTime, createdBy, ltsGroupId, ltsStreamId, definition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkFlowResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    workflowUrn: ").append(toIndentedString(workflowUrn)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsStreamId: ").append(toIndentedString(ltsStreamId)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
