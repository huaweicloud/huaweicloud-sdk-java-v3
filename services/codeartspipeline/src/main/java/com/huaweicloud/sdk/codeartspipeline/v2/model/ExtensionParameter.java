package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户可配置参数
 */
public class ExtensionParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation")

    private ExtensionParameterValidation validation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultValue")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "helpMarkdown")

    private String helpMarkdown;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displaySettings")

    private ExtensionParameterDisplaySettings displaySettings;

    public ExtensionParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtensionParameter withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 参数显示标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ExtensionParameter withValidation(ExtensionParameterValidation validation) {
        this.validation = validation;
        return this;
    }

    public ExtensionParameter withValidation(Consumer<ExtensionParameterValidation> validationSetter) {
        if (this.validation == null) {
            this.validation = new ExtensionParameterValidation();
            validationSetter.accept(this.validation);
        }

        return this;
    }

    /**
     * Get validation
     * @return validation
     */
    public ExtensionParameterValidation getValidation() {
        return validation;
    }

    public void setValidation(ExtensionParameterValidation validation) {
        this.validation = validation;
    }

    public ExtensionParameter withDefaultValue(String defaultValue) {
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

    public ExtensionParameter withHelpMarkdown(String helpMarkdown) {
        this.helpMarkdown = helpMarkdown;
        return this;
    }

    /**
     * 帮助文档(markdown格式)。
     * @return helpMarkdown
     */
    public String getHelpMarkdown() {
        return helpMarkdown;
    }

    public void setHelpMarkdown(String helpMarkdown) {
        this.helpMarkdown = helpMarkdown;
    }

    public ExtensionParameter withDisplaySettings(ExtensionParameterDisplaySettings displaySettings) {
        this.displaySettings = displaySettings;
        return this;
    }

    public ExtensionParameter withDisplaySettings(Consumer<ExtensionParameterDisplaySettings> displaySettingsSetter) {
        if (this.displaySettings == null) {
            this.displaySettings = new ExtensionParameterDisplaySettings();
            displaySettingsSetter.accept(this.displaySettings);
        }

        return this;
    }

    /**
     * Get displaySettings
     * @return displaySettings
     */
    public ExtensionParameterDisplaySettings getDisplaySettings() {
        return displaySettings;
    }

    public void setDisplaySettings(ExtensionParameterDisplaySettings displaySettings) {
        this.displaySettings = displaySettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionParameter that = (ExtensionParameter) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.label, that.label)
            && Objects.equals(this.validation, that.validation) && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.helpMarkdown, that.helpMarkdown)
            && Objects.equals(this.displaySettings, that.displaySettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, label, validation, defaultValue, helpMarkdown, displaySettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionParameter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    helpMarkdown: ").append(toIndentedString(helpMarkdown)).append("\n");
        sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
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
