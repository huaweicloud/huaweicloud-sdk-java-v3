package com.huaweicloud.sdk.drs.v5.model;

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
public class ListLinksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_links")

    private List<JobLinkResp> jobLinks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListLinksResponse withJobLinks(List<JobLinkResp> jobLinks) {
        this.jobLinks = jobLinks;
        return this;
    }

    public ListLinksResponse addJobLinksItem(JobLinkResp jobLinksItem) {
        if (this.jobLinks == null) {
            this.jobLinks = new ArrayList<>();
        }
        this.jobLinks.add(jobLinksItem);
        return this;
    }

    public ListLinksResponse withJobLinks(Consumer<List<JobLinkResp>> jobLinksSetter) {
        if (this.jobLinks == null) {
            this.jobLinks = new ArrayList<>();
        }
        jobLinksSetter.accept(this.jobLinks);
        return this;
    }

    /**
     * 可用链路信息。
     * @return jobLinks
     */
    public List<JobLinkResp> getJobLinks() {
        return jobLinks;
    }

    public void setJobLinks(List<JobLinkResp> jobLinks) {
        this.jobLinks = jobLinks;
    }

    public ListLinksResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 可用链路总条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLinksResponse listLinksResponse = (ListLinksResponse) o;
        return Objects.equals(this.jobLinks, listLinksResponse.jobLinks)
            && Objects.equals(this.totalCount, listLinksResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobLinks, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLinksResponse {\n");
        sb.append("    jobLinks: ").append(toIndentedString(jobLinks)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
