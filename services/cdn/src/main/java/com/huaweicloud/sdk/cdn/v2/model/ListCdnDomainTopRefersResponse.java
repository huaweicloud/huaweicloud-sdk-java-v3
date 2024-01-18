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
public class ListCdnDomainTopRefersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_refer_summary")

    private List<TopReferSummary> topReferSummary = null;

    public ListCdnDomainTopRefersResponse withTopReferSummary(List<TopReferSummary> topReferSummary) {
        this.topReferSummary = topReferSummary;
        return this;
    }

    public ListCdnDomainTopRefersResponse addTopReferSummaryItem(TopReferSummary topReferSummaryItem) {
        if (this.topReferSummary == null) {
            this.topReferSummary = new ArrayList<>();
        }
        this.topReferSummary.add(topReferSummaryItem);
        return this;
    }

    public ListCdnDomainTopRefersResponse withTopReferSummary(Consumer<List<TopReferSummary>> topReferSummarySetter) {
        if (this.topReferSummary == null) {
            this.topReferSummary = new ArrayList<>();
        }
        topReferSummarySetter.accept(this.topReferSummary);
        return this;
    }

    /**
     * 详情数据对象。
     * @return topReferSummary
     */
    public List<TopReferSummary> getTopReferSummary() {
        return topReferSummary;
    }

    public void setTopReferSummary(List<TopReferSummary> topReferSummary) {
        this.topReferSummary = topReferSummary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCdnDomainTopRefersResponse that = (ListCdnDomainTopRefersResponse) obj;
        return Objects.equals(this.topReferSummary, that.topReferSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topReferSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCdnDomainTopRefersResponse {\n");
        sb.append("    topReferSummary: ").append(toIndentedString(topReferSummary)).append("\n");
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
