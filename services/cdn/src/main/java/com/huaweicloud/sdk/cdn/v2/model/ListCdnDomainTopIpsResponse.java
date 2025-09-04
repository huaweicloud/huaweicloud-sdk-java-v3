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
public class ListCdnDomainTopIpsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_ip_summary")

    private List<TopIpSummary> topIpSummary = null;

    public ListCdnDomainTopIpsResponse withTopIpSummary(List<TopIpSummary> topIpSummary) {
        this.topIpSummary = topIpSummary;
        return this;
    }

    public ListCdnDomainTopIpsResponse addTopIpSummaryItem(TopIpSummary topIpSummaryItem) {
        if (this.topIpSummary == null) {
            this.topIpSummary = new ArrayList<>();
        }
        this.topIpSummary.add(topIpSummaryItem);
        return this;
    }

    public ListCdnDomainTopIpsResponse withTopIpSummary(Consumer<List<TopIpSummary>> topIpSummarySetter) {
        if (this.topIpSummary == null) {
            this.topIpSummary = new ArrayList<>();
        }
        topIpSummarySetter.accept(this.topIpSummary);
        return this;
    }

    /**
     * 详情数据对象。
     * @return topIpSummary
     */
    public List<TopIpSummary> getTopIpSummary() {
        return topIpSummary;
    }

    public void setTopIpSummary(List<TopIpSummary> topIpSummary) {
        this.topIpSummary = topIpSummary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCdnDomainTopIpsResponse that = (ListCdnDomainTopIpsResponse) obj;
        return Objects.equals(this.topIpSummary, that.topIpSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topIpSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCdnDomainTopIpsResponse {\n");
        sb.append("    topIpSummary: ").append(toIndentedString(topIpSummary)).append("\n");
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
