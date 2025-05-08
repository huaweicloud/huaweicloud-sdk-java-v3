package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateKafkaReassignmentTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reassignment_time")

    private Integer reassignmentTime;

    public CreateKafkaReassignmentTaskResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID（当执行分区平衡任务时仅返回job_id）。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateKafkaReassignmentTaskResponse withReassignmentTime(Integer reassignmentTime) {
        this.reassignmentTime = reassignmentTime;
        return this;
    }

    /**
     * 预估时间，单位为秒（当执行预估时间任务时仅返回reassignment_time）。
     * @return reassignmentTime
     */
    public Integer getReassignmentTime() {
        return reassignmentTime;
    }

    public void setReassignmentTime(Integer reassignmentTime) {
        this.reassignmentTime = reassignmentTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKafkaReassignmentTaskResponse that = (CreateKafkaReassignmentTaskResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.reassignmentTime, that.reassignmentTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, reassignmentTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKafkaReassignmentTaskResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    reassignmentTime: ").append(toIndentedString(reassignmentTime)).append("\n");
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
