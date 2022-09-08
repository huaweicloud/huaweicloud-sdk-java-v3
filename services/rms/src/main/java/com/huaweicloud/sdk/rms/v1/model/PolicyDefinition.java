package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略定义
 */
public class PolicyDefinition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private String policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rule_type")

    private String policyRuleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rule")

    private Object policyRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private List<String> keywords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, PolicyParameterDefinition> parameters = null;

    public PolicyDefinition withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PolicyDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PolicyDefinition withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 策略类型
     * @return policyType
     */
    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public PolicyDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicyDefinition withPolicyRuleType(String policyRuleType) {
        this.policyRuleType = policyRuleType;
        return this;
    }

    /**
     * 策略语法类型
     * @return policyRuleType
     */
    public String getPolicyRuleType() {
        return policyRuleType;
    }

    public void setPolicyRuleType(String policyRuleType) {
        this.policyRuleType = policyRuleType;
    }

    public PolicyDefinition withPolicyRule(Object policyRule) {
        this.policyRule = policyRule;
        return this;
    }

    /**
     * 策略规则
     * @return policyRule
     */
    public Object getPolicyRule() {
        return policyRule;
    }

    public void setPolicyRule(Object policyRule) {
        this.policyRule = policyRule;
    }

    public PolicyDefinition withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发器类型，可选值：resource, period
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public PolicyDefinition withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public PolicyDefinition addKeywordsItem(String keywordsItem) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    public PolicyDefinition withKeywords(Consumer<List<String>> keywordsSetter) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        keywordsSetter.accept(this.keywords);
        return this;
    }

    /**
     * 关键词列表
     * @return keywords
     */
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public PolicyDefinition withParameters(Map<String, PolicyParameterDefinition> parameters) {
        this.parameters = parameters;
        return this;
    }

    public PolicyDefinition putParametersItem(String key, PolicyParameterDefinition parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public PolicyDefinition withParameters(Consumer<Map<String, PolicyParameterDefinition>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 策略参数
     * @return parameters
     */
    public Map<String, PolicyParameterDefinition> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, PolicyParameterDefinition> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyDefinition policyDefinition = (PolicyDefinition) o;
        return Objects.equals(this.id, policyDefinition.id) && Objects.equals(this.name, policyDefinition.name)
            && Objects.equals(this.policyType, policyDefinition.policyType)
            && Objects.equals(this.description, policyDefinition.description)
            && Objects.equals(this.policyRuleType, policyDefinition.policyRuleType)
            && Objects.equals(this.policyRule, policyDefinition.policyRule)
            && Objects.equals(this.triggerType, policyDefinition.triggerType)
            && Objects.equals(this.keywords, policyDefinition.keywords)
            && Objects.equals(this.parameters, policyDefinition.parameters);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, policyType, description, policyRuleType, policyRule, triggerType, keywords, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyDefinition {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyRuleType: ").append(toIndentedString(policyRuleType)).append("\n");
        sb.append("    policyRule: ").append(toIndentedString(policyRule)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
