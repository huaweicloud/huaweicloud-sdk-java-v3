package com.huaweicloud.sdk.cloudbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowLastHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_id")

    private String recordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_number")

    private Integer buildNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    public ShowLastHistoryResponse withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /** 构建记录id--唯一key
     * 
     * @return recordId */
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public ShowLastHistoryResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 构建任务ID
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowLastHistoryResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /** 构建任务名称
     * 
     * @return jobName */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowLastHistoryResponse withBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
        return this;
    }

    /** 构建编号
     * 
     * @return buildNumber */
    public Integer getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
    }

    public ShowLastHistoryResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 构建开始时间
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowLastHistoryResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 构建结束时间
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowLastHistoryResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /** 构建执行结果
     * 
     * @return result */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ShowLastHistoryResponse withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /** commitId
     * 
     * @return commitId */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLastHistoryResponse showLastHistoryResponse = (ShowLastHistoryResponse) o;
        return Objects.equals(this.recordId, showLastHistoryResponse.recordId)
            && Objects.equals(this.jobId, showLastHistoryResponse.jobId)
            && Objects.equals(this.jobName, showLastHistoryResponse.jobName)
            && Objects.equals(this.buildNumber, showLastHistoryResponse.buildNumber)
            && Objects.equals(this.startTime, showLastHistoryResponse.startTime)
            && Objects.equals(this.endTime, showLastHistoryResponse.endTime)
            && Objects.equals(this.result, showLastHistoryResponse.result)
            && Objects.equals(this.commitId, showLastHistoryResponse.commitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, jobId, jobName, buildNumber, startTime, endTime, result, commitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLastHistoryResponse {\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
