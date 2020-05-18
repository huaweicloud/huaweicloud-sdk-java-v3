package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.MetaData;
import com.huaweicloud.sdk.ces.v1.model.MetricInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListMetricsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metrics")
    
    private List<MetricInfo> metrics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    private MetaData metaData = null;

    public ListMetricsResponse withMetrics(List<MetricInfo> metrics) {
        this.metrics = metrics;
        return this;
    }

    
    public ListMetricsResponse addMetricsItem(MetricInfo metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ListMetricsResponse withMetrics(Consumer<List<MetricInfo>> metricsSetter) {
        if(this.metrics == null ){
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标信息列表
     * @return metrics
     */
    public List<MetricInfo> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricInfo> metrics) {
        this.metrics = metrics;
    }

    public ListMetricsResponse withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListMetricsResponse withMetaData(Consumer<MetaData> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new MetaData();
        }
        metaDataSetter.accept(this.metaData);
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMetricsResponse listMetricsResponse = (ListMetricsResponse) o;
        return Objects.equals(this.metrics, listMetricsResponse.metrics) &&
            Objects.equals(this.metaData, listMetricsResponse.metaData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metrics, metaData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricsResponse {\n");
            sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

