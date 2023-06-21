package com.huaweicloud.sdk.iotedge.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.ContainerConfigsDTO;
import com.huaweicloud.sdk.iotedge.v2.model.ExtDevice;
import com.huaweicloud.sdk.iotedge.v2.model.ResourceDTO;
import com.huaweicloud.sdk.iotedge.v2.model.VolumeDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        /**
     * NPU类型, D310:昇腾310推理卡，D910:昇腾910训练卡;D310P：昇腾710或者310P加速卡
     */
    public static final class NpuTypeEnum {

        
        /**
         * Enum D310 for value: "D310"
         */
        public static final NpuTypeEnum D310 = new NpuTypeEnum("D310");
        
        /**
         * Enum D910 for value: "D910"
         */
        public static final NpuTypeEnum D910 = new NpuTypeEnum("D910");
        
        /**
         * Enum D310P for value: "D310P"
         */
        public static final NpuTypeEnum D310P = new NpuTypeEnum("D310P");
        

        private static final Map<String, NpuTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NpuTypeEnum> createStaticFields() {
            Map<String, NpuTypeEnum> map = new HashMap<>();
            map.put("D310", D310);
            map.put("D910", D910);
            map.put("D310P", D310P);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NpuTypeEnum(String value) {
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
        public static NpuTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NpuTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NpuTypeEnum(value);
            }
            return result;
        }

        public static NpuTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NpuTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NpuTypeEnum) {
                return this.value.equals(((NpuTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="npu_type")
    

    private NpuTypeEnum npuType;
    /**
     * NPU算力切分模板,昇腾D310Pro，支持：vir01、vir02、vir02_1c、vir04、vir04_4c_dvpp、vir04_3c、vir04_3c_ndvpp 昇腾D910芯片支持:vir01|vir02|vir04|vir08 可在对应芯片的机器上通过npu-smi info -t template-info命令查询其详细信息
     */
    public static final class VnpuTemplateEnum {

        
        /**
         * Enum VIR01 for value: "vir01"
         */
        public static final VnpuTemplateEnum VIR01 = new VnpuTemplateEnum("vir01");
        
        /**
         * Enum VIR02 for value: "vir02"
         */
        public static final VnpuTemplateEnum VIR02 = new VnpuTemplateEnum("vir02");
        
        /**
         * Enum VIR04 for value: "vir04"
         */
        public static final VnpuTemplateEnum VIR04 = new VnpuTemplateEnum("vir04");
        
        /**
         * Enum VIR08 for value: "vir08"
         */
        public static final VnpuTemplateEnum VIR08 = new VnpuTemplateEnum("vir08");
        
        /**
         * Enum VIR02_1C for value: "vir02_1c"
         */
        public static final VnpuTemplateEnum VIR02_1C = new VnpuTemplateEnum("vir02_1c");
        
        /**
         * Enum VIR04_3C for value: "vir04_3c"
         */
        public static final VnpuTemplateEnum VIR04_3C = new VnpuTemplateEnum("vir04_3c");
        
        /**
         * Enum VIR04_3C_NDVPP for value: "vir04_3c_ndvpp"
         */
        public static final VnpuTemplateEnum VIR04_3C_NDVPP = new VnpuTemplateEnum("vir04_3c_ndvpp");
        
        /**
         * Enum VIR04_4C_DVPP for value: "vir04_4c_dvpp"
         */
        public static final VnpuTemplateEnum VIR04_4C_DVPP = new VnpuTemplateEnum("vir04_4c_dvpp");
        

        private static final Map<String, VnpuTemplateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VnpuTemplateEnum> createStaticFields() {
            Map<String, VnpuTemplateEnum> map = new HashMap<>();
            map.put("vir01", VIR01);
            map.put("vir02", VIR02);
            map.put("vir04", VIR04);
            map.put("vir08", VIR08);
            map.put("vir02_1c", VIR02_1C);
            map.put("vir04_3c", VIR04_3C);
            map.put("vir04_3c_ndvpp", VIR04_3C_NDVPP);
            map.put("vir04_4c_dvpp", VIR04_4C_DVPP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VnpuTemplateEnum(String value) {
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
        public static VnpuTemplateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            VnpuTemplateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VnpuTemplateEnum(value);
            }
            return result;
        }

        public static VnpuTemplateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VnpuTemplateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VnpuTemplateEnum) {
                return this.value.equals(((VnpuTemplateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vnpu_template")
    

    private VnpuTemplateEnum vnpuTemplate;

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

    

    public ContainerSettingsDTO withNpuType(NpuTypeEnum npuType) {
        this.npuType = npuType;
        return this;
    }

    


    /**
     * NPU类型, D310:昇腾310推理卡，D910:昇腾910训练卡;D310P：昇腾710或者310P加速卡
     * @return npuType
     */
    public NpuTypeEnum getNpuType() {
        return npuType;
    }

    public void setNpuType(NpuTypeEnum npuType) {
        this.npuType = npuType;
    }

    

    public ContainerSettingsDTO withVnpuTemplate(VnpuTemplateEnum vnpuTemplate) {
        this.vnpuTemplate = vnpuTemplate;
        return this;
    }

    


    /**
     * NPU算力切分模板,昇腾D310Pro，支持：vir01、vir02、vir02_1c、vir04、vir04_4c_dvpp、vir04_3c、vir04_3c_ndvpp 昇腾D910芯片支持:vir01|vir02|vir04|vir08 可在对应芯片的机器上通过npu-smi info -t template-info命令查询其详细信息
     * @return vnpuTemplate
     */
    public VnpuTemplateEnum getVnpuTemplate() {
        return vnpuTemplate;
    }

    public void setVnpuTemplate(VnpuTemplateEnum vnpuTemplate) {
        this.vnpuTemplate = vnpuTemplate;
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
            Objects.equals(this.npuType, containerSettingsDTO.npuType) &&
            Objects.equals(this.vnpuTemplate, containerSettingsDTO.vnpuTemplate) &&
            Objects.equals(this.resources, containerSettingsDTO.resources) &&
            Objects.equals(this.extDevices, containerSettingsDTO.extDevices);
    }
    @Override
    public int hashCode() {
        return Objects.hash(configs, imageUrl, envs, volumes, npuType, vnpuTemplate, resources, extDevices);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerSettingsDTO {\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    npuType: ").append(toIndentedString(npuType)).append("\n");
        sb.append("    vnpuTemplate: ").append(toIndentedString(vnpuTemplate)).append("\n");
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

