package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageInfo
 */
public class ImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_format")

    private String diskFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ram")

    private Integer minRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_disk")

    private Integer minDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_code")

    private String productCode;

    public ImageInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 镜像ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型，目前支持以下类型： 公共镜像：gold 私有镜像：private。
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ImageInfo withOsType(String osType) {
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

    public ImageInfo withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 操作系统架构，目前取值arm，x86
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ImageInfo withOsVersion(String osVersion) {
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

    public ImageInfo withDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    /**
     * 镜像格式，目前支持vhd，raw，qcow2，zvhd2格式。
     * @return diskFormat
     */
    public String getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
    }

    public ImageInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageInfo withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    /**
     * 镜像运行需要的最小内存，单位为MB。参数取值依据弹性云服务器的规格限制，一般设置为0。
     * minimum: 1
     * maximum: 55
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public ImageInfo withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    /**
     * 镜像运行需要的最小磁盘，单位为GB 。取值为40～1024GB。
     * minimum: 1
     * maximum: 55
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public ImageInfo withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * 镜像的产品编码。
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
        return Objects.equals(this.id, that.id) && Objects.equals(this.imageType, that.imageType)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.architecture, that.architecture)
            && Objects.equals(this.osVersion, that.osVersion) && Objects.equals(this.diskFormat, that.diskFormat)
            && Objects.equals(this.name, that.name) && Objects.equals(this.minRam, that.minRam)
            && Objects.equals(this.minDisk, that.minDisk) && Objects.equals(this.productCode, that.productCode);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, imageType, osType, architecture, osVersion, diskFormat, name, minRam, minDisk, productCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
        sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
        sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
