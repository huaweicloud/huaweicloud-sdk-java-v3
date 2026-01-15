package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重建系统盘的请求。
 */
public class RebuildDesktopsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_ids")

    private List<String> desktopIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_type")

    private EncryptType encryptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_id")

    private String kmsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time")

    private Integer delayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_type")

    private String handleType;

    public RebuildDesktopsReq withDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }

    public RebuildDesktopsReq addDesktopIdsItem(String desktopIdsItem) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        this.desktopIds.add(desktopIdsItem);
        return this;
    }

    public RebuildDesktopsReq withDesktopIds(Consumer<List<String>> desktopIdsSetter) {
        if (this.desktopIds == null) {
            this.desktopIds = new ArrayList<>();
        }
        desktopIdsSetter.accept(this.desktopIds);
        return this;
    }

    /**
     * 计算机id列表。
     * @return desktopIds
     */
    public List<String> getDesktopIds() {
        return desktopIds;
    }

    public void setDesktopIds(List<String> desktopIds) {
        this.desktopIds = desktopIds;
    }

    public RebuildDesktopsReq withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型 - 公共镜像：gold - 私有镜像：private - 市场镜像：market
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public RebuildDesktopsReq withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 模板ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public RebuildDesktopsReq withEncryptType(EncryptType encryptType) {
        this.encryptType = encryptType;
        return this;
    }

    /**
     * Get encryptType
     * @return encryptType
     */
    public EncryptType getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(EncryptType encryptType) {
        this.encryptType = encryptType;
    }

    public RebuildDesktopsReq withKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }

    /**
     * 密钥ID，encrypt_type为ENCRYPTED时必传。
     * @return kmsId
     */
    public String getKmsId() {
        return kmsId;
    }

    public void setKmsId(String kmsId) {
        this.kmsId = kmsId;
    }

    public RebuildDesktopsReq withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * os类型。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public RebuildDesktopsReq withDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    /**
     * 立即重建时给用户预留的保存数据的时间（单位：分钟）。
     * minimum: 0
     * maximum: 2147483647
     * @return delayTime
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public RebuildDesktopsReq withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 下发重建系统盘任务时，给用户发送的提示信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RebuildDesktopsReq withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID，包周期桌面重建系统盘，涉及收费镜像时需传。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public RebuildDesktopsReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认\"0。\"
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RebuildDesktopsReq withHandleType(String handleType) {
        this.handleType = handleType;
        return this;
    }

    /**
     * 处理类型 - ONLY_FOR_EXPAND：仅对新扩容桌面生效 - FOR_EXPAND_AND_IDLE：对新扩容桌面与空闲桌面生效 - FOR_EXPAND_AND_ALL：对新扩容桌面与已有全部桌面生效
     * @return handleType
     */
    public String getHandleType() {
        return handleType;
    }

    public void setHandleType(String handleType) {
        this.handleType = handleType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RebuildDesktopsReq that = (RebuildDesktopsReq) obj;
        return Objects.equals(this.desktopIds, that.desktopIds) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.encryptType, that.encryptType)
            && Objects.equals(this.kmsId, that.kmsId) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.delayTime, that.delayTime) && Objects.equals(this.message, that.message)
            && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.handleType, that.handleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopIds,
            imageType,
            imageId,
            encryptType,
            kmsId,
            osType,
            delayTime,
            message,
            orderId,
            enterpriseProjectId,
            handleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RebuildDesktopsReq {\n");
        sb.append("    desktopIds: ").append(toIndentedString(desktopIds)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    encryptType: ").append(toIndentedString(encryptType)).append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    handleType: ").append(toIndentedString(handleType)).append("\n");
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
