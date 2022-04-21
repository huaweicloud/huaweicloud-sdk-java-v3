package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * InstanceConfig
 */
public class InstanceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_id")

    private String configId;

    /**
     * 配额名称
     */
    public static final class ConfigNameEnum {

        /**
         * Enum INSTANCE_NUM_LIMIT for value: "INSTANCE_NUM_LIMIT"
         */
        public static final ConfigNameEnum INSTANCE_NUM_LIMIT = new ConfigNameEnum("INSTANCE_NUM_LIMIT");

        private static final Map<String, ConfigNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigNameEnum> createStaticFields() {
            Map<String, ConfigNameEnum> map = new HashMap<>();
            map.put("INSTANCE_NUM_LIMIT", INSTANCE_NUM_LIMIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfigNameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConfigNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConfigNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConfigNameEnum(value);
            }
            return result;
        }

        public static ConfigNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConfigNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfigNameEnum) {
                return this.value.equals(((ConfigNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    private ConfigNameEnum configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private String configValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_time")

    private OffsetDateTime configTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public InstanceConfig withConfigId(String configId) {
        this.configId = configId;
        return this;
    }

    /**
     * 配额编号
     * @return configId
     */
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public InstanceConfig withConfigName(ConfigNameEnum configName) {
        this.configName = configName;
        return this;
    }

    /**
     * 配额名称
     * @return configName
     */
    public ConfigNameEnum getConfigName() {
        return configName;
    }

    public void setConfigName(ConfigNameEnum configName) {
        this.configName = configName;
    }

    public InstanceConfig withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * 配额值  当前实例所在租户该配额对应的数量
     * @return configValue
     */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public InstanceConfig withConfigTime(OffsetDateTime configTime) {
        this.configTime = configTime;
        return this;
    }

    /**
     * 配额创建时间
     * @return configTime
     */
    public OffsetDateTime getConfigTime() {
        return configTime;
    }

    public void setConfigTime(OffsetDateTime configTime) {
        this.configTime = configTime;
    }

    public InstanceConfig withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 配额描述 - INSTANCE_NUM_LIMIT：租户可以创建的实例个数限制
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceConfig instanceConfig = (InstanceConfig) o;
        return Objects.equals(this.configId, instanceConfig.configId)
            && Objects.equals(this.configName, instanceConfig.configName)
            && Objects.equals(this.configValue, instanceConfig.configValue)
            && Objects.equals(this.configTime, instanceConfig.configTime)
            && Objects.equals(this.remark, instanceConfig.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, configName, configValue, configTime, remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceConfig {\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    configTime: ").append(toIndentedString(configTime)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
