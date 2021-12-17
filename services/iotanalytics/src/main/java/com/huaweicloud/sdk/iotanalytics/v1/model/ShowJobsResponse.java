package com.huaweicloud.sdk.iotanalytics.v1.model;

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
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<StreamingJobInfoDto> jobs = null;

    public ShowJobsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /** 总数 minimum: 0 maximum: 2147483647
     * 
     * @return count */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowJobsResponse withJobs(List<StreamingJobInfoDto> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ShowJobsResponse addJobsItem(StreamingJobInfoDto jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ShowJobsResponse withJobs(Consumer<List<StreamingJobInfoDto>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /** 作业列表
     * 
     * @return jobs */
    public List<StreamingJobInfoDto> getJobs() {
        return jobs;
    }

    public void setJobs(List<StreamingJobInfoDto> jobs) {
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
        ShowJobsResponse showJobsResponse = (ShowJobsResponse) o;
        return Objects.equals(this.count, showJobsResponse.count) && Objects.equals(this.jobs, showJobsResponse.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
