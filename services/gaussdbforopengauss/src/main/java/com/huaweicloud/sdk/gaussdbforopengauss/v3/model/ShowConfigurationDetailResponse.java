package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ParaGroupParameterResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowConfigurationDetailResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine_version")
    

    private String engineVersion;
    /**
     * 实例部署形态。independent：独立；ha：主备。
     */
    public static final class InstanceModeEnum {

        
        /**
         * Enum INDEPENDENT for value: "independent"
         */
        public static final InstanceModeEnum INDEPENDENT = new InstanceModeEnum("independent");
        
        /**
         * Enum HA for value: "ha"
         */
        public static final InstanceModeEnum HA = new InstanceModeEnum("ha");
        

        private static final Map<String, InstanceModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceModeEnum> createStaticFields() {
            Map<String, InstanceModeEnum> map = new HashMap<>();
            map.put("independent", INDEPENDENT);
            map.put("ha", HA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceModeEnum(String value) {
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
        public static InstanceModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            InstanceModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstanceModeEnum(value);
            }
            return result;
        }

        public static InstanceModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            InstanceModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceModeEnum) {
                return this.value.equals(((InstanceModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_mode")
    

    private InstanceModeEnum instanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configuration_parameters")
    
    private List<ParaGroupParameterResult> configurationParameters = null;
    
    public ShowConfigurationDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 参数模板ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowConfigurationDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 参数模板名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowConfigurationDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 参数模板描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ShowConfigurationDetailResponse withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    


    /**
     * 引擎版本。 [数据库版本。支持2.3版本，取值为“2.3”]。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    

    public ShowConfigurationDetailResponse withInstanceMode(InstanceModeEnum instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    


    /**
     * 实例部署形态。independent：独立；ha：主备。
     * @return instanceMode
     */
    public InstanceModeEnum getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(InstanceModeEnum instanceMode) {
        this.instanceMode = instanceMode;
    }

    

    public ShowConfigurationDetailResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 创建时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public ShowConfigurationDetailResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 修改时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    public ShowConfigurationDetailResponse withConfigurationParameters(List<ParaGroupParameterResult> configurationParameters) {
        this.configurationParameters = configurationParameters;
        return this;
    }

    
    public ShowConfigurationDetailResponse addConfigurationParametersItem(ParaGroupParameterResult configurationParametersItem) {
        if(this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        this.configurationParameters.add(configurationParametersItem);
        return this;
    }

    public ShowConfigurationDetailResponse withConfigurationParameters(Consumer<List<ParaGroupParameterResult>> configurationParametersSetter) {
        if(this.configurationParameters == null) {
            this.configurationParameters = new ArrayList<>();
        }
        configurationParametersSetter.accept(this.configurationParameters);
        return this;
    }

    /**
     * 参数详情。
     * @return configurationParameters
     */
    public List<ParaGroupParameterResult> getConfigurationParameters() {
        return configurationParameters;
    }

    public void setConfigurationParameters(List<ParaGroupParameterResult> configurationParameters) {
        this.configurationParameters = configurationParameters;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowConfigurationDetailResponse showConfigurationDetailResponse = (ShowConfigurationDetailResponse) o;
        return Objects.equals(this.id, showConfigurationDetailResponse.id) &&
            Objects.equals(this.name, showConfigurationDetailResponse.name) &&
            Objects.equals(this.description, showConfigurationDetailResponse.description) &&
            Objects.equals(this.engineVersion, showConfigurationDetailResponse.engineVersion) &&
            Objects.equals(this.instanceMode, showConfigurationDetailResponse.instanceMode) &&
            Objects.equals(this.createdAt, showConfigurationDetailResponse.createdAt) &&
            Objects.equals(this.updatedAt, showConfigurationDetailResponse.updatedAt) &&
            Objects.equals(this.configurationParameters, showConfigurationDetailResponse.configurationParameters);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, engineVersion, instanceMode, createdAt, updatedAt, configurationParameters);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConfigurationDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    configurationParameters: ").append(toIndentedString(configurationParameters)).append("\n");
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

