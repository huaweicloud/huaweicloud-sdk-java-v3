package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.ImageTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 创建镜像请求体
 */
public class CreateDataImageRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cmk_id")
    
    private String cmkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId = "0";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_tags")
    
    private List<ImageTag> imageTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_url")
    
    private String imageUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_disk")
    
    private Integer minDisk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 操作系统类型。只能是Windows、Linux二者之一，值区分大小写。
     */
    public static class OsTypeEnum {

        
        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

        
        /**
         * Enum LINUX for value: "Linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

        

        public static Map<String, OsTypeEnum> staticFields =
                new HashMap<String, OsTypeEnum>() {
                    { 
                        put("Windows", WINDOWS);
                        put("Linux", LINUX);
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
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    
    public CreateDataImageRequestBody withCmkId(String cmkId) {
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

    public CreateDataImageRequestBody withDescription(String description) {
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

    public CreateDataImageRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 表示当前镜像所属的企业项目。取值为0或无该值，表示属于default企业项目；取值为UUID，表示属于该UUID对应的企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateDataImageRequestBody withImageTags(List<ImageTag> imageTags) {
        this.imageTags = imageTags;
        return this;
    }

    
    public CreateDataImageRequestBody addImageTagsItem(ImageTag imageTagsItem) {
        if (this.imageTags == null) {
            this.imageTags = new ArrayList<>();
        }
        this.imageTags.add(imageTagsItem);
        return this;
    }

    public CreateDataImageRequestBody withImageTags(Consumer<List<ImageTag>> imageTagsSetter) {
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
    public List<ImageTag> getImageTags() {
        return imageTags;
    }

    public void setImageTags(List<ImageTag> imageTags) {
        this.imageTags = imageTags;
    }

    public CreateDataImageRequestBody withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    


    /**
     * OBS桶中外部镜像文件地址。格式为<OBS桶名>:<OBS镜像文件名称>。 此处的OBS桶和镜像文件的存储类别必须是OBS标准存储。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CreateDataImageRequestBody withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    


    /**
     * 最小数据盘大小。取值范围40-2048GB。
     * minimum: 40
     * maximum: 2048
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public CreateDataImageRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDataImageRequestBody withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 操作系统类型。只能是Windows、Linux二者之一，值区分大小写。
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public CreateDataImageRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateDataImageRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateDataImageRequestBody withTags(Consumer<List<String>> tagsSetter) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDataImageRequestBody createDataImageRequestBody = (CreateDataImageRequestBody) o;
        return Objects.equals(this.cmkId, createDataImageRequestBody.cmkId) &&
            Objects.equals(this.description, createDataImageRequestBody.description) &&
            Objects.equals(this.enterpriseProjectId, createDataImageRequestBody.enterpriseProjectId) &&
            Objects.equals(this.imageTags, createDataImageRequestBody.imageTags) &&
            Objects.equals(this.imageUrl, createDataImageRequestBody.imageUrl) &&
            Objects.equals(this.minDisk, createDataImageRequestBody.minDisk) &&
            Objects.equals(this.name, createDataImageRequestBody.name) &&
            Objects.equals(this.osType, createDataImageRequestBody.osType) &&
            Objects.equals(this.tags, createDataImageRequestBody.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cmkId, description, enterpriseProjectId, imageTags, imageUrl, minDisk, name, osType, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDataImageRequestBody {\n");
            sb.append("    cmkId: ").append(toIndentedString(cmkId)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
            sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
            sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

