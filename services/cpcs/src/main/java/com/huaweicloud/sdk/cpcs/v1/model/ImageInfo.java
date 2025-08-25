package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageInfo
 */
public class ImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch_type")

    private String archType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification_id")

    private String specificationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_type")

    private String versionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_domain")

    private String trustDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_name")

    private String vendorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor_image_version")

    private String vendorImageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ccsp_version_need")

    private String ccspVersionNeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw_image_version")

    private String hwImageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ImageInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ImageInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImageInfo withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 镜像所属的服务
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ImageInfo withArchType(String archType) {
        this.archType = archType;
        return this;
    }

    /**
     * 镜像的系统架构： - **X86_64** : X86 - **ARRCH** : ARM
     * @return archType
     */
    public String getArchType() {
        return archType;
    }

    public void setArchType(String archType) {
        this.archType = archType;
    }

    public ImageInfo withSpecificationId(String specificationId) {
        this.specificationId = specificationId;
        return this;
    }

    /**
     * 规格ID
     * @return specificationId
     */
    public String getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(String specificationId) {
        this.specificationId = specificationId;
    }

    public ImageInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 镜像的录入时间，UNIX时间戳，单位毫秒
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ImageInfo withVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * 版本类型
     * @return versionType
     */
    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public ImageInfo withTrustDomain(String trustDomain) {
        this.trustDomain = trustDomain;
        return this;
    }

    /**
     * domain白名单列表，多个之间用逗号分隔
     * @return trustDomain
     */
    public String getTrustDomain() {
        return trustDomain;
    }

    public void setTrustDomain(String trustDomain) {
        this.trustDomain = trustDomain;
    }

    public ImageInfo withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * 厂商名称
     * @return vendorName
     */
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public ImageInfo withVendorImageVersion(String vendorImageVersion) {
        this.vendorImageVersion = vendorImageVersion;
        return this;
    }

    /**
     * 厂商版本号
     * @return vendorImageVersion
     */
    public String getVendorImageVersion() {
        return vendorImageVersion;
    }

    public void setVendorImageVersion(String vendorImageVersion) {
        this.vendorImageVersion = vendorImageVersion;
    }

    public ImageInfo withCcspVersionNeed(String ccspVersionNeed) {
        this.ccspVersionNeed = ccspVersionNeed;
        return this;
    }

    /**
     * 密码服务依赖的(厂商)平台版本号
     * @return ccspVersionNeed
     */
    public String getCcspVersionNeed() {
        return ccspVersionNeed;
    }

    public void setCcspVersionNeed(String ccspVersionNeed) {
        this.ccspVersionNeed = ccspVersionNeed;
    }

    public ImageInfo withHwImageVersion(String hwImageVersion) {
        this.hwImageVersion = hwImageVersion;
        return this;
    }

    /**
     * 华为版本号
     * @return hwImageVersion
     */
    public String getHwImageVersion() {
        return hwImageVersion;
    }

    public void setHwImageVersion(String hwImageVersion) {
        this.hwImageVersion = hwImageVersion;
    }

    public ImageInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageInfo that = (ImageInfo) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.archType, that.archType)
            && Objects.equals(this.specificationId, that.specificationId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.versionType, that.versionType)
            && Objects.equals(this.trustDomain, that.trustDomain) && Objects.equals(this.vendorName, that.vendorName)
            && Objects.equals(this.vendorImageVersion, that.vendorImageVersion)
            && Objects.equals(this.ccspVersionNeed, that.ccspVersionNeed)
            && Objects.equals(this.hwImageVersion, that.hwImageVersion)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId,
            imageName,
            serviceType,
            archType,
            specificationId,
            createTime,
            versionType,
            trustDomain,
            vendorName,
            vendorImageVersion,
            ccspVersionNeed,
            hwImageVersion,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageInfo {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    archType: ").append(toIndentedString(archType)).append("\n");
        sb.append("    specificationId: ").append(toIndentedString(specificationId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    trustDomain: ").append(toIndentedString(trustDomain)).append("\n");
        sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
        sb.append("    vendorImageVersion: ").append(toIndentedString(vendorImageVersion)).append("\n");
        sb.append("    ccspVersionNeed: ").append(toIndentedString(ccspVersionNeed)).append("\n");
        sb.append("    hwImageVersion: ").append(toIndentedString(hwImageVersion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
