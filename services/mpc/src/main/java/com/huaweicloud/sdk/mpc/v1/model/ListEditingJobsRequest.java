package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListEditingJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private List<String> jobId = null;

    public ListEditingJobsRequest withJobId(List<String> jobId) {
        this.jobId = jobId;
        return this;
    }

    public ListEditingJobsRequest addJobIdItem(String jobIdItem) {
        if (this.jobId == null) {
            this.jobId = new ArrayList<>();
        }
        this.jobId.add(jobIdItem);
        return this;
    }

    public ListEditingJobsRequest withJobId(Consumer<List<String>> jobIdSetter) {
        if (this.jobId == null) {
            this.jobId = new ArrayList<>();
        }
        jobIdSetter.accept(this.jobId);
        return this;
    }

    /**
     * 任务ID。一次最多10个
     * @return jobId
     */
    public List<String> getJobId() {
        return jobId;
    }

    public void setJobId(List<String> jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEditingJobsRequest listEditingJobsRequest = (ListEditingJobsRequest) o;
        return Objects.equals(this.jobId, listEditingJobsRequest.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEditingJobsRequest {\n");
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
