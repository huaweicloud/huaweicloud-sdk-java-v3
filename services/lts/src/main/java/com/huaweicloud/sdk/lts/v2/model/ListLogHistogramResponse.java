package com.huaweicloud.sdk.lts.v2.model;

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
public class ListLogHistogramResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histogram")

    private List<LogCounts> histogram = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isQueryComplete")

    private Boolean isQueryComplete;

    public ListLogHistogramResponse withHistogram(List<LogCounts> histogram) {
        this.histogram = histogram;
        return this;
    }

    public ListLogHistogramResponse addHistogramItem(LogCounts histogramItem) {
        if (this.histogram == null) {
            this.histogram = new ArrayList<>();
        }
        this.histogram.add(histogramItem);
        return this;
    }

    public ListLogHistogramResponse withHistogram(Consumer<List<LogCounts>> histogramSetter) {
        if (this.histogram == null) {
            this.histogram = new ArrayList<>();
        }
        histogramSetter.accept(this.histogram);
        return this;
    }

    /**
     * **参数解释：** 直方图结果。 **取值范围：** 不涉及。
     * @return histogram
     */
    public List<LogCounts> getHistogram() {
        return histogram;
    }

    public void setHistogram(List<LogCounts> histogram) {
        this.histogram = histogram;
    }

    public ListLogHistogramResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 日志条数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListLogHistogramResponse withIsQueryComplete(Boolean isQueryComplete) {
        this.isQueryComplete = isQueryComplete;
        return this;
    }

    /**
     * 是否查询完成。
     * @return isQueryComplete
     */
    public Boolean getIsQueryComplete() {
        return isQueryComplete;
    }

    public void setIsQueryComplete(Boolean isQueryComplete) {
        this.isQueryComplete = isQueryComplete;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogHistogramResponse that = (ListLogHistogramResponse) obj;
        return Objects.equals(this.histogram, that.histogram) && Objects.equals(this.count, that.count)
            && Objects.equals(this.isQueryComplete, that.isQueryComplete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(histogram, count, isQueryComplete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogHistogramResponse {\n");
        sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    isQueryComplete: ").append(toIndentedString(isQueryComplete)).append("\n");
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
