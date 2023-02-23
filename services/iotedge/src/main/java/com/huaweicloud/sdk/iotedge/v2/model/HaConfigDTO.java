package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ActiveStandbyConfigDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 高可用配置请求结构体
 */
public class HaConfigDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha_type")
    

    private String haType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="active_standby_config")
    

    private ActiveStandbyConfigDTO activeStandbyConfig;

    public HaConfigDTO withHaType(String haType) {
        this.haType = haType;
        return this;
    }

    


    /**
     * 节点高可用类型双活或者主备
     * @return haType
     */
    public String getHaType() {
        return haType;
    }

    public void setHaType(String haType) {
        this.haType = haType;
    }

    

    public HaConfigDTO withActiveStandbyConfig(ActiveStandbyConfigDTO activeStandbyConfig) {
        this.activeStandbyConfig = activeStandbyConfig;
        return this;
    }

    public HaConfigDTO withActiveStandbyConfig(Consumer<ActiveStandbyConfigDTO> activeStandbyConfigSetter) {
        if(this.activeStandbyConfig == null ){
            this.activeStandbyConfig = new ActiveStandbyConfigDTO();
            activeStandbyConfigSetter.accept(this.activeStandbyConfig);
        }
        
        return this;
    }


    /**
     * Get activeStandbyConfig
     * @return activeStandbyConfig
     */
    public ActiveStandbyConfigDTO getActiveStandbyConfig() {
        return activeStandbyConfig;
    }

    public void setActiveStandbyConfig(ActiveStandbyConfigDTO activeStandbyConfig) {
        this.activeStandbyConfig = activeStandbyConfig;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HaConfigDTO haConfigDTO = (HaConfigDTO) o;
        return Objects.equals(this.haType, haConfigDTO.haType) &&
            Objects.equals(this.activeStandbyConfig, haConfigDTO.activeStandbyConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(haType, activeStandbyConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HaConfigDTO {\n");
        sb.append("    haType: ").append(toIndentedString(haType)).append("\n");
        sb.append("    activeStandbyConfig: ").append(toIndentedString(activeStandbyConfig)).append("\n");
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

