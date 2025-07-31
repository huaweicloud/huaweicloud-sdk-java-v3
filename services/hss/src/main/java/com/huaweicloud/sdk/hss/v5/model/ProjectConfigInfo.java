package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置信息
 */
public class ProjectConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    private String configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private String configValue;

    public ProjectConfigInfo withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    /**
     * 配置名称，包含如下    - password_min_len ：密码最小长度    - password_digit_min_num ：密码中最少包含数字数量    - password_upper_letter_min_num ：密码中最少包含大写字母数量    - password_lower_letter_min_num ：密码中最少包含小写字母数量    - password_special_char_min_num ：密码中最少包含特殊字符数量    - weakpwd: 自定义弱口令策略
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public ProjectConfigInfo withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * 配置内容
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
        ProjectConfigInfo that = (ProjectConfigInfo) obj;
        return Objects.equals(this.configName, that.configName) && Objects.equals(this.configValue, that.configValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configName, configValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectConfigInfo {\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
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
