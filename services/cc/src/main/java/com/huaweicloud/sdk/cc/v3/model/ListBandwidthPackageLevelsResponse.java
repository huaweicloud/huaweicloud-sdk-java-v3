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
public class ListBandwidthPackageLevelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package_levels")

    private List<BandwidthPackageLevel> bandwidthPackageLevels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListBandwidthPackageLevelsResponse withBandwidthPackageLevels(
        List<BandwidthPackageLevel> bandwidthPackageLevels) {
        this.bandwidthPackageLevels = bandwidthPackageLevels;
        return this;
    }

    public ListBandwidthPackageLevelsResponse addBandwidthPackageLevelsItem(
        BandwidthPackageLevel bandwidthPackageLevelsItem) {
        if (this.bandwidthPackageLevels == null) {
            this.bandwidthPackageLevels = new ArrayList<>();
        }
        this.bandwidthPackageLevels.add(bandwidthPackageLevelsItem);
        return this;
    }

    public ListBandwidthPackageLevelsResponse withBandwidthPackageLevels(
        Consumer<List<BandwidthPackageLevel>> bandwidthPackageLevelsSetter) {
        if (this.bandwidthPackageLevels == null) {
            this.bandwidthPackageLevels = new ArrayList<>();
        }
        bandwidthPackageLevelsSetter.accept(this.bandwidthPackageLevels);
        return this;
    }

    /**
     * 带宽包等级列表。
     * @return bandwidthPackageLevels
     */
    public List<BandwidthPackageLevel> getBandwidthPackageLevels() {
        return bandwidthPackageLevels;
    }

    public void setBandwidthPackageLevels(List<BandwidthPackageLevel> bandwidthPackageLevels) {
        this.bandwidthPackageLevels = bandwidthPackageLevels;
    }

    public ListBandwidthPackageLevelsResponse withRequestId(String requestId) {
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

    public ListBandwidthPackageLevelsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListBandwidthPackageLevelsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListBandwidthPackageLevelsResponse that = (ListBandwidthPackageLevelsResponse) obj;
        return Objects.equals(this.bandwidthPackageLevels, that.bandwidthPackageLevels)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPackageLevels, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthPackageLevelsResponse {\n");
        sb.append("    bandwidthPackageLevels: ").append(toIndentedString(bandwidthPackageLevels)).append("\n");
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
