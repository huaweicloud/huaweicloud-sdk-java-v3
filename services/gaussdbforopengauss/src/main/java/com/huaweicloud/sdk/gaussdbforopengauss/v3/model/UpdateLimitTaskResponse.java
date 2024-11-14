package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateLimitTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private String databases;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_words")

    private String keyWords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_size")

    private Integer parallelSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_utilization")

    private Integer cpuUtilization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_utilization")

    private Integer memoryUtilization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public UpdateLimitTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 限流任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public UpdateLimitTaskResponse withDatabases(String databases) {
        this.databases = databases;
        return this;
    }

    /**
     * CN节点数据库组,每个数据库字符串以逗号形式隔开，仅当任务类型为SQL_TYPE时，返回该值且与请求参数相同。
     * @return databases
     */
    public String getDatabases() {
        return databases;
    }

    public void setDatabases(String databases) {
        this.databases = databases;
    }

    public UpdateLimitTaskResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 限流任务名，与请求参数相同。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public UpdateLimitTaskResponse withKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }

    /**
     * 关键词，仅当任务类型为SQL_TYPE时，返回该值且与请求参数相同。
     * @return keyWords
     */
    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public UpdateLimitTaskResponse withParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
        return this;
    }

    /**
     * 并发数，与请求参数相同。
     * @return parallelSize
     */
    public Integer getParallelSize() {
        return parallelSize;
    }

    public void setParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
    }

    public UpdateLimitTaskResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 限流任务开始时间，格式为yyyy-mm-ddThh:mm:ssZ，当前时间指UTC时间，SQL范围返回该值。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public UpdateLimitTaskResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 限流任务结束时间，格式为yyyy-mm-ddThh:mm:ssZ，当前时间指UTC时间，SQL范围返回该值。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public UpdateLimitTaskResponse withCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
        return this;
    }

    /**
     * cpu利用率，仅当任务类型为SESSION_ACTIVE_MAX_COUNT时，返回该值且只保留正整数。
     * @return cpuUtilization
     */
    public Integer getCpuUtilization() {
        return cpuUtilization;
    }

    public void setCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
    }

    public UpdateLimitTaskResponse withMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
        return this;
    }

    /**
     * 内存利用率，仅当任务类型为SESSION_ACTIVE_MAX_COUNT时，返回该值且只保留正整数。
     * @return memoryUtilization
     */
    public Integer getMemoryUtilization() {
        return memoryUtilization;
    }

    public void setMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
    }

    public UpdateLimitTaskResponse withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public UpdateLimitTaskResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 工作流ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLimitTaskResponse that = (UpdateLimitTaskResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.databases, that.databases)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.keyWords, that.keyWords)
            && Objects.equals(this.parallelSize, that.parallelSize) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.cpuUtilization, that.cpuUtilization)
            && Objects.equals(this.memoryUtilization, that.memoryUtilization)
            && Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            databases,
            taskName,
            keyWords,
            parallelSize,
            startTime,
            endTime,
            cpuUtilization,
            memoryUtilization,
            ruleName,
            jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLimitTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    keyWords: ").append(toIndentedString(keyWords)).append("\n");
        sb.append("    parallelSize: ").append(toIndentedString(parallelSize)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    cpuUtilization: ").append(toIndentedString(cpuUtilization)).append("\n");
        sb.append("    memoryUtilization: ").append(toIndentedString(memoryUtilization)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
