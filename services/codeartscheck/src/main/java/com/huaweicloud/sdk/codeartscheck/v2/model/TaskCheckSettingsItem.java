package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskCheckSettingsItem
 */
public class TaskCheckSettingsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cfg_key")

    private String cfgKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cfg_value")

    private String cfgValue;

    public TaskCheckSettingsItem withCfgKey(String cfgKey) {
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

    public TaskCheckSettingsItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 参数状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskCheckSettingsItem withCfgValue(String cfgValue) {
        this.cfgValue = cfgValue;
        return this;
    }

    /**
     * 检查参数值
     * @return cfgValue
     */
    public String getCfgValue() {
        return cfgValue;
    }

    public void setCfgValue(String cfgValue) {
        this.cfgValue = cfgValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskCheckSettingsItem that = (TaskCheckSettingsItem) obj;
        return Objects.equals(this.cfgKey, that.cfgKey) && Objects.equals(this.status, that.status)
            && Objects.equals(this.cfgValue, that.cfgValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cfgKey, status, cfgValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskCheckSettingsItem {\n");
        sb.append("    cfgKey: ").append(toIndentedString(cfgKey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cfgValue: ").append(toIndentedString(cfgValue)).append("\n");
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
