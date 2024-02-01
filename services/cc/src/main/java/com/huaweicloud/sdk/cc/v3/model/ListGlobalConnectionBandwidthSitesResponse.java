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
public class ListGlobalConnectionBandwidthSitesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_infos")

    private List<GlobalConnectionBandwidthSites> siteInfos = null;

    public ListGlobalConnectionBandwidthSitesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListGlobalConnectionBandwidthSitesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListGlobalConnectionBandwidthSitesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListGlobalConnectionBandwidthSitesResponse withSiteInfos(List<GlobalConnectionBandwidthSites> siteInfos) {
        this.siteInfos = siteInfos;
        return this;
    }

    public ListGlobalConnectionBandwidthSitesResponse addSiteInfosItem(GlobalConnectionBandwidthSites siteInfosItem) {
        if (this.siteInfos == null) {
            this.siteInfos = new ArrayList<>();
        }
        this.siteInfos.add(siteInfosItem);
        return this;
    }

    public ListGlobalConnectionBandwidthSitesResponse withSiteInfos(
        Consumer<List<GlobalConnectionBandwidthSites>> siteInfosSetter) {
        if (this.siteInfos == null) {
            this.siteInfos = new ArrayList<>();
        }
        siteInfosSetter.accept(this.siteInfos);
        return this;
    }

    /**
     * 站点信息列表响应体。
     * @return siteInfos
     */
    public List<GlobalConnectionBandwidthSites> getSiteInfos() {
        return siteInfos;
    }

    public void setSiteInfos(List<GlobalConnectionBandwidthSites> siteInfos) {
        this.siteInfos = siteInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConnectionBandwidthSitesResponse that = (ListGlobalConnectionBandwidthSitesResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.siteInfos, that.siteInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, siteInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConnectionBandwidthSitesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    siteInfos: ").append(toIndentedString(siteInfos)).append("\n");
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
