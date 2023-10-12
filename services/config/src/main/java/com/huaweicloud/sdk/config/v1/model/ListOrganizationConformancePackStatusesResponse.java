package com.huaweicloud.sdk.config.v1.model;

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
public class ListOrganizationConformancePackStatusesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statuses")

    private List<OrgConformancePackStatus> statuses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListOrganizationConformancePackStatusesResponse withStatuses(List<OrgConformancePackStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    public ListOrganizationConformancePackStatusesResponse addStatusesItem(OrgConformancePackStatus statusesItem) {
        if (this.statuses == null) {
            this.statuses = new ArrayList<>();
        }
        this.statuses.add(statusesItem);
        return this;
    }

    public ListOrganizationConformancePackStatusesResponse withStatuses(
        Consumer<List<OrgConformancePackStatus>> statusesSetter) {
        if (this.statuses == null) {
            this.statuses = new ArrayList<>();
        }
        statusesSetter.accept(this.statuses);
        return this;
    }

    /**
     * 组织合规规则包查询列表。
     * @return statuses
     */
    public List<OrgConformancePackStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<OrgConformancePackStatus> statuses) {
        this.statuses = statuses;
    }

    public ListOrganizationConformancePackStatusesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListOrganizationConformancePackStatusesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListOrganizationConformancePackStatusesResponse that = (ListOrganizationConformancePackStatusesResponse) obj;
        return Objects.equals(this.statuses, that.statuses) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statuses, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrganizationConformancePackStatusesResponse {\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
