package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 监控信息。
 */
public class ServerMetricData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoints")

    private List<ServerDataPoints> datapoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_value")

    private String dimensionValue;

    public ServerMetricData withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 监控指标名称。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ServerMetricData withDatapoints(List<ServerDataPoints> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    public ServerMetricData addDatapointsItem(ServerDataPoints datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public ServerMetricData withDatapoints(Consumer<List<ServerDataPoints>> datapointsSetter) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * 指标数据列表。
     * @return datapoints
     */
    public List<ServerDataPoints> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<ServerDataPoints> datapoints) {
        this.datapoints = datapoints;
    }

    public ServerMetricData withDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
        return this;
    }

    /**
     * 维度值，仅查询GPU监控信息时有值。
     * @return dimensionValue
     */
    public String getDimensionValue() {
        return dimensionValue;
    }

    public void setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerMetricData that = (ServerMetricData) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.datapoints, that.datapoints)
            && Objects.equals(this.dimensionValue, that.dimensionValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, datapoints, dimensionValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerMetricData {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
        sb.append("    dimensionValue: ").append(toIndentedString(dimensionValue)).append("\n");
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
