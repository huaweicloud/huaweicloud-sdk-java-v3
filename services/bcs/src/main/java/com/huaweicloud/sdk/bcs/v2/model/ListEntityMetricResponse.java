package com.huaweicloud.sdk.bcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.EntityMetricList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEntityMetricResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metrics")
    
    private List<EntityMetricList> metrics = null;
    
    public ListEntityMetricResponse withMetrics(List<EntityMetricList> metrics) {
        this.metrics = metrics;
        return this;
    }

    
    public ListEntityMetricResponse addMetricsItem(EntityMetricList metricsItem) {
        if(this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ListEntityMetricResponse withMetrics(Consumer<List<EntityMetricList>> metricsSetter) {
        if(this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标对象列表。
     * @return metrics
     */
    public List<EntityMetricList> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<EntityMetricList> metrics) {
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
        ListEntityMetricResponse listEntityMetricResponse = (ListEntityMetricResponse) o;
        return Objects.equals(this.metrics, listEntityMetricResponse.metrics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metrics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEntityMetricResponse {\n");
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

