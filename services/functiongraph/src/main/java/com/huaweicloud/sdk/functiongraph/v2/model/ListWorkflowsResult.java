package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 函数流详情
 */
public class ListWorkflowsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_urn")

    private String workflowUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    public ListWorkflowsResult withId(String id) {
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

    public ListWorkflowsResult withWorkflowUrn(String workflowUrn) {
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

    public ListWorkflowsResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流程定义名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListWorkflowsResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流程定义描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListWorkflowsResult withCreatedTime(String createdTime) {
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

    public ListWorkflowsResult withUpdatedTime(String updatedTime) {
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

    public ListWorkflowsResult withCreatedBy(String createdBy) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkflowsResult listWorkflowsResult = (ListWorkflowsResult) o;
        return Objects.equals(this.id, listWorkflowsResult.id)
            && Objects.equals(this.workflowUrn, listWorkflowsResult.workflowUrn)
            && Objects.equals(this.name, listWorkflowsResult.name)
            && Objects.equals(this.description, listWorkflowsResult.description)
            && Objects.equals(this.createdTime, listWorkflowsResult.createdTime)
            && Objects.equals(this.updatedTime, listWorkflowsResult.updatedTime)
            && Objects.equals(this.createdBy, listWorkflowsResult.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workflowUrn, name, description, createdTime, updatedTime, createdBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkflowsResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    workflowUrn: ").append(toIndentedString(workflowUrn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
