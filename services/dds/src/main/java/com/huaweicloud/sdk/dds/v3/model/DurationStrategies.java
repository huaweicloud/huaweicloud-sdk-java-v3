package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DurationStrategies
 */
public class DurationStrategies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private String strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_upgrade_duration")

    private Integer estimatedUpgradeDuration;

    public DurationStrategies withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * 升级策略 - minimized_interrupt_time，表示最短中断时间 - minimized_upgrade_time，最短升级时长
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public DurationStrategies withEstimatedUpgradeDuration(Integer estimatedUpgradeDuration) {
        this.estimatedUpgradeDuration = estimatedUpgradeDuration;
        return this;
    }

    /**
     * 升级时长，单位为分钟
     * @return estimatedUpgradeDuration
     */
    public Integer getEstimatedUpgradeDuration() {
        return estimatedUpgradeDuration;
    }

    public void setEstimatedUpgradeDuration(Integer estimatedUpgradeDuration) {
        this.estimatedUpgradeDuration = estimatedUpgradeDuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DurationStrategies durationStrategies = (DurationStrategies) o;
        return Objects.equals(this.strategy, durationStrategies.strategy)
            && Objects.equals(this.estimatedUpgradeDuration, durationStrategies.estimatedUpgradeDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategy, estimatedUpgradeDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DurationStrategies {\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    estimatedUpgradeDuration: ").append(toIndentedString(estimatedUpgradeDuration)).append("\n");
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
