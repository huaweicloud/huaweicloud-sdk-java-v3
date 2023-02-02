package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询流水线列表请求体
 */
public class ListPipelineQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_ids")

    private List<String> projectIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<String> status = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_publish")

    private Boolean isPublish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_ids")

    private List<String> creatorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_ids")

    private List<String> executorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    public ListPipelineQuery withProjectIds(List<String> projectIds) {
        this.projectIds = projectIds;
        return this;
    }

    public ListPipelineQuery addProjectIdsItem(String projectIdsItem) {
        if (this.projectIds == null) {
            this.projectIds = new ArrayList<>();
        }
        this.projectIds.add(projectIdsItem);
        return this;
    }

    public ListPipelineQuery withProjectIds(Consumer<List<String>> projectIdsSetter) {
        if (this.projectIds == null) {
            this.projectIds = new ArrayList<>();
        }
        projectIdsSetter.accept(this.projectIds);
        return this;
    }

    /**
     * 项目ID列表
     * @return projectIds
     */
    public List<String> getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(List<String> projectIds) {
        this.projectIds = projectIds;
    }

    public ListPipelineQuery withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件ID
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ListPipelineQuery withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流水线名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPipelineQuery withStatus(List<String> status) {
        this.status = status;
        return this;
    }

    public ListPipelineQuery addStatusItem(String statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListPipelineQuery withStatus(Consumer<List<String>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public ListPipelineQuery withIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
        return this;
    }

    /**
     * 是否为变更流水线
     * @return isPublish
     */
    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    public ListPipelineQuery withCreatorIds(List<String> creatorIds) {
        this.creatorIds = creatorIds;
        return this;
    }

    public ListPipelineQuery addCreatorIdsItem(String creatorIdsItem) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        this.creatorIds.add(creatorIdsItem);
        return this;
    }

    public ListPipelineQuery withCreatorIds(Consumer<List<String>> creatorIdsSetter) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        creatorIdsSetter.accept(this.creatorIds);
        return this;
    }

    /**
     * 创建人ID列表
     * @return creatorIds
     */
    public List<String> getCreatorIds() {
        return creatorIds;
    }

    public void setCreatorIds(List<String> creatorIds) {
        this.creatorIds = creatorIds;
    }

    public ListPipelineQuery withExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }

    public ListPipelineQuery addExecutorIdsItem(String executorIdsItem) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        this.executorIds.add(executorIdsItem);
        return this;
    }

    public ListPipelineQuery withExecutorIds(Consumer<List<String>> executorIdsSetter) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        executorIdsSetter.accept(this.executorIds);
        return this;
    }

    /**
     * 执行人ID列表
     * @return executorIds
     */
    public List<String> getExecutorIds() {
        return executorIds;
    }

    public void setExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
    }

    public ListPipelineQuery withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListPipelineQuery withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListPipelineQuery withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 起始偏移
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListPipelineQuery withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询数量
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListPipelineQuery withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段名称
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListPipelineQuery withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序规则
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPipelineQuery listPipelineQuery = (ListPipelineQuery) o;
        return Objects.equals(this.projectIds, listPipelineQuery.projectIds)
            && Objects.equals(this.componentId, listPipelineQuery.componentId)
            && Objects.equals(this.name, listPipelineQuery.name)
            && Objects.equals(this.status, listPipelineQuery.status)
            && Objects.equals(this.isPublish, listPipelineQuery.isPublish)
            && Objects.equals(this.creatorIds, listPipelineQuery.creatorIds)
            && Objects.equals(this.executorIds, listPipelineQuery.executorIds)
            && Objects.equals(this.startTime, listPipelineQuery.startTime)
            && Objects.equals(this.endTime, listPipelineQuery.endTime)
            && Objects.equals(this.offset, listPipelineQuery.offset)
            && Objects.equals(this.limit, listPipelineQuery.limit)
            && Objects.equals(this.sortKey, listPipelineQuery.sortKey)
            && Objects.equals(this.sortDir, listPipelineQuery.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectIds,
            componentId,
            name,
            status,
            isPublish,
            creatorIds,
            executorIds,
            startTime,
            endTime,
            offset,
            limit,
            sortKey,
            sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelineQuery {\n");
        sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isPublish: ").append(toIndentedString(isPublish)).append("\n");
        sb.append("    creatorIds: ").append(toIndentedString(creatorIds)).append("\n");
        sb.append("    executorIds: ").append(toIndentedString(executorIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
