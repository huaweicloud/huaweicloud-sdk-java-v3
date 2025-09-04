package com.huaweicloud.sdk.cdn.v2.model;

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
public class ListCdnDomainTopOriginUrlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_origin_url_summary")

    private List<TopOriginUrlSummary> topOriginUrlSummary = null;

    public ListCdnDomainTopOriginUrlResponse withTopOriginUrlSummary(List<TopOriginUrlSummary> topOriginUrlSummary) {
        this.topOriginUrlSummary = topOriginUrlSummary;
        return this;
    }

    public ListCdnDomainTopOriginUrlResponse addTopOriginUrlSummaryItem(TopOriginUrlSummary topOriginUrlSummaryItem) {
        if (this.topOriginUrlSummary == null) {
            this.topOriginUrlSummary = new ArrayList<>();
        }
        this.topOriginUrlSummary.add(topOriginUrlSummaryItem);
        return this;
    }

    public ListCdnDomainTopOriginUrlResponse withTopOriginUrlSummary(
        Consumer<List<TopOriginUrlSummary>> topOriginUrlSummarySetter) {
        if (this.topOriginUrlSummary == null) {
            this.topOriginUrlSummary = new ArrayList<>();
        }
        topOriginUrlSummarySetter.accept(this.topOriginUrlSummary);
        return this;
    }

    /**
     * 详情数据对象。
     * @return topOriginUrlSummary
     */
    public List<TopOriginUrlSummary> getTopOriginUrlSummary() {
        return topOriginUrlSummary;
    }

    public void setTopOriginUrlSummary(List<TopOriginUrlSummary> topOriginUrlSummary) {
        this.topOriginUrlSummary = topOriginUrlSummary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCdnDomainTopOriginUrlResponse that = (ListCdnDomainTopOriginUrlResponse) obj;
        return Objects.equals(this.topOriginUrlSummary, that.topOriginUrlSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topOriginUrlSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCdnDomainTopOriginUrlResponse {\n");
        sb.append("    topOriginUrlSummary: ").append(toIndentedString(topOriginUrlSummary)).append("\n");
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
