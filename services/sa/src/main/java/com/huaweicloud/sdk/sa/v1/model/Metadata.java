package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Metadata */
public class Metadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_bit")

    private String osBit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    public Metadata withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /** 云服务器所属的虚拟私有云ID。
     * 
     * @return vpcId */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Metadata withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /** 云服务器操作系统对应的镜像ID。
     * 
     * @return imageId */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Metadata withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /** 云服务器操作系统对应的镜像名称。
     * 
     * @return imageName */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Metadata withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /** 镜像类型，目前支持： 公共镜像（gold）、 私有镜像（private）、 共享镜像（shared）。
     * 
     * @return imageType */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Metadata withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    /** 操作系统位数，一般取值为“32”或者“64”。
     * 
     * @return osBit */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    public Metadata withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /** 操作系统类型，取值为：Linux、Windows。
     * 
     * @return osType */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) o;
        return Objects.equals(this.vpcId, metadata.vpcId) && Objects.equals(this.imageId, metadata.imageId)
            && Objects.equals(this.imageName, metadata.imageName) && Objects.equals(this.imageType, metadata.imageType)
            && Objects.equals(this.osBit, metadata.osBit) && Objects.equals(this.osType, metadata.osType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, imageId, imageName, imageType, osBit, osType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
