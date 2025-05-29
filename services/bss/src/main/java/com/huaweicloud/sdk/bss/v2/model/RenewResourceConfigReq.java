package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RenewResourceConfigReq
 */
public class RenewResourceConfigReq {

    /**
     * |参数名称：续订资源设置属性类型| |参数的约束及描述：该参数必填，设置类型，支持枚举| |DEDUCTION_DATE：设置自动续费扣款日，EXPIRE_DATE：设置续费后资源统一到期日|
     */
    public static final class ConfigNameEnum {

        /**
         * Enum DEDUCTION_DATE for value: "DEDUCTION_DATE"
         */
        public static final ConfigNameEnum DEDUCTION_DATE = new ConfigNameEnum("DEDUCTION_DATE");

        /**
         * Enum EXPIRE_DATE for value: "EXPIRE_DATE"
         */
        public static final ConfigNameEnum EXPIRE_DATE = new ConfigNameEnum("EXPIRE_DATE");

        private static final Map<String, ConfigNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigNameEnum> createStaticFields() {
            Map<String, ConfigNameEnum> map = new HashMap<>();
            map.put("DEDUCTION_DATE", DEDUCTION_DATE);
            map.put("EXPIRE_DATE", EXPIRE_DATE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConfigNameEnum(value));
        }

        public static ConfigNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public RenewResourceConfigReq withConfigName(ConfigNameEnum configName) {
        this.configName = configName;
        return this;
    }

    /**
     * |参数名称：续订资源设置属性类型| |参数的约束及描述：该参数必填，设置类型，支持枚举| |DEDUCTION_DATE：设置自动续费扣款日，EXPIRE_DATE：设置续费后资源统一到期日|
     * @return configName
     */
    public ConfigNameEnum getConfigName() {
        return configName;
    }

    public void setConfigName(ConfigNameEnum configName) {
        this.configName = configName;
    }

    public RenewResourceConfigReq withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * |参数名称：续订资源设置属性值| |参数约束及描述：该参数必填，当config_name值为DEDUCTION_DATE时，支持设置资源到期前2天至前7天自动扣款，config_value范围：2，3，4，5，6，7。 当config_name值为EXPIRE_DATE时，支持设置统一到期日为每个月的同一天（1~28号及每个月最后一天），config_value范围：1，2，3，4，5，6，7，8，9，10，11，12，13，14，15，16，17，18，19，20，21，22，23，24，25，26，27，28，-1|
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
        RenewResourceConfigReq that = (RenewResourceConfigReq) obj;
        return Objects.equals(this.configName, that.configName) && Objects.equals(this.configValue, that.configValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configName, configValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenewResourceConfigReq {\n");
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
