package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSubscriptionListsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private SubscriptionListResp jobs;

    public ShowSubscriptionListsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 列表中的项目总数，与分页无关。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowSubscriptionListsResponse withJobs(SubscriptionListResp jobs) {
        this.jobs = jobs;
        return this;
    }

    public ShowSubscriptionListsResponse withJobs(Consumer<SubscriptionListResp> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new SubscriptionListResp();
            jobsSetter.accept(this.jobs);
        }

        return this;
    }

    /**
     * Get jobs
     * @return jobs
     */
    public SubscriptionListResp getJobs() {
        return jobs;
    }

    public void setJobs(SubscriptionListResp jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSubscriptionListsResponse that = (ShowSubscriptionListsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.jobs, that.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubscriptionListsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
