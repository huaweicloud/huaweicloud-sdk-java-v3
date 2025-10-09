package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数描述**：  变配条件。  **约束限制**：  至少各定义一个CPU使用率和内存使用率指标条件，最多各定义两个。
 */
public class ScalingCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_id")

    private String conditionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_conditions")

    private List<MetricCondition> metricConditions = null;

    public ScalingCondition withConditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    /**
     * **参数描述**:  变配条件名称。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字和中划线组成，且长度不超过32个字符，不能为空。  **默认取值**：  不涉及。
     * @return conditionId
     */
    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    public ScalingCondition withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数描述**：  持续时间，单位是毫秒。  **约束限制**：  不涉及。  **取值范围**：  2000-5000。  **默认取值**：  不涉及。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ScalingCondition withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * **参数解释**:  间隔时间，单位是毫秒。  **约束限制**：  不涉及。  **取值范围**：  1000-5000。  **默认取值**：  不涉及。
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public ScalingCondition withMetricConditions(List<MetricCondition> metricConditions) {
        this.metricConditions = metricConditions;
        return this;
    }

    public ScalingCondition addMetricConditionsItem(MetricCondition metricConditionsItem) {
        if (this.metricConditions == null) {
            this.metricConditions = new ArrayList<>();
        }
        this.metricConditions.add(metricConditionsItem);
        return this;
    }

    public ScalingCondition withMetricConditions(Consumer<List<MetricCondition>> metricConditionsSetter) {
        if (this.metricConditions == null) {
            this.metricConditions = new ArrayList<>();
        }
        metricConditionsSetter.accept(this.metricConditions);
        return this;
    }

    /**
     * **参数描述**:  指标变配条件。  **约束条件**：  不涉及。
     * @return metricConditions
     */
    public List<MetricCondition> getMetricConditions() {
        return metricConditions;
    }

    public void setMetricConditions(List<MetricCondition> metricConditions) {
        this.metricConditions = metricConditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScalingCondition that = (ScalingCondition) obj;
        return Objects.equals(this.conditionId, that.conditionId) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.metricConditions, that.metricConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionId, duration, interval, metricConditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingCondition {\n");
        sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    metricConditions: ").append(toIndentedString(metricConditions)).append("\n");
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
