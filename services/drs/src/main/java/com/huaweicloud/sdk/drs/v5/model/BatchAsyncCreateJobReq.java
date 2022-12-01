package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量异步创建任务请求体。
 */
public class BatchAsyncCreateJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<AsyncCreateJobReq> jobs = null;

    public BatchAsyncCreateJobReq withJobs(List<AsyncCreateJobReq> jobs) {
        this.jobs = jobs;
        return this;
    }

    public BatchAsyncCreateJobReq addJobsItem(AsyncCreateJobReq jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchAsyncCreateJobReq withJobs(Consumer<List<AsyncCreateJobReq>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 异步创建任务请求体。
     * @return jobs
     */
    public List<AsyncCreateJobReq> getJobs() {
        return jobs;
    }

    public void setJobs(List<AsyncCreateJobReq> jobs) {
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
        BatchAsyncCreateJobReq batchAsyncCreateJobReq = (BatchAsyncCreateJobReq) o;
        return Objects.equals(this.jobs, batchAsyncCreateJobReq.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAsyncCreateJobReq {\n");
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
