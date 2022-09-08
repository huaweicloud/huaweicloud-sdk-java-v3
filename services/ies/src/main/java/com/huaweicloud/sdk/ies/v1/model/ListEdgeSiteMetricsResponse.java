package com.huaweicloud.sdk.ies.v1.model;

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
public class ListEdgeSiteMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_data")

    private List<MetricDataDetail> metricData = null;

    public ListEdgeSiteMetricsResponse withMetricData(List<MetricDataDetail> metricData) {
        this.metricData = metricData;
        return this;
    }

    public ListEdgeSiteMetricsResponse addMetricDataItem(MetricDataDetail metricDataItem) {
        if (this.metricData == null) {
            this.metricData = new ArrayList<>();
        }
        this.metricData.add(metricDataItem);
        return this;
    }

    public ListEdgeSiteMetricsResponse withMetricData(Consumer<List<MetricDataDetail>> metricDataSetter) {
        if (this.metricData == null) {
            this.metricData = new ArrayList<>();
        }
        metricDataSetter.accept(this.metricData);
        return this;
    }

    /**
     * 监控数据
     * @return metricData
     */
    public List<MetricDataDetail> getMetricData() {
        return metricData;
    }

    public void setMetricData(List<MetricDataDetail> metricData) {
        this.metricData = metricData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEdgeSiteMetricsResponse listEdgeSiteMetricsResponse = (ListEdgeSiteMetricsResponse) o;
        return Objects.equals(this.metricData, listEdgeSiteMetricsResponse.metricData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeSiteMetricsResponse {\n");
        sb.append("    metricData: ").append(toIndentedString(metricData)).append("\n");
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
