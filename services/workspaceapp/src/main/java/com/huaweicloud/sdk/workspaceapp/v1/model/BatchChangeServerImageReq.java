package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量修改服务器镜像的请求体。
 */
public class BatchChangeServerImageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private ImageTypeEnum imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_product_id")

    private String imageProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_access_agent")

    private Boolean updateAccessAgent;

    public BatchChangeServerImageReq withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public BatchChangeServerImageReq addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public BatchChangeServerImageReq withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 应用服务器id集合。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    public BatchChangeServerImageReq withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像id，要求与服务器原有镜像id不相同。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public BatchChangeServerImageReq withImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * Get imageType
     * @return imageType
     */
    public ImageTypeEnum getImageType() {
        return imageType;
    }

    public void setImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
    }

    public BatchChangeServerImageReq withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get osType
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public BatchChangeServerImageReq withImageProductId(String imageProductId) {
        this.imageProductId = imageProductId;
        return this;
    }

    /**
     * 镜像的产品id，当镜像是市场镜像时候，该字段必传。
     * @return imageProductId
     */
    public String getImageProductId() {
        return imageProductId;
    }

    public void setImageProductId(String imageProductId) {
        this.imageProductId = imageProductId;
    }

    public BatchChangeServerImageReq withUpdateAccessAgent(Boolean updateAccessAgent) {
        this.updateAccessAgent = updateAccessAgent;
        return this;
    }

    /**
     * 是否自动升级hda版本。
     * @return updateAccessAgent
     */
    public Boolean getUpdateAccessAgent() {
        return updateAccessAgent;
    }

    public void setUpdateAccessAgent(Boolean updateAccessAgent) {
        this.updateAccessAgent = updateAccessAgent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchChangeServerImageReq that = (BatchChangeServerImageReq) obj;
        return Objects.equals(this.serverIds, that.serverIds) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.imageProductId, that.imageProductId)
            && Objects.equals(this.updateAccessAgent, that.updateAccessAgent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverIds, imageId, imageType, osType, imageProductId, updateAccessAgent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchChangeServerImageReq {\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    imageProductId: ").append(toIndentedString(imageProductId)).append("\n");
        sb.append("    updateAccessAgent: ").append(toIndentedString(updateAccessAgent)).append("\n");
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
