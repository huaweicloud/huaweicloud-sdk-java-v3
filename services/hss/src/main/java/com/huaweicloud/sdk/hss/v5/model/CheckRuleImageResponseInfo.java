package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 受配置检测影响的镜像信息
 */
public class CheckRuleImageResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_digest")

    private String imageDigest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_size")

    private Integer imageSize;

    public CheckRuleImageResponseInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**: 组织名称 **取值范围**: 字符长度0-64 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public CheckRuleImageResponseInfo withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * **参数解释**: 镜像digest **取值范围**: 字符长度0-128 
     * @return imageDigest
     */
    public String getImageDigest() {
        return imageDigest;
    }

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    public CheckRuleImageResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-128 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public CheckRuleImageResponseInfo withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**: 镜像版本 **取值范围**: 字符长度0-128 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public CheckRuleImageResponseInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**: 镜像类型 **取值范围**: - private_image：私有镜像 - shared_image：共享镜像 - instance_image：企业镜像 - harbor：Harbor镜像 - jfrog：Jfrog镜像 - cicd：cicd镜像
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public CheckRuleImageResponseInfo withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * **参数解释**: 镜像仓库名称 **取值范围**: 字符长度0-128 
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public CheckRuleImageResponseInfo withImageSize(Integer imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * **参数解释**: 版本大小 **取值范围**: 大小0-2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return imageSize
     */
    public Integer getImageSize() {
        return imageSize;
    }

    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRuleImageResponseInfo that = (CheckRuleImageResponseInfo) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.imageDigest, that.imageDigest)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageVersion, that.imageVersion)
            && Objects.equals(this.imageType, that.imageType) && Objects.equals(this.registryName, that.registryName)
            && Objects.equals(this.imageSize, that.imageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, imageDigest, imageName, imageVersion, imageType, registryName, imageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRuleImageResponseInfo {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    imageDigest: ").append(toIndentedString(imageDigest)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
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
