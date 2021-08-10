package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** ConfigurationForUpdate */
public class ConfigurationForUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private Map<String, String> values = null;

    public ConfigurationForUpdate withName(String name) {
        this.name = name;
        return this;
    }

    /** 参数模板名称。最长64个字符，只允许大写字母、小写字母、数字、和“-_.”特殊字符。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigurationForUpdate withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 参数模板描述。最长256个字符，不支持>!<\"&'=特殊字符。默认为空。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigurationForUpdate withValues(Map<String, String> values) {
        this.values = values;
        return this;
    }

    public ConfigurationForUpdate putValuesItem(String key, String valuesItem) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        this.values.put(key, valuesItem);
        return this;
    }

    public ConfigurationForUpdate withValues(Consumer<Map<String, String>> valuesSetter) {
        if (this.values == null) {
            this.values = new HashMap<>();
        }
        valuesSetter.accept(this.values);
        return this;
    }

    /** 参数值对象，用户基于默认参数模板自定义的参数值。为空时不修改参数值。
     * 
     * @return values */
    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigurationForUpdate configurationForUpdate = (ConfigurationForUpdate) o;
        return Objects.equals(this.name, configurationForUpdate.name)
            && Objects.equals(this.description, configurationForUpdate.description)
            && Objects.equals(this.values, configurationForUpdate.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationForUpdate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
