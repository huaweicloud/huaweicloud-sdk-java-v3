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
public class ListServerOfferingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offerings")

    private List<ServerOffering> offerings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListServerOfferingsResponse withOfferings(List<ServerOffering> offerings) {
        this.offerings = offerings;
        return this;
    }

    public ListServerOfferingsResponse addOfferingsItem(ServerOffering offeringsItem) {
        if (this.offerings == null) {
            this.offerings = new ArrayList<>();
        }
        this.offerings.add(offeringsItem);
        return this;
    }

    public ListServerOfferingsResponse withOfferings(Consumer<List<ServerOffering>> offeringsSetter) {
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
    public List<ServerOffering> getOfferings() {
        return offerings;
    }

    public void setOfferings(List<ServerOffering> offerings) {
        this.offerings = offerings;
    }

    public ListServerOfferingsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListServerOfferingsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListServerOfferingsResponse that = (ListServerOfferingsResponse) obj;
        return Objects.equals(this.offerings, that.offerings) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerings, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerOfferingsResponse {\n");
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
