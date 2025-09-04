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
public class ListCdnDomainTopUasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_ua_summary")

    private List<TopUaSummary> topUaSummary = null;

    public ListCdnDomainTopUasResponse withTopUaSummary(List<TopUaSummary> topUaSummary) {
        this.topUaSummary = topUaSummary;
        return this;
    }

    public ListCdnDomainTopUasResponse addTopUaSummaryItem(TopUaSummary topUaSummaryItem) {
        if (this.topUaSummary == null) {
            this.topUaSummary = new ArrayList<>();
        }
        this.topUaSummary.add(topUaSummaryItem);
        return this;
    }

    public ListCdnDomainTopUasResponse withTopUaSummary(Consumer<List<TopUaSummary>> topUaSummarySetter) {
        if (this.topUaSummary == null) {
            this.topUaSummary = new ArrayList<>();
        }
        topUaSummarySetter.accept(this.topUaSummary);
        return this;
    }

    /**
     * 详情数据对象。
     * @return topUaSummary
     */
    public List<TopUaSummary> getTopUaSummary() {
        return topUaSummary;
    }

    public void setTopUaSummary(List<TopUaSummary> topUaSummary) {
        this.topUaSummary = topUaSummary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCdnDomainTopUasResponse that = (ListCdnDomainTopUasResponse) obj;
        return Objects.equals(this.topUaSummary, that.topUaSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topUaSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCdnDomainTopUasResponse {\n");
        sb.append("    topUaSummary: ").append(toIndentedString(topUaSummary)).append("\n");
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
