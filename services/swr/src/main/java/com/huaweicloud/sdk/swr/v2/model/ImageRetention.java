package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageRetention
 */
public class ImageRetention {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private String algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<RetentionRuleResponseBody> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private TriggerConfig trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    public ImageRetention withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 老化策略ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ImageRetention withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 算法
     * @return algorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public ImageRetention withRules(List<RetentionRuleResponseBody> rules) {
        this.rules = rules;
        return this;
    }

    public ImageRetention addRulesItem(RetentionRuleResponseBody rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public ImageRetention withRules(Consumer<List<RetentionRuleResponseBody>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 匹配规则
     * @return rules
     */
    public List<RetentionRuleResponseBody> getRules() {
        return rules;
    }

    public void setRules(List<RetentionRuleResponseBody> rules) {
        this.rules = rules;
    }

    public ImageRetention withTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
        return this;
    }

    public ImageRetention withTrigger(Consumer<TriggerConfig> triggerSetter) {
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

    public ImageRetention withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启策略
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ImageRetention withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageRetention withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * 命名空间ID
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public ImageRetention withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageRetention that = (ImageRetention) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.algorithm, that.algorithm)
            && Objects.equals(this.rules, that.rules) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespaceId, that.namespaceId)
            && Objects.equals(this.namespaceName, that.namespaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, algorithm, rules, trigger, enabled, name, namespaceId, namespaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageRetention {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
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
