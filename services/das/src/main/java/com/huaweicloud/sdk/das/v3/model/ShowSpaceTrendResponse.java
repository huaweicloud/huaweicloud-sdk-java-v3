package com.huaweicloud.sdk.das.v3.model;

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
public class ShowSpaceTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "series")

    private List<SpaceTrend> series = null;

    public ShowSpaceTrendResponse withSeries(List<SpaceTrend> series) {
        this.series = series;
        return this;
    }

    public ShowSpaceTrendResponse addSeriesItem(SpaceTrend seriesItem) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        this.series.add(seriesItem);
        return this;
    }

    public ShowSpaceTrendResponse withSeries(Consumer<List<SpaceTrend>> seriesSetter) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        seriesSetter.accept(this.series);
        return this;
    }

    /**
     * 空间趋势指标列表
     * @return series
     */
    public List<SpaceTrend> getSeries() {
        return series;
    }

    public void setSeries(List<SpaceTrend> series) {
        this.series = series;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSpaceTrendResponse that = (ShowSpaceTrendResponse) obj;
        return Objects.equals(this.series, that.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSpaceTrendResponse {\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
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
