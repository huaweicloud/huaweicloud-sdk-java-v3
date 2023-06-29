package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskData
 */
public class TaskData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streams")

    private List<TaskStream> streams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time_info")

    private StartTimeInfo startTimeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_usage_estimate")

    private TaskSourceUsageEstimate sourceUsageEstimate;

    public TaskData withStreams(List<TaskStream> streams) {
        this.streams = streams;
        return this;
    }

    public TaskData addStreamsItem(TaskStream streamsItem) {
        if (this.streams == null) {
            this.streams = new ArrayList<>();
        }
        this.streams.add(streamsItem);
        return this;
    }

    public TaskData withStreams(Consumer<List<TaskStream>> streamsSetter) {
        if (this.streams == null) {
            this.streams = new ArrayList<>();
        }
        streamsSetter.accept(this.streams);
        return this;
    }

    /**
     * 作业流详情
     * @return streams
     */
    public List<TaskStream> getStreams() {
        return streams;
    }

    public void setStreams(List<TaskStream> streams) {
        this.streams = streams;
    }

    public TaskData withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 作业id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskData withStartTimeInfo(StartTimeInfo startTimeInfo) {
        this.startTimeInfo = startTimeInfo;
        return this;
    }

    public TaskData withStartTimeInfo(Consumer<StartTimeInfo> startTimeInfoSetter) {
        if (this.startTimeInfo == null) {
            this.startTimeInfo = new StartTimeInfo();
            startTimeInfoSetter.accept(this.startTimeInfo);
        }

        return this;
    }

    /**
     * Get startTimeInfo
     * @return startTimeInfo
     */
    public StartTimeInfo getStartTimeInfo() {
        return startTimeInfo;
    }

    public void setStartTimeInfo(StartTimeInfo startTimeInfo) {
        this.startTimeInfo = startTimeInfo;
    }

    public TaskData withSourceUsageEstimate(TaskSourceUsageEstimate sourceUsageEstimate) {
        this.sourceUsageEstimate = sourceUsageEstimate;
        return this;
    }

    public TaskData withSourceUsageEstimate(Consumer<TaskSourceUsageEstimate> sourceUsageEstimateSetter) {
        if (this.sourceUsageEstimate == null) {
            this.sourceUsageEstimate = new TaskSourceUsageEstimate();
            sourceUsageEstimateSetter.accept(this.sourceUsageEstimate);
        }

        return this;
    }

    /**
     * Get sourceUsageEstimate
     * @return sourceUsageEstimate
     */
    public TaskSourceUsageEstimate getSourceUsageEstimate() {
        return sourceUsageEstimate;
    }

    public void setSourceUsageEstimate(TaskSourceUsageEstimate sourceUsageEstimate) {
        this.sourceUsageEstimate = sourceUsageEstimate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskData that = (TaskData) obj;
        return Objects.equals(this.streams, that.streams) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.startTimeInfo, that.startTimeInfo)
            && Objects.equals(this.sourceUsageEstimate, that.sourceUsageEstimate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streams, taskId, startTimeInfo, sourceUsageEstimate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskData {\n");
        sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    startTimeInfo: ").append(toIndentedString(startTimeInfo)).append("\n");
        sb.append("    sourceUsageEstimate: ").append(toIndentedString(sourceUsageEstimate)).append("\n");
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
