package com.huaweicloud.sdk.apig.v2.model;

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
public class ListMetricDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoints")

    private List<MetricData> datapoints = null;

    public ListMetricDataResponse withDatapoints(List<MetricData> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    public ListMetricDataResponse addDatapointsItem(MetricData datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public ListMetricDataResponse withDatapoints(Consumer<List<MetricData>> datapointsSetter) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * 指标数据列表
     * @return datapoints
     */
    public List<MetricData> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<MetricData> datapoints) {
        this.datapoints = datapoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMetricDataResponse listMetricDataResponse = (ListMetricDataResponse) o;
        return Objects.equals(this.datapoints, listMetricDataResponse.datapoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datapoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricDataResponse {\n");
        sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
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
