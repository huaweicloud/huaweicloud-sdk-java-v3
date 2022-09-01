package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 此参数在请求实体中，采用json字符串格式
 */
public class QueryLtsStructLogParamsNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    @JacksonXmlProperty(localName = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    @JacksonXmlProperty(localName = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    @JacksonXmlProperty(localName = "time_range")

    private TimeRange timeRange;

    public QueryLtsStructLogParamsNew withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * sql语句字符串。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public QueryLtsStructLogParamsNew withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 查询结果格式。当前仅支持：\"k-v\"。
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public QueryLtsStructLogParamsNew withTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public QueryLtsStructLogParamsNew withTimeRange(Consumer<TimeRange> timeRangeSetter) {
        if (this.timeRange == null) {
            this.timeRange = new TimeRange();
            timeRangeSetter.accept(this.timeRange);
        }

        return this;
    }

    /**
     * Get timeRange
     * @return timeRange
     */
    public TimeRange getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryLtsStructLogParamsNew queryLtsStructLogParamsNew = (QueryLtsStructLogParamsNew) o;
        return Objects.equals(this.query, queryLtsStructLogParamsNew.query)
            && Objects.equals(this.format, queryLtsStructLogParamsNew.format)
            && Objects.equals(this.timeRange, queryLtsStructLogParamsNew.timeRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query, format, timeRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryLtsStructLogParamsNew {\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
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
