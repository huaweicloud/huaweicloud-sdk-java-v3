package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateImageSynchronizeTaskRequestInfoRegistryInfo
 */
public class CreateImageSynchronizeTaskRequestInfoRegistryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_id")

    private String registryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    public CreateImageSynchronizeTaskRequestInfoRegistryInfo withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * 镜像仓库Id
     * @return registryId
     */
    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public CreateImageSynchronizeTaskRequestInfoRegistryInfo withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * 镜像仓库类型 | SwrPrivate swr私有 SwrShared  swr共享 SwrEnterprise  swr企业 Harbor harbor仓库 Jfrog  jfrog仓库 Other  其他仓库
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
        CreateImageSynchronizeTaskRequestInfoRegistryInfo that =
            (CreateImageSynchronizeTaskRequestInfoRegistryInfo) obj;
        return Objects.equals(this.registryId, that.registryId) && Objects.equals(this.registryType, that.registryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryId, registryType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageSynchronizeTaskRequestInfoRegistryInfo {\n");
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
