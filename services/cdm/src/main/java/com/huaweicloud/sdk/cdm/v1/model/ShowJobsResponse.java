package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<Job> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple")

    private Boolean simple;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    public ShowJobsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 作业数
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowJobsResponse withJobs(List<Job> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ShowJobsResponse addJobsItem(Job jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ShowJobsResponse withJobs(Consumer<List<Job>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /** 作业列表，请参见jobs参数说明
     * 
     * @return jobs */
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public ShowJobsResponse withSimple(Boolean simple) {
        this.simple = simple;
        return this;
    }

    /** 当为“true”时返回精简消息，即作业参数只返回参数名和值，不返回参数的“size”、“type”、“id”等属性
     * 
     * @return simple */
    public Boolean getSimple() {
        return simple;
    }

    public void setSimple(Boolean simple) {
        this.simple = simple;
    }

    public ShowJobsResponse withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /** 返回指定页号的作业
     * 
     * @return pageNo */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ShowJobsResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /** 每页作业数
     * 
     * @return pageSize */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobsResponse showJobsResponse = (ShowJobsResponse) o;
        return Objects.equals(this.total, showJobsResponse.total) && Objects.equals(this.jobs, showJobsResponse.jobs)
            && Objects.equals(this.simple, showJobsResponse.simple)
            && Objects.equals(this.pageNo, showJobsResponse.pageNo)
            && Objects.equals(this.pageSize, showJobsResponse.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, jobs, simple, pageNo, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
