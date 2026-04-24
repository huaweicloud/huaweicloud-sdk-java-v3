package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EventSearchResultV2Events
 */
public class EventSearchResultV2Events {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_name")

    private String baselineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_version")

    private Integer taskVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happen_time")

    private Integer happenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    public EventSearchResultV2Events withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EventSearchResultV2Events withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventSearchResultV2Events withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 事件类型，取值为ERROR和SLOW_DOWN。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EventSearchResultV2Events withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 事件状态，取值为NEW_DISCOVERY、PROCESSING、RESTORED和IGNORED。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EventSearchResultV2Events withBaselineName(String baselineName) {
        this.baselineName = baselineName;
        return this;
    }

    /**
     * 基线任务名称。
     * @return baselineName
     */
    public String getBaselineName() {
        return baselineName;
    }

    public void setBaselineName(String baselineName) {
        this.baselineName = baselineName;
    }

    public EventSearchResultV2Events withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 作业名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public EventSearchResultV2Events withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 作业ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public EventSearchResultV2Events withTaskVersion(Integer taskVersion) {
        this.taskVersion = taskVersion;
        return this;
    }

    /**
     * 作业版本号。
     * @return taskVersion
     */
    public Integer getTaskVersion() {
        return taskVersion;
    }

    public void setTaskVersion(Integer taskVersion) {
        this.taskVersion = taskVersion;
    }

    public EventSearchResultV2Events withHappenTime(Integer happenTime) {
        this.happenTime = happenTime;
        return this;
    }

    /**
     * 发生时间戳，单位毫秒。
     * @return happenTime
     */
    public Integer getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Integer happenTime) {
        this.happenTime = happenTime;
    }

    public EventSearchResultV2Events withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 责任人用户名称。
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventSearchResultV2Events that = (EventSearchResultV2Events) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.baselineName, that.baselineName) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskVersion, that.taskVersion)
            && Objects.equals(this.happenTime, that.happenTime) && Objects.equals(this.ownerName, that.ownerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, status, baselineName, taskName, taskId, taskVersion, happenTime, ownerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSearchResultV2Events {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    baselineName: ").append(toIndentedString(baselineName)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskVersion: ").append(toIndentedString(taskVersion)).append("\n");
        sb.append("    happenTime: ").append(toIndentedString(happenTime)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
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
