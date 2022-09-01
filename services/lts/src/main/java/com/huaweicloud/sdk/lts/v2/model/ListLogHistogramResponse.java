package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListLogHistogramResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histogram")

    @JacksonXmlProperty(localName = "histogram")

    private String histogram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Long count;

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
            && Objects.equals(this.count, listLogHistogramResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(histogram, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogHistogramResponse {\n");
        sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
