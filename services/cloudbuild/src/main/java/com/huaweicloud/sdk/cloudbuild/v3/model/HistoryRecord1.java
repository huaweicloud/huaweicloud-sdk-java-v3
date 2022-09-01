package com.huaweicloud.sdk.cloudbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * HistoryRecord1
 */
public class HistoryRecord1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    @JacksonXmlProperty(localName = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_number")

    @JacksonXmlProperty(localName = "build_number")

    private Integer buildNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    @JacksonXmlProperty(localName = "branch")

    private String branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    @JacksonXmlProperty(localName = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_message")

    @JacksonXmlProperty(localName = "commit_message")

    private String commitMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    @JacksonXmlProperty(localName = "executor")

    private String executor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    @JacksonXmlProperty(localName = "trigger_type")

    private String triggerType;

    public HistoryRecord1 withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * 构建记录id--唯一key
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public HistoryRecord1 withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public HistoryRecord1 withBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
        return this;
    }

    /**
     * 构建编号
     * @return buildNumber
     */
    public Integer getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
    }

    public HistoryRecord1 withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 构建开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public HistoryRecord1 withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 构建结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public HistoryRecord1 withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 构建结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public HistoryRecord1 withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * 代码分支
     * @return branch
     */
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public HistoryRecord1 withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * 代码提交的commit id
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public HistoryRecord1 withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * 代码提交时用户输入的提交信息，只有使用codehub仓库时有值
     * @return commitMessage
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public HistoryRecord1 withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * 执行构建任务的用户的用户名
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public HistoryRecord1 withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发方式，可选值：手工触发，定时触发，代码更新触发，流水线触发
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryRecord1 historyRecord1 = (HistoryRecord1) o;
        return Objects.equals(this.recordId, historyRecord1.recordId)
            && Objects.equals(this.jobId, historyRecord1.jobId)
            && Objects.equals(this.buildNumber, historyRecord1.buildNumber)
            && Objects.equals(this.startTime, historyRecord1.startTime)
            && Objects.equals(this.endTime, historyRecord1.endTime)
            && Objects.equals(this.result, historyRecord1.result) && Objects.equals(this.branch, historyRecord1.branch)
            && Objects.equals(this.commitId, historyRecord1.commitId)
            && Objects.equals(this.commitMessage, historyRecord1.commitMessage)
            && Objects.equals(this.executor, historyRecord1.executor)
            && Objects.equals(this.triggerType, historyRecord1.triggerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId,
            jobId,
            buildNumber,
            startTime,
            endTime,
            result,
            branch,
            commitId,
            commitMessage,
            executor,
            triggerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryRecord1 {\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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
