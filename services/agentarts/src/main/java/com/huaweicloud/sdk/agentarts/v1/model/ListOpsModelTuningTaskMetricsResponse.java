package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsModelTuningTaskMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<OpsTuningStepMetric> metrics = null;

    public ListOpsModelTuningTaskMetricsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 满足条件的指标记录总数，用于计算分页总页数，单位：条。  **取值范围：** 大于等于0的整数。
     * minimum: 0
     * maximum: 100000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsModelTuningTaskMetricsResponse withMetrics(List<OpsTuningStepMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public ListOpsModelTuningTaskMetricsResponse addMetricsItem(OpsTuningStepMetric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ListOpsModelTuningTaskMetricsResponse withMetrics(Consumer<List<OpsTuningStepMetric>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * **参数解释：** 当前分页下的训练指标详情列表。  **取值范围：** 符合OpsTuningStepMetric定义的对象数组。
     * @return metrics
     */
    public List<OpsTuningStepMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<OpsTuningStepMetric> metrics) {
        this.metrics = metrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsModelTuningTaskMetricsResponse that = (ListOpsModelTuningTaskMetricsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.metrics, that.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsModelTuningTaskMetricsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
