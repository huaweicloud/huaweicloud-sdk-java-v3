package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConfigItem
 */
public class ConfigItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    private String configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private String configValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "should_override")

    private Boolean shouldOverride;

    public ConfigItem withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    /**
     * 配置项名称。
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public ConfigItem withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * 配置项值。
     * @return configValue
     */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public ConfigItem withShouldOverride(Boolean shouldOverride) {
        this.shouldOverride = shouldOverride;
        return this;
    }

    /**
     * 是否重写。
     * @return shouldOverride
     */
    public Boolean getShouldOverride() {
        return shouldOverride;
    }

    public void setShouldOverride(Boolean shouldOverride) {
        this.shouldOverride = shouldOverride;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigItem configItem = (ConfigItem) o;
        return Objects.equals(this.configName, configItem.configName)
            && Objects.equals(this.configValue, configItem.configValue)
            && Objects.equals(this.shouldOverride, configItem.shouldOverride);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configName, configValue, shouldOverride);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigItem {\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    shouldOverride: ").append(toIndentedString(shouldOverride)).append("\n");
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
