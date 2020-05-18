package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.CreateDataImage;
import com.huaweicloud.sdk.ims.v2.model.TagKeyValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 创建镜像请求参数体
 */
public class CreateImageRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_images")
    
    private List<CreateDataImage> dataImages = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_tags")
    
    private List<TagKeyValue> imageTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_ram")
    
    private Integer maxRam;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_ram")
    
    private Integer minRam;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_version")
    
    private String osVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_url")
    
    private String imageUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_disk")
    
    private Integer minDisk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_config")
    
    private Boolean isConfig = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cmk_id")
    
    private String cmkId;
    /**
     * 镜像的类型。 取值为ECS、BMS、FusionCompute、Ironic。默认使用“ECS”。 ECS/FusionCompute：表示是ECS服务器的镜像。 BMS/Ironic：表示是BMS服务器的镜像。
     */
    public static class TypeEnum {

        
        /**
         * Enum ECS for value: "ECS"
         */
        public static final TypeEnum ECS = new TypeEnum("ECS");

        
        /**
         * Enum BMS for value: "BMS"
         */
        public static final TypeEnum BMS = new TypeEnum("BMS");

        
        /**
         * Enum FUSIONCOMPUTE for value: "FusionCompute"
         */
        public static final TypeEnum FUSIONCOMPUTE = new TypeEnum("FusionCompute");

        
        /**
         * Enum IRONIC for value: "Ironic"
         */
        public static final TypeEnum IRONIC = new TypeEnum("Ironic");

        

        public static Map<String, TypeEnum> staticFields =
                new HashMap<String, TypeEnum>() {
                    { 
                        put("ECS", ECS);
                        put("BMS", BMS);
                        put("FusionCompute", FUSIONCOMPUTE);
                        put("Ironic", IRONIC);
                    }
                };

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type = TypeEnum.ECS;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_quick_import")
    
    private Boolean isQuickImport = false;
    /**
     * 镜像的架构类型。取值包括： x86 arm 默认使用“x86”。 当架构类型为arm时，镜像引导方式将自动转为UEFI的引导方式。
     */
    public static class ArchitectureEnum {

        
        /**
         * Enum X86 for value: "x86"
         */
        public static final ArchitectureEnum X86 = new ArchitectureEnum("x86");

        
        /**
         * Enum ARM for value: "arm"
         */
        public static final ArchitectureEnum ARM = new ArchitectureEnum("arm");

        

        public static Map<String, ArchitectureEnum> staticFields =
                new HashMap<String, ArchitectureEnum>() {
                    { 
                        put("x86", X86);
                        put("arm", ARM);
                    }
                };

        private String value;

        ArchitectureEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ArchitectureEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ArchitectureEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ArchitectureEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ArchitectureEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ArchitectureEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ArchitectureEnum) {
                return this.value.equals(((ArchitectureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="architecture")
    
    private ArchitectureEnum architecture = ArchitectureEnum.X86;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_id")
    
    private String volumeId;

    public CreateImageRequestBody withDataImages(List<CreateDataImage> dataImages) {
        this.dataImages = dataImages;
        return this;
    }

    
    public CreateImageRequestBody addDataImagesItem(CreateDataImage dataImagesItem) {
        if (this.dataImages == null) {
            this.dataImages = new ArrayList<>();
        }
        this.dataImages.add(dataImagesItem);
        return this;
    }

    public CreateImageRequestBody withDataImages(Consumer<List<CreateDataImage>> dataImagesSetter) {
        if(this.dataImages == null ){
            this.dataImages = new ArrayList<>();
        }
        dataImagesSetter.accept(this.dataImages);
        return this;
    }

    /**
     * 需要转换的数据盘信息，其中，当使用云服务器上的数据盘进行私有数据盘镜像创建时，该字段必选。 如果不是用于制作数据盘镜像，该字段默认为空。
     * @return dataImages
     */
    public List<CreateDataImage> getDataImages() {
        return dataImages;
    }

    public void setDataImages(List<CreateDataImage> dataImages) {
        this.dataImages = dataImages;
    }

    public CreateImageRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 镜像描述信息。支持字母、数字、中文等，不支持回车、<、 >，长度不能超过1024个字符。默认为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateImageRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 表示当前镜像所属的企业项目。取值为0或无该值，表示属于default企业项目。取值为UUID，表示属于该UUID对应的企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateImageRequestBody withImageTags(List<TagKeyValue> imageTags) {
        this.imageTags = imageTags;
        return this;
    }

    
    public CreateImageRequestBody addImageTagsItem(TagKeyValue imageTagsItem) {
        if (this.imageTags == null) {
            this.imageTags = new ArrayList<>();
        }
        this.imageTags.add(imageTagsItem);
        return this;
    }

    public CreateImageRequestBody withImageTags(Consumer<List<TagKeyValue>> imageTagsSetter) {
        if(this.imageTags == null ){
            this.imageTags = new ArrayList<>();
        }
        imageTagsSetter.accept(this.imageTags);
        return this;
    }

    /**
     * 新规范的镜像标签列表。默认为空。tags和image_tags只能使用一个。
     * @return imageTags
     */
    public List<TagKeyValue> getImageTags() {
        return imageTags;
    }

    public void setImageTags(List<TagKeyValue> imageTags) {
        this.imageTags = imageTags;
    }

    public CreateImageRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 需要转换的云服务器ID。使用instance_id字段，从云服务器制作私有镜像时，该字段填写云服务器ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateImageRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateImageRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateImageRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateImageRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像标签列表。默认为空。tags和image_tags只能使用一个。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CreateImageRequestBody withMaxRam(Integer maxRam) {
        this.maxRam = maxRam;
        return this;
    }

    


    /**
     * 表示镜像支持的最大内存，单位为MB。
     * @return maxRam
     */
    public Integer getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(Integer maxRam) {
        this.maxRam = maxRam;
    }

    public CreateImageRequestBody withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    


    /**
     * 表示镜像支持的最小内存，单位为MB，默认为0，表示不受限制。
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public CreateImageRequestBody withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    


    /**
     * 操作系统版本。 使用上传至OBS桶中的外部镜像文件制作镜像时生效。 当“is_quick_import”的值为“true”时，即使用镜像文件快速导入方式导入系统盘镜像，则该参数为必填参数。
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public CreateImageRequestBody withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    


    /**
     * OBS桶中外部镜像文件地址。 在使用OBS桶的外部镜像文件制作镜像时生效且为必选字段。格式为<OBS桶名>:<OBS镜像文件名称>。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CreateImageRequestBody withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    


    /**
     * 最小系统盘大小。 在使用OBS桶的外部镜像文件制作镜像时生效且为必选字段。取值为40～1024GB。
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public CreateImageRequestBody withIsConfig(Boolean isConfig) {
        this.isConfig = isConfig;
        return this;
    }

    


    /**
     * 是否自动配置。 取值为true或false。 如果需要后台自动配置，取值为true，否则为false。默认取值为false。
     * @return isConfig
     */
    public Boolean getIsConfig() {
        return isConfig;
    }

    public void setIsConfig(Boolean isConfig) {
        this.isConfig = isConfig;
    }

    public CreateImageRequestBody withCmkId(String cmkId) {
        this.cmkId = cmkId;
        return this;
    }

    


    /**
     * 创建加密镜像的用户主密钥，具体取值请参考《密钥管理服务用户指南》获取。
     * @return cmkId
     */
    public String getCmkId() {
        return cmkId;
    }

    public void setCmkId(String cmkId) {
        this.cmkId = cmkId;
    }

    public CreateImageRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 镜像的类型。 取值为ECS、BMS、FusionCompute、Ironic。默认使用“ECS”。 ECS/FusionCompute：表示是ECS服务器的镜像。 BMS/Ironic：表示是BMS服务器的镜像。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateImageRequestBody withIsQuickImport(Boolean isQuickImport) {
        this.isQuickImport = isQuickImport;
        return this;
    }

    


    /**
     * 是否使用镜像文件快速导入方式，导入系统盘镜像。 是，配置为true。 否，配置为false。 关于镜像文件快速导入的约束与限制请参见镜像文件快速导入。
     * @return isQuickImport
     */
    public Boolean getIsQuickImport() {
        return isQuickImport;
    }

    public void setIsQuickImport(Boolean isQuickImport) {
        this.isQuickImport = isQuickImport;
    }

    public CreateImageRequestBody withArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
        return this;
    }

    


    /**
     * 镜像的架构类型。取值包括： x86 arm 默认使用“x86”。 当架构类型为arm时，镜像引导方式将自动转为UEFI的引导方式。
     * @return architecture
     */
    public ArchitectureEnum getArchitecture() {
        return architecture;
    }

    public void setArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
    }

    public CreateImageRequestBody withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * 数据盘的卷ID。当数据盘创建系统盘镜像时，该参数必选
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateImageRequestBody createImageRequestBody = (CreateImageRequestBody) o;
        return Objects.equals(this.dataImages, createImageRequestBody.dataImages) &&
            Objects.equals(this.description, createImageRequestBody.description) &&
            Objects.equals(this.enterpriseProjectId, createImageRequestBody.enterpriseProjectId) &&
            Objects.equals(this.imageTags, createImageRequestBody.imageTags) &&
            Objects.equals(this.instanceId, createImageRequestBody.instanceId) &&
            Objects.equals(this.name, createImageRequestBody.name) &&
            Objects.equals(this.tags, createImageRequestBody.tags) &&
            Objects.equals(this.maxRam, createImageRequestBody.maxRam) &&
            Objects.equals(this.minRam, createImageRequestBody.minRam) &&
            Objects.equals(this.osVersion, createImageRequestBody.osVersion) &&
            Objects.equals(this.imageUrl, createImageRequestBody.imageUrl) &&
            Objects.equals(this.minDisk, createImageRequestBody.minDisk) &&
            Objects.equals(this.isConfig, createImageRequestBody.isConfig) &&
            Objects.equals(this.cmkId, createImageRequestBody.cmkId) &&
            Objects.equals(this.type, createImageRequestBody.type) &&
            Objects.equals(this.isQuickImport, createImageRequestBody.isQuickImport) &&
            Objects.equals(this.architecture, createImageRequestBody.architecture) &&
            Objects.equals(this.volumeId, createImageRequestBody.volumeId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dataImages, description, enterpriseProjectId, imageTags, instanceId, name, tags, maxRam, minRam, osVersion, imageUrl, minDisk, isConfig, cmkId, type, isQuickImport, architecture, volumeId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageRequestBody {\n");
            sb.append("    dataImages: ").append(toIndentedString(dataImages)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    maxRam: ").append(toIndentedString(maxRam)).append("\n");
            sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
            sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
            sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
            sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
            sb.append("    isConfig: ").append(toIndentedString(isConfig)).append("\n");
            sb.append("    cmkId: ").append(toIndentedString(cmkId)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    isQuickImport: ").append(toIndentedString(isQuickImport)).append("\n");
            sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
            sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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

