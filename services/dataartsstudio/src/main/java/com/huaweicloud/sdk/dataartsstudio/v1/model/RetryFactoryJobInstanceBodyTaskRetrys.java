package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RetryFactoryJobInstanceBodyTaskRetrys
 */
public class RetryFactoryJobInstanceBodyTaskRetrys {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_time")

    private Long planTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submit_time")

    private Long submitTime;

    public RetryFactoryJobInstanceBodyTaskRetrys withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id，当前重跑实例的作业id。
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public RetryFactoryJobInstanceBodyTaskRetrys withPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }

    /**
     * 实例计划时间，13位时间戳，可通过查询作业实例列表接口获取。
     * @return planTime
     */
    public Long getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }

    public RetryFactoryJobInstanceBodyTaskRetrys withSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * 实例提交时间，13位时间戳，可通过查询作业实例列表接口获取。
     * @return submitTime
     */
    public Long getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryFactoryJobInstanceBodyTaskRetrys that = (RetryFactoryJobInstanceBodyTaskRetrys) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.planTime, that.planTime)
            && Objects.equals(this.submitTime, that.submitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, planTime, submitTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryFactoryJobInstanceBodyTaskRetrys {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
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
