package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ConfigurationParameterList
 */
public class ConfigurationParameterList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_restart")

    @JacksonXmlProperty(localName = "need_restart")

    private String needRestart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    @JacksonXmlProperty(localName = "read_only")

    private String readOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    @JacksonXmlProperty(localName = "value_range")

    private String valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    @JacksonXmlProperty(localName = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public ConfigurationParameterList withName(String name) {
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

    public ConfigurationParameterList withValue(String value) {
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

    public ConfigurationParameterList withNeedRestart(String needRestart) {
        this.needRestart = needRestart;
        return this;
    }

    /**
     * 是否需要重启实例。
     * @return needRestart
     */
    public String getNeedRestart() {
        return needRestart;
    }

    public void setNeedRestart(String needRestart) {
        this.needRestart = needRestart;
    }

    public ConfigurationParameterList withReadOnly(String readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * 参数是否只读。
     * @return readOnly
     */
    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }

    public ConfigurationParameterList withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    /**
     * 参数取值范围。
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    public ConfigurationParameterList withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 参数类型。
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public ConfigurationParameterList withDescription(String description) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationParameterList configurationParameterList = (ConfigurationParameterList) o;
        return Objects.equals(this.name, configurationParameterList.name)
            && Objects.equals(this.value, configurationParameterList.value)
            && Objects.equals(this.needRestart, configurationParameterList.needRestart)
            && Objects.equals(this.readOnly, configurationParameterList.readOnly)
            && Objects.equals(this.valueRange, configurationParameterList.valueRange)
            && Objects.equals(this.dataType, configurationParameterList.dataType)
            && Objects.equals(this.description, configurationParameterList.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, needRestart, readOnly, valueRange, dataType, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationParameterList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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
