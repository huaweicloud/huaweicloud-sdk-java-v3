package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubTaskRuntimeDto
 */
public class SubTaskRuntimeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_name")

    private String subTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_running_time")

    private Integer actualRunningTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_storage_link")

    private String logStorageLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_create_time")

    private String podCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_start_time")

    private String podStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_failed_times")

    private Integer jobFailedTimes;

    public SubTaskRuntimeDto withSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
        return this;
    }

    /**
     * 作业子任务的并发实例名称
     * @return subTaskName
     */
    public String getSubTaskName() {
        return subTaskName;
    }

    public void setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
    }

    public SubTaskRuntimeDto withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业子任务的并发实例运行创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public SubTaskRuntimeDto withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 作业子任务的并发实例运行结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public SubTaskRuntimeDto withActualRunningTime(Integer actualRunningTime) {
        this.actualRunningTime = actualRunningTime;
        return this;
    }

    /**
     * 作业子任务的并发实例实际运行时间
     * @return actualRunningTime
     */
    public Integer getActualRunningTime() {
        return actualRunningTime;
    }

    public void setActualRunningTime(Integer actualRunningTime) {
        this.actualRunningTime = actualRunningTime;
    }

    public SubTaskRuntimeDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业子任务的并发实例运行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SubTaskRuntimeDto withLogStorageLink(String logStorageLink) {
        this.logStorageLink = logStorageLink;
        return this;
    }

    /**
     * 作业日志存储链接
     * @return logStorageLink
     */
    public String getLogStorageLink() {
        return logStorageLink;
    }

    public void setLogStorageLink(String logStorageLink) {
        this.logStorageLink = logStorageLink;
    }

    public SubTaskRuntimeDto withPodCreateTime(String podCreateTime) {
        this.podCreateTime = podCreateTime;
        return this;
    }

    /**
     * task的pod创建时间
     * @return podCreateTime
     */
    public String getPodCreateTime() {
        return podCreateTime;
    }

    public void setPodCreateTime(String podCreateTime) {
        this.podCreateTime = podCreateTime;
    }

    public SubTaskRuntimeDto withPodStartTime(String podStartTime) {
        this.podStartTime = podStartTime;
        return this;
    }

    /**
     * task的pod启动时间
     * @return podStartTime
     */
    public String getPodStartTime() {
        return podStartTime;
    }

    public void setPodStartTime(String podStartTime) {
        this.podStartTime = podStartTime;
    }

    public SubTaskRuntimeDto withJobFailedTimes(Integer jobFailedTimes) {
        this.jobFailedTimes = jobFailedTimes;
        return this;
    }

    /**
     * task的cce job失败次数
     * @return jobFailedTimes
     */
    public Integer getJobFailedTimes() {
        return jobFailedTimes;
    }

    public void setJobFailedTimes(Integer jobFailedTimes) {
        this.jobFailedTimes = jobFailedTimes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTaskRuntimeDto that = (SubTaskRuntimeDto) obj;
        return Objects.equals(this.subTaskName, that.subTaskName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.actualRunningTime, that.actualRunningTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.logStorageLink, that.logStorageLink)
            && Objects.equals(this.podCreateTime, that.podCreateTime)
            && Objects.equals(this.podStartTime, that.podStartTime)
            && Objects.equals(this.jobFailedTimes, that.jobFailedTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subTaskName,
            createTime,
            finishTime,
            actualRunningTime,
            status,
            logStorageLink,
            podCreateTime,
            podStartTime,
            jobFailedTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTaskRuntimeDto {\n");
        sb.append("    subTaskName: ").append(toIndentedString(subTaskName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    actualRunningTime: ").append(toIndentedString(actualRunningTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    logStorageLink: ").append(toIndentedString(logStorageLink)).append("\n");
        sb.append("    podCreateTime: ").append(toIndentedString(podCreateTime)).append("\n");
        sb.append("    podStartTime: ").append(toIndentedString(podStartTime)).append("\n");
        sb.append("    jobFailedTimes: ").append(toIndentedString(jobFailedTimes)).append("\n");
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
