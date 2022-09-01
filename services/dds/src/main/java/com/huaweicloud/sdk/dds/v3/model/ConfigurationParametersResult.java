package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ConfigurationParametersResult
 */
public class ConfigurationParametersResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    @JacksonXmlProperty(localName = "value_range")

    private String valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_required")

    @JacksonXmlProperty(localName = "restart_required")

    private Boolean restartRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly")

    @JacksonXmlProperty(localName = "readonly")

    private Boolean readonly;

    public ConfigurationParametersResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigurationParametersResult withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ConfigurationParametersResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigurationParametersResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 参数类型，取值为“integer”，“string”，“boolean”，“float”或“list”。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConfigurationParametersResult withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    /**
     * 参数值范围，如integer取值0-1、boolean取值true|false等。
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    public ConfigurationParametersResult withRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
        return this;
    }

    /**
     * 参数是否需要重启。 - 取值为“true”，需要重启。 - 取值为“false”，不需要重启。
     * @return restartRequired
     */
    public Boolean getRestartRequired() {
        return restartRequired;
    }

    public void setRestartRequired(Boolean restartRequired) {
        this.restartRequired = restartRequired;
    }

    public ConfigurationParametersResult withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    /**
     * 是否只读。 - 取值为“false”，非只读参数。 - 取值为“true”，只读参数。
     * @return readonly
     */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationParametersResult configurationParametersResult = (ConfigurationParametersResult) o;
        return Objects.equals(this.name, configurationParametersResult.name)
            && Objects.equals(this.value, configurationParametersResult.value)
            && Objects.equals(this.description, configurationParametersResult.description)
            && Objects.equals(this.type, configurationParametersResult.type)
            && Objects.equals(this.valueRange, configurationParametersResult.valueRange)
            && Objects.equals(this.restartRequired, configurationParametersResult.restartRequired)
            && Objects.equals(this.readonly, configurationParametersResult.readonly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, description, type, valueRange, restartRequired, readonly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationParametersResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    restartRequired: ").append(toIndentedString(restartRequired)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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
