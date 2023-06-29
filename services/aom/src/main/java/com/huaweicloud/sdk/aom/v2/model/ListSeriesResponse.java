package com.huaweicloud.sdk.aom.v2.model;

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
public class ListSeriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "series")

    private List<SeriesQueryItemResult> series = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private MetaDataSeries metaData;

    public ListSeriesResponse withSeries(List<SeriesQueryItemResult> series) {
        this.series = series;
        return this;
    }

    public ListSeriesResponse addSeriesItem(SeriesQueryItemResult seriesItem) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        this.series.add(seriesItem);
        return this;
    }

    public ListSeriesResponse withSeries(Consumer<List<SeriesQueryItemResult>> seriesSetter) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        seriesSetter.accept(this.series);
        return this;
    }

    /**
     * 时间序列对象列表。
     * @return series
     */
    public List<SeriesQueryItemResult> getSeries() {
        return series;
    }

    public void setSeries(List<SeriesQueryItemResult> series) {
        this.series = series;
    }

    public ListSeriesResponse withMetaData(MetaDataSeries metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListSeriesResponse withMetaData(Consumer<MetaDataSeries> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MetaDataSeries();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public MetaDataSeries getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataSeries metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSeriesResponse that = (ListSeriesResponse) obj;
        return Objects.equals(this.series, that.series) && Objects.equals(this.metaData, that.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSeriesResponse {\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
