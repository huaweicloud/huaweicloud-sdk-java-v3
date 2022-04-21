package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量更新迁移用户请求体
 */
public class BatchUpdateSrcUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<UpdateUserReq> jobs = null;

    public BatchUpdateSrcUserReq withJobs(List<UpdateUserReq> jobs) {
        this.jobs = jobs;
        return this;
    }

    public BatchUpdateSrcUserReq addJobsItem(UpdateUserReq jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchUpdateSrcUserReq withJobs(Consumer<List<UpdateUserReq>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 批量更新迁移用户请求列表
     * @return jobs
     */
    public List<UpdateUserReq> getJobs() {
        return jobs;
    }

    public void setJobs(List<UpdateUserReq> jobs) {
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
        BatchUpdateSrcUserReq batchUpdateSrcUserReq = (BatchUpdateSrcUserReq) o;
        return Objects.equals(this.jobs, batchUpdateSrcUserReq.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateSrcUserReq {\n");
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
