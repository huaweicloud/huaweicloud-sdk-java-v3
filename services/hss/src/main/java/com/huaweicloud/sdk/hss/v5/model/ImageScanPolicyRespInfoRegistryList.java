package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 镜像仓库信息
 */
public class ImageScanPolicyRespInfoRegistryList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_selected")

    private Boolean isSelected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_id")

    private String registryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    public ImageScanPolicyRespInfoRegistryList withIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
        return this;
    }

    /**
     * 是否已经选择
     * @return isSelected
     */
    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public ImageScanPolicyRespInfoRegistryList withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * 镜像仓库名称
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public ImageScanPolicyRespInfoRegistryList withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * 镜像仓库id
     * @return registryId
     */
    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public ImageScanPolicyRespInfoRegistryList withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * 镜像仓库类型 | SwrPrivate:swr私有 SwrShared:swr共享 SwrEnterprise:swr企业 Harbor:harbor仓库 Jfrog:jfrog仓库 Other:其他仓库
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
        ImageScanPolicyRespInfoRegistryList that = (ImageScanPolicyRespInfoRegistryList) obj;
        return Objects.equals(this.isSelected, that.isSelected) && Objects.equals(this.registryName, that.registryName)
            && Objects.equals(this.registryId, that.registryId) && Objects.equals(this.registryType, that.registryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSelected, registryName, registryId, registryType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageScanPolicyRespInfoRegistryList {\n");
        sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
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
