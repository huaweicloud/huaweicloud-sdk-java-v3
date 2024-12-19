package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RetryFactoryJobInstanceBody
 */
public class RetryFactoryJobInstanceBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_location")

    private String retryLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_task_version")

    private String retryTaskVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_obs_monitor")

    private Boolean ignoreObsMonitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_retrys")

    private List<RetryFactoryJobInstanceBodyTaskRetrys> taskRetrys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<RetryFactoryJobInstanceBodyJobs> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrent")

    private Integer concurrent;

    public RetryFactoryJobInstanceBody withRetryLocation(String retryLocation) {
        this.retryLocation = retryLocation;
        return this;
    }

    /**
     * 重跑开始位置，取值有firstNode、errorNode和specifiedNode。
     * @return retryLocation
     */
    public String getRetryLocation() {
        return retryLocation;
    }

    public void setRetryLocation(String retryLocation) {
        this.retryLocation = retryLocation;
    }

    public RetryFactoryJobInstanceBody withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public RetryFactoryJobInstanceBody withRetryTaskVersion(String retryTaskVersion) {
        this.retryTaskVersion = retryTaskVersion;
        return this;
    }

    /**
     * 使用的作业参数，取值有original_version和current_version。
     * @return retryTaskVersion
     */
    public String getRetryTaskVersion() {
        return retryTaskVersion;
    }

    public void setRetryTaskVersion(String retryTaskVersion) {
        this.retryTaskVersion = retryTaskVersion;
    }

    public RetryFactoryJobInstanceBody withIgnoreObsMonitor(Boolean ignoreObsMonitor) {
        this.ignoreObsMonitor = ignoreObsMonitor;
        return this;
    }

    /**
     * 是否忽略obs监听，默认为true。
     * @return ignoreObsMonitor
     */
    public Boolean getIgnoreObsMonitor() {
        return ignoreObsMonitor;
    }

    public void setIgnoreObsMonitor(Boolean ignoreObsMonitor) {
        this.ignoreObsMonitor = ignoreObsMonitor;
    }

    public RetryFactoryJobInstanceBody withTaskRetrys(List<RetryFactoryJobInstanceBodyTaskRetrys> taskRetrys) {
        this.taskRetrys = taskRetrys;
        return this;
    }

    public RetryFactoryJobInstanceBody addTaskRetrysItem(RetryFactoryJobInstanceBodyTaskRetrys taskRetrysItem) {
        if (this.taskRetrys == null) {
            this.taskRetrys = new ArrayList<>();
        }
        this.taskRetrys.add(taskRetrysItem);
        return this;
    }

    public RetryFactoryJobInstanceBody withTaskRetrys(
        Consumer<List<RetryFactoryJobInstanceBodyTaskRetrys>> taskRetrysSetter) {
        if (this.taskRetrys == null) {
            this.taskRetrys = new ArrayList<>();
        }
        taskRetrysSetter.accept(this.taskRetrys);
        return this;
    }

    /**
     * 作业实例重跑参数，当重跑当前实例类型时，需要指定该参数的重跑信息，重跑当前作业及其上下游作业实例类型不需要指定该参数。
     * @return taskRetrys
     */
    public List<RetryFactoryJobInstanceBodyTaskRetrys> getTaskRetrys() {
        return taskRetrys;
    }

    public void setTaskRetrys(List<RetryFactoryJobInstanceBodyTaskRetrys> taskRetrys) {
        this.taskRetrys = taskRetrys;
    }

    public RetryFactoryJobInstanceBody withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 实例开始时间，当重跑当前作业及其上下游作业实例类型时，该参数有效。
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public RetryFactoryJobInstanceBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 实例结束时间，当重跑当前作业及其上下游作业实例类型时，该参数有效。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public RetryFactoryJobInstanceBody withJobs(List<RetryFactoryJobInstanceBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }

    public RetryFactoryJobInstanceBody addJobsItem(RetryFactoryJobInstanceBodyJobs jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public RetryFactoryJobInstanceBody withJobs(Consumer<List<RetryFactoryJobInstanceBodyJobs>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 作业实例重跑参数，当重跑当前作业及其上下游作业实例类型时，需要指定该参数的重跑信息，重跑当前实例类型不需要指定该参数。
     * @return jobs
     */
    public List<RetryFactoryJobInstanceBodyJobs> getJobs() {
        return jobs;
    }

    public void setJobs(List<RetryFactoryJobInstanceBodyJobs> jobs) {
        this.jobs = jobs;
    }

    public RetryFactoryJobInstanceBody withConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
        return this;
    }

    /**
     * 并行度，当重跑当前作业及其上下游作业实例类型时，该参数有效，默认值为1，取值范围为1到128。
     * @return concurrent
     */
    public Integer getConcurrent() {
        return concurrent;
    }

    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryFactoryJobInstanceBody that = (RetryFactoryJobInstanceBody) obj;
        return Objects.equals(this.retryLocation, that.retryLocation) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.retryTaskVersion, that.retryTaskVersion)
            && Objects.equals(this.ignoreObsMonitor, that.ignoreObsMonitor)
            && Objects.equals(this.taskRetrys, that.taskRetrys) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.jobs, that.jobs)
            && Objects.equals(this.concurrent, that.concurrent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retryLocation,
            nodeName,
            retryTaskVersion,
            ignoreObsMonitor,
            taskRetrys,
            beginTime,
            endTime,
            jobs,
            concurrent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryFactoryJobInstanceBody {\n");
        sb.append("    retryLocation: ").append(toIndentedString(retryLocation)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    retryTaskVersion: ").append(toIndentedString(retryTaskVersion)).append("\n");
        sb.append("    ignoreObsMonitor: ").append(toIndentedString(ignoreObsMonitor)).append("\n");
        sb.append("    taskRetrys: ").append(toIndentedString(taskRetrys)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    concurrent: ").append(toIndentedString(concurrent)).append("\n");
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
