package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNextflowJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<NextflowJobListDto> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListNextflowJobResponse withJobs(List<NextflowJobListDto> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListNextflowJobResponse addJobsItem(NextflowJobListDto jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListNextflowJobResponse withJobs(Consumer<List<NextflowJobListDto>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 作业列表
     * @return jobs
     */
    public List<NextflowJobListDto> getJobs() {
        return jobs;
    }

    public void setJobs(List<NextflowJobListDto> jobs) {
        this.jobs = jobs;
    }

    public ListNextflowJobResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 作业总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNextflowJobResponse listNextflowJobResponse = (ListNextflowJobResponse) o;
        return Objects.equals(this.jobs, listNextflowJobResponse.jobs)
            && Objects.equals(this.count, listNextflowJobResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNextflowJobResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
