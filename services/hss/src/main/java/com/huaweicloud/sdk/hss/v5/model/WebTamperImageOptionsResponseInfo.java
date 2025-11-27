package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网页防篡改可选服务器信息
 */
public class WebTamperImageOptionsResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_full_name")

    private String imageFullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_version_list")

    private List<String> imageVersionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_namespace")

    private String imageNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    public WebTamperImageOptionsResponseInfo withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-512位 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public WebTamperImageOptionsResponseInfo withImageFullName(String imageFullName) {
        this.imageFullName = imageFullName;
        return this;
    }

    /**
     * **参数解释**: 镜像名称 **取值范围**: 字符长度0-512位 
     * @return imageFullName
     */
    public String getImageFullName() {
        return imageFullName;
    }

    public void setImageFullName(String imageFullName) {
        this.imageFullName = imageFullName;
    }

    public WebTamperImageOptionsResponseInfo withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**: 镜像id **取值范围**: 字符长度0-64位 
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public WebTamperImageOptionsResponseInfo withImageVersionList(List<String> imageVersionList) {
        this.imageVersionList = imageVersionList;
        return this;
    }

    public WebTamperImageOptionsResponseInfo addImageVersionListItem(String imageVersionListItem) {
        if (this.imageVersionList == null) {
            this.imageVersionList = new ArrayList<>();
        }
        this.imageVersionList.add(imageVersionListItem);
        return this;
    }

    public WebTamperImageOptionsResponseInfo withImageVersionList(Consumer<List<String>> imageVersionListSetter) {
        if (this.imageVersionList == null) {
            this.imageVersionList = new ArrayList<>();
        }
        imageVersionListSetter.accept(this.imageVersionList);
        return this;
    }

    /**
     * **参数解释**: 镜像版本列表 **约束限制**: 不涉及 **取值范围**: 最少0条，最多100条 **默认取值**: 不涉及 
     * @return imageVersionList
     */
    public List<String> getImageVersionList() {
        return imageVersionList;
    }

    public void setImageVersionList(List<String> imageVersionList) {
        this.imageVersionList = imageVersionList;
    }

    public WebTamperImageOptionsResponseInfo withImageNamespace(String imageNamespace) {
        this.imageNamespace = imageNamespace;
        return this;
    }

    /**
     * **参数解释**: 仓库镜像的组织名称 **取值范围**: 字符长度0-512位 
     * @return imageNamespace
     */
    public String getImageNamespace() {
        return imageNamespace;
    }

    public void setImageNamespace(String imageNamespace) {
        this.imageNamespace = imageNamespace;
    }

    public WebTamperImageOptionsResponseInfo withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * **参数解释**: 镜像仓库名称 **取值范围**: 字符长度1-128位 
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public WebTamperImageOptionsResponseInfo withRegistryType(String registryType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperImageOptionsResponseInfo that = (WebTamperImageOptionsResponseInfo) obj;
        return Objects.equals(this.imageName, that.imageName) && Objects.equals(this.imageFullName, that.imageFullName)
            && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.imageVersionList, that.imageVersionList)
            && Objects.equals(this.imageNamespace, that.imageNamespace)
            && Objects.equals(this.registryName, that.registryName)
            && Objects.equals(this.registryType, that.registryType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(imageName, imageFullName, imageId, imageVersionList, imageNamespace, registryName, registryType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperImageOptionsResponseInfo {\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    imageFullName: ").append(toIndentedString(imageFullName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    imageVersionList: ").append(toIndentedString(imageVersionList)).append("\n");
        sb.append("    imageNamespace: ").append(toIndentedString(imageNamespace)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
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
