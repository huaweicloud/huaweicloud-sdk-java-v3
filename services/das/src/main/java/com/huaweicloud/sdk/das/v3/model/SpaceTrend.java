package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SpaceTrend对象
 */
public class SpaceTrend {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "series")

    private List<Double> series = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamps")

    private List<Long> timestamps = null;

    public SpaceTrend withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SpaceTrend withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指标名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpaceTrend withSeries(List<Double> series) {
        this.series = series;
        return this;
    }

    public SpaceTrend addSeriesItem(Double seriesItem) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        this.series.add(seriesItem);
        return this;
    }

    public SpaceTrend withSeries(Consumer<List<Double>> seriesSetter) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        seriesSetter.accept(this.series);
        return this;
    }

    /**
     * 指标值列表
     * @return series
     */
    public List<Double> getSeries() {
        return series;
    }

    public void setSeries(List<Double> series) {
        this.series = series;
    }

    public SpaceTrend withTimestamps(List<Long> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    public SpaceTrend addTimestampsItem(Long timestampsItem) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        this.timestamps.add(timestampsItem);
        return this;
    }

    public SpaceTrend withTimestamps(Consumer<List<Long>> timestampsSetter) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        timestampsSetter.accept(this.timestamps);
        return this;
    }

    /**
     * 时间戳列表
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
        SpaceTrend that = (SpaceTrend) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.series, that.series) && Objects.equals(this.timestamps, that.timestamps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, name, series, timestamps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpaceTrend {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
