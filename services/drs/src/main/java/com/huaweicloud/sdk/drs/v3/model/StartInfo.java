package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 启动任务请求体。
 */
public class StartInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_only_init_task")

    private Boolean isOnlyInitTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    public StartInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StartInfo withIsOnlyInitTask(Boolean isOnlyInitTask) {
        this.isOnlyInitTask = isOnlyInitTask;
        return this;
    }

    /**
     * 是否支持只初始化任务。
     * @return isOnlyInitTask
     */
    public Boolean getIsOnlyInitTask() {
        return isOnlyInitTask;
    }

    public void setIsOnlyInitTask(Boolean isOnlyInitTask) {
        this.isOnlyInitTask = isOnlyInitTask;
    }

    public StartInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务启动时间，时间戳格式精确到毫秒，例如：1679966489593，取值为空代表立即启动。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartInfo that = (StartInfo) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.isOnlyInitTask, that.isOnlyInitTask)
            && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, isOnlyInitTask, startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    isOnlyInitTask: ").append(toIndentedString(isOnlyInitTask)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
