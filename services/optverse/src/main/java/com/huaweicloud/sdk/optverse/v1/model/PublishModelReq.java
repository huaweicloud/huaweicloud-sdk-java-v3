package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 发布模型请求体。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
 */
public class PublishModelReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_job_id")

    private String trainJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_location")

    private String assetLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_id")

    private String chatId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_version")

    private String assetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_version")

    private String externalVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_asset_type")

    private String subAssetType;

    public PublishModelReq withTrainJobId(String trainJobId) {
        this.trainJobId = trainJobId;
        return this;
    }

    /**
     * **参数解释**： 训练任务ID。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return trainJobId
     */
    public String getTrainJobId() {
        return trainJobId;
    }

    public void setTrainJobId(String trainJobId) {
        this.trainJobId = trainJobId;
    }

    public PublishModelReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 模型名称。 **约束限制**： 不涉及 **取值范围**： 长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublishModelReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 模型名称。 **约束限制**： 不涉及 **取值范围**： 长度为[1-2048]个字符。 **默认取值**： 不涉及 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PublishModelReq withAssetLocation(String assetLocation) {
        this.assetLocation = assetLocation;
        return this;
    }

    /**
     * **参数解释**： 模型在OBS存储位置。 **约束限制**： 不涉及 **取值范围**： 长度为[1-512]个字符。 **默认取值**： 不涉及 
     * @return assetLocation
     */
    public String getAssetLocation() {
        return assetLocation;
    }

    public void setAssetLocation(String assetLocation) {
        this.assetLocation = assetLocation;
    }

    public PublishModelReq withChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * **参数解释**： 对话id。 **约束限制**： 不涉及 **取值范围**： 长度为[1-64]个字符。 **默认取值**： 不涉及 
     * @return chatId
     */
    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public PublishModelReq withAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
        return this;
    }

    /**
     * **参数解释**： 模型版本。 **约束限制**： 不涉及 **取值范围**： 长度为[1-64]个字符。 **默认取值**： 不涉及 
     * @return assetVersion
     */
    public String getAssetVersion() {
        return assetVersion;
    }

    public void setAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
    }

    public PublishModelReq withExternalVersion(String externalVersion) {
        this.externalVersion = externalVersion;
        return this;
    }

    /**
     * **参数解释**： 模型对外显示版本。 **约束限制**： 不涉及 **取值范围**： 长度为[1-64]个字符。 **默认取值**： 不涉及 
     * @return externalVersion
     */
    public String getExternalVersion() {
        return externalVersion;
    }

    public void setExternalVersion(String externalVersion) {
        this.externalVersion = externalVersion;
    }

    public PublishModelReq withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * **参数解释**： 模型类型。 **约束限制**： 不涉及 **取值范围**： 长度为[1-64]个字符。 **默认取值**： 不涉及 
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public PublishModelReq withSubAssetType(String subAssetType) {
        this.subAssetType = subAssetType;
        return this;
    }

    /**
     * **参数解释**： 模型子类型。 **约束限制**： 不涉及 **取值范围**： 长度为[1-64]个字符。 **默认取值**： 不涉及 
     * @return subAssetType
     */
    public String getSubAssetType() {
        return subAssetType;
    }

    public void setSubAssetType(String subAssetType) {
        this.subAssetType = subAssetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublishModelReq that = (PublishModelReq) obj;
        return Objects.equals(this.trainJobId, that.trainJobId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.assetLocation, that.assetLocation) && Objects.equals(this.chatId, that.chatId)
            && Objects.equals(this.assetVersion, that.assetVersion)
            && Objects.equals(this.externalVersion, that.externalVersion)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.subAssetType, that.subAssetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainJobId,
            name,
            description,
            assetLocation,
            chatId,
            assetVersion,
            externalVersion,
            assetType,
            subAssetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishModelReq {\n");
        sb.append("    trainJobId: ").append(toIndentedString(trainJobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    assetLocation: ").append(toIndentedString(assetLocation)).append("\n");
        sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
        sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
        sb.append("    externalVersion: ").append(toIndentedString(externalVersion)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    subAssetType: ").append(toIndentedString(subAssetType)).append("\n");
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
