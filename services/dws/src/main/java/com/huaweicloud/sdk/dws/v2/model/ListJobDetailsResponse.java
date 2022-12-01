package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListJobDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_code")

    private String failedCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_detail")

    private String failedDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    public ListJobDetailsResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListJobDetailsResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 任务名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListJobDetailsResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务开始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListJobDetailsResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListJobDetailsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务当前状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListJobDetailsResponse withFailedCode(String failedCode) {
        this.failedCode = failedCode;
        return this;
    }

    /**
     * 任务失败错误码
     * @return failedCode
     */
    public String getFailedCode() {
        return failedCode;
    }

    public void setFailedCode(String failedCode) {
        this.failedCode = failedCode;
    }

    public ListJobDetailsResponse withFailedDetail(String failedDetail) {
        this.failedDetail = failedDetail;
        return this;
    }

    /**
     * 任务失败错误详情
     * @return failedDetail
     */
    public String getFailedDetail() {
        return failedDetail;
    }

    public void setFailedDetail(String failedDetail) {
        this.failedDetail = failedDetail;
    }

    public ListJobDetailsResponse withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 任务进度
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListJobDetailsResponse listJobDetailsResponse = (ListJobDetailsResponse) o;
        return Objects.equals(this.jobId, listJobDetailsResponse.jobId)
            && Objects.equals(this.jobName, listJobDetailsResponse.jobName)
            && Objects.equals(this.beginTime, listJobDetailsResponse.beginTime)
            && Objects.equals(this.endTime, listJobDetailsResponse.endTime)
            && Objects.equals(this.status, listJobDetailsResponse.status)
            && Objects.equals(this.failedCode, listJobDetailsResponse.failedCode)
            && Objects.equals(this.failedDetail, listJobDetailsResponse.failedDetail)
            && Objects.equals(this.progress, listJobDetailsResponse.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobName, beginTime, endTime, status, failedCode, failedDetail, progress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobDetailsResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedCode: ").append(toIndentedString(failedCode)).append("\n");
        sb.append("    failedDetail: ").append(toIndentedString(failedDetail)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
