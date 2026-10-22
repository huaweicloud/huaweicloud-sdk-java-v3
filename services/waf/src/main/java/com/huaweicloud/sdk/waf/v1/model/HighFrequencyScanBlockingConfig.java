package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * HighFrequencyScanBlockingConfig
 */
public class HighFrequencyScanBlockingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private PolicyAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private Integer timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_threshold")

    private Integer triggerThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_num_triggered_rules")

    private Integer maxNumTriggeredRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_period")

    private Integer blockingPeriod;

    public HighFrequencyScanBlockingConfig withAction(PolicyAction action) {
        this.action = action;
        return this;
    }

    public HighFrequencyScanBlockingConfig withAction(Consumer<PolicyAction> actionSetter) {
        if (this.action == null) {
            this.action = new PolicyAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public PolicyAction getAction() {
        return action;
    }

    public void setAction(PolicyAction action) {
        this.action = action;
    }

    public HighFrequencyScanBlockingConfig withTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * 检测时间范围，单位秒
     * @return timeRange
     */
    public Integer getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
    }

    public HighFrequencyScanBlockingConfig withTriggerThreshold(Integer triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
        return this;
    }

    /**
     * 触发阈值，在检测时间内扫描次数超过该值则触发封禁
     * @return triggerThreshold
     */
    public Integer getTriggerThreshold() {
        return triggerThreshold;
    }

    public void setTriggerThreshold(Integer triggerThreshold) {
        this.triggerThreshold = triggerThreshold;
    }

    public HighFrequencyScanBlockingConfig withMaxNumTriggeredRules(Integer maxNumTriggeredRules) {
        this.maxNumTriggeredRules = maxNumTriggeredRules;
        return this;
    }

    /**
     * 最大触发规则数，在检测时间内命中不同防护规则的数量达到该值时触发封禁
     * @return maxNumTriggeredRules
     */
    public Integer getMaxNumTriggeredRules() {
        return maxNumTriggeredRules;
    }

    public void setMaxNumTriggeredRules(Integer maxNumTriggeredRules) {
        this.maxNumTriggeredRules = maxNumTriggeredRules;
    }

    public HighFrequencyScanBlockingConfig withBlockingPeriod(Integer blockingPeriod) {
        this.blockingPeriod = blockingPeriod;
        return this;
    }

    /**
     * 封禁周期，单位秒
     * @return blockingPeriod
     */
    public Integer getBlockingPeriod() {
        return blockingPeriod;
    }

    public void setBlockingPeriod(Integer blockingPeriod) {
        this.blockingPeriod = blockingPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HighFrequencyScanBlockingConfig that = (HighFrequencyScanBlockingConfig) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.timeRange, that.timeRange)
            && Objects.equals(this.triggerThreshold, that.triggerThreshold)
            && Objects.equals(this.maxNumTriggeredRules, that.maxNumTriggeredRules)
            && Objects.equals(this.blockingPeriod, that.blockingPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, timeRange, triggerThreshold, maxNumTriggeredRules, blockingPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HighFrequencyScanBlockingConfig {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    triggerThreshold: ").append(toIndentedString(triggerThreshold)).append("\n");
        sb.append("    maxNumTriggeredRules: ").append(toIndentedString(maxNumTriggeredRules)).append("\n");
        sb.append("    blockingPeriod: ").append(toIndentedString(blockingPeriod)).append("\n");
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
