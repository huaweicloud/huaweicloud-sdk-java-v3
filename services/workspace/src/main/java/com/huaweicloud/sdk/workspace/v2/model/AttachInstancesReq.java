package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分配用户请求。
 */
public class AttachInstancesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktops")

    private List<AttachInstancesDesktopInfo> desktops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name_policy_id")

    private String desktopNamePolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_type")

    private EncryptType encryptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_id")

    private String kmsId;

    public AttachInstancesReq withDesktops(List<AttachInstancesDesktopInfo> desktops) {
        this.desktops = desktops;
        return this;
    }

    public AttachInstancesReq addDesktopsItem(AttachInstancesDesktopInfo desktopsItem) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        this.desktops.add(desktopsItem);
        return this;
    }

    public AttachInstancesReq withDesktops(Consumer<List<AttachInstancesDesktopInfo>> desktopsSetter) {
        if (this.desktops == null) {
            this.desktops = new ArrayList<>();
        }
        desktopsSetter.accept(this.desktops);
        return this;
    }

    /**
     * 桌面信息列表。
     * @return desktops
     */
    public List<AttachInstancesDesktopInfo> getDesktops() {
        return desktops;
    }

    public void setDesktops(List<AttachInstancesDesktopInfo> desktops) {
        this.desktops = desktops;
    }

    public AttachInstancesReq withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型，涉及变更镜像时需传（可选）。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public AttachInstancesReq withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 模板ID，涉及变更镜像时需传（可选）。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public AttachInstancesReq withDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
        return this;
    }

    /**
     * 策略id，用于指定生成桌面名称策略，如果指定了桌面名称则优先使用指定的桌面名称。
     * @return desktopNamePolicyId
     */
    public String getDesktopNamePolicyId() {
        return desktopNamePolicyId;
    }

    public void setDesktopNamePolicyId(String desktopNamePolicyId) {
        this.desktopNamePolicyId = desktopNamePolicyId;
    }

    public AttachInstancesReq withEncryptType(EncryptType encryptType) {
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

    public AttachInstancesReq withKmsId(String kmsId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachInstancesReq that = (AttachInstancesReq) obj;
        return Objects.equals(this.desktops, that.desktops) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.desktopNamePolicyId, that.desktopNamePolicyId)
            && Objects.equals(this.encryptType, that.encryptType) && Objects.equals(this.kmsId, that.kmsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktops, imageType, imageId, desktopNamePolicyId, encryptType, kmsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachInstancesReq {\n");
        sb.append("    desktops: ").append(toIndentedString(desktops)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    desktopNamePolicyId: ").append(toIndentedString(desktopNamePolicyId)).append("\n");
        sb.append("    encryptType: ").append(toIndentedString(encryptType)).append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
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
