package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageBasicImageInfo
 */
public class ImageBasicImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_digest")

    private String layerDigest;

    public ImageBasicImageInfo withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * 基础镜像的系统名称
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public ImageBasicImageInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 基础镜像的系统版本
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public ImageBasicImageInfo withLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
        return this;
    }

    /**
     * 基础镜像的层digest
     * @return layerDigest
     */
    public String getLayerDigest() {
        return layerDigest;
    }

    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageBasicImageInfo that = (ImageBasicImageInfo) obj;
        return Objects.equals(this.osName, that.osName) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.layerDigest, that.layerDigest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osName, osVersion, layerDigest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageBasicImageInfo {\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    layerDigest: ").append(toIndentedString(layerDigest)).append("\n");
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
