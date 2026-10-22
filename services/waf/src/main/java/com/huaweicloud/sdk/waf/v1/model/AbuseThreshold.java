package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 算力滥用触发阈值
 */
public class AbuseThreshold {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_window_seconds")

    private Integer timeWindowSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<AbuseCondition> conditions = null;

    public AbuseThreshold withTimeWindowSeconds(Integer timeWindowSeconds) {
        this.timeWindowSeconds = timeWindowSeconds;
        return this;
    }

    /**
     * 统计时间窗口（秒），最大86400（1天）
     * minimum: 1
     * maximum: 86400
     * @return timeWindowSeconds
     */
    public Integer getTimeWindowSeconds() {
        return timeWindowSeconds;
    }

    public void setTimeWindowSeconds(Integer timeWindowSeconds) {
        this.timeWindowSeconds = timeWindowSeconds;
    }

    public AbuseThreshold withConditions(List<AbuseCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public AbuseThreshold addConditionsItem(AbuseCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public AbuseThreshold withConditions(Consumer<List<AbuseCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 阈值条件列表，当前仅支持1个条件
     * @return conditions
     */
    public List<AbuseCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<AbuseCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbuseThreshold that = (AbuseThreshold) obj;
        return Objects.equals(this.timeWindowSeconds, that.timeWindowSeconds)
            && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeWindowSeconds, conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbuseThreshold {\n");
        sb.append("    timeWindowSeconds: ").append(toIndentedString(timeWindowSeconds)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
