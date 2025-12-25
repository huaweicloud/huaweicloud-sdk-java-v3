package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateField
 */
public class TemplateField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "example")

    private String example;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restrictions")

    private List<Restriction> restrictions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_field_id")

    private String templateFieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public TemplateField withDefaultValue(String defaultValue) {
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

    public TemplateField withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateField withExample(String example) {
        this.example = example;
        return this;
    }

    /**
     * 示例
     * @return example
     */
    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public TemplateField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateField withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 是否必填
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public TemplateField withRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    public TemplateField addRestrictionsItem(Restriction restrictionsItem) {
        if (this.restrictions == null) {
            this.restrictions = new ArrayList<>();
        }
        this.restrictions.add(restrictionsItem);
        return this;
    }

    public TemplateField withRestrictions(Consumer<List<Restriction>> restrictionsSetter) {
        if (this.restrictions == null) {
            this.restrictions = new ArrayList<>();
        }
        restrictionsSetter.accept(this.restrictions);
        return this;
    }

    /**
     * 相关描述信息
     * @return restrictions
     */
    public List<Restriction> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
    }

    public TemplateField withTemplateFieldId(String templateFieldId) {
        this.templateFieldId = templateFieldId;
        return this;
    }

    /**
     * UUID
     * @return templateFieldId
     */
    public String getTemplateFieldId() {
        return templateFieldId;
    }

    public void setTemplateFieldId(String templateFieldId) {
        this.templateFieldId = templateFieldId;
    }

    public TemplateField withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 相关标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TemplateField withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 规则类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateField that = (TemplateField) obj;
        return Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.description, that.description) && Objects.equals(this.example, that.example)
            && Objects.equals(this.name, that.name) && Objects.equals(this.required, that.required)
            && Objects.equals(this.restrictions, that.restrictions)
            && Objects.equals(this.templateFieldId, that.templateFieldId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(defaultValue, description, example, name, required, restrictions, templateFieldId, title, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateField {\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    example: ").append(toIndentedString(example)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
        sb.append("    templateFieldId: ").append(toIndentedString(templateFieldId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
