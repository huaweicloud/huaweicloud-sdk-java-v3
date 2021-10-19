package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListFailureJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_jobs")

    private List<FailureJobParams> failureJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListFailureJobsResponse withFailureJobs(List<FailureJobParams> failureJobs) {
        this.failureJobs = failureJobs;
        return this;
    }

    public ListFailureJobsResponse addFailureJobsItem(FailureJobParams failureJobsItem) {
        if (this.failureJobs == null) {
            this.failureJobs = new ArrayList<>();
        }
        this.failureJobs.add(failureJobsItem);
        return this;
    }

    public ListFailureJobsResponse withFailureJobs(Consumer<List<FailureJobParams>> failureJobsSetter) {
        if (this.failureJobs == null) {
            this.failureJobs = new ArrayList<>();
        }
        failureJobsSetter.accept(this.failureJobs);
        return this;
    }

    /** 失败任务信息列表。
     * 
     * @return failureJobs */
    public List<FailureJobParams> getFailureJobs() {
        return failureJobs;
    }

    public void setFailureJobs(List<FailureJobParams> failureJobs) {
        this.failureJobs = failureJobs;
    }

    public ListFailureJobsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 列表中失败任务个数。
     * 
     * @return count */
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
        ListFailureJobsResponse listFailureJobsResponse = (ListFailureJobsResponse) o;
        return Objects.equals(this.failureJobs, listFailureJobsResponse.failureJobs)
            && Objects.equals(this.count, listFailureJobsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failureJobs, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFailureJobsResponse {\n");
        sb.append("    failureJobs: ").append(toIndentedString(failureJobs)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
