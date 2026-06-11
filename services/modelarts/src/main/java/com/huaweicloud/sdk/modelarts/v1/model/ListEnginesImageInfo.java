package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 引擎具体信息。
 */
public class ListEnginesImageInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_image_url")

    private String cpuImageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_image_url")

    private String gpuImageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    public ListEnginesImageInfo withCpuImageUrl(String cpuImageUrl) {
        this.cpuImageUrl = cpuImageUrl;
        return this;
    }

    /**
     * cpu规格下对应镜像。
     * @return cpuImageUrl
     */
    public String getCpuImageUrl() {
        return cpuImageUrl;
    }

    public void setCpuImageUrl(String cpuImageUrl) {
        this.cpuImageUrl = cpuImageUrl;
    }

    public ListEnginesImageInfo withGpuImageUrl(String gpuImageUrl) {
        this.gpuImageUrl = gpuImageUrl;
        return this;
    }

    /**
     * gpu[或者Ascend](tag:hc,hk,fcs_super)规格下对应镜像。
     * @return gpuImageUrl
     */
    public String getGpuImageUrl() {
        return gpuImageUrl;
    }

    public void setGpuImageUrl(String gpuImageUrl) {
        this.gpuImageUrl = gpuImageUrl;
    }

    public ListEnginesImageInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * 镜像版本。
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnginesImageInfo that = (ListEnginesImageInfo) obj;
        return Objects.equals(this.cpuImageUrl, that.cpuImageUrl) && Objects.equals(this.gpuImageUrl, that.gpuImageUrl)
            && Objects.equals(this.imageVersion, that.imageVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuImageUrl, gpuImageUrl, imageVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnginesImageInfo {\n");
        sb.append("    cpuImageUrl: ").append(toIndentedString(cpuImageUrl)).append("\n");
        sb.append("    gpuImageUrl: ").append(toIndentedString(gpuImageUrl)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
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
