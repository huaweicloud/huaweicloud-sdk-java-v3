package com.huaweicloud.sdk.codeartscheck.v2.model;

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

    private String ruleId;

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
     * **参数解释:** 规则配置ID。可调用[[获取规则列表接口](https://support.huaweicloud.com/api-codecheck/ListRules.html)](tag:hws)[[获取规则列表接口](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ListRules.html)](tag:hws_hk)[获取规则列表接口](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)获取规则配置ID。 **约束限制:** 不涉及。 **取值范围:** 32位UUID。 **默认取值:** 不涉及。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RuleConfig withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释:** 工具规则ID，即可配置阈值规则的各种阈值对应的ID，当前无便利手段获取，请联系客服咨询。 **约束限制:** 不涉及。 **取值范围:** 32位UUID。 **默认取值:** 不涉及。
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public RuleConfig withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * **参数解释:** 配置参数默认阈值。 **约束限制:** 不涉及。 **取值范围:** 不涉及。 **默认取值:** 不涉及。
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
     * **参数解释:** 配置参数新阈值。 **约束限制:** 不涉及。 **取值范围:** 不涉及。 **默认取值:** 不涉及。
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
     * **参数解释:** 当前规则配置项key。可调用[[获取规则列表接口](https://support.huaweicloud.com/api-codecheck/ListRules.html)](tag:hws)[[获取规则列表接口](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ListRules.html)](tag:hws_hk)[获取规则列表接口](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)获取规则配置ID。 **约束限制:** 需要和规则ID相匹配。 **取值范围:** 不涉及。 **默认取值:** 不涉及。
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
     * **参数解释:** 当前规则配置项key。可调用[[获取规则列表接口](https://support.huaweicloud.com/api-codecheck/ListRules.html)](tag:hws)[[获取规则列表接口](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ListRules.html)](tag:hws_hk)[获取规则列表接口](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)获取规则配置ID。 **约束限制:** 需要和规则ID相匹配。 **取值范围:** 不涉及。 **默认取值:** 不涉及。
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
     * **参数解释:** 规则集ID。可调用[[查询规则集列表](https://support.huaweicloud.com/api-codecheck/ListRulesets.html)](tag:hws)[[查询规则集列表](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ListRulesets.html)](tag:hws_hk)[查询规则集列表](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)获取规则集ID。 **约束限制:** 不涉及。 **取值范围:** 32位UUID。 **默认取值:** 不涉及。
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
     * **参数解释:** 配置参数的描述。可不填。 **约束限制:** 不涉及。 **取值范围:** 不涉及。 **默认取值:** 不涉及。
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
