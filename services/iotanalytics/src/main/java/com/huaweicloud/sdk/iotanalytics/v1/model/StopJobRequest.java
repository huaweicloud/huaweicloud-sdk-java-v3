package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class StopJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_savepoint")

    private Boolean triggerSavepoint;

    public StopJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 作业ID
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StopJobRequest withTriggerSavepoint(Boolean triggerSavepoint) {
        this.triggerSavepoint = triggerSavepoint;
        return this;
    }

    /** 停止作业触发savepoint
     * 
     * @return triggerSavepoint */
    public Boolean getTriggerSavepoint() {
        return triggerSavepoint;
    }

    public void setTriggerSavepoint(Boolean triggerSavepoint) {
        this.triggerSavepoint = triggerSavepoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopJobRequest stopJobRequest = (StopJobRequest) o;
        return Objects.equals(this.jobId, stopJobRequest.jobId)
            && Objects.equals(this.triggerSavepoint, stopJobRequest.triggerSavepoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, triggerSavepoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopJobRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    triggerSavepoint: ").append(toIndentedString(triggerSavepoint)).append("\n");
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
