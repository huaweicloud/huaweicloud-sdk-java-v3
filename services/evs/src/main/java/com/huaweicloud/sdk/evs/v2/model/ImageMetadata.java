package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ImageMetadata
 */
public class ImageMetadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checksum")
    
    private String checksum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_format")
    
    private String containerFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_format")
    
    private String diskFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_id")
    
    private String imageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_name")
    
    private String imageName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_source_type")
    
    private String imageSourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="imagetype")
    
    private String imagetype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isregistered")
    
    private String isregistered;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_disk")
    
    private String minDisk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_ram")
    
    private String minRam;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_bit")
    
    private String osBit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    private String osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_version")
    
    private String osVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="platform")
    
    private String platform;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virtual_env_type")
    
    private String virtualEnvType;

    public ImageMetadata withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    


    /**
     * 预留属性。
     * @return checksum
     */
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public ImageMetadata withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    


    /**
     * 容器类型。
     * @return containerFormat
     */
    public String getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    public ImageMetadata withDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    


    /**
     * 镜像的格式。
     * @return diskFormat
     */
    public String getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
    }

    public ImageMetadata withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    


    /**
     * 镜像ID。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ImageMetadata withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    


    /**
     * 镜像名称。
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImageMetadata withImageSourceType(String imageSourceType) {
        this.imageSourceType = imageSourceType;
        return this;
    }

    


    /**
     * 镜像后端存储类型。
     * @return imageSourceType
     */
    public String getImageSourceType() {
        return imageSourceType;
    }

    public void setImageSourceType(String imageSourceType) {
        this.imageSourceType = imageSourceType;
    }

    public ImageMetadata withImagetype(String imagetype) {
        this.imagetype = imagetype;
        return this;
    }

    


    /**
     * 镜像类型。
     * @return imagetype
     */
    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }

    public ImageMetadata withIsregistered(String isregistered) {
        this.isregistered = isregistered;
        return this;
    }

    


    /**
     * 是否是注册过的镜像，取值为 “true”或者“false”。
     * @return isregistered
     */
    public String getIsregistered() {
        return isregistered;
    }

    public void setIsregistered(String isregistered) {
        this.isregistered = isregistered;
    }

    public ImageMetadata withMinDisk(String minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    


    /**
     * 镜像运行最小磁盘空间，单位为 GB。
     * @return minDisk
     */
    public String getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(String minDisk) {
        this.minDisk = minDisk;
    }

    public ImageMetadata withMinRam(String minRam) {
        this.minRam = minRam;
        return this;
    }

    


    /**
     * 镜像运行最小内存，单位为MB。
     * @return minRam
     */
    public String getMinRam() {
        return minRam;
    }

    public void setMinRam(String minRam) {
        this.minRam = minRam;
    }

    public ImageMetadata withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    


    /**
     * 操作系统位数，一般取值为“32” 或者“64”。
     * @return osBit
     */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    public ImageMetadata withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 操作系统类型，目前取值Linux， Windows，Other。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ImageMetadata withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    


    /**
     * 操作系统具体版本。
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public ImageMetadata withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * 镜像平台分类，取值为Windows， Ubuntu，RedHat，SUSE， CentOS，Other。
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ImageMetadata withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 预留属性。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ImageMetadata withVirtualEnvType(String virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
        return this;
    }

    


    /**
     * 镜像使用环境类型。
     * @return virtualEnvType
     */
    public String getVirtualEnvType() {
        return virtualEnvType;
    }

    public void setVirtualEnvType(String virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageMetadata imageMetadata = (ImageMetadata) o;
        return Objects.equals(this.checksum, imageMetadata.checksum) &&
            Objects.equals(this.containerFormat, imageMetadata.containerFormat) &&
            Objects.equals(this.diskFormat, imageMetadata.diskFormat) &&
            Objects.equals(this.imageId, imageMetadata.imageId) &&
            Objects.equals(this.imageName, imageMetadata.imageName) &&
            Objects.equals(this.imageSourceType, imageMetadata.imageSourceType) &&
            Objects.equals(this.imagetype, imageMetadata.imagetype) &&
            Objects.equals(this.isregistered, imageMetadata.isregistered) &&
            Objects.equals(this.minDisk, imageMetadata.minDisk) &&
            Objects.equals(this.minRam, imageMetadata.minRam) &&
            Objects.equals(this.osBit, imageMetadata.osBit) &&
            Objects.equals(this.osType, imageMetadata.osType) &&
            Objects.equals(this.osVersion, imageMetadata.osVersion) &&
            Objects.equals(this.platform, imageMetadata.platform) &&
            Objects.equals(this.size, imageMetadata.size) &&
            Objects.equals(this.virtualEnvType, imageMetadata.virtualEnvType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checksum, containerFormat, diskFormat, imageId, imageName, imageSourceType, imagetype, isregistered, minDisk, minRam, osBit, osType, osVersion, platform, size, virtualEnvType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageMetadata {\n");
            sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
            sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
            sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
            sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
            sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
            sb.append("    imageSourceType: ").append(toIndentedString(imageSourceType)).append("\n");
            sb.append("    imagetype: ").append(toIndentedString(imagetype)).append("\n");
            sb.append("    isregistered: ").append(toIndentedString(isregistered)).append("\n");
            sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
            sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
            sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
            sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
            sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
            sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    virtualEnvType: ").append(toIndentedString(virtualEnvType)).append("\n");
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

