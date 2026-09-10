package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务监控连接信息。
 */
public class MonitorTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_props")

    private Object taskProps;

    public MonitorTaskInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Flink作业任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public MonitorTaskInfo withTaskProps(Object taskProps) {
        this.taskProps = taskProps;
        return this;
    }

    /**
     * 任务实时监控指标。
     * @return taskProps
     */
    public Object getTaskProps() {
        return taskProps;
    }

    public void setTaskProps(Object taskProps) {
        this.taskProps = taskProps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MonitorTaskInfo that = (MonitorTaskInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskProps, that.taskProps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskProps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonitorTaskInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskProps: ").append(toIndentedString(taskProps)).append("\n");
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
