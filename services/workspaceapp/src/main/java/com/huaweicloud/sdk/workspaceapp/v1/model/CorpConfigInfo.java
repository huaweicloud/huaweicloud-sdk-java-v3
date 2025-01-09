package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 企业配置。
 */
public class CorpConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_key")

    private String configKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private String configValue;

    public CorpConfigInfo withConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }

    /**
     * 查询的配置configKey。
     * @return configKey
     */
    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public CorpConfigInfo withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * 根据configKey查到的configValue。
     * @return configValue
     */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CorpConfigInfo that = (CorpConfigInfo) obj;
        return Objects.equals(this.configKey, that.configKey) && Objects.equals(this.configValue, that.configValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configKey, configValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorpConfigInfo {\n");
        sb.append("    configKey: ").append(toIndentedString(configKey)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
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
