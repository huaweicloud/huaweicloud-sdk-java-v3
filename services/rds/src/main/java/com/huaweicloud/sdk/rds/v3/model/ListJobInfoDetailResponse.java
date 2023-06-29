package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListJobInfoDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private GetTaskDetailListRspJobs jobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListJobInfoDetailResponse withJobs(GetTaskDetailListRspJobs jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListJobInfoDetailResponse withJobs(Consumer<GetTaskDetailListRspJobs> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new GetTaskDetailListRspJobs();
            jobsSetter.accept(this.jobs);
        }

        return this;
    }

    /**
     * Get jobs
     * @return jobs
     */
    public GetTaskDetailListRspJobs getJobs() {
        return jobs;
    }

    public void setJobs(GetTaskDetailListRspJobs jobs) {
        this.jobs = jobs;
    }

    public ListJobInfoDetailResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 任务数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobInfoDetailResponse that = (ListJobInfoDetailResponse) obj;
        return Objects.equals(this.jobs, that.jobs) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobInfoDetailResponse {\n");
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
