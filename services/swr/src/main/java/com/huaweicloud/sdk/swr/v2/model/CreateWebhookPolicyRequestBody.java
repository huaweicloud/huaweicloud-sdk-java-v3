package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateWebhookPolicyRequestBody
 */
public class CreateWebhookPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<Target> targets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_rules")

    private List<ScopeRule> scopeRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_types")

    private List<String> eventTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public CreateWebhookPolicyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 触发器名称，由字母、汉字、数字、下划线（_）、中划线 (-)组成，1-256个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWebhookPolicyRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 触发器描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWebhookPolicyRequestBody withTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    public CreateWebhookPolicyRequestBody addTargetsItem(Target targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public CreateWebhookPolicyRequestBody withTargets(Consumer<List<Target>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 触发器目标参数
     * @return targets
     */
    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    public CreateWebhookPolicyRequestBody withScopeRules(List<ScopeRule> scopeRules) {
        this.scopeRules = scopeRules;
        return this;
    }

    public CreateWebhookPolicyRequestBody addScopeRulesItem(ScopeRule scopeRulesItem) {
        if (this.scopeRules == null) {
            this.scopeRules = new ArrayList<>();
        }
        this.scopeRules.add(scopeRulesItem);
        return this;
    }

    public CreateWebhookPolicyRequestBody withScopeRules(Consumer<List<ScopeRule>> scopeRulesSetter) {
        if (this.scopeRules == null) {
            this.scopeRules = new ArrayList<>();
        }
        scopeRulesSetter.accept(this.scopeRules);
        return this;
    }

    /**
     * 作用范围规则
     * @return scopeRules
     */
    public List<ScopeRule> getScopeRules() {
        return scopeRules;
    }

    public void setScopeRules(List<ScopeRule> scopeRules) {
        this.scopeRules = scopeRules;
    }

    public CreateWebhookPolicyRequestBody withEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public CreateWebhookPolicyRequestBody addEventTypesItem(String eventTypesItem) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        this.eventTypes.add(eventTypesItem);
        return this;
    }

    public CreateWebhookPolicyRequestBody withEventTypes(Consumer<List<String>> eventTypesSetter) {
        if (this.eventTypes == null) {
            this.eventTypes = new ArrayList<>();
        }
        eventTypesSetter.accept(this.eventTypes);
        return this;
    }

    /**
     * 触发器触发条件，当前支持PUSH_ARTIFACT
     * @return eventTypes
     */
    public List<String> getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
    }

    public CreateWebhookPolicyRequestBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWebhookPolicyRequestBody that = (CreateWebhookPolicyRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.targets, that.targets) && Objects.equals(this.scopeRules, that.scopeRules)
            && Objects.equals(this.eventTypes, that.eventTypes) && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, targets, scopeRules, eventTypes, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWebhookPolicyRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    scopeRules: ").append(toIndentedString(scopeRules)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
