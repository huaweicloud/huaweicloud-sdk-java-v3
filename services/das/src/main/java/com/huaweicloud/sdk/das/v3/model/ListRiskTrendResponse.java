package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRiskTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_code")

    private String metricCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private QueryRiskTrendMetric metric;

    public ListRiskTrendResponse withMetricCode(String metricCode) {
        this.metricCode = metricCode;
        return this;
    }

    /**
     * 指标码
     * @return metricCode
     */
    public String getMetricCode() {
        return metricCode;
    }

    public void setMetricCode(String metricCode) {
        this.metricCode = metricCode;
    }

    public ListRiskTrendResponse withMetric(QueryRiskTrendMetric metric) {
        this.metric = metric;
        return this;
    }

    public ListRiskTrendResponse withMetric(Consumer<QueryRiskTrendMetric> metricSetter) {
        if (this.metric == null) {
            this.metric = new QueryRiskTrendMetric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public QueryRiskTrendMetric getMetric() {
        return metric;
    }

    public void setMetric(QueryRiskTrendMetric metric) {
        this.metric = metric;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRiskTrendResponse that = (ListRiskTrendResponse) obj;
        return Objects.equals(this.metricCode, that.metricCode) && Objects.equals(this.metric, that.metric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricCode, metric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRiskTrendResponse {\n");
        sb.append("    metricCode: ").append(toIndentedString(metricCode)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
