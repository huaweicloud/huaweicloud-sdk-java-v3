package com.huaweicloud.sdk.dcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.QueryRedisConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListConfigurationsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_time")
    
    private String configTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redis_config")
    
    private List<QueryRedisConfig> redisConfig = null;
        /**
     * 实例修改状态 - UPDATING - FAILURE - SUCCESS 
     */
    public static final class ConfigStatusEnum {

        
        /**
         * Enum UPDATING for value: "UPDATING"
         */
        public static final ConfigStatusEnum UPDATING = new ConfigStatusEnum("UPDATING");
        
        /**
         * Enum FAILURE for value: "FAILURE"
         */
        public static final ConfigStatusEnum FAILURE = new ConfigStatusEnum("FAILURE");
        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final ConfigStatusEnum SUCCESS = new ConfigStatusEnum("SUCCESS");
        

        private static final Map<String, ConfigStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigStatusEnum> createStaticFields() {
            Map<String, ConfigStatusEnum> map = new HashMap<>();
            map.put("UPDATING", UPDATING);
            map.put("FAILURE", FAILURE);
            map.put("SUCCESS", SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfigStatusEnum(String value) {
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
        public static ConfigStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ConfigStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConfigStatusEnum(value);
            }
            return result;
        }

        public static ConfigStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ConfigStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ConfigStatusEnum) {
                return this.value.equals(((ConfigStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_status")
    
    private ConfigStatusEnum configStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public ListConfigurationsResponse withConfigTime(String configTime) {
        this.configTime = configTime;
        return this;
    }

    


    /**
     * 实例操作时间。格式为：2017-03-31T12:24:46.297Z
     * @return configTime
     */
    public String getConfigTime() {
        return configTime;
    }

    public void setConfigTime(String configTime) {
        this.configTime = configTime;
    }

    

    public ListConfigurationsResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListConfigurationsResponse withRedisConfig(List<QueryRedisConfig> redisConfig) {
        this.redisConfig = redisConfig;
        return this;
    }

    
    public ListConfigurationsResponse addRedisConfigItem(QueryRedisConfig redisConfigItem) {
        if(this.redisConfig == null) {
            this.redisConfig = new ArrayList<>();
        }
        this.redisConfig.add(redisConfigItem);
        return this;
    }

    public ListConfigurationsResponse withRedisConfig(Consumer<List<QueryRedisConfig>> redisConfigSetter) {
        if(this.redisConfig == null) {
            this.redisConfig = new ArrayList<>();
        }
        redisConfigSetter.accept(this.redisConfig);
        return this;
    }

    /**
     * 实例配置项数组。
     * @return redisConfig
     */
    public List<QueryRedisConfig> getRedisConfig() {
        return redisConfig;
    }

    public void setRedisConfig(List<QueryRedisConfig> redisConfig) {
        this.redisConfig = redisConfig;
    }

    

    public ListConfigurationsResponse withConfigStatus(ConfigStatusEnum configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    


    /**
     * 实例修改状态 - UPDATING - FAILURE - SUCCESS 
     * @return configStatus
     */
    public ConfigStatusEnum getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(ConfigStatusEnum configStatus) {
        this.configStatus = configStatus;
    }

    

    public ListConfigurationsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例运行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConfigurationsResponse listConfigurationsResponse = (ListConfigurationsResponse) o;
        return Objects.equals(this.configTime, listConfigurationsResponse.configTime) &&
            Objects.equals(this.instanceId, listConfigurationsResponse.instanceId) &&
            Objects.equals(this.redisConfig, listConfigurationsResponse.redisConfig) &&
            Objects.equals(this.configStatus, listConfigurationsResponse.configStatus) &&
            Objects.equals(this.status, listConfigurationsResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configTime, instanceId, redisConfig, configStatus, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigurationsResponse {\n");
        sb.append("    configTime: ").append(toIndentedString(configTime)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    redisConfig: ").append(toIndentedString(redisConfig)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

