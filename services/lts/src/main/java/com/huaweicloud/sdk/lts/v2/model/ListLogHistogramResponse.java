package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListLogHistogramResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histogram")

    private String histogram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isQueryComplete")

    private Boolean isQueryComplete;

    public ListLogHistogramResponse withHistogram(String histogram) {
        this.histogram = histogram;
        return this;
    }

    /**
     * 直方图结果
     * @return histogram
     */
    public String getHistogram() {
        return histogram;
    }

    public void setHistogram(String histogram) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLogHistogramResponse listLogHistogramResponse = (ListLogHistogramResponse) o;
        return Objects.equals(this.histogram, listLogHistogramResponse.histogram)
            && Objects.equals(this.count, listLogHistogramResponse.count)
            && Objects.equals(this.isQueryComplete, listLogHistogramResponse.isQueryComplete);
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
