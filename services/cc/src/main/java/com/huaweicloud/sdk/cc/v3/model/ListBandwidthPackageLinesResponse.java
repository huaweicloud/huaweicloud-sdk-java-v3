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
public class ListBandwidthPackageLinesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_package_lines")

    private List<BandwidthPackageLine> bandwidthPackageLines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListBandwidthPackageLinesResponse withBandwidthPackageLines(
        List<BandwidthPackageLine> bandwidthPackageLines) {
        this.bandwidthPackageLines = bandwidthPackageLines;
        return this;
    }

    public ListBandwidthPackageLinesResponse addBandwidthPackageLinesItem(
        BandwidthPackageLine bandwidthPackageLinesItem) {
        if (this.bandwidthPackageLines == null) {
            this.bandwidthPackageLines = new ArrayList<>();
        }
        this.bandwidthPackageLines.add(bandwidthPackageLinesItem);
        return this;
    }

    public ListBandwidthPackageLinesResponse withBandwidthPackageLines(
        Consumer<List<BandwidthPackageLine>> bandwidthPackageLinesSetter) {
        if (this.bandwidthPackageLines == null) {
            this.bandwidthPackageLines = new ArrayList<>();
        }
        bandwidthPackageLinesSetter.accept(this.bandwidthPackageLines);
        return this;
    }

    /**
     * 带宽包线路列表。
     * @return bandwidthPackageLines
     */
    public List<BandwidthPackageLine> getBandwidthPackageLines() {
        return bandwidthPackageLines;
    }

    public void setBandwidthPackageLines(List<BandwidthPackageLine> bandwidthPackageLines) {
        this.bandwidthPackageLines = bandwidthPackageLines;
    }

    public ListBandwidthPackageLinesResponse withRequestId(String requestId) {
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

    public ListBandwidthPackageLinesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListBandwidthPackageLinesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListBandwidthPackageLinesResponse that = (ListBandwidthPackageLinesResponse) obj;
        return Objects.equals(this.bandwidthPackageLines, that.bandwidthPackageLines)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPackageLines, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthPackageLinesResponse {\n");
        sb.append("    bandwidthPackageLines: ").append(toIndentedString(bandwidthPackageLines)).append("\n");
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
