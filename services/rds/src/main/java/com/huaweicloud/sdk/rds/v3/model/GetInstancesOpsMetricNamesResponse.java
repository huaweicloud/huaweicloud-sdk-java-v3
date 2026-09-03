package com.huaweicloud.sdk.rds.v3.model;

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
public class GetInstancesOpsMetricNamesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<MetricItem> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim")

    private String dim;

    public GetInstancesOpsMetricNamesResponse withMetrics(List<MetricItem> metrics) {
        this.metrics = metrics;
        return this;
    }

    public GetInstancesOpsMetricNamesResponse addMetricsItem(MetricItem metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public GetInstancesOpsMetricNamesResponse withMetrics(Consumer<List<MetricItem>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * **参数解释**：  监控指标项列表。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return metrics
     */
    public List<MetricItem> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricItem> metrics) {
        this.metrics = metrics;
    }

    public GetInstancesOpsMetricNamesResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**：  CES命名空间。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public GetInstancesOpsMetricNamesResponse withDim(String dim) {
        this.dim = dim;
        return this;
    }

    /**
     * **参数解释**：  监控维度类型。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return dim
     */
    public String getDim() {
        return dim;
    }

    public void setDim(String dim) {
        this.dim = dim;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetInstancesOpsMetricNamesResponse that = (GetInstancesOpsMetricNamesResponse) obj;
        return Objects.equals(this.metrics, that.metrics) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.dim, that.dim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metrics, namespace, dim);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetInstancesOpsMetricNamesResponse {\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dim: ").append(toIndentedString(dim)).append("\n");
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
