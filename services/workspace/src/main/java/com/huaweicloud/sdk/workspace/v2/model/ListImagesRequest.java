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
            && Objects.equals(this.architecture, listImagesRequest.architecture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osType, imageType, platform, architecture);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImagesRequest {\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
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
