package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 失败镜像信息
 */
public class ImageScanTaskInfoFailedImages {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_id")

    private String registryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version")

    private String imageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    public ImageScanTaskInfoFailedImages withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 失败镜像ID **取值范围**： 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ImageScanTaskInfoFailedImages withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * **参数解释**： 镜像仓库ID **取值范围**： 字符长度0-128位 
     * @return registryId
     */
    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public ImageScanTaskInfoFailedImages withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * **参数解释**： 镜像仓库名称 **取值范围**： 字符长度0-128位 
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public ImageScanTaskInfoFailedImages withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**： 镜像名称 **取值范围**： 字符长度0-128位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImageScanTaskInfoFailedImages withImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
        return this;
    }

    /**
     * **参数解释**： 镜像版本 **取值范围**： 字符长度0-128位 
     * @return imageVersion
     */
    public String getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    public ImageScanTaskInfoFailedImages withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**： 命名空间 **取值范围**： 字符长度0-128位 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ImageScanTaskInfoFailedImages withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * **参数解释**： 镜像仓库类型 **取值范围**： - SwrPrivate：swr私有。 - SwrShared：swr共享。 - SwrEnterprise：swr企业。 - Harbor：harbor仓库。 - Jfrog：jfrog仓库。 - Other：其他仓库。 
     * @return registryType
     */
    public String getRegistryType() {
        return registryType;
    }

    public void setRegistryType(String registryType) {
        this.registryType = registryType;
    }

    public ImageScanTaskInfoFailedImages withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * **参数解释**： 失败原因 **取值范围**： 字符长度0-128位 
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageScanTaskInfoFailedImages that = (ImageScanTaskInfoFailedImages) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.registryId, that.registryId)
            && Objects.equals(this.registryName, that.registryName) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.imageVersion, that.imageVersion) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.registryType, that.registryType)
            && Objects.equals(this.failedReason, that.failedReason);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, registryId, registryName, imageName, imageVersion, namespace, registryType, failedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageScanTaskInfoFailedImages {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageVersion: ").append(toIndentedString(imageVersion)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
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
