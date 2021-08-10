package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 集群批量测试连接任务请求体 */
public class BatchSpecialTestConnectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<BatchJobActionReq> jobs = null;

    public BatchSpecialTestConnectionReq withJobs(List<BatchJobActionReq> jobs) {
        this.jobs = jobs;
        return this;
    }

    public BatchSpecialTestConnectionReq addJobsItem(BatchJobActionReq jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchSpecialTestConnectionReq withJobs(Consumer<List<BatchJobActionReq>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /** 集群批量测试连接任务请求列表
     * 
     * @return jobs */
    public List<BatchJobActionReq> getJobs() {
        return jobs;
    }

    public void setJobs(List<BatchJobActionReq> jobs) {
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
        BatchSpecialTestConnectionReq batchSpecialTestConnectionReq = (BatchSpecialTestConnectionReq) o;
        return Objects.equals(this.jobs, batchSpecialTestConnectionReq.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSpecialTestConnectionReq {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
