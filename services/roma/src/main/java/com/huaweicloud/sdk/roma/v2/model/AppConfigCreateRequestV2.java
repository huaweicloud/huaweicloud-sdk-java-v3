package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AppConfigModifyRequestV2;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppConfigCreateRequestV2
 */
public class AppConfigCreateRequestV2  {

    /**
     * 应用配置类型： - variable：模板变量 - password：密码 - certificate：证书
     */
    public static final class ConfigTypeEnum {

        
        /**
         * Enum VARIABLE for value: "variable"
         */
        public static final ConfigTypeEnum VARIABLE = new ConfigTypeEnum("variable");
        
        /**
         * Enum PASSWORD for value: "password"
         */
        public static final ConfigTypeEnum PASSWORD = new ConfigTypeEnum("password");
        
        /**
         * Enum CERTIFICATE for value: "certificate"
         */
        public static final ConfigTypeEnum CERTIFICATE = new ConfigTypeEnum("certificate");
        

        private static final Map<String, ConfigTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigTypeEnum> createStaticFields() {
            Map<String, ConfigTypeEnum> map = new HashMap<>();
            map.put("variable", VARIABLE);
            map.put("password", PASSWORD);
            map.put("certificate", CERTIFICATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfigTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConfigTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ConfigTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConfigTypeEnum(value);
            }
            return result;
        }

        public static ConfigTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ConfigTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ConfigTypeEnum) {
                return this.value.equals(((ConfigTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_type")
    
    private ConfigTypeEnum configType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_value")
    
    private String configValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_name")
    
    private String configName;

    public AppConfigCreateRequestV2 withConfigType(ConfigTypeEnum configType) {
        this.configType = configType;
        return this;
    }

    


    /**
     * 应用配置类型： - variable：模板变量 - password：密码 - certificate：证书
     * @return configType
     */
    public ConfigTypeEnum getConfigType() {
        return configType;
    }

    public void setConfigType(ConfigTypeEnum configType) {
        this.configType = configType;
    }

    

    public AppConfigCreateRequestV2 withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    


    /**
     * 应用配置值： - config_type = variable：config_value为模板变量的值 - config_type = password：config_value为密码值 - config_type = certificate：config_value需要包含证书public_key（必填），私钥private_key（必填）和密码passphrase（非必填），格式如：\"{\\\\\"public_key\\\\\": \\\"\\,\\\\\"private_key\\\\\":\\\\\"\\\\\",\\\\\"passphrase\\\\\":\\\\\"\\\\\"}\"
     * @return configValue
     */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    

    public AppConfigCreateRequestV2 withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 应用配置描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public AppConfigCreateRequestV2 withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    


    /**
     * 应用配置名称。  支持英文大小写字符、数字、下划线、中划线、点和@，且只能以英文字母开头。
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppConfigCreateRequestV2 appConfigCreateRequestV2 = (AppConfigCreateRequestV2) o;
        return Objects.equals(this.configType, appConfigCreateRequestV2.configType) &&
            Objects.equals(this.configValue, appConfigCreateRequestV2.configValue) &&
            Objects.equals(this.description, appConfigCreateRequestV2.description) &&
            Objects.equals(this.configName, appConfigCreateRequestV2.configName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configType, configValue, description, configName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppConfigCreateRequestV2 {\n");
        sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
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

