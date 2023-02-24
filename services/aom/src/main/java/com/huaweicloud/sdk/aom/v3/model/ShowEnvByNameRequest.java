package com.huaweicloud.sdk.aom.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowEnvByNameRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="environment_name")
    

    private String environmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_id")
    

    private String componentId;

    public ShowEnvByNameRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    


    /**
     * 环境名称
     * @return environmentName
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    

    public ShowEnvByNameRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 环境region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public ShowEnvByNameRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    


    /**
     * 组件id
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEnvByNameRequest showEnvByNameRequest = (ShowEnvByNameRequest) o;
        return Objects.equals(this.environmentName, showEnvByNameRequest.environmentName) &&
            Objects.equals(this.region, showEnvByNameRequest.region) &&
            Objects.equals(this.componentId, showEnvByNameRequest.componentId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(environmentName, region, componentId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnvByNameRequest {\n");
        sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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

