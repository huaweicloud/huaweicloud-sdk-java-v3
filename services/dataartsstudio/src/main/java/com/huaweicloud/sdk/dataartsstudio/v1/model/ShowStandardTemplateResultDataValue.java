package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询数据标准模板结果
 */
public class ShowStandardTemplateResultDataValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allFields")

    private List<StandElementFieldVO> allFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional")

    private List<StandElementFieldVO> optional = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_default")

    private List<StandElementFieldVO> systemDefault = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom")

    private List<StandElementFieldVO> custom = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hasTemplate")

    private Boolean hasTemplate;

    public ShowStandardTemplateResultDataValue withAllFields(List<StandElementFieldVO> allFields) {
        this.allFields = allFields;
        return this;
    }

    public ShowStandardTemplateResultDataValue addAllFieldsItem(StandElementFieldVO allFieldsItem) {
        if (this.allFields == null) {
            this.allFields = new ArrayList<>();
        }
        this.allFields.add(allFieldsItem);
        return this;
    }

    public ShowStandardTemplateResultDataValue withAllFields(Consumer<List<StandElementFieldVO>> allFieldsSetter) {
        if (this.allFields == null) {
            this.allFields = new ArrayList<>();
        }
        allFieldsSetter.accept(this.allFields);
        return this;
    }

    /**
     * 数据标准全部属性，集合中是单个StandElementFieldVO对象
     * @return allFields
     */
    public List<StandElementFieldVO> getAllFields() {
        return allFields;
    }

    public void setAllFields(List<StandElementFieldVO> allFields) {
        this.allFields = allFields;
    }

    public ShowStandardTemplateResultDataValue withOptional(List<StandElementFieldVO> optional) {
        this.optional = optional;
        return this;
    }

    public ShowStandardTemplateResultDataValue addOptionalItem(StandElementFieldVO optionalItem) {
        if (this.optional == null) {
            this.optional = new ArrayList<>();
        }
        this.optional.add(optionalItem);
        return this;
    }

    public ShowStandardTemplateResultDataValue withOptional(Consumer<List<StandElementFieldVO>> optionalSetter) {
        if (this.optional == null) {
            this.optional = new ArrayList<>();
        }
        optionalSetter.accept(this.optional);
        return this;
    }

    /**
     * 可选项,集合中是单个StandElementFieldVO对象
     * @return optional
     */
    public List<StandElementFieldVO> getOptional() {
        return optional;
    }

    public void setOptional(List<StandElementFieldVO> optional) {
        this.optional = optional;
    }

    public ShowStandardTemplateResultDataValue withSystemDefault(List<StandElementFieldVO> systemDefault) {
        this.systemDefault = systemDefault;
        return this;
    }

    public ShowStandardTemplateResultDataValue addSystemDefaultItem(StandElementFieldVO systemDefaultItem) {
        if (this.systemDefault == null) {
            this.systemDefault = new ArrayList<>();
        }
        this.systemDefault.add(systemDefaultItem);
        return this;
    }

    public ShowStandardTemplateResultDataValue withSystemDefault(
        Consumer<List<StandElementFieldVO>> systemDefaultSetter) {
        if (this.systemDefault == null) {
            this.systemDefault = new ArrayList<>();
        }
        systemDefaultSetter.accept(this.systemDefault);
        return this;
    }

    /**
     * 系统默认项，集合中是单个StandElementFieldVO对象
     * @return systemDefault
     */
    public List<StandElementFieldVO> getSystemDefault() {
        return systemDefault;
    }

    public void setSystemDefault(List<StandElementFieldVO> systemDefault) {
        this.systemDefault = systemDefault;
    }

    public ShowStandardTemplateResultDataValue withCustom(List<StandElementFieldVO> custom) {
        this.custom = custom;
        return this;
    }

    public ShowStandardTemplateResultDataValue addCustomItem(StandElementFieldVO customItem) {
        if (this.custom == null) {
            this.custom = new ArrayList<>();
        }
        this.custom.add(customItem);
        return this;
    }

    public ShowStandardTemplateResultDataValue withCustom(Consumer<List<StandElementFieldVO>> customSetter) {
        if (this.custom == null) {
            this.custom = new ArrayList<>();
        }
        customSetter.accept(this.custom);
        return this;
    }

    /**
     * 自定义项,集合中是单个StandElementFieldVO对象
     * @return custom
     */
    public List<StandElementFieldVO> getCustom() {
        return custom;
    }

    public void setCustom(List<StandElementFieldVO> custom) {
        this.custom = custom;
    }

    public ShowStandardTemplateResultDataValue withHasTemplate(Boolean hasTemplate) {
        this.hasTemplate = hasTemplate;
        return this;
    }

    /**
     * 是否使用模板
     * @return hasTemplate
     */
    public Boolean getHasTemplate() {
        return hasTemplate;
    }

    public void setHasTemplate(Boolean hasTemplate) {
        this.hasTemplate = hasTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStandardTemplateResultDataValue that = (ShowStandardTemplateResultDataValue) obj;
        return Objects.equals(this.allFields, that.allFields) && Objects.equals(this.optional, that.optional)
            && Objects.equals(this.systemDefault, that.systemDefault) && Objects.equals(this.custom, that.custom)
            && Objects.equals(this.hasTemplate, that.hasTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allFields, optional, systemDefault, custom, hasTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStandardTemplateResultDataValue {\n");
        sb.append("    allFields: ").append(toIndentedString(allFields)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
        sb.append("    systemDefault: ").append(toIndentedString(systemDefault)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    hasTemplate: ").append(toIndentedString(hasTemplate)).append("\n");
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
