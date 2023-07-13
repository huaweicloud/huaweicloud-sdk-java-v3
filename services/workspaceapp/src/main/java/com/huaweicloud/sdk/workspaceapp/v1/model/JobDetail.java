package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Job信息详情
 */
public class JobDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private Integer jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_status")

    private Integer jobStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs")

    private List<SubJobInfo> subJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private OffsetDateTime beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_end_time")

    private OffsetDateTime expectedEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_code")

    private String executeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_message")

    private String executeMessage;

    public JobDetail withJobId(String jobId) {
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

    public JobDetail withJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * job类型,固定值1
     * @return jobType
     */
    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public JobDetail withJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * job执行状态 - 0：失败。（如果是开通失败，云运营查询到失败状态，直接退费给客户。如果是变更失败，当前是发运维工单，暂时还不是直接退费给客户） - 1：成功。（处理结果成功） - 2：处理中。 - 3：正在初始化。
     * @return jobStatus
     */
    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public JobDetail withSubJobs(List<SubJobInfo> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    public JobDetail addSubJobsItem(SubJobInfo subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public JobDetail withSubJobs(Consumer<List<SubJobInfo>> subJobsSetter) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 子任务信息
     * @return subJobs
     */
    public List<SubJobInfo> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<SubJobInfo> subJobs) {
        this.subJobs = subJobs;
    }

    public JobDetail withBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * Job处理开始时间
     * @return beginTime
     */
    public OffsetDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public JobDetail withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * job处理结束时间
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public JobDetail withExpectedEndTime(OffsetDateTime expectedEndTime) {
        this.expectedEndTime = expectedEndTime;
        return this;
    }

    /**
     * 云服务预估的Job处理结束时间，只针对job有效，针对子job无效
     * @return expectedEndTime
     */
    public OffsetDateTime getExpectedEndTime() {
        return expectedEndTime;
    }

    public void setExpectedEndTime(OffsetDateTime expectedEndTime) {
        this.expectedEndTime = expectedEndTime;
    }

    public JobDetail withExecuteCode(String executeCode) {
        this.executeCode = executeCode;
        return this;
    }

    /**
     * Job执行结果码
     * @return executeCode
     */
    public String getExecuteCode() {
        return executeCode;
    }

    public void setExecuteCode(String executeCode) {
        this.executeCode = executeCode;
    }

    public JobDetail withExecuteMessage(String executeMessage) {
        this.executeMessage = executeMessage;
        return this;
    }

    /**
     * Job执行结果描述，以及每个SubJob的执行结果描述
     * @return executeMessage
     */
    public String getExecuteMessage() {
        return executeMessage;
    }

    public void setExecuteMessage(String executeMessage) {
        this.executeMessage = executeMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobDetail that = (JobDetail) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.jobStatus, that.jobStatus) && Objects.equals(this.subJobs, that.subJobs)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.expectedEndTime, that.expectedEndTime)
            && Objects.equals(this.executeCode, that.executeCode)
            && Objects.equals(this.executeMessage, that.executeMessage);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(jobId, jobType, jobStatus, subJobs, beginTime, endTime, expectedEndTime, executeCode, executeMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDetail {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    expectedEndTime: ").append(toIndentedString(expectedEndTime)).append("\n");
        sb.append("    executeCode: ").append(toIndentedString(executeCode)).append("\n");
        sb.append("    executeMessage: ").append(toIndentedString(executeMessage)).append("\n");
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
