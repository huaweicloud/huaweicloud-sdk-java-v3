package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEditingJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_array")

    private List<QueryEditingJob> jobArray = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListEditingJobsResponse withJobArray(List<QueryEditingJob> jobArray) {
        this.jobArray = jobArray;
        return this;
    }

    public ListEditingJobsResponse addJobArrayItem(QueryEditingJob jobArrayItem) {
        if (this.jobArray == null) {
            this.jobArray = new ArrayList<>();
        }
        this.jobArray.add(jobArrayItem);
        return this;
    }

    public ListEditingJobsResponse withJobArray(Consumer<List<QueryEditingJob>> jobArraySetter) {
        if (this.jobArray == null) {
            this.jobArray = new ArrayList<>();
        }
        jobArraySetter.accept(this.jobArray);
        return this;
    }

    /**
     * 任务列表
     * @return jobArray
     */
    public List<QueryEditingJob> getJobArray() {
        return jobArray;
    }

    public void setJobArray(List<QueryEditingJob> jobArray) {
        this.jobArray = jobArray;
    }

    public ListEditingJobsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEditingJobsResponse listEditingJobsResponse = (ListEditingJobsResponse) o;
        return Objects.equals(this.jobArray, listEditingJobsResponse.jobArray)
            && Objects.equals(this.xRequestId, listEditingJobsResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobArray, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEditingJobsResponse {\n");
        sb.append("    jobArray: ").append(toIndentedString(jobArray)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
