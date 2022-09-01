package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ContainerConfigsResDTO;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ModuleContainerSettingsResDTO
 */
public class ModuleContainerSettingsResDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configs")
    
    @JacksonXmlProperty(localName = "configs")
    
    private ContainerConfigsResDTO configs;

    public ModuleContainerSettingsResDTO withConfigs(ContainerConfigsResDTO configs) {
        this.configs = configs;
        return this;
    }

    public ModuleContainerSettingsResDTO withConfigs(Consumer<ContainerConfigsResDTO> configsSetter) {
        if(this.configs == null ){
            this.configs = new ContainerConfigsResDTO();
            configsSetter.accept(this.configs);
        }
        
        return this;
    }


    /**
     * Get configs
     * @return configs
     */
    public ContainerConfigsResDTO getConfigs() {
        return configs;
    }

    public void setConfigs(ContainerConfigsResDTO configs) {
        this.configs = configs;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModuleContainerSettingsResDTO moduleContainerSettingsResDTO = (ModuleContainerSettingsResDTO) o;
        return Objects.equals(this.configs, moduleContainerSettingsResDTO.configs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModuleContainerSettingsResDTO {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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

