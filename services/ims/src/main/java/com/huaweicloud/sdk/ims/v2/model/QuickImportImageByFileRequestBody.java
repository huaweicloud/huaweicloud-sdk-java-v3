package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.ResourceTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 快速通道创建镜像的请求体
 */
public class QuickImportImageByFileRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


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
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
        /**
     * 制作的镜像类型。系统盘镜像为ECS/BMS，数据盘镜像为DataImage. 制作数据盘镜像时该参数必选.
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
         * Enum DATAIMAGE for value: "DataImage"
         */
        public static final TypeEnum DATAIMAGE = new TypeEnum("DataImage");

        

        public static Map<String, TypeEnum> staticFields =
                new HashMap<String, TypeEnum>() {
                    { 
                        put("ECS", ECS);
                        put("BMS", BMS);
                        put("DataImage", DATAIMAGE);
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
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId = "0";
    /**
     * 镜像的架构类型。取值包括： x86 arm 默认使用“x86”。
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
    /**
     * 操作系统版本。 创建数据盘镜像时该参数必填，取值为Linux或Windows。
     */
    public static class OsTypeEnum {

        
        /**
         * Enum LINUX for value: "Linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

        
        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

        

        public static Map<String, OsTypeEnum> staticFields =
                new HashMap<String, OsTypeEnum>() {
                    { 
                        put("Linux", LINUX);
                        put("Windows", WINDOWS);
                    }
                };

        private String value;

        OsTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    private OsTypeEnum osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_tags")
    
    private List<ResourceTag> imageTags = null;
    
    public QuickImportImageByFileRequestBody withName(String name) {
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

    public QuickImportImageByFileRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 镜像描述信息。_description参数说明请参考镜像属性。支持字母、数字、中文等，不支持回车、<、 >，长度不能超过1024个字符。默认为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QuickImportImageByFileRequestBody withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    


    /**
     * 操作系统版本。使用上传至OBS桶中的外部镜像文件制作镜像时生效
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public QuickImportImageByFileRequestBody withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    


    /**
     * OBS桶中外部镜像文件地址。在使用OBS桶的外部镜像文件制作镜像时生效且为必选字段。格式为<OBS桶名>:<OBS镜像文件名称>。注意：此处的OBS桶和镜像文件的存储类别必须是OBS标准存储。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public QuickImportImageByFileRequestBody withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    


    /**
     * 最小系统盘大小。在使用OBS桶的外部镜像文件制作镜像时生效且为必选字段。取值为1至1024GB。
     * minimum: 1
     * maximum: 1024
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public QuickImportImageByFileRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public QuickImportImageByFileRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QuickImportImageByFileRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像标签列表。默认为空。 tags和image_tags只能使用一个。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public QuickImportImageByFileRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 制作的镜像类型。系统盘镜像为ECS/BMS，数据盘镜像为DataImage. 制作数据盘镜像时该参数必选.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public QuickImportImageByFileRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 表示当前镜像所属的企业项目。 取值为0或无该值，表示属于default企业项目。 取值为UUID，表示属于该UUID对应的企业项目。 关于企业项目ID的获取及企业项目特性的详细信息，请参考《企业管理用户指南》。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public QuickImportImageByFileRequestBody withArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
        return this;
    }

    


    /**
     * 镜像的架构类型。取值包括： x86 arm 默认使用“x86”。
     * @return architecture
     */
    public ArchitectureEnum getArchitecture() {
        return architecture;
    }

    public void setArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
    }

    public QuickImportImageByFileRequestBody withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 操作系统版本。 创建数据盘镜像时该参数必填，取值为Linux或Windows。
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public QuickImportImageByFileRequestBody withImageTags(List<ResourceTag> imageTags) {
        this.imageTags = imageTags;
        return this;
    }

    
    public QuickImportImageByFileRequestBody addImageTagsItem(ResourceTag imageTagsItem) {
        if (this.imageTags == null) {
            this.imageTags = new ArrayList<>();
        }
        this.imageTags.add(imageTagsItem);
        return this;
    }

    public QuickImportImageByFileRequestBody withImageTags(Consumer<List<ResourceTag>> imageTagsSetter) {
        if(this.imageTags == null ){
            this.imageTags = new ArrayList<>();
        }
        imageTagsSetter.accept(this.imageTags);
        return this;
    }

    /**
     * 新规范的镜像标签列表。默认为空。 tags和image_tags只能使用一个。
     * @return imageTags
     */
    public List<ResourceTag> getImageTags() {
        return imageTags;
    }

    public void setImageTags(List<ResourceTag> imageTags) {
        this.imageTags = imageTags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuickImportImageByFileRequestBody quickImportImageByFileRequestBody = (QuickImportImageByFileRequestBody) o;
        return Objects.equals(this.name, quickImportImageByFileRequestBody.name) &&
            Objects.equals(this.description, quickImportImageByFileRequestBody.description) &&
            Objects.equals(this.osVersion, quickImportImageByFileRequestBody.osVersion) &&
            Objects.equals(this.imageUrl, quickImportImageByFileRequestBody.imageUrl) &&
            Objects.equals(this.minDisk, quickImportImageByFileRequestBody.minDisk) &&
            Objects.equals(this.tags, quickImportImageByFileRequestBody.tags) &&
            Objects.equals(this.type, quickImportImageByFileRequestBody.type) &&
            Objects.equals(this.enterpriseProjectId, quickImportImageByFileRequestBody.enterpriseProjectId) &&
            Objects.equals(this.architecture, quickImportImageByFileRequestBody.architecture) &&
            Objects.equals(this.osType, quickImportImageByFileRequestBody.osType) &&
            Objects.equals(this.imageTags, quickImportImageByFileRequestBody.imageTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, osVersion, imageUrl, minDisk, tags, type, enterpriseProjectId, architecture, osType, imageTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuickImportImageByFileRequestBody {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
            sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
            sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
            sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
            sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
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

