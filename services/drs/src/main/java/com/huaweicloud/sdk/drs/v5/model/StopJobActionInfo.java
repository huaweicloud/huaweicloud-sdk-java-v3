package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 结束任务请求体。
 */
public class StopJobActionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force_stop")

    private Boolean isForceStop;

    public StopJobActionInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StopJobActionInfo withIsForceStop(Boolean isForceStop) {
        this.isForceStop = isForceStop;
        return this;
    }

    /**
     * 强制结束任务时取值true，默认false。
     * @return isForceStop
     */
    public Boolean getIsForceStop() {
        return isForceStop;
    }

    public void setIsForceStop(Boolean isForceStop) {
        this.isForceStop = isForceStop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopJobActionInfo that = (StopJobActionInfo) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.isForceStop, that.isForceStop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, isForceStop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopJobActionInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    isForceStop: ").append(toIndentedString(isForceStop)).append("\n");
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
