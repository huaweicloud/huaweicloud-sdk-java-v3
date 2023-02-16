package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ContainerConfigsDTO;
import com.huaweicloud.sdk.iotedge.v2.model.ExtDevice;
import com.huaweicloud.sdk.iotedge.v2.model.ResourceDTO;
import com.huaweicloud.sdk.iotedge.v2.model.VolumeDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ContainerSettingsDTO
 */
public class ContainerSettingsDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="configs")
    
    
    private ContainerConfigsDTO configs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_url")
    
    
    private String imageUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="envs")
    
    
    private Object envs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes")
    
    
    private List<VolumeDTO> volumes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resources")
    
    
    private ResourceDTO resources;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ext_devices")
    
    
    private List<ExtDevice> extDevices = null;
    
    public ContainerSettingsDTO withConfigs(ContainerConfigsDTO configs) {
        this.configs = configs;
        return this;
    }

    public ContainerSettingsDTO withConfigs(Consumer<ContainerConfigsDTO> configsSetter) {
        if(this.configs == null ){
            this.configs = new ContainerConfigsDTO();
            configsSetter.accept(this.configs);
        }
        
        return this;
    }


    /**
     * Get configs
     * @return configs
     */
    public ContainerConfigsDTO getConfigs() {
        return configs;
    }

    public void setConfigs(ContainerConfigsDTO configs) {
        this.configs = configs;
    }

    

    public ContainerSettingsDTO withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    


    /**
     * 镜像存储地址
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    

    public ContainerSettingsDTO withEnvs(Object envs) {
        this.envs = envs;
        return this;
    }

    


    /**
     * 环境变量
     * @return envs
     */
    public Object getEnvs() {
        return envs;
    }

    public void setEnvs(Object envs) {
        this.envs = envs;
    }

    

    public ContainerSettingsDTO withVolumes(List<VolumeDTO> volumes) {
        this.volumes = volumes;
        return this;
    }

    
    public ContainerSettingsDTO addVolumesItem(VolumeDTO volumesItem) {
        if(this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ContainerSettingsDTO withVolumes(Consumer<List<VolumeDTO>> volumesSetter) {
        if(this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 卷配置
     * @return volumes
     */
    public List<VolumeDTO> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VolumeDTO> volumes) {
        this.volumes = volumes;
    }

    

    public ContainerSettingsDTO withResources(ResourceDTO resources) {
        this.resources = resources;
        return this;
    }

    public ContainerSettingsDTO withResources(Consumer<ResourceDTO> resourcesSetter) {
        if(this.resources == null ){
            this.resources = new ResourceDTO();
            resourcesSetter.accept(this.resources);
        }
        
        return this;
    }


    /**
     * Get resources
     * @return resources
     */
    public ResourceDTO getResources() {
        return resources;
    }

    public void setResources(ResourceDTO resources) {
        this.resources = resources;
    }

    

    public ContainerSettingsDTO withExtDevices(List<ExtDevice> extDevices) {
        this.extDevices = extDevices;
        return this;
    }

    
    public ContainerSettingsDTO addExtDevicesItem(ExtDevice extDevicesItem) {
        if(this.extDevices == null) {
            this.extDevices = new ArrayList<>();
        }
        this.extDevices.add(extDevicesItem);
        return this;
    }

    public ContainerSettingsDTO withExtDevices(Consumer<List<ExtDevice>> extDevicesSetter) {
        if(this.extDevices == null) {
            this.extDevices = new ArrayList<>();
        }
        extDevicesSetter.accept(this.extDevices);
        return this;
    }

    /**
     * 外挂设备配置
     * @return extDevices
     */
    public List<ExtDevice> getExtDevices() {
        return extDevices;
    }

    public void setExtDevices(List<ExtDevice> extDevices) {
        this.extDevices = extDevices;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerSettingsDTO containerSettingsDTO = (ContainerSettingsDTO) o;
        return Objects.equals(this.configs, containerSettingsDTO.configs) &&
            Objects.equals(this.imageUrl, containerSettingsDTO.imageUrl) &&
            Objects.equals(this.envs, containerSettingsDTO.envs) &&
            Objects.equals(this.volumes, containerSettingsDTO.volumes) &&
            Objects.equals(this.resources, containerSettingsDTO.resources) &&
            Objects.equals(this.extDevices, containerSettingsDTO.extDevices);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configs, imageUrl, envs, volumes, resources, extDevices);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerSettingsDTO {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    extDevices: ").append(toIndentedString(extDevices)).append("\n");
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

