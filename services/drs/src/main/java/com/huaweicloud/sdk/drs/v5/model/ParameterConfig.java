package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务参数配置信息。
 */
public class ParameterConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    private String valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_restart")

    private Boolean isNeedRestart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ParameterConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParameterConfig withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ParameterConfig withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 参数默认值
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ParameterConfig withValueRange(String valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    /**
     * 参数值范围，如Integer取值0-1、Boolean取值true|false等。
     * @return valueRange
     */
    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange;
    }

    public ParameterConfig withIsNeedRestart(Boolean isNeedRestart) {
        this.isNeedRestart = isNeedRestart;
        return this;
    }

    /**
     * 是否需要重启。默认为true, “false”表示否。“true”表示是。
     * @return isNeedRestart
     */
    public Boolean getIsNeedRestart() {
        return isNeedRestart;
    }

    public void setIsNeedRestart(Boolean isNeedRestart) {
        this.isNeedRestart = isNeedRestart;
    }

    public ParameterConfig withDescription(String description) {
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

    public ParameterConfig withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间，例如：2023-01-20T07:18:26Z
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ParameterConfig withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间，例如：2023-03-01T09:42:02Z
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParameterConfig that = (ParameterConfig) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value)
            && Objects.equals(this.defaultValue, that.defaultValue) && Objects.equals(this.valueRange, that.valueRange)
            && Objects.equals(this.isNeedRestart, that.isNeedRestart)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, defaultValue, valueRange, isNeedRestart, description, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterConfig {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    isNeedRestart: ").append(toIndentedString(isNeedRestart)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
