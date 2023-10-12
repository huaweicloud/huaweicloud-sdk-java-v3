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
public class ListOrganizationConformancePacksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_conformance_packs")

    private List<OrgConformancePackResponse> organizationConformancePacks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListOrganizationConformancePacksResponse withOrganizationConformancePacks(
        List<OrgConformancePackResponse> organizationConformancePacks) {
        this.organizationConformancePacks = organizationConformancePacks;
        return this;
    }

    public ListOrganizationConformancePacksResponse addOrganizationConformancePacksItem(
        OrgConformancePackResponse organizationConformancePacksItem) {
        if (this.organizationConformancePacks == null) {
            this.organizationConformancePacks = new ArrayList<>();
        }
        this.organizationConformancePacks.add(organizationConformancePacksItem);
        return this;
    }

    public ListOrganizationConformancePacksResponse withOrganizationConformancePacks(
        Consumer<List<OrgConformancePackResponse>> organizationConformancePacksSetter) {
        if (this.organizationConformancePacks == null) {
            this.organizationConformancePacks = new ArrayList<>();
        }
        organizationConformancePacksSetter.accept(this.organizationConformancePacks);
        return this;
    }

    /**
     * 组织合规规则包查询列表。
     * @return organizationConformancePacks
     */
    public List<OrgConformancePackResponse> getOrganizationConformancePacks() {
        return organizationConformancePacks;
    }

    public void setOrganizationConformancePacks(List<OrgConformancePackResponse> organizationConformancePacks) {
        this.organizationConformancePacks = organizationConformancePacks;
    }

    public ListOrganizationConformancePacksResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListOrganizationConformancePacksResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListOrganizationConformancePacksResponse that = (ListOrganizationConformancePacksResponse) obj;
        return Objects.equals(this.organizationConformancePacks, that.organizationConformancePacks)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationConformancePacks, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrganizationConformancePacksResponse {\n");
        sb.append("    organizationConformancePacks: ")
            .append(toIndentedString(organizationConformancePacks))
            .append("\n");
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
