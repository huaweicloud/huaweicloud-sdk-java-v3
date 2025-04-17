package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TransTemplateRsp
 */
public class TransTemplateRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Boolean isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_encrypt")

    private Boolean isAutoEncrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_manifests")

    private List<AdditionalManifest> additionalManifests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_info_list")

    private List<QualityInfoList> qualityInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_template_ids")

    private List<String> watermarkTemplateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private CommonInfo common;

    public TransTemplateRsp withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 模板组id<br/> 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public TransTemplateRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板组名称<br/> 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransTemplateRsp withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否设置成默认转码模板<br/> 
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public TransTemplateRsp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 模板组类型<br/> 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TransTemplateRsp withIsAutoEncrypt(Boolean isAutoEncrypt) {
        this.isAutoEncrypt = isAutoEncrypt;
        return this;
    }

    /**
     * 是否开启加密
     * @return isAutoEncrypt
     */
    public Boolean getIsAutoEncrypt() {
        return isAutoEncrypt;
    }

    public void setIsAutoEncrypt(Boolean isAutoEncrypt) {
        this.isAutoEncrypt = isAutoEncrypt;
    }

    public TransTemplateRsp withAdditionalManifests(List<AdditionalManifest> additionalManifests) {
        this.additionalManifests = additionalManifests;
        return this;
    }

    public TransTemplateRsp addAdditionalManifestsItem(AdditionalManifest additionalManifestsItem) {
        if (this.additionalManifests == null) {
            this.additionalManifests = new ArrayList<>();
        }
        this.additionalManifests.add(additionalManifestsItem);
        return this;
    }

    public TransTemplateRsp withAdditionalManifests(Consumer<List<AdditionalManifest>> additionalManifestsSetter) {
        if (this.additionalManifests == null) {
            this.additionalManifests = new ArrayList<>();
        }
        additionalManifestsSetter.accept(this.additionalManifests);
        return this;
    }

    /**
     * 自定义索引后缀列表。
     * @return additionalManifests
     */
    public List<AdditionalManifest> getAdditionalManifests() {
        return additionalManifests;
    }

    public void setAdditionalManifests(List<AdditionalManifest> additionalManifests) {
        this.additionalManifests = additionalManifests;
    }

    public TransTemplateRsp withQualityInfoList(List<QualityInfoList> qualityInfoList) {
        this.qualityInfoList = qualityInfoList;
        return this;
    }

    public TransTemplateRsp addQualityInfoListItem(QualityInfoList qualityInfoListItem) {
        if (this.qualityInfoList == null) {
            this.qualityInfoList = new ArrayList<>();
        }
        this.qualityInfoList.add(qualityInfoListItem);
        return this;
    }

    public TransTemplateRsp withQualityInfoList(Consumer<List<QualityInfoList>> qualityInfoListSetter) {
        if (this.qualityInfoList == null) {
            this.qualityInfoList = new ArrayList<>();
        }
        qualityInfoListSetter.accept(this.qualityInfoList);
        return this;
    }

    /**
     * 画质配置信息列表<br/> 
     * @return qualityInfoList
     */
    public List<QualityInfoList> getQualityInfoList() {
        return qualityInfoList;
    }

    public void setQualityInfoList(List<QualityInfoList> qualityInfoList) {
        this.qualityInfoList = qualityInfoList;
    }

    public TransTemplateRsp withWatermarkTemplateIds(List<String> watermarkTemplateIds) {
        this.watermarkTemplateIds = watermarkTemplateIds;
        return this;
    }

    public TransTemplateRsp addWatermarkTemplateIdsItem(String watermarkTemplateIdsItem) {
        if (this.watermarkTemplateIds == null) {
            this.watermarkTemplateIds = new ArrayList<>();
        }
        this.watermarkTemplateIds.add(watermarkTemplateIdsItem);
        return this;
    }

    public TransTemplateRsp withWatermarkTemplateIds(Consumer<List<String>> watermarkTemplateIdsSetter) {
        if (this.watermarkTemplateIds == null) {
            this.watermarkTemplateIds = new ArrayList<>();
        }
        watermarkTemplateIdsSetter.accept(this.watermarkTemplateIds);
        return this;
    }

    /**
     * 绑定的水印模板组ID数组<br/> 
     * @return watermarkTemplateIds
     */
    public List<String> getWatermarkTemplateIds() {
        return watermarkTemplateIds;
    }

    public void setWatermarkTemplateIds(List<String> watermarkTemplateIds) {
        this.watermarkTemplateIds = watermarkTemplateIds;
    }

    public TransTemplateRsp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板介绍<br/> 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransTemplateRsp withCommon(CommonInfo common) {
        this.common = common;
        return this;
    }

    public TransTemplateRsp withCommon(Consumer<CommonInfo> commonSetter) {
        if (this.common == null) {
            this.common = new CommonInfo();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /**
     * Get common
     * @return common
     */
    public CommonInfo getCommon() {
        return common;
    }

    public void setCommon(CommonInfo common) {
        this.common = common;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransTemplateRsp that = (TransTemplateRsp) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.isDefault, that.isDefault) && Objects.equals(this.type, that.type)
            && Objects.equals(this.isAutoEncrypt, that.isAutoEncrypt)
            && Objects.equals(this.additionalManifests, that.additionalManifests)
            && Objects.equals(this.qualityInfoList, that.qualityInfoList)
            && Objects.equals(this.watermarkTemplateIds, that.watermarkTemplateIds)
            && Objects.equals(this.description, that.description) && Objects.equals(this.common, that.common);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            name,
            isDefault,
            type,
            isAutoEncrypt,
            additionalManifests,
            qualityInfoList,
            watermarkTemplateIds,
            description,
            common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransTemplateRsp {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isAutoEncrypt: ").append(toIndentedString(isAutoEncrypt)).append("\n");
        sb.append("    additionalManifests: ").append(toIndentedString(additionalManifests)).append("\n");
        sb.append("    qualityInfoList: ").append(toIndentedString(qualityInfoList)).append("\n");
        sb.append("    watermarkTemplateIds: ").append(toIndentedString(watermarkTemplateIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
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
