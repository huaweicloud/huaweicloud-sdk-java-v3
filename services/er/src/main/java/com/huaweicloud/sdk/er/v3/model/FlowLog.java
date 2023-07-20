package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 流日志详情
 */
public class FlowLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_store_type")

    private String logStoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_aggregation_interval")

    private Integer logAggregationInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public FlowLog withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流日志ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FlowLog withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流日志名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowLog withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流日志描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FlowLog withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 流日志任务创建者项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public FlowLog withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 采集的资源类型:attachment
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public FlowLog withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 采集的资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public FlowLog withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组ID
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public FlowLog withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流ID
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public FlowLog withLogStoreType(String logStoreType) {
        this.logStoreType = logStoreType;
        return this;
    }

    /**
     * 流日志存储类型
     * @return logStoreType
     */
    public String getLogStoreType() {
        return logStoreType;
    }

    public void setLogStoreType(String logStoreType) {
        this.logStoreType = logStoreType;
    }

    public FlowLog withLogAggregationInterval(Integer logAggregationInterval) {
        this.logAggregationInterval = logAggregationInterval;
        return this;
    }

    /**
     * 日志聚合时间，单位s，取值范围：60-600
     * @return logAggregationInterval
     */
    public Integer getLogAggregationInterval() {
        return logAggregationInterval;
    }

    public void setLogAggregationInterval(Integer logAggregationInterval) {
        this.logAggregationInterval = logAggregationInterval;
    }

    public FlowLog withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public FlowLog withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public FlowLog withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 日志资源状态:pending|available|modifying|deleting|deleted|failed
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public FlowLog withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 日志开关:true|false
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowLog that = (FlowLog) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logStoreType, that.logStoreType)
            && Objects.equals(this.logAggregationInterval, that.logAggregationInterval)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.state, that.state) && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            projectId,
            resourceType,
            resourceId,
            logGroupId,
            logStreamId,
            logStoreType,
            logAggregationInterval,
            createdAt,
            updatedAt,
            state,
            enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowLog {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStoreType: ").append(toIndentedString(logStoreType)).append("\n");
        sb.append("    logAggregationInterval: ").append(toIndentedString(logAggregationInterval)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
