package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateRetentionPolicyRequestBody
 */
public class UpdateRetentionPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private String algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<RetentionRule> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private TriggerConfig trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public UpdateRetentionPolicyRequestBody withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 算法，目前只支持or
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public UpdateRetentionPolicyRequestBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用或者关闭所有retentionRules
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UpdateRetentionPolicyRequestBody withRules(List<RetentionRule> rules) {
        this.rules = rules;
        return this;
    }

    public UpdateRetentionPolicyRequestBody addRulesItem(RetentionRule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public UpdateRetentionPolicyRequestBody withRules(Consumer<List<RetentionRule>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 匹配规则，数组长度只允许为1，配置repo范围、tag范围以及作用规则
     * @return rules
     */
    public List<RetentionRule> getRules() {
        return rules;
    }

    public void setRules(List<RetentionRule> rules) {
        this.rules = rules;
    }

    public UpdateRetentionPolicyRequestBody withTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
        return this;
    }

    public UpdateRetentionPolicyRequestBody withTrigger(Consumer<TriggerConfig> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new TriggerConfig();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public TriggerConfig getTrigger() {
        return trigger;
    }

    public void setTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
    }

    public UpdateRetentionPolicyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称，由字母、汉字、数字、下划线（_）、中划线 (-)组成，1-256个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRetentionPolicyRequestBody that = (UpdateRetentionPolicyRequestBody) obj;
        return Objects.equals(this.algorithm, that.algorithm) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.rules, that.rules) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algorithm, enabled, rules, trigger, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRetentionPolicyRequestBody {\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
