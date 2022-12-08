package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListImagesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListImagesRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 产品镜像的操作系统类型，如Windows。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListImagesRequest withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * 镜像类型。 -gold  公共镜像 -private  私有镜像
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ListImagesRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 镜像系统类型,如Windows。
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ListImagesRequest withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 镜像架构：x86。
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ListImagesRequest withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * 套餐系列
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public ListImagesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量，范围0-100，默认100。
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListImagesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量,默认0。
     * minimum: 0
     * maximum: 5000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListImagesRequest listImagesRequest = (ListImagesRequest) o;
        return Objects.equals(this.osType, listImagesRequest.osType)
            && Objects.equals(this.imageType, listImagesRequest.imageType)
            && Objects.equals(this.platform, listImagesRequest.platform)
            && Objects.equals(this.architecture, listImagesRequest.architecture)
            && Objects.equals(this.packageType, listImagesRequest.packageType)
            && Objects.equals(this.limit, listImagesRequest.limit)
            && Objects.equals(this.offset, listImagesRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osType, imageType, platform, architecture, packageType, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImagesRequest {\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
