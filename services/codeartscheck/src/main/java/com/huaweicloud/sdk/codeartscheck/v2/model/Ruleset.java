package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建规则集信息。
 */
public class Ruleset {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private String isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_ids")

    private String ruleIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uncheck_ids")

    private String uncheckIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_attributes")

    private List<CustomAttributes> customAttributes = null;

    public Ruleset withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释:** 项目的32位UUID，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/zh-cn/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)接口获取。 **约束限制:** 不涉及。 **取值范围:** 长度为[1~32]个字符。 **默认取值:** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Ruleset withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * **参数解释:** 新规则集名称。 **约束限制:** 不能含有任意中英文，数字，点，连字符-及下划线_以外的特殊字符。 **取值范围:** 任意中英文，数字，点，连字符-及下划线_。长度为[1~128]个字符。 **默认取值:** 不涉及。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Ruleset withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释:** 规则集语言。 **约束限制:** 只能选择当前系统上支持的语言。 **取值范围:** 只能传一种语言。当前支持的语言有： - ARKTS - C# - CANGJIE - C++ - CSS - GO - HTML - JAVA - JAVASCRIPT - KOTLIN - LUA - PHP - PYTHON - RUST - SCALA - SHELL - SQL - TERRAFORM - TYPESCRIPT - AZURERESOURCEMANAGER - DOCKER - KUBERNETES **默认取值:** 不涉及。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Ruleset withIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * **参数解释:** 是否基于已存在的规则集创建新规则集。 **约束限制:** 只能填0或1。 **取值范围:** - 0：新建空白规则集。 - 1：基于已存在的规则集创建新规则集。 **默认取值:** 不涉及。
     * @return isDefault
     */
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public Ruleset withRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    /**
     * **参数解释:** 新启用规则ID集合，启用多条规则时，id用英文逗号相连。可调用[[获取规则列表接口](https://support.huaweicloud.com/api-codecheck/ListRules.html)](tag:hws)[[获取规则列表接口](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ListRules.html)](tag:hws_hk)[获取规则列表接口](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)获取规则ID。 **约束限制:** 规则ID为32位UUID，多个ID之间用英文逗号分隔。例如：\"00034fc32ee045388365d42ca4e07fe1,002c2eda6d6c11edab16fa163e0fa374\"。 **取值范围:** 长度为[1~4000]个字符。 **默认取值:** 不涉及。
     * @return ruleIds
     */
    public String getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
    }

    public Ruleset withUncheckIds(String uncheckIds) {
        this.uncheckIds = uncheckIds;
        return this;
    }

    /**
     * **参数解释:** 新关闭规则ID集合，多个ID用英文逗号相连。可调用[[获取规则列表接口](https://support.huaweicloud.com/api-codecheck/ListRules.html)](tag:hws)[[获取规则列表接口](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ListRules.html)](tag:hws_hk)[获取规则列表接口](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)获取规则ID。 **约束限制:** 规则ID为32位UUID，多个ID之间用英文逗号分隔。例如：\"00034fc32ee045388365d42ca4e07fe1,002c2eda6d6c11edab16fa163e0fa374\"。 **取值范围:** 长度为[1~4000]个字符。 **默认取值:** 不涉及。
     * @return uncheckIds
     */
    public String getUncheckIds() {
        return uncheckIds;
    }

    public void setUncheckIds(String uncheckIds) {
        this.uncheckIds = uncheckIds;
    }

    public Ruleset withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释:** 规则集ID。当is_default参数为1时，该参数需要传参。可调用[[查询规则集列表](https://support.huaweicloud.com/api-codecheck/ListRulesets.html)](tag:hws)[[查询规则集列表](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ListRulesets.html)](tag:hws_hk)[查询规则集列表](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)获取已存在的规则集ID。 **约束限制:** 32位UUID。例如：\"da303d80d2594faca60dbcc2e29c18aa\"。 **取值范围:** 不涉及。 **默认取值:** 不涉及。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Ruleset withCustomAttributes(List<CustomAttributes> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    public Ruleset addCustomAttributesItem(CustomAttributes customAttributesItem) {
        if (this.customAttributes == null) {
            this.customAttributes = new ArrayList<>();
        }
        this.customAttributes.add(customAttributesItem);
        return this;
    }

    public Ruleset withCustomAttributes(Consumer<List<CustomAttributes>> customAttributesSetter) {
        if (this.customAttributes == null) {
            this.customAttributes = new ArrayList<>();
        }
        customAttributesSetter.accept(this.customAttributes);
        return this;
    }

    /**
     * 自定义规则参数项，支持修改规则阈值。
     * @return customAttributes
     */
    public List<CustomAttributes> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<CustomAttributes> customAttributes) {
        this.customAttributes = customAttributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ruleset that = (Ruleset) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.language, that.language) && Objects.equals(this.isDefault, that.isDefault)
            && Objects.equals(this.ruleIds, that.ruleIds) && Objects.equals(this.uncheckIds, that.uncheckIds)
            && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.customAttributes, that.customAttributes);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(projectId, templateName, language, isDefault, ruleIds, uncheckIds, templateId, customAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ruleset {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
        sb.append("    uncheckIds: ").append(toIndentedString(uncheckIds)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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
