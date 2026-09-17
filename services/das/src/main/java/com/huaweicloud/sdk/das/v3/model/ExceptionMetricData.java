package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExceptionMetricData对象
 */
public class ExceptionMetricData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "series")

    private List<Double> series = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamps")

    private List<Long> timestamps = null;

    public ExceptionMetricData withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ExceptionMetricData withName(String name) {
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

    public ExceptionMetricData withSeries(List<Double> series) {
        this.series = series;
        return this;
    }

    public ExceptionMetricData addSeriesItem(Double seriesItem) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        this.series.add(seriesItem);
        return this;
    }

    public ExceptionMetricData withSeries(Consumer<List<Double>> seriesSetter) {
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

    public ExceptionMetricData withTimestamps(List<Long> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    public ExceptionMetricData addTimestampsItem(Long timestampsItem) {
        if (this.timestamps == null) {
            this.timestamps = new ArrayList<>();
        }
        this.timestamps.add(timestampsItem);
        return this;
    }

    public ExceptionMetricData withTimestamps(Consumer<List<Long>> timestampsSetter) {
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
        ExceptionMetricData that = (ExceptionMetricData) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.series, that.series) && Objects.equals(this.timestamps, that.timestamps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, name, series, timestamps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExceptionMetricData {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
