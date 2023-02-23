package com.huaweicloud.sdk.rms.v1.model;

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
public class ListAggregationAuthorizationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregation_authorizations")

    private List<AggregationAuthorizationResp> aggregationAuthorizations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListAggregationAuthorizationsResponse withAggregationAuthorizations(
        List<AggregationAuthorizationResp> aggregationAuthorizations) {
        this.aggregationAuthorizations = aggregationAuthorizations;
        return this;
    }

    public ListAggregationAuthorizationsResponse addAggregationAuthorizationsItem(
        AggregationAuthorizationResp aggregationAuthorizationsItem) {
        if (this.aggregationAuthorizations == null) {
            this.aggregationAuthorizations = new ArrayList<>();
        }
        this.aggregationAuthorizations.add(aggregationAuthorizationsItem);
        return this;
    }

    public ListAggregationAuthorizationsResponse withAggregationAuthorizations(
        Consumer<List<AggregationAuthorizationResp>> aggregationAuthorizationsSetter) {
        if (this.aggregationAuthorizations == null) {
            this.aggregationAuthorizations = new ArrayList<>();
        }
        aggregationAuthorizationsSetter.accept(this.aggregationAuthorizations);
        return this;
    }

    /**
     * 授权过的资源聚合器帐号列表。
     * @return aggregationAuthorizations
     */
    public List<AggregationAuthorizationResp> getAggregationAuthorizations() {
        return aggregationAuthorizations;
    }

    public void setAggregationAuthorizations(List<AggregationAuthorizationResp> aggregationAuthorizations) {
        this.aggregationAuthorizations = aggregationAuthorizations;
    }

    public ListAggregationAuthorizationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAggregationAuthorizationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListAggregationAuthorizationsResponse listAggregationAuthorizationsResponse =
            (ListAggregationAuthorizationsResponse) o;
        return Objects.equals(this.aggregationAuthorizations,
            listAggregationAuthorizationsResponse.aggregationAuthorizations)
            && Objects.equals(this.pageInfo, listAggregationAuthorizationsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregationAuthorizations, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAggregationAuthorizationsResponse {\n");
        sb.append("    aggregationAuthorizations: ").append(toIndentedString(aggregationAuthorizations)).append("\n");
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
