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
public class ListCdnDomainTopPathResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_path_summary")

    private List<TopPathSummary> topPathSummary = null;

    public ListCdnDomainTopPathResponse withTopPathSummary(List<TopPathSummary> topPathSummary) {
        this.topPathSummary = topPathSummary;
        return this;
    }

    public ListCdnDomainTopPathResponse addTopPathSummaryItem(TopPathSummary topPathSummaryItem) {
        if (this.topPathSummary == null) {
            this.topPathSummary = new ArrayList<>();
        }
        this.topPathSummary.add(topPathSummaryItem);
        return this;
    }

    public ListCdnDomainTopPathResponse withTopPathSummary(Consumer<List<TopPathSummary>> topPathSummarySetter) {
        if (this.topPathSummary == null) {
            this.topPathSummary = new ArrayList<>();
        }
        topPathSummarySetter.accept(this.topPathSummary);
        return this;
    }

    /**
     * 详情数据对象。
     * @return topPathSummary
     */
    public List<TopPathSummary> getTopPathSummary() {
        return topPathSummary;
    }

    public void setTopPathSummary(List<TopPathSummary> topPathSummary) {
        this.topPathSummary = topPathSummary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCdnDomainTopPathResponse that = (ListCdnDomainTopPathResponse) obj;
        return Objects.equals(this.topPathSummary, that.topPathSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topPathSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCdnDomainTopPathResponse {\n");
        sb.append("    topPathSummary: ").append(toIndentedString(topPathSummary)).append("\n");
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
