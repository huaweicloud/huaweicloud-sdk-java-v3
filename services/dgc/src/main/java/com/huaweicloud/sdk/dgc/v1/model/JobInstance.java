package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobInstance
 */
public class JobInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobName")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planTime")

    private Integer planTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Integer endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executeTime")

    private Integer executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instancesId")

    private String instancesId;

    public JobInstance withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * Get jobName
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobInstance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobInstance withPlanTime(Integer planTime) {
        this.planTime = planTime;
        return this;
    }

    /**
     * Get planTime
     * @return planTime
     */
    public Integer getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Integer planTime) {
        this.planTime = planTime;
    }

    public JobInstance withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get startTime
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public JobInstance withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get endTime
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public JobInstance withExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * Get executeTime
     * @return executeTime
     */
    public Integer getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
    }

    public JobInstance withInstancesId(String instancesId) {
        this.instancesId = instancesId;
        return this;
    }

    /**
     * Get instancesId
     * @return instancesId
     */
    public String getInstancesId() {
        return instancesId;
    }

    public void setInstancesId(String instancesId) {
        this.instancesId = instancesId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobInstance jobInstance = (JobInstance) o;
        return Objects.equals(this.jobName, jobInstance.jobName) && Objects.equals(this.status, jobInstance.status)
            && Objects.equals(this.planTime, jobInstance.planTime)
            && Objects.equals(this.startTime, jobInstance.startTime)
            && Objects.equals(this.endTime, jobInstance.endTime)
            && Objects.equals(this.executeTime, jobInstance.executeTime)
            && Objects.equals(this.instancesId, jobInstance.instancesId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName, status, planTime, startTime, endTime, executeTime, instancesId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobInstance {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    instancesId: ").append(toIndentedString(instancesId)).append("\n");
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
