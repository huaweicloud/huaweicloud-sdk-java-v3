package com.huaweicloud.sdk.ies.v1.model;

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
public class ListEdgeSitesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_sites")

    private List<EdgeSiteDetail> edgeSites = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListEdgeSitesResponse withEdgeSites(List<EdgeSiteDetail> edgeSites) {
        this.edgeSites = edgeSites;
        return this;
    }

    public ListEdgeSitesResponse addEdgeSitesItem(EdgeSiteDetail edgeSitesItem) {
        if (this.edgeSites == null) {
            this.edgeSites = new ArrayList<>();
        }
        this.edgeSites.add(edgeSitesItem);
        return this;
    }

    public ListEdgeSitesResponse withEdgeSites(Consumer<List<EdgeSiteDetail>> edgeSitesSetter) {
        if (this.edgeSites == null) {
            this.edgeSites = new ArrayList<>();
        }
        edgeSitesSetter.accept(this.edgeSites);
        return this;
    }

    /**
     * 边缘小站列表。
     * @return edgeSites
     */
    public List<EdgeSiteDetail> getEdgeSites() {
        return edgeSites;
    }

    public void setEdgeSites(List<EdgeSiteDetail> edgeSites) {
        this.edgeSites = edgeSites;
    }

    public ListEdgeSitesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListEdgeSitesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEdgeSitesResponse listEdgeSitesResponse = (ListEdgeSitesResponse) o;
        return Objects.equals(this.edgeSites, listEdgeSitesResponse.edgeSites)
            && Objects.equals(this.pageInfo, listEdgeSitesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeSites, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeSitesResponse {\n");
        sb.append("    edgeSites: ").append(toIndentedString(edgeSites)).append("\n");
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
