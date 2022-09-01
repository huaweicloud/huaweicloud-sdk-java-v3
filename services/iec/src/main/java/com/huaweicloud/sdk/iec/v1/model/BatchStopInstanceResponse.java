package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchStopInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    @JacksonXmlProperty(localName = "jobs")

    private List<JobResult> jobs = null;

    public BatchStopInstanceResponse withJobs(List<JobResult> jobs) {
        this.jobs = jobs;
        return this;
    }

    public BatchStopInstanceResponse addJobsItem(JobResult jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchStopInstanceResponse withJobs(Consumer<List<JobResult>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 任务列表对象。
     * @return jobs
     */
    public List<JobResult> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobResult> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchStopInstanceResponse batchStopInstanceResponse = (BatchStopInstanceResponse) o;
        return Objects.equals(this.jobs, batchStopInstanceResponse.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStopInstanceResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
