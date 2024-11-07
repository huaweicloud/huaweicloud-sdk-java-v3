package com.huaweicloud.sdk.cc.v3.model;

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
public class ListBandwidthPackageSitesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package_sites")

    private List<BandwidthPackageSite> bandwidthPackageSites = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListBandwidthPackageSitesResponse withBandwidthPackageSites(
        List<BandwidthPackageSite> bandwidthPackageSites) {
        this.bandwidthPackageSites = bandwidthPackageSites;
        return this;
    }

    public ListBandwidthPackageSitesResponse addBandwidthPackageSitesItem(
        BandwidthPackageSite bandwidthPackageSitesItem) {
        if (this.bandwidthPackageSites == null) {
            this.bandwidthPackageSites = new ArrayList<>();
        }
        this.bandwidthPackageSites.add(bandwidthPackageSitesItem);
        return this;
    }

    public ListBandwidthPackageSitesResponse withBandwidthPackageSites(
        Consumer<List<BandwidthPackageSite>> bandwidthPackageSitesSetter) {
        if (this.bandwidthPackageSites == null) {
            this.bandwidthPackageSites = new ArrayList<>();
        }
        bandwidthPackageSitesSetter.accept(this.bandwidthPackageSites);
        return this;
    }

    /**
     * 站点列表表。
     * @return bandwidthPackageSites
     */
    public List<BandwidthPackageSite> getBandwidthPackageSites() {
        return bandwidthPackageSites;
    }

    public void setBandwidthPackageSites(List<BandwidthPackageSite> bandwidthPackageSites) {
        this.bandwidthPackageSites = bandwidthPackageSites;
    }

    public ListBandwidthPackageSitesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListBandwidthPackageSitesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListBandwidthPackageSitesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListBandwidthPackageSitesResponse that = (ListBandwidthPackageSitesResponse) obj;
        return Objects.equals(this.bandwidthPackageSites, that.bandwidthPackageSites)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPackageSites, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthPackageSitesResponse {\n");
        sb.append("    bandwidthPackageSites: ").append(toIndentedString(bandwidthPackageSites)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
