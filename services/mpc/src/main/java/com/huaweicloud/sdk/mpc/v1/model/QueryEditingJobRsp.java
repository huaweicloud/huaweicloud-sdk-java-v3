package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** QueryEditingJobRsp */
public class QueryEditingJobRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<EditingJob> jobs = null;

    public QueryEditingJobRsp withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 任务总数 minimum: 0 maximum: 2147483647
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public QueryEditingJobRsp withJobs(List<EditingJob> jobs) {
        this.jobs = jobs;
        return this;
    }

    public QueryEditingJobRsp addJobsItem(EditingJob jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public QueryEditingJobRsp withJobs(Consumer<List<EditingJob>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /** 任务列表
     * 
     * @return jobs */
    public List<EditingJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<EditingJob> jobs) {
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
        QueryEditingJobRsp queryEditingJobRsp = (QueryEditingJobRsp) o;
        return Objects.equals(this.total, queryEditingJobRsp.total)
            && Objects.equals(this.jobs, queryEditingJobRsp.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryEditingJobRsp {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
