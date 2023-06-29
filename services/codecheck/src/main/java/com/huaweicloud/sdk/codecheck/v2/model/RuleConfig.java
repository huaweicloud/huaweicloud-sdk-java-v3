package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleConfig
 */
public class RuleConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private Integer ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option_value")

    private String optionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option_key")

    private String optionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option_name")

    private String optionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public RuleConfig withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 规则配置ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RuleConfig withRuleId(Integer ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则ID
     * @return ruleId
     */
    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public RuleConfig withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 默认值
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public RuleConfig withOptionValue(String optionValue) {
        this.optionValue = optionValue;
        return this;
    }

    /**
     * 当前
     * @return optionValue
     */
    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public RuleConfig withOptionKey(String optionKey) {
        this.optionKey = optionKey;
        return this;
    }

    /**
     * 当前规则配置项key
     * @return optionKey
     */
    public String getOptionKey() {
        return optionKey;
    }

    public void setOptionKey(String optionKey) {
        this.optionKey = optionKey;
    }

    public RuleConfig withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * 当前规则配置项名称
     * @return optionName
     */
    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public RuleConfig withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 规则集id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public RuleConfig withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleConfig that = (RuleConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.optionValue, that.optionValue) && Objects.equals(this.optionKey, that.optionKey)
            && Objects.equals(this.optionName, that.optionName) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ruleId, defaultValue, optionValue, optionKey, optionName, templateId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    optionValue: ").append(toIndentedString(optionValue)).append("\n");
        sb.append("    optionKey: ").append(toIndentedString(optionKey)).append("\n");
        sb.append("    optionName: ").append(toIndentedString(optionName)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
