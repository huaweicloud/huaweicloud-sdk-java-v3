package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置实例配置请求体
 */
public class UpdateInstanceConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_type")

    private String configType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private String configValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    public UpdateInstanceConfigRequestBody withConfigType(String configType) {
        this.configType = configType;
        return this;
    }

    /**
     * 配置类型。取值范围：metaLockWaitThreshold, innodbLockWaitThreshold
     * @return configType
     */
    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public UpdateInstanceConfigRequestBody withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * 配置的数值
     * @return configValue
     */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public UpdateInstanceConfigRequestBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateInstanceConfigRequestBody that = (UpdateInstanceConfigRequestBody) obj;
        return Objects.equals(this.configType, that.configType) && Objects.equals(this.configValue, that.configValue)
            && Objects.equals(this.engineType, that.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configType, configValue, engineType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceConfigRequestBody {\n");
        sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
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
