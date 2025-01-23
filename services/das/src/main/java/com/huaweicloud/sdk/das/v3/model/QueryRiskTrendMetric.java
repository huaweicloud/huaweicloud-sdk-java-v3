package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 指标值
 */
public class QueryRiskTrendMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "series")

    private List<Double> series = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamps")

    private List<Long> timestamps = null;

    public QueryRiskTrendMetric withSeries(List<Double> series) {
        this.series = series;
        return this;
    }

    public QueryRiskTrendMetric addSeriesItem(Double seriesItem) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        this.series.add(seriesItem);
        return this;
    }

    public QueryRiskTrendMetric withSeries(Consumer<List<Double>> seriesSetter) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        seriesSetter.accept(this.series);
        return this;
    }

    /**
     * 数值
     * @return series
     */
    public List<Double> getSeries() {
        return series;
    }

    public void setSeries(List<Double> series) {
        this.series = series;
    }

    public QueryRiskTrendMetric withTimestamps(List<Long> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    public QueryRiskTrendMetric addTimestampsItem(Long timestampsItem) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        this.timestamps.add(timestampsItem);
        return this;
    }

    public QueryRiskTrendMetric withTimestamps(Consumer<List<Long>> timestampsSetter) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        timestampsSetter.accept(this.timestamps);
        return this;
    }

    /**
     * 时间戳
     * @return timestamps
     */
    public List<Long> getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(List<Long> timestamps) {
        this.timestamps = timestamps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryRiskTrendMetric that = (QueryRiskTrendMetric) obj;
        return Objects.equals(this.series, that.series) && Objects.equals(this.timestamps, that.timestamps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, timestamps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryRiskTrendMetric {\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
        sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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
