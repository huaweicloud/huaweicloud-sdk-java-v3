package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskRulesetInfo
 */
public class TaskRulesetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public TaskRulesetInfo withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释：** 规则集ID。 **取值范围:** 长度为[1~32]个字符。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TaskRulesetInfo withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释：** 规则集语言。 **取值范围:** 自定义语言或者系统内置语言，当前支持的系统内置语言有： - ARKTS - C# - CANGJIE - C++ - CSS - GO - HTML - JAVA - JAVASCRIPT - KOTLIN - LUA - PHP - PYTHON - RUST - SCALA - SHELL - SQL - TERRAFORM - TYPESCRIPT - AZURERESOURCEMANAGER - DOCKER - KUBERNETES
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public TaskRulesetInfo withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * **参数解释：** 规则集名称。 **取值范围:** 任意中英文，数字，点，连字符-及下划线_。长度为[1~128]个字符。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public TaskRulesetInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 规则集选取状态。 **取值范围:** - selected：已选。 - optional：可选，指未开启的语言在当前项目下的默认规则集。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TaskRulesetInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 规则集属性。 **取值范围:** - 0：用户自定义规则集。 - 1：系统规则集。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskRulesetInfo that = (TaskRulesetInfo) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.language, that.language)
            && Objects.equals(this.templateName, that.templateName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, language, templateName, type, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskRulesetInfo {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
