package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PluginDTOInputInfo
 */
public class PluginDTOInputInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation")

    private String validation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_content")

    private String layoutContent;

    public PluginDTOInputInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PluginDTOInputInfo withDefaultValue(String defaultValue) {
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

    public PluginDTOInputInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 输入类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PluginDTOInputInfo withValidation(String validation) {
        this.validation = validation;
        return this;
    }

    /**
     * 验证
     * @return validation
     */
    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }

    public PluginDTOInputInfo withLayoutContent(String layoutContent) {
        this.layoutContent = layoutContent;
        return this;
    }

    /**
     * 样式信息
     * @return layoutContent
     */
    public String getLayoutContent() {
        return layoutContent;
    }

    public void setLayoutContent(String layoutContent) {
        this.layoutContent = layoutContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginDTOInputInfo that = (PluginDTOInputInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.type, that.type) && Objects.equals(this.validation, that.validation)
            && Objects.equals(this.layoutContent, that.layoutContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, defaultValue, type, validation, layoutContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginDTOInputInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
        sb.append("    layoutContent: ").append(toIndentedString(layoutContent)).append("\n");
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
