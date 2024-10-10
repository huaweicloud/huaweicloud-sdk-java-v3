package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * JobInformation
 */
public class JobInformation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workSpace")

    private String workSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobName")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobId")

    private Long jobId;

    public JobInformation withWorkSpace(String workSpace) {
        this.workSpace = workSpace;
        return this;
    }

    /**
     * 下游作业的工作空间名称
     * @return workSpace
     */
    public String getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(String workSpace) {
        this.workSpace = workSpace;
    }

    public JobInformation withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 下游作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobInformation withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 下游作业ID
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
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
        JobInformation that = (JobInformation) obj;
        return Objects.equals(this.workSpace, that.workSpace) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workSpace, jobName, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobInformation {\n");
        sb.append("    workSpace: ").append(toIndentedString(workSpace)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
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
