package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.ConfigOutline;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Config
 */
public class Config  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_id")
    
    private String configId;
    /**
     * 配额名称
     */
    public static final class ConfigNameEnum {

        
        /**
         * Enum API_NUM_LIMIT for value: "API_NUM_LIMIT"
         */
        public static final ConfigNameEnum API_NUM_LIMIT = new ConfigNameEnum("API_NUM_LIMIT");
        
        /**
         * Enum APP_NUM_LIMIT for value: "APP_NUM_LIMIT"
         */
        public static final ConfigNameEnum APP_NUM_LIMIT = new ConfigNameEnum("APP_NUM_LIMIT");
        
        /**
         * Enum APIGROUP_NUM_LIMIT for value: "APIGROUP_NUM_LIMIT"
         */
        public static final ConfigNameEnum APIGROUP_NUM_LIMIT = new ConfigNameEnum("APIGROUP_NUM_LIMIT");
        
        /**
         * Enum ENVIRONMENT_NUM_LIMIT for value: "ENVIRONMENT_NUM_LIMIT"
         */
        public static final ConfigNameEnum ENVIRONMENT_NUM_LIMIT = new ConfigNameEnum("ENVIRONMENT_NUM_LIMIT");
        
        /**
         * Enum VARIABLE_NUM_LIMIT for value: "VARIABLE_NUM_LIMIT"
         */
        public static final ConfigNameEnum VARIABLE_NUM_LIMIT = new ConfigNameEnum("VARIABLE_NUM_LIMIT");
        
        /**
         * Enum SIGN_NUM_LIMIT for value: "SIGN_NUM_LIMIT"
         */
        public static final ConfigNameEnum SIGN_NUM_LIMIT = new ConfigNameEnum("SIGN_NUM_LIMIT");
        
        /**
         * Enum THROTTLE_NUM_LIMIT for value: "THROTTLE_NUM_LIMIT"
         */
        public static final ConfigNameEnum THROTTLE_NUM_LIMIT = new ConfigNameEnum("THROTTLE_NUM_LIMIT");
        
        /**
         * Enum APIGROUP_DOMAIN_NUM_LIMIT for value: "APIGROUP_DOMAIN_NUM_LIMIT"
         */
        public static final ConfigNameEnum APIGROUP_DOMAIN_NUM_LIMIT = new ConfigNameEnum("APIGROUP_DOMAIN_NUM_LIMIT");
        
        /**
         * Enum API_VERSION_NUM_LIMIT for value: "API_VERSION_NUM_LIMIT"
         */
        public static final ConfigNameEnum API_VERSION_NUM_LIMIT = new ConfigNameEnum("API_VERSION_NUM_LIMIT");
        
        /**
         * Enum VPC_NUM_LIMIT for value: "VPC_NUM_LIMIT"
         */
        public static final ConfigNameEnum VPC_NUM_LIMIT = new ConfigNameEnum("VPC_NUM_LIMIT");
        
        /**
         * Enum VPC_INSTANCE_NUM_LIMIT for value: "VPC_INSTANCE_NUM_LIMIT"
         */
        public static final ConfigNameEnum VPC_INSTANCE_NUM_LIMIT = new ConfigNameEnum("VPC_INSTANCE_NUM_LIMIT");
        
        /**
         * Enum API_PARAM_NUM_LIMIT for value: "API_PARAM_NUM_LIMIT"
         */
        public static final ConfigNameEnum API_PARAM_NUM_LIMIT = new ConfigNameEnum("API_PARAM_NUM_LIMIT");
        
        /**
         * Enum API_USER_CALL_LIMIT for value: "API_USER_CALL_LIMIT"
         */
        public static final ConfigNameEnum API_USER_CALL_LIMIT = new ConfigNameEnum("API_USER_CALL_LIMIT");
        
        /**
         * Enum ACL_NUM_LIMIT for value: "ACL_NUM_LIMIT"
         */
        public static final ConfigNameEnum ACL_NUM_LIMIT = new ConfigNameEnum("ACL_NUM_LIMIT");
        
        /**
         * Enum APP_THROTTLE_LIMIT for value: "APP_THROTTLE_LIMIT"
         */
        public static final ConfigNameEnum APP_THROTTLE_LIMIT = new ConfigNameEnum("APP_THROTTLE_LIMIT");
        
        /**
         * Enum USER_THROTTLE_LIMIT for value: "USER_THROTTLE_LIMIT"
         */
        public static final ConfigNameEnum USER_THROTTLE_LIMIT = new ConfigNameEnum("USER_THROTTLE_LIMIT");
        
        /**
         * Enum API_NUM_LIMIT_PER_GROUP for value: "API_NUM_LIMIT_PER_GROUP"
         */
        public static final ConfigNameEnum API_NUM_LIMIT_PER_GROUP = new ConfigNameEnum("API_NUM_LIMIT_PER_GROUP");
        
        /**
         * Enum API_POLICY_NUM_LIMIT for value: "API_POLICY_NUM_LIMIT"
         */
        public static final ConfigNameEnum API_POLICY_NUM_LIMIT = new ConfigNameEnum("API_POLICY_NUM_LIMIT");
        
        /**
         * Enum API_CONDITION_NUM_LIMIT for value: "API_CONDITION_NUM_LIMIT"
         */
        public static final ConfigNameEnum API_CONDITION_NUM_LIMIT = new ConfigNameEnum("API_CONDITION_NUM_LIMIT");
        
        /**
         * Enum SL_DOMAIN_CALL_LIMIT for value: "SL_DOMAIN_CALL_LIMIT"
         */
        public static final ConfigNameEnum SL_DOMAIN_CALL_LIMIT = new ConfigNameEnum("SL_DOMAIN_CALL_LIMIT");
        
        /**
         * Enum ELB_SWITCH for value: "ELB_SWITCH"
         */
        public static final ConfigNameEnum ELB_SWITCH = new ConfigNameEnum("ELB_SWITCH");
        
        /**
         * Enum AUTHORIZER_NUM_LIMIT for value: "AUTHORIZER_NUM_LIMIT"
         */
        public static final ConfigNameEnum AUTHORIZER_NUM_LIMIT = new ConfigNameEnum("AUTHORIZER_NUM_LIMIT");
        
        /**
         * Enum AUTHORIZER_IDENTITY_NUM_LIMIT for value: "AUTHORIZER_IDENTITY_NUM_LIMIT"
         */
        public static final ConfigNameEnum AUTHORIZER_IDENTITY_NUM_LIMIT = new ConfigNameEnum("AUTHORIZER_IDENTITY_NUM_LIMIT");
        
        /**
         * Enum APP_CODE_NUM_LIMIT for value: "APP_CODE_NUM_LIMIT"
         */
        public static final ConfigNameEnum APP_CODE_NUM_LIMIT = new ConfigNameEnum("APP_CODE_NUM_LIMIT");
        
        /**
         * Enum REGION_MANAGER_WHITELIST_SERVICES for value: "REGION_MANAGER_WHITELIST_SERVICES"
         */
        public static final ConfigNameEnum REGION_MANAGER_WHITELIST_SERVICES = new ConfigNameEnum("REGION_MANAGER_WHITELIST_SERVICES");
        
        /**
         * Enum API_SWAGGER_NUM_LIMIT for value: "API_SWAGGER_NUM_LIMIT"
         */
        public static final ConfigNameEnum API_SWAGGER_NUM_LIMIT = new ConfigNameEnum("API_SWAGGER_NUM_LIMIT");
        
        /**
         * Enum API_TAG_NUM_LIMIT for value: "API_TAG_NUM_LIMIT"
         */
        public static final ConfigNameEnum API_TAG_NUM_LIMIT = new ConfigNameEnum("API_TAG_NUM_LIMIT");
        
        /**
         * Enum LTS_SWITCH for value: "LTS_SWITCH"
         */
        public static final ConfigNameEnum LTS_SWITCH = new ConfigNameEnum("LTS_SWITCH");
        
        /**
         * Enum APP_KEY_SECRET_SWITCH for value: "APP_KEY_SECRET_SWITCH"
         */
        public static final ConfigNameEnum APP_KEY_SECRET_SWITCH = new ConfigNameEnum("APP_KEY_SECRET_SWITCH");
        
        /**
         * Enum RESPONSE_NUM_LIMIT for value: "RESPONSE_NUM_LIMIT"
         */
        public static final ConfigNameEnum RESPONSE_NUM_LIMIT = new ConfigNameEnum("RESPONSE_NUM_LIMIT");
        
        /**
         * Enum CONFIG_NUM_LIMIT_PER_APP for value: "CONFIG_NUM_LIMIT_PER_APP"
         */
        public static final ConfigNameEnum CONFIG_NUM_LIMIT_PER_APP = new ConfigNameEnum("CONFIG_NUM_LIMIT_PER_APP");
        
        /**
         * Enum BACKEND_TOKEN_ALLOW_SWITCH for value: "BACKEND_TOKEN_ALLOW_SWITCH"
         */
        public static final ConfigNameEnum BACKEND_TOKEN_ALLOW_SWITCH = new ConfigNameEnum("BACKEND_TOKEN_ALLOW_SWITCH");
        
        /**
         * Enum APP_TOKEN_SWITCH for value: "APP_TOKEN_SWITCH"
         */
        public static final ConfigNameEnum APP_TOKEN_SWITCH = new ConfigNameEnum("APP_TOKEN_SWITCH");
        
        /**
         * Enum API_DESIGNER_SWITCH for value: "API_DESIGNER_SWITCH"
         */
        public static final ConfigNameEnum API_DESIGNER_SWITCH = new ConfigNameEnum("API_DESIGNER_SWITCH");
        
        /**
         * Enum APP_API_KEY_SWITCH for value: "APP_API_KEY_SWITCH"
         */
        public static final ConfigNameEnum APP_API_KEY_SWITCH = new ConfigNameEnum("APP_API_KEY_SWITCH");
        
        /**
         * Enum APP_BASIC_SWITCH for value: "APP_BASIC_SWITCH"
         */
        public static final ConfigNameEnum APP_BASIC_SWITCH = new ConfigNameEnum("APP_BASIC_SWITCH");
        
        /**
         * Enum APP_JWT_SWITCH for value: "APP_JWT_SWITCH"
         */
        public static final ConfigNameEnum APP_JWT_SWITCH = new ConfigNameEnum("APP_JWT_SWITCH");
        
        /**
         * Enum APP_ROUTE_SWITCH for value: "APP_ROUTE_SWITCH"
         */
        public static final ConfigNameEnum APP_ROUTE_SWITCH = new ConfigNameEnum("APP_ROUTE_SWITCH");
        
        /**
         * Enum PUBLIC_KEY_SWITCH for value: "PUBLIC_KEY_SWITCH"
         */
        public static final ConfigNameEnum PUBLIC_KEY_SWITCH = new ConfigNameEnum("PUBLIC_KEY_SWITCH");
        
        /**
         * Enum APP_SECRET_SWITCH for value: "APP_SECRET_SWITCH"
         */
        public static final ConfigNameEnum APP_SECRET_SWITCH = new ConfigNameEnum("APP_SECRET_SWITCH");
        
        /**
         * Enum CASCADE_SWITCH for value: "CASCADE_SWITCH"
         */
        public static final ConfigNameEnum CASCADE_SWITCH = new ConfigNameEnum("CASCADE_SWITCH");
        
        /**
         * Enum IS_INIT_API_PATH_HASH for value: "IS_INIT_API_PATH_HASH"
         */
        public static final ConfigNameEnum IS_INIT_API_PATH_HASH = new ConfigNameEnum("IS_INIT_API_PATH_HASH");
        
        /**
         * Enum APP_QUOTA_NUM_LIMIT for value: "APP_QUOTA_NUM_LIMIT"
         */
        public static final ConfigNameEnum APP_QUOTA_NUM_LIMIT = new ConfigNameEnum("APP_QUOTA_NUM_LIMIT");
        
        /**
         * Enum IS_INIT_API_VERSION for value: "IS_INIT_API_VERSION"
         */
        public static final ConfigNameEnum IS_INIT_API_VERSION = new ConfigNameEnum("IS_INIT_API_VERSION");
        
        /**
         * Enum PLUGIN_NUM_LIMIT for value: "PLUGIN_NUM_LIMIT"
         */
        public static final ConfigNameEnum PLUGIN_NUM_LIMIT = new ConfigNameEnum("PLUGIN_NUM_LIMIT");
        
        /**
         * Enum APICLIENT_FIRST_USE_X_HW_ID_SWITCH for value: "APICLIENT_FIRST_USE_X_HW_ID_SWITCH"
         */
        public static final ConfigNameEnum APICLIENT_FIRST_USE_X_HW_ID_SWITCH = new ConfigNameEnum("APICLIENT_FIRST_USE_X_HW_ID_SWITCH");
        
        /**
         * Enum API_TASK_NUM_LIMIT for value: "API_TASK_NUM_LIMIT"
         */
        public static final ConfigNameEnum API_TASK_NUM_LIMIT = new ConfigNameEnum("API_TASK_NUM_LIMIT");
        

        private static final Map<String, ConfigNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigNameEnum> createStaticFields() {
            Map<String, ConfigNameEnum> map = new HashMap<>();
            map.put("API_NUM_LIMIT", API_NUM_LIMIT);
            map.put("APP_NUM_LIMIT", APP_NUM_LIMIT);
            map.put("APIGROUP_NUM_LIMIT", APIGROUP_NUM_LIMIT);
            map.put("ENVIRONMENT_NUM_LIMIT", ENVIRONMENT_NUM_LIMIT);
            map.put("VARIABLE_NUM_LIMIT", VARIABLE_NUM_LIMIT);
            map.put("SIGN_NUM_LIMIT", SIGN_NUM_LIMIT);
            map.put("THROTTLE_NUM_LIMIT", THROTTLE_NUM_LIMIT);
            map.put("APIGROUP_DOMAIN_NUM_LIMIT", APIGROUP_DOMAIN_NUM_LIMIT);
            map.put("API_VERSION_NUM_LIMIT", API_VERSION_NUM_LIMIT);
            map.put("VPC_NUM_LIMIT", VPC_NUM_LIMIT);
            map.put("VPC_INSTANCE_NUM_LIMIT", VPC_INSTANCE_NUM_LIMIT);
            map.put("API_PARAM_NUM_LIMIT", API_PARAM_NUM_LIMIT);
            map.put("API_USER_CALL_LIMIT", API_USER_CALL_LIMIT);
            map.put("ACL_NUM_LIMIT", ACL_NUM_LIMIT);
            map.put("APP_THROTTLE_LIMIT", APP_THROTTLE_LIMIT);
            map.put("USER_THROTTLE_LIMIT", USER_THROTTLE_LIMIT);
            map.put("API_NUM_LIMIT_PER_GROUP", API_NUM_LIMIT_PER_GROUP);
            map.put("API_POLICY_NUM_LIMIT", API_POLICY_NUM_LIMIT);
            map.put("API_CONDITION_NUM_LIMIT", API_CONDITION_NUM_LIMIT);
            map.put("SL_DOMAIN_CALL_LIMIT", SL_DOMAIN_CALL_LIMIT);
            map.put("ELB_SWITCH", ELB_SWITCH);
            map.put("AUTHORIZER_NUM_LIMIT", AUTHORIZER_NUM_LIMIT);
            map.put("AUTHORIZER_IDENTITY_NUM_LIMIT", AUTHORIZER_IDENTITY_NUM_LIMIT);
            map.put("APP_CODE_NUM_LIMIT", APP_CODE_NUM_LIMIT);
            map.put("REGION_MANAGER_WHITELIST_SERVICES", REGION_MANAGER_WHITELIST_SERVICES);
            map.put("API_SWAGGER_NUM_LIMIT", API_SWAGGER_NUM_LIMIT);
            map.put("API_TAG_NUM_LIMIT", API_TAG_NUM_LIMIT);
            map.put("LTS_SWITCH", LTS_SWITCH);
            map.put("APP_KEY_SECRET_SWITCH", APP_KEY_SECRET_SWITCH);
            map.put("RESPONSE_NUM_LIMIT", RESPONSE_NUM_LIMIT);
            map.put("CONFIG_NUM_LIMIT_PER_APP", CONFIG_NUM_LIMIT_PER_APP);
            map.put("BACKEND_TOKEN_ALLOW_SWITCH", BACKEND_TOKEN_ALLOW_SWITCH);
            map.put("APP_TOKEN_SWITCH", APP_TOKEN_SWITCH);
            map.put("API_DESIGNER_SWITCH", API_DESIGNER_SWITCH);
            map.put("APP_API_KEY_SWITCH", APP_API_KEY_SWITCH);
            map.put("APP_BASIC_SWITCH", APP_BASIC_SWITCH);
            map.put("APP_JWT_SWITCH", APP_JWT_SWITCH);
            map.put("APP_ROUTE_SWITCH", APP_ROUTE_SWITCH);
            map.put("PUBLIC_KEY_SWITCH", PUBLIC_KEY_SWITCH);
            map.put("APP_SECRET_SWITCH", APP_SECRET_SWITCH);
            map.put("CASCADE_SWITCH", CASCADE_SWITCH);
            map.put("IS_INIT_API_PATH_HASH", IS_INIT_API_PATH_HASH);
            map.put("APP_QUOTA_NUM_LIMIT", APP_QUOTA_NUM_LIMIT);
            map.put("IS_INIT_API_VERSION", IS_INIT_API_VERSION);
            map.put("PLUGIN_NUM_LIMIT", PLUGIN_NUM_LIMIT);
            map.put("APICLIENT_FIRST_USE_X_HW_ID_SWITCH", APICLIENT_FIRST_USE_X_HW_ID_SWITCH);
            map.put("API_TASK_NUM_LIMIT", API_TASK_NUM_LIMIT);
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
            if( value == null ){
                return null;
            }
            ConfigNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConfigNameEnum(value);
            }
            return result;
        }

        public static ConfigNameEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="config_name")
    
    private ConfigNameEnum configName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_value")
    
    private String configValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_time")
    
    private OffsetDateTime configTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="used")
    
    private Long used;

    public Config withConfigId(String configId) {
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

    

    public Config withConfigName(ConfigNameEnum configName) {
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

    

    public Config withConfigValue(String configValue) {
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

    

    public Config withConfigTime(OffsetDateTime configTime) {
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

    

    public Config withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 配额描述：   - API_NUM_LIMIT：租户可以创建的API个数限制   - APP_NUM_LIMIT：租户可以创建的APP个数限制   - APIGROUP_NUM_LIMIT：租户可以创建的API分组个数限制   - ENVIRONMENT_NUM_LIMIT：租户可以创建的环境个数限制   - VARIABLE_NUM_LIMIT：每个API分组上可以创建的环境变量个数限制   - SIGN_NUM_LIMIT：租户可以创建的签名密钥个数限制   - THROTTLE_NUM_LIMIT：租户可以创建的流控策略个数限制   - APIGROUP_DOMAIN_NUM_LIMIT：每个API分组上可以绑定的自定义域名个数限制   - API_VERSION_NUM_LIMIT：每个API可以保留的发布版本个数限制   - VPC_NUM_LIMIT：租户可以创建的VPC通道个数限制   - VPC_INSTANCE_NUM_LIMIT：每个VPC通道上可以绑定的弹性云服务器个数限制   - API_PARAM_NUM_LIMIT：每个API可以设置的参数个数限制   - API_USER_CALL_LIMIT：每个租户的API单位时间内的请求默认限制   - ACL_NUM_LIMIT：每个租户可以创建的ACL策略个数限制   - APP_THROTTLE_LIMIT：特殊应用流控策略个数限制   - USER_THROTTLE_LIMIT：特殊用户流控策略个数限制   - API_NUM_LIMIT_PER_GROUP：租户每个API分组可以创建的API数量限制   - API_POLICY_NUM_LIMIT：每个API可以设置的策略后端个数限制   - API_CONDITION_NUM_LIMIT：每个API策略后端可以设置的条件个数限制   - SL_DOMAIN_CALL_LIMIT：每个二级域名单位时间内的请求默认限制   - ELB_SWITCH：是否启用ELB通道   - AUTHORIZER_NUM_LIMIT：租户可创建的自定义认证个数限制   - AUTHORIZER_IDENTITY_NUM_LIMIT：每个自定义认证可以设置的身份来源个数限制   - APP_CODE_NUM_LIMIT：每个APP可以创建的APP code数量限制   - REGION_MANAGER_WHITELIST_SERVICES：不校验region manager服务白名单列表，暂不支持   - API_SWAGGER_NUM_LIMIT：单个API分组可以绑定的swagger文档数量限制   - API_TAG_NUM_LIMIT：每个API可以设置的标签个数限制   - LTS_SWITCH：是启用LTS上报   - APP_KEY_SECRET_SWITCH：是否打开APP支持自定义KEY和SECRET的开关，1：开启；2：关闭   - RESPONSE_NUM_LIMIT：分组自定义响应个数限制   - CONFIG_NUM_LIMIT_PER_APP：每个APP可以设置的配置项个数限制   - BACKEND_TOKEN_ALLOW_SWITCH：是否支持普通租户透传后端token，1：开启；2：关闭   - APP_TOKEN_SWITCH：是否启用APPTOKEN   - API_DESIGNER_SWITCH：是否启用api设计器，1：开启；2：关闭   - APP_API_KEY_SWITCH：是否启用APP_API_KEY认证方式   - APP_BASIC_SWITCH：是否启用APP_BASIC认证方式   - APP_JWT_SWITCH：是否启用APP_JWT认证方式   - APP_ROUTE_SWITCH：是否启用APP路由   - PUBLIC_KEY_SWITCH：是否启用PUBLIK_KEY后端认证方式   - APP_SECRET_SWITCH：是否启用APP_SECRET认证方式   - CASCADE_SWITCH：是否启用级联网关   - IS_INIT_API_PATH_HASH：是否执行过API PATH HASH刷新   - APP_QUOTA_NUM_LIMIT：租户可以创建的客户端配额个数   - IS_INIT_API_VERSION：是否执行过API VERSION CANONICAL PATH刷新   - PLUGIN_NUM_LIMIT：租户可以创建的插件个数   - APICLIENT_FIRST_USE_X_HW_ID_SWITCH：ApiClient是否优先使用x-hw-id校验权限   [- API_TASK_NUM_LIMIT：租户可以创建的API定时任务个数限制](tag:hws)
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public Config withUsed(Long used) {
        this.used = used;
        return this;
    }

    


    /**
     * 该实例对应配额已使用数量
     * @return used
     */
    public Long getUsed() {
        return used;
    }

    public void setUsed(Long used) {
        this.used = used;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Config config = (Config) o;
        return Objects.equals(this.configId, config.configId) &&
            Objects.equals(this.configName, config.configName) &&
            Objects.equals(this.configValue, config.configValue) &&
            Objects.equals(this.configTime, config.configTime) &&
            Objects.equals(this.remark, config.remark) &&
            Objects.equals(this.used, config.used);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configId, configName, configValue, configTime, remark, used);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Config {\n");
        sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    configTime: ").append(toIndentedString(configTime)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

