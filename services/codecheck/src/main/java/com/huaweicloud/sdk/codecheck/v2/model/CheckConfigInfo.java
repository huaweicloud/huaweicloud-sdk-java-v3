package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckConfigInfo
 */
public class CheckConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cfg_key")

    private String cfgKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option_value")

    private String optionValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_required")

    private Integer isRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CheckConfigInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 检查参数名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckConfigInfo withCfgKey(String cfgKey) {
        this.cfgKey = cfgKey;
        return this;
    }

    /**
     * 检查参数对应的key值
     * @return cfgKey
     */
    public String getCfgKey() {
        return cfgKey;
    }

    public void setCfgKey(String cfgKey) {
        this.cfgKey = cfgKey;
    }

    public CheckConfigInfo withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 检查参数默认值
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public CheckConfigInfo withOptionValue(String optionValue) {
        this.optionValue = optionValue;
        return this;
    }

    /**
     * 检查参数可选项
     * @return optionValue
     */
    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public CheckConfigInfo withIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * 0：非必填，1：必填
     * @return isRequired
     */
    public Integer getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    public CheckConfigInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 检查参数说明
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckConfigInfo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 参数类型，0：文本，2：有可选项
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CheckConfigInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 参数状态，on：启用，off：未启用
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckConfigInfo checkConfigInfo = (CheckConfigInfo) o;
        return Objects.equals(this.name, checkConfigInfo.name) && Objects.equals(this.cfgKey, checkConfigInfo.cfgKey)
            && Objects.equals(this.defaultValue, checkConfigInfo.defaultValue)
            && Objects.equals(this.optionValue, checkConfigInfo.optionValue)
            && Objects.equals(this.isRequired, checkConfigInfo.isRequired)
            && Objects.equals(this.description, checkConfigInfo.description)
            && Objects.equals(this.type, checkConfigInfo.type) && Objects.equals(this.status, checkConfigInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cfgKey, defaultValue, optionValue, isRequired, description, type, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckConfigInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    cfgKey: ").append(toIndentedString(cfgKey)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    optionValue: ").append(toIndentedString(optionValue)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
