package com.huaweicloud.sdk.cloudpond.v2.model;

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
public class ListNetworkDeviceOfferingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offerings")

    private List<NetworkDeviceOffering> offerings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListNetworkDeviceOfferingsResponse withOfferings(List<NetworkDeviceOffering> offerings) {
        this.offerings = offerings;
        return this;
    }

    public ListNetworkDeviceOfferingsResponse addOfferingsItem(NetworkDeviceOffering offeringsItem) {
        if (this.offerings == null) {
            this.offerings = new ArrayList<>();
        }
        this.offerings.add(offeringsItem);
        return this;
    }

    public ListNetworkDeviceOfferingsResponse withOfferings(Consumer<List<NetworkDeviceOffering>> offeringsSetter) {
        if (this.offerings == null) {
            this.offerings = new ArrayList<>();
        }
        offeringsSetter.accept(this.offerings);
        return this;
    }

    /**
     * 商品列表
     * @return offerings
     */
    public List<NetworkDeviceOffering> getOfferings() {
        return offerings;
    }

    public void setOfferings(List<NetworkDeviceOffering> offerings) {
        this.offerings = offerings;
    }

    public ListNetworkDeviceOfferingsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListNetworkDeviceOfferingsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListNetworkDeviceOfferingsResponse that = (ListNetworkDeviceOfferingsResponse) obj;
        return Objects.equals(this.offerings, that.offerings) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerings, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworkDeviceOfferingsResponse {\n");
        sb.append("    offerings: ").append(toIndentedString(offerings)).append("\n");
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
