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
public class ListAreaBandwidthPackageSpecificationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_specifications")

    private List<AreaBandwidthPackageSpecification> areaSpecifications = null;

    public ListAreaBandwidthPackageSpecificationsResponse withRequestId(String requestId) {
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

    public ListAreaBandwidthPackageSpecificationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAreaBandwidthPackageSpecificationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListAreaBandwidthPackageSpecificationsResponse withAreaSpecifications(
        List<AreaBandwidthPackageSpecification> areaSpecifications) {
        this.areaSpecifications = areaSpecifications;
        return this;
    }

    public ListAreaBandwidthPackageSpecificationsResponse addAreaSpecificationsItem(
        AreaBandwidthPackageSpecification areaSpecificationsItem) {
        if (this.areaSpecifications == null) {
            this.areaSpecifications = new ArrayList<>();
        }
        this.areaSpecifications.add(areaSpecificationsItem);
        return this;
    }

    public ListAreaBandwidthPackageSpecificationsResponse withAreaSpecifications(
        Consumer<List<AreaBandwidthPackageSpecification>> areaSpecificationsSetter) {
        if (this.areaSpecifications == null) {
            this.areaSpecifications = new ArrayList<>();
        }
        areaSpecificationsSetter.accept(this.areaSpecifications);
        return this;
    }

    /**
     * 大区带宽包规格列表。
     * @return areaSpecifications
     */
    public List<AreaBandwidthPackageSpecification> getAreaSpecifications() {
        return areaSpecifications;
    }

    public void setAreaSpecifications(List<AreaBandwidthPackageSpecification> areaSpecifications) {
        this.areaSpecifications = areaSpecifications;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAreaBandwidthPackageSpecificationsResponse that = (ListAreaBandwidthPackageSpecificationsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.areaSpecifications, that.areaSpecifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, areaSpecifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAreaBandwidthPackageSpecificationsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    areaSpecifications: ").append(toIndentedString(areaSpecifications)).append("\n");
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
