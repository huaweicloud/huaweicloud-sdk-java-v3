package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ListSinkTasksRespTasks
 */
public class ListSinkTasksRespTasks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    @JacksonXmlProperty(localName = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_type")

    @JacksonXmlProperty(localName = "destination_type")

    private String destinationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    @JacksonXmlProperty(localName = "topics")

    private String topics;

    public ListSinkTasksRespTasks withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListSinkTasksRespTasks withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 转储任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListSinkTasksRespTasks withDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }

    /**
     * 转储任务类型。
     * @return destinationType
     */
    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public ListSinkTasksRespTasks withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 转储任务创建时间戳。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListSinkTasksRespTasks withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 转储任务状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListSinkTasksRespTasks withTopics(String topics) {
        this.topics = topics;
        return this;
    }

    /**
     * 返回任务转存的topics列表或者正则表达式。
     * @return topics
     */
    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSinkTasksRespTasks listSinkTasksRespTasks = (ListSinkTasksRespTasks) o;
        return Objects.equals(this.taskId, listSinkTasksRespTasks.taskId)
            && Objects.equals(this.taskName, listSinkTasksRespTasks.taskName)
            && Objects.equals(this.destinationType, listSinkTasksRespTasks.destinationType)
            && Objects.equals(this.createTime, listSinkTasksRespTasks.createTime)
            && Objects.equals(this.status, listSinkTasksRespTasks.status)
            && Objects.equals(this.topics, listSinkTasksRespTasks.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, destinationType, createTime, status, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSinkTasksRespTasks {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
