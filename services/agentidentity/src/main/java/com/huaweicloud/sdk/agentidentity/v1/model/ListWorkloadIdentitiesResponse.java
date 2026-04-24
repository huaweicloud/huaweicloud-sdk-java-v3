package com.huaweicloud.sdk.agentidentity.v1.model;

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
public class ListWorkloadIdentitiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identities")

    private List<WorkloadIdentitySummary> workloadIdentities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListWorkloadIdentitiesResponse withWorkloadIdentities(List<WorkloadIdentitySummary> workloadIdentities) {
        this.workloadIdentities = workloadIdentities;
        return this;
    }

    public ListWorkloadIdentitiesResponse addWorkloadIdentitiesItem(WorkloadIdentitySummary workloadIdentitiesItem) {
        if (this.workloadIdentities == null) {
            this.workloadIdentities = new ArrayList<>();
        }
        this.workloadIdentities.add(workloadIdentitiesItem);
        return this;
    }

    public ListWorkloadIdentitiesResponse withWorkloadIdentities(
        Consumer<List<WorkloadIdentitySummary>> workloadIdentitiesSetter) {
        if (this.workloadIdentities == null) {
            this.workloadIdentities = new ArrayList<>();
        }
        workloadIdentitiesSetter.accept(this.workloadIdentities);
        return this;
    }

    /**
     * Get workloadIdentities
     * @return workloadIdentities
     */
    public List<WorkloadIdentitySummary> getWorkloadIdentities() {
        return workloadIdentities;
    }

    public void setWorkloadIdentities(List<WorkloadIdentitySummary> workloadIdentities) {
        this.workloadIdentities = workloadIdentities;
    }

    public ListWorkloadIdentitiesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListWorkloadIdentitiesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkloadIdentitiesResponse that = (ListWorkloadIdentitiesResponse) obj;
        return Objects.equals(this.workloadIdentities, that.workloadIdentities)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workloadIdentities, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkloadIdentitiesResponse {\n");
        sb.append("    workloadIdentities: ").append(toIndentedString(workloadIdentities)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
