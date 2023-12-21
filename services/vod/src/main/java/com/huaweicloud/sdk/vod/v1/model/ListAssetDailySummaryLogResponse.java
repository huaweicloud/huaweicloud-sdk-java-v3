package com.huaweicloud.sdk.vod.v1.model;

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
public class ListAssetDailySummaryLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary_results")

    private List<AssetDailySummaryResult> summaryResults = null;

    public ListAssetDailySummaryLogResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 记录总数 
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListAssetDailySummaryLogResponse withSummaryResults(List<AssetDailySummaryResult> summaryResults) {
        this.summaryResults = summaryResults;
        return this;
    }

    public ListAssetDailySummaryLogResponse addSummaryResultsItem(AssetDailySummaryResult summaryResultsItem) {
        if (this.summaryResults == null) {
            this.summaryResults = new ArrayList<>();
        }
        this.summaryResults.add(summaryResultsItem);
        return this;
    }

    public ListAssetDailySummaryLogResponse withSummaryResults(
        Consumer<List<AssetDailySummaryResult>> summaryResultsSetter) {
        if (this.summaryResults == null) {
            this.summaryResults = new ArrayList<>();
        }
        summaryResultsSetter.accept(this.summaryResults);
        return this;
    }

    /**
     * 日志文件列表 
     * @return summaryResults
     */
    public List<AssetDailySummaryResult> getSummaryResults() {
        return summaryResults;
    }

    public void setSummaryResults(List<AssetDailySummaryResult> summaryResults) {
        this.summaryResults = summaryResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAssetDailySummaryLogResponse that = (ListAssetDailySummaryLogResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.summaryResults, that.summaryResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, summaryResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetDailySummaryLogResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    summaryResults: ").append(toIndentedString(summaryResults)).append("\n");
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
