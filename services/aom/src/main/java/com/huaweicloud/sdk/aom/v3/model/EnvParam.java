package com.huaweicloud.sdk.aom.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EnvParam
 */
public class EnvParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_id")
    
    
    private String componentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_name")
    
    
    private String envName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_type")
    
    
    private String envType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    
    private String osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="register_type")
    
    
    private String registerType;

    public EnvParam withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    


    /**
     * 环境关联组件id
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    

    public EnvParam withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public EnvParam withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    


    /**
     * 环境名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    

    public EnvParam withEnvType(String envType) {
        this.envType = envType;
        return this;
    }

    


    /**
     * 环境类型，取值：DEV、TEST、PRE、ONLINE
     * @return envType
     */
    public String getEnvType() {
        return envType;
    }

    public void setEnvType(String envType) {
        this.envType = envType;
    }

    

    public EnvParam withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * OS类型，取值：LINUX、WINDOWS
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    

    public EnvParam withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 环境关联region。创建环境必传
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public EnvParam withRegisterType(String registerType) {
        this.registerType = registerType;
        return this;
    }

    


    /**
     * 注册类型，取值：API、SERVICE_DISCOVERY、CONSOLE，默认值：API
     * @return registerType
     */
    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvParam envParam = (EnvParam) o;
        return Objects.equals(this.componentId, envParam.componentId) &&
            Objects.equals(this.description, envParam.description) &&
            Objects.equals(this.envName, envParam.envName) &&
            Objects.equals(this.envType, envParam.envType) &&
            Objects.equals(this.osType, envParam.osType) &&
            Objects.equals(this.region, envParam.region) &&
            Objects.equals(this.registerType, envParam.registerType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(componentId, description, envName, envType, osType, region, registerType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvParam {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    registerType: ").append(toIndentedString(registerType)).append("\n");
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

