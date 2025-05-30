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
public class ListRegionBandwidthPackageSpecificationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_specifications")

    private List<RegionBandwidthPackageSpecification> regionSpecifications = null;

    public ListRegionBandwidthPackageSpecificationsResponse withRequestId(String requestId) {
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

    public ListRegionBandwidthPackageSpecificationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListRegionBandwidthPackageSpecificationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListRegionBandwidthPackageSpecificationsResponse withRegionSpecifications(
        List<RegionBandwidthPackageSpecification> regionSpecifications) {
        this.regionSpecifications = regionSpecifications;
        return this;
    }

    public ListRegionBandwidthPackageSpecificationsResponse addRegionSpecificationsItem(
        RegionBandwidthPackageSpecification regionSpecificationsItem) {
        if (this.regionSpecifications == null) {
            this.regionSpecifications = new ArrayList<>();
        }
        this.regionSpecifications.add(regionSpecificationsItem);
        return this;
    }

    public ListRegionBandwidthPackageSpecificationsResponse withRegionSpecifications(
        Consumer<List<RegionBandwidthPackageSpecification>> regionSpecificationsSetter) {
        if (this.regionSpecifications == null) {
            this.regionSpecifications = new ArrayList<>();
        }
        regionSpecificationsSetter.accept(this.regionSpecifications);
        return this;
    }

    /**
     * 租户带宽包城域规格列表。
     * @return regionSpecifications
     */
    public List<RegionBandwidthPackageSpecification> getRegionSpecifications() {
        return regionSpecifications;
    }

    public void setRegionSpecifications(List<RegionBandwidthPackageSpecification> regionSpecifications) {
        this.regionSpecifications = regionSpecifications;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRegionBandwidthPackageSpecificationsResponse that = (ListRegionBandwidthPackageSpecificationsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.regionSpecifications, that.regionSpecifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, regionSpecifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRegionBandwidthPackageSpecificationsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    regionSpecifications: ").append(toIndentedString(regionSpecifications)).append("\n");
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
