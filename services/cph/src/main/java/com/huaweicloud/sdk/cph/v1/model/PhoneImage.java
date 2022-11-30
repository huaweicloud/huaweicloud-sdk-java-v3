package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云手机镜像信息。
 */
public class PhoneImage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Integer isPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_label")

    private String imageLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    public PhoneImage withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 手机镜像名称，不超过128个字节
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public PhoneImage withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 镜像操作系统类型，不超过16个字节
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public PhoneImage withIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * 镜像类型 - 1：公有镜像 - 2 ：私有镜像
     * minimum: -128
     * maximum: 128
     * @return isPublic
     */
    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public PhoneImage withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * 手机操作系统，不超过36个字节
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public PhoneImage withImageLabel(String imageLabel) {
        this.imageLabel = imageLabel;
        return this;
    }

    /**
     * 镜像适用的云手机规格 - cloud_phone：适用于physical.rx1.xlarge 类型云手机服务器 - cloud_phone_1620：适用于physical.kg1.4xlarge.cp类型云手机服务器 - cloud_game：适用于physical.rx1.xlarge.cg 类型云手游服务器 - cloud_game_1620：适用于physical.kg1.4xlarge.cg 类型云手游服务器 - qemu_phone： 适用于physical.rx1.xlarge 类型云手机服务器中 qemu类型云手机规格
     * @return imageLabel
     */
    public String getImageLabel() {
        return imageLabel;
    }

    public void setImageLabel(String imageLabel) {
        this.imageLabel = imageLabel;
    }

    public PhoneImage withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 手机镜像唯一标识ID，不超过32个字节
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneImage phoneImage = (PhoneImage) o;
        return Objects.equals(this.imageName, phoneImage.imageName) && Objects.equals(this.osType, phoneImage.osType)
            && Objects.equals(this.isPublic, phoneImage.isPublic) && Objects.equals(this.osName, phoneImage.osName)
            && Objects.equals(this.imageLabel, phoneImage.imageLabel)
            && Objects.equals(this.imageId, phoneImage.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName, osType, isPublic, osName, imageLabel, imageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneImage {\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    imageLabel: ").append(toIndentedString(imageLabel)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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
