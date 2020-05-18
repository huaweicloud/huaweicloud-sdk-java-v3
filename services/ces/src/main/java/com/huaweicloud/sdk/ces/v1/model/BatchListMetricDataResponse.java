package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.BatchMetricData;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class BatchListMetricDataResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metrics")
    
    private List<BatchMetricData> metrics = null;
    
    public BatchListMetricDataResponse withMetrics(List<BatchMetricData> metrics) {
        this.metrics = metrics;
        return this;
    }

    
    public BatchListMetricDataResponse addMetricsItem(BatchMetricData metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public BatchListMetricDataResponse withMetrics(Consumer<List<BatchMetricData>> metricsSetter) {
        if(this.metrics == null ){
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 
     * @return metrics
     */
    public List<BatchMetricData> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<BatchMetricData> metrics) {
        this.metrics = metrics;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchListMetricDataResponse batchListMetricDataResponse = (BatchListMetricDataResponse) o;
        return Objects.equals(this.metrics, batchListMetricDataResponse.metrics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metrics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListMetricDataResponse {\n");
            sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

