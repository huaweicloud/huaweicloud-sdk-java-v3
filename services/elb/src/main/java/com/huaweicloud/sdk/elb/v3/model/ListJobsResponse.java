package com.huaweicloud.sdk.elb.v3.model;

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
public class ListJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<MainJob> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListJobsResponse withJobs(List<MainJob> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ListJobsResponse addJobsItem(MainJob jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public ListJobsResponse withJobs(Consumer<List<MainJob>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * **参数解释**：任务列表。
     * @return jobs
     */
    public List<MainJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<MainJob> jobs) {
        this.jobs = jobs;
    }

    public ListJobsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListJobsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListJobsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobsResponse that = (ListJobsResponse) obj;
        return Objects.equals(this.jobs, that.jobs) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobsResponse {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
