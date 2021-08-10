package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowPlansRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_stage")

    private String currentStage;

    public ShowPlansRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** DevCloud项目id，项目唯一标识，固定长度32位字符
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowPlansRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /** 起始偏移量，表示从此偏移量开始查询， offset大于等于0 minimum: 0 maximum: 999
     * 
     * @return offset */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ShowPlansRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量,最大支持200条 minimum: 1 maximum: 200
     * 
     * @return limit */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ShowPlansRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 模糊查询使用(针对测试计划名称)
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowPlansRequest withCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }

    /** 测试计划所处阶段（create,design,execute,report）
     * 
     * @return currentStage */
    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPlansRequest showPlansRequest = (ShowPlansRequest) o;
        return Objects.equals(this.projectId, showPlansRequest.projectId)
            && Objects.equals(this.offset, showPlansRequest.offset)
            && Objects.equals(this.limit, showPlansRequest.limit) && Objects.equals(this.name, showPlansRequest.name)
            && Objects.equals(this.currentStage, showPlansRequest.currentStage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, offset, limit, name, currentStage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPlansRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
