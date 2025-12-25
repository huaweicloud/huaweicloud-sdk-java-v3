package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ListSearchHistogramsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histograms")

    private List<Histogram> histograms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    public ListSearchHistogramsResponse withHistograms(List<Histogram> histograms) {
        this.histograms = histograms;
        return this;
    }

    public ListSearchHistogramsResponse addHistogramsItem(Histogram histogramsItem) {
        if (this.histograms == null) {
            this.histograms = new ArrayList<>();
        }
        this.histograms.add(histogramsItem);
        return this;
    }

    public ListSearchHistogramsResponse withHistograms(Consumer<List<Histogram>> histogramsSetter) {
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
    public List<Histogram> getHistograms() {
        return histograms;
    }

    public void setHistograms(List<Histogram> histograms) {
        this.histograms = histograms;
    }

    public ListSearchHistogramsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 数据总条数
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSearchHistogramsResponse that = (ListSearchHistogramsResponse) obj;
        return Objects.equals(this.histograms, that.histograms) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(histograms, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSearchHistogramsResponse {\n");
        sb.append("    histograms: ").append(toIndentedString(histograms)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
