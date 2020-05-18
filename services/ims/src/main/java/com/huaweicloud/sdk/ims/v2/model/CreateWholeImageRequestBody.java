package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ims.v2.model.TagKeyValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * CreateWholeImageRequestBody
 */
public class CreateWholeImageRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId = "0";


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
    @JsonProperty(value="backup_id")
    
    private String backupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whole_image_type")
    
    private String wholeImageType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_ram")
    
    private Integer maxRam;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_ram")
    
    private Integer minRam = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault_id")
    
    private String vaultId;

    public CreateWholeImageRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 镜像描述信息。 支持字母、数字、中文等，不支持回车、<、 >，长度不能超过1024个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWholeImageRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 表示当前镜像所属的企业项目。取值为0或无该值，表示属于default企业项目。取值为UUID，表示属于该UUID对应的企业项目。关于企业项目ID的获取及企业项目特性的详细信息，请参考《企业管理用户指南》。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateWholeImageRequestBody withImageTags(List<TagKeyValue> imageTags) {
        this.imageTags = imageTags;
        return this;
    }

    
    public CreateWholeImageRequestBody addImageTagsItem(TagKeyValue imageTagsItem) {
        if (this.imageTags == null) {
            this.imageTags = new ArrayList<>();
        }
        this.imageTags.add(imageTagsItem);
        return this;
    }

    public CreateWholeImageRequestBody withImageTags(Consumer<List<TagKeyValue>> imageTagsSetter) {
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

    public CreateWholeImageRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 弹性云服务器ID。使用弹性云服务器制作整机镜像时使用此参数。 如果使用备份创建整机镜像，该参数应换成backup_id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateWholeImageRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像名称。 名称的首尾字母不能为空格。 名称的长度至为1～128位。 名称包含以下4种字符： 大写字母 小写字母 数字 特殊字符包含-、.、_、空格和中文。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWholeImageRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateWholeImageRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateWholeImageRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像标签列表。tags和image_tags只能使用一个。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CreateWholeImageRequestBody withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    


    /**
     * 使用云服务器备份创建整机镜像使用此参数。 如果使用ECS创建整机镜像，则该参数应传为instance_id
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public CreateWholeImageRequestBody withWholeImageType(String wholeImageType) {
        this.wholeImageType = wholeImageType;
        return this;
    }

    


    /**
     * 使用备份创建整机镜像时，该字段区分是CBR服务的备份还是CSBS服务的备份，取值为：CBR/CSBS。 使用ECS创建整机镜像时，该字段不填
     * @return wholeImageType
     */
    public String getWholeImageType() {
        return wholeImageType;
    }

    public void setWholeImageType(String wholeImageType) {
        this.wholeImageType = wholeImageType;
    }

    public CreateWholeImageRequestBody withMaxRam(Integer maxRam) {
        this.maxRam = maxRam;
        return this;
    }

    


    /**
     * 表示镜像支持的最大内存，单位为MB，默认不设置。
     * @return maxRam
     */
    public Integer getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(Integer maxRam) {
        this.maxRam = maxRam;
    }

    public CreateWholeImageRequestBody withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    


    /**
     * 表示镜像支持的最小内存，单位为MB，默认为0。
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public CreateWholeImageRequestBody withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    


    /**
     * 表示云服务器待加入的或已加入的存储库的ID。 使用云服务器创建整机镜像的过程为：先创建一个备份，再将备份创建为整机镜像。如果这个备份为CBR，vault_id为必填项；如果备份为CSBS，vault_id参数可不填。
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWholeImageRequestBody createWholeImageRequestBody = (CreateWholeImageRequestBody) o;
        return Objects.equals(this.description, createWholeImageRequestBody.description) &&
            Objects.equals(this.enterpriseProjectId, createWholeImageRequestBody.enterpriseProjectId) &&
            Objects.equals(this.imageTags, createWholeImageRequestBody.imageTags) &&
            Objects.equals(this.instanceId, createWholeImageRequestBody.instanceId) &&
            Objects.equals(this.name, createWholeImageRequestBody.name) &&
            Objects.equals(this.tags, createWholeImageRequestBody.tags) &&
            Objects.equals(this.backupId, createWholeImageRequestBody.backupId) &&
            Objects.equals(this.wholeImageType, createWholeImageRequestBody.wholeImageType) &&
            Objects.equals(this.maxRam, createWholeImageRequestBody.maxRam) &&
            Objects.equals(this.minRam, createWholeImageRequestBody.minRam) &&
            Objects.equals(this.vaultId, createWholeImageRequestBody.vaultId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, enterpriseProjectId, imageTags, instanceId, name, tags, backupId, wholeImageType, maxRam, minRam, vaultId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWholeImageRequestBody {\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
            sb.append("    wholeImageType: ").append(toIndentedString(wholeImageType)).append("\n");
            sb.append("    maxRam: ").append(toIndentedString(maxRam)).append("\n");
            sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
            sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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

