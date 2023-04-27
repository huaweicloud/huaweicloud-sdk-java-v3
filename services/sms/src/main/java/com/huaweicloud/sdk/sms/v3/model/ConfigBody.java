package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置参数body
 */
public class ConfigBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_key")

    private String configKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private String configValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private String configStatus;

    public ConfigBody withConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }

    /**
     * 配置类型，分为：”EXCLUDE_MIGRATE_PATH\"，\"EXCLUDE_SYNC_PATH\"，\"ONLY_SYNC_PATH\",\"OTHERS\"
     * @return configKey
     */
    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public ConfigBody withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * 具体配置参数字段，保存于数据库，最终在agent端进行解析
     * @return configValue
     */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public ConfigBody withConfigStatus(String configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * 描述配置状态的保留字段
     * @return configStatus
     */
    public String getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(String configStatus) {
        this.configStatus = configStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigBody configBody = (ConfigBody) o;
        return Objects.equals(this.configKey, configBody.configKey)
            && Objects.equals(this.configValue, configBody.configValue)
            && Objects.equals(this.configStatus, configBody.configStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configKey, configValue, configStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigBody {\n");
        sb.append("    configKey: ").append(toIndentedString(configKey)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
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
