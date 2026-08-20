package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

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
public class ListSparkJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private SparkMarkerPageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<ListSparkJobResponseDto> jobs = null;

    public ListSparkJobsResponse withPageInfo(SparkMarkerPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListSparkJobsResponse withPageInfo(Consumer<SparkMarkerPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new SparkMarkerPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public SparkMarkerPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(SparkMarkerPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListSparkJobsResponse withJobs(List<ListSparkJobResponseDto> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListSparkJobsResponse addJobsItem(ListSparkJobResponseDto jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListSparkJobsResponse withJobs(Consumer<List<ListSparkJobResponseDto>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * **参数解释**：Spark作业列表，包含作业详细信息。
     * @return jobs
     */
    public List<ListSparkJobResponseDto> getJobs() {
        return jobs;
    }

    public void setJobs(List<ListSparkJobResponseDto> jobs) {
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
        ListSparkJobsResponse that = (ListSparkJobsResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.jobs, that.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSparkJobsResponse {\n");
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
