package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MetricCondition
 */
public class MetricCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_value")

    private Integer metricValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_mode")

    private String compareMode;

    public MetricCondition withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数描述**:  指标名称。  **约束限制**：  不涉及。  **取值范围**： - cpuTotalUsage：CPU使用率。 - memoryTotalUsage：内存使用率。  **默认取值**：  不涉及。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public MetricCondition withMetricValue(Integer metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * **参数描述**：  指标变配阈值。  **约束限制**：  取值为百分比的10000倍，比如50%对应的参数值为5000。  **取值范围**：  6000-8000。  **默认取值**：  不涉及。
     * @return metricValue
     */
    public Integer getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(Integer metricValue) {
        this.metricValue = metricValue;
    }

    public MetricCondition withCompareMode(String compareMode) {
        this.compareMode = compareMode;
        return this;
    }

    /**
     * **参数描述**：  比较模式。  **约束限制**：  不涉及。。  **取值范围**：  GT：大于。  **默认取值**：  不涉及。
     * @return compareMode
     */
    public String getCompareMode() {
        return compareMode;
    }

    public void setCompareMode(String compareMode) {
        this.compareMode = compareMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricCondition that = (MetricCondition) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.metricValue, that.metricValue)
            && Objects.equals(this.compareMode, that.compareMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, metricValue, compareMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricCondition {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
        sb.append("    compareMode: ").append(toIndentedString(compareMode)).append("\n");
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
