package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 限流信息
 */
public class IntelligentKillSessionHistory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_link")

    private String downloadLink;

    public IntelligentKillSessionHistory withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public IntelligentKillSessionHistory withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * kill开始时间
     * minimum: 0
     * maximum: 10000000000000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public IntelligentKillSessionHistory withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * kill结束时间
     * minimum: 0
     * maximum: 10000000000000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public IntelligentKillSessionHistory withDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }

    /**
     * 操作历史下载链接
     * @return downloadLink
     */
    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntelligentKillSessionHistory that = (IntelligentKillSessionHistory) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.downloadLink, that.downloadLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, startTime, endTime, downloadLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntelligentKillSessionHistory {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
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
