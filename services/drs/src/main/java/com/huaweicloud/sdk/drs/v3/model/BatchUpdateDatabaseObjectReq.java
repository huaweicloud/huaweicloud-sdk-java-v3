package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 批量更新数据库对象选择消息体 */
public class BatchUpdateDatabaseObjectReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<UpdateDatabaseObjectReq> jobs = null;

    public BatchUpdateDatabaseObjectReq withJobs(List<UpdateDatabaseObjectReq> jobs) {
        this.jobs = jobs;
        return this;
    }

    public BatchUpdateDatabaseObjectReq addJobsItem(UpdateDatabaseObjectReq jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchUpdateDatabaseObjectReq withJobs(Consumer<List<UpdateDatabaseObjectReq>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /** 批量更新数据库对象请求任务ID列表
     * 
     * @return jobs */
    public List<UpdateDatabaseObjectReq> getJobs() {
        return jobs;
    }

    public void setJobs(List<UpdateDatabaseObjectReq> jobs) {
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
        BatchUpdateDatabaseObjectReq batchUpdateDatabaseObjectReq = (BatchUpdateDatabaseObjectReq) o;
        return Objects.equals(this.jobs, batchUpdateDatabaseObjectReq.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateDatabaseObjectReq {\n");
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
