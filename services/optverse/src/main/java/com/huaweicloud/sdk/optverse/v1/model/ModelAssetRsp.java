package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模型资产详情。
 */
public class ModelAssetRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_asset_id")

    private String rootAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_version")

    private String assetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_version")

    private String externalVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_available")

    private String isAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_location")

    private String assetLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_desc")

    private String assetDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_asset_type")

    private String subAssetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_code")

    private String assetCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_source")

    private String assetSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_actions")

    private String assetActions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_obs_url")

    private String trainObsUrl;

    public ModelAssetRsp withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * **参数解释**： 资产ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ModelAssetRsp withRootAssetId(String rootAssetId) {
        this.rootAssetId = rootAssetId;
        return this;
    }

    /**
     * **参数解释**： 根资产ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return rootAssetId
     */
    public String getRootAssetId() {
        return rootAssetId;
    }

    public void setRootAssetId(String rootAssetId) {
        this.rootAssetId = rootAssetId;
    }

    public ModelAssetRsp withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * **参数解释**： 资产名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public ModelAssetRsp withAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
        return this;
    }

    /**
     * **参数解释**： 资产内部版本。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetVersion
     */
    public String getAssetVersion() {
        return assetVersion;
    }

    public void setAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
    }

    public ModelAssetRsp withExternalVersion(String externalVersion) {
        this.externalVersion = externalVersion;
        return this;
    }

    /**
     * **参数解释**： 资产对外版本。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return externalVersion
     */
    public String getExternalVersion() {
        return externalVersion;
    }

    public void setExternalVersion(String externalVersion) {
        this.externalVersion = externalVersion;
    }

    public ModelAssetRsp withIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    /**
     * **参数解释**： 对外是否可见。 **约束限制**： 不涉及 **取值范围**： * 1：可见 * 0：不可见 **默认取值**： 不涉及 
     * @return isAvailable
     */
    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public ModelAssetRsp withAssetLocation(String assetLocation) {
        this.assetLocation = assetLocation;
        return this;
    }

    /**
     * **参数解释**： OBS存储位置。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetLocation
     */
    public String getAssetLocation() {
        return assetLocation;
    }

    public void setAssetLocation(String assetLocation) {
        this.assetLocation = assetLocation;
    }

    public ModelAssetRsp withAssetDesc(String assetDesc) {
        this.assetDesc = assetDesc;
        return this;
    }

    /**
     * **参数解释**： 资产描述。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetDesc
     */
    public String getAssetDesc() {
        return assetDesc;
    }

    public void setAssetDesc(String assetDesc) {
        this.assetDesc = assetDesc;
    }

    public ModelAssetRsp withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * **参数解释**： 资产类型。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public ModelAssetRsp withSubAssetType(String subAssetType) {
        this.subAssetType = subAssetType;
        return this;
    }

    /**
     * **参数解释**： 资产子类型。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return subAssetType
     */
    public String getSubAssetType() {
        return subAssetType;
    }

    public void setSubAssetType(String subAssetType) {
        this.subAssetType = subAssetType;
    }

    public ModelAssetRsp withAssetCode(String assetCode) {
        this.assetCode = assetCode;
        return this;
    }

    /**
     * **参数解释**： 资产编码。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetCode
     */
    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public ModelAssetRsp withAssetSource(String assetSource) {
        this.assetSource = assetSource;
        return this;
    }

    /**
     * **参数解释**： 资产来源。 **约束限制**： 不涉及 **取值范围**： * Preset：预置 * AIGallery：订阅 * Import：导入 * Publish：发布 **默认取值**： 不涉及 
     * @return assetSource
     */
    public String getAssetSource() {
        return assetSource;
    }

    public void setAssetSource(String assetSource) {
        this.assetSource = assetSource;
    }

    public ModelAssetRsp withAssetActions(String assetActions) {
        this.assetActions = assetActions;
        return this;
    }

    /**
     * **参数解释**： 资产应用场景，多个场景以英文逗号分隔。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetActions
     */
    public String getAssetActions() {
        return assetActions;
    }

    public void setAssetActions(String assetActions) {
        this.assetActions = assetActions;
    }

    public ModelAssetRsp withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 更新时间（毫秒时间戳）。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ModelAssetRsp withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间（毫秒时间戳）。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ModelAssetRsp withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**： 模型创建者名称。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ModelAssetRsp withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 模型创建者ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ModelAssetRsp withTrainObsUrl(String trainObsUrl) {
        this.trainObsUrl = trainObsUrl;
        return this;
    }

    /**
     * **参数解释**： 生成该模型时用到的数据集。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return trainObsUrl
     */
    public String getTrainObsUrl() {
        return trainObsUrl;
    }

    public void setTrainObsUrl(String trainObsUrl) {
        this.trainObsUrl = trainObsUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelAssetRsp that = (ModelAssetRsp) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.rootAssetId, that.rootAssetId)
            && Objects.equals(this.assetName, that.assetName) && Objects.equals(this.assetVersion, that.assetVersion)
            && Objects.equals(this.externalVersion, that.externalVersion)
            && Objects.equals(this.isAvailable, that.isAvailable)
            && Objects.equals(this.assetLocation, that.assetLocation) && Objects.equals(this.assetDesc, that.assetDesc)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.subAssetType, that.subAssetType)
            && Objects.equals(this.assetCode, that.assetCode) && Objects.equals(this.assetSource, that.assetSource)
            && Objects.equals(this.assetActions, that.assetActions) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.trainObsUrl, that.trainObsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId,
            rootAssetId,
            assetName,
            assetVersion,
            externalVersion,
            isAvailable,
            assetLocation,
            assetDesc,
            assetType,
            subAssetType,
            assetCode,
            assetSource,
            assetActions,
            updateTime,
            createTime,
            creator,
            userId,
            trainObsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelAssetRsp {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    rootAssetId: ").append(toIndentedString(rootAssetId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
        sb.append("    externalVersion: ").append(toIndentedString(externalVersion)).append("\n");
        sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
        sb.append("    assetLocation: ").append(toIndentedString(assetLocation)).append("\n");
        sb.append("    assetDesc: ").append(toIndentedString(assetDesc)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    subAssetType: ").append(toIndentedString(subAssetType)).append("\n");
        sb.append("    assetCode: ").append(toIndentedString(assetCode)).append("\n");
        sb.append("    assetSource: ").append(toIndentedString(assetSource)).append("\n");
        sb.append("    assetActions: ").append(toIndentedString(assetActions)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    trainObsUrl: ").append(toIndentedString(trainObsUrl)).append("\n");
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
