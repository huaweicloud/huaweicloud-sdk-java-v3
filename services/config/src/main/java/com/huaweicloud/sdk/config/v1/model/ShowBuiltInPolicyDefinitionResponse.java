package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBuiltInPolicyDefinitionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

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
    @JsonProperty(value = "default_resource_types")

    private List<PolicyDefinitionDefaultResourceTypes> defaultResourceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, PolicyParameterDefinition> parameters = null;

    public ShowBuiltInPolicyDefinitionResponse withId(String id) {
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

    public ShowBuiltInPolicyDefinitionResponse withName(String name) {
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

    public ShowBuiltInPolicyDefinitionResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 策略展示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowBuiltInPolicyDefinitionResponse withPolicyType(String policyType) {
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

    public ShowBuiltInPolicyDefinitionResponse withDescription(String description) {
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

    public ShowBuiltInPolicyDefinitionResponse withPolicyRuleType(String policyRuleType) {
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

    public ShowBuiltInPolicyDefinitionResponse withPolicyRule(Object policyRule) {
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

    public ShowBuiltInPolicyDefinitionResponse withTriggerType(String triggerType) {
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

    public ShowBuiltInPolicyDefinitionResponse withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public ShowBuiltInPolicyDefinitionResponse addKeywordsItem(String keywordsItem) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    public ShowBuiltInPolicyDefinitionResponse withKeywords(Consumer<List<String>> keywordsSetter) {
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

    public ShowBuiltInPolicyDefinitionResponse withDefaultResourceTypes(
        List<PolicyDefinitionDefaultResourceTypes> defaultResourceTypes) {
        this.defaultResourceTypes = defaultResourceTypes;
        return this;
    }

    public ShowBuiltInPolicyDefinitionResponse addDefaultResourceTypesItem(
        PolicyDefinitionDefaultResourceTypes defaultResourceTypesItem) {
        if (this.defaultResourceTypes == null) {
            this.defaultResourceTypes = new ArrayList<>();
        }
        this.defaultResourceTypes.add(defaultResourceTypesItem);
        return this;
    }

    public ShowBuiltInPolicyDefinitionResponse withDefaultResourceTypes(
        Consumer<List<PolicyDefinitionDefaultResourceTypes>> defaultResourceTypesSetter) {
        if (this.defaultResourceTypes == null) {
            this.defaultResourceTypes = new ArrayList<>();
        }
        defaultResourceTypesSetter.accept(this.defaultResourceTypes);
        return this;
    }

    /**
     * 默认资源类型列表
     * @return defaultResourceTypes
     */
    public List<PolicyDefinitionDefaultResourceTypes> getDefaultResourceTypes() {
        return defaultResourceTypes;
    }

    public void setDefaultResourceTypes(List<PolicyDefinitionDefaultResourceTypes> defaultResourceTypes) {
        this.defaultResourceTypes = defaultResourceTypes;
    }

    public ShowBuiltInPolicyDefinitionResponse withParameters(Map<String, PolicyParameterDefinition> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ShowBuiltInPolicyDefinitionResponse putParametersItem(String key, PolicyParameterDefinition parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public ShowBuiltInPolicyDefinitionResponse withParameters(
        Consumer<Map<String, PolicyParameterDefinition>> parametersSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBuiltInPolicyDefinitionResponse that = (ShowBuiltInPolicyDefinitionResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.policyType, that.policyType)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.policyRuleType, that.policyRuleType)
            && Objects.equals(this.policyRule, that.policyRule) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.keywords, that.keywords)
            && Objects.equals(this.defaultResourceTypes, that.defaultResourceTypes)
            && Objects.equals(this.parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            displayName,
            policyType,
            description,
            policyRuleType,
            policyRule,
            triggerType,
            keywords,
            defaultResourceTypes,
            parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBuiltInPolicyDefinitionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyRuleType: ").append(toIndentedString(policyRuleType)).append("\n");
        sb.append("    policyRule: ").append(toIndentedString(policyRule)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    defaultResourceTypes: ").append(toIndentedString(defaultResourceTypes)).append("\n");
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
