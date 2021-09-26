package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 批量设置同步策略请求体 */
public class BatchSetupSyncPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<SyncPolicyReq> jobs = null;

    public BatchSetupSyncPolicyReq withJobs(List<SyncPolicyReq> jobs) {
        this.jobs = jobs;
        return this;
    }

    public BatchSetupSyncPolicyReq addJobsItem(SyncPolicyReq jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchSetupSyncPolicyReq withJobs(Consumer<List<SyncPolicyReq>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /** 批量设置同步策略请求列表。
     * 
     * @return jobs */
    public List<SyncPolicyReq> getJobs() {
        return jobs;
    }

    public void setJobs(List<SyncPolicyReq> jobs) {
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
        BatchSetupSyncPolicyReq batchSetupSyncPolicyReq = (BatchSetupSyncPolicyReq) o;
        return Objects.equals(this.jobs, batchSetupSyncPolicyReq.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetupSyncPolicyReq {\n");
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
