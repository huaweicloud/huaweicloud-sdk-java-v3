package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ListFlinkJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private MarkerPageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<FlinkJobSummary> jobs = null;

    public ListFlinkJobsResponse withPageInfo(MarkerPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListFlinkJobsResponse withPageInfo(Consumer<MarkerPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new MarkerPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public MarkerPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(MarkerPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListFlinkJobsResponse withJobs(List<FlinkJobSummary> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListFlinkJobsResponse addJobsItem(FlinkJobSummary jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListFlinkJobsResponse withJobs(Consumer<List<FlinkJobSummary>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * **参数解释**：详细的Flink作业列表，包含0~1000个FlinkJobSummary对象。 
     * @return jobs
     */
    public List<FlinkJobSummary> getJobs() {
        return jobs;
    }

    public void setJobs(List<FlinkJobSummary> jobs) {
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
        ListFlinkJobsResponse that = (ListFlinkJobsResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.jobs, that.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlinkJobsResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
