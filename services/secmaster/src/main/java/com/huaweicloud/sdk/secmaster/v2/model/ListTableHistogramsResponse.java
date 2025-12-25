package com.huaweicloud.sdk.secmaster.v2.model;

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
public class ListTableHistogramsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histograms")

    private List<SearchQueryResultHistogram> histograms = null;

    public ListTableHistogramsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListTableHistogramsResponse withHistograms(List<SearchQueryResultHistogram> histograms) {
        this.histograms = histograms;
        return this;
    }

    public ListTableHistogramsResponse addHistogramsItem(SearchQueryResultHistogram histogramsItem) {
        if (this.histograms == null) {
            this.histograms = new ArrayList<>();
        }
        this.histograms.add(histogramsItem);
        return this;
    }

    public ListTableHistogramsResponse withHistograms(Consumer<List<SearchQueryResultHistogram>> histogramsSetter) {
        if (this.histograms == null) {
            this.histograms = new ArrayList<>();
        }
        histogramsSetter.accept(this.histograms);
        return this;
    }

    /**
     * 直方图
     * @return histograms
     */
    public List<SearchQueryResultHistogram> getHistograms() {
        return histograms;
    }

    public void setHistograms(List<SearchQueryResultHistogram> histograms) {
        this.histograms = histograms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTableHistogramsResponse that = (ListTableHistogramsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.histograms, that.histograms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, histograms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableHistogramsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    histograms: ").append(toIndentedString(histograms)).append("\n");
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
