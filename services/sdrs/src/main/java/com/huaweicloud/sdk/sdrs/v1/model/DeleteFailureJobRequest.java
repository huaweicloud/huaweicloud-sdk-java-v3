package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteFailureJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_job_id")

    private String failureJobId;

    public DeleteFailureJobRequest withFailureJobId(String failureJobId) {
        this.failureJobId = failureJobId;
        return this;
    }

    /** 失败任务ID。
     * 
     * @return failureJobId */
    public String getFailureJobId() {
        return failureJobId;
    }

    public void setFailureJobId(String failureJobId) {
        this.failureJobId = failureJobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteFailureJobRequest deleteFailureJobRequest = (DeleteFailureJobRequest) o;
        return Objects.equals(this.failureJobId, deleteFailureJobRequest.failureJobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failureJobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteFailureJobRequest {\n");
        sb.append("    failureJobId: ").append(toIndentedString(failureJobId)).append("\n");
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
