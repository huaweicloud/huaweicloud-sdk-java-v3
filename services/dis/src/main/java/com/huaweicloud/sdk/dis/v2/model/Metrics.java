package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据对象。
 */
public class Metrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataPoints")

    private List<DataPoint> dataPoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    public Metrics withDataPoints(List<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    public Metrics addDataPointsItem(DataPoint dataPointsItem) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public Metrics withDataPoints(Consumer<List<DataPoint>> dataPointsSetter) {
        if (this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * 监控数据。
     * @return dataPoints
     */
    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public Metrics withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 监控指标。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metrics that = (Metrics) obj;
        return Objects.equals(this.dataPoints, that.dataPoints) && Objects.equals(this.label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataPoints, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metrics {\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
