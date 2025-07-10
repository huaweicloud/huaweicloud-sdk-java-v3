package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 磁盘产品信息。
 */
public class VolumeProductInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_product_type")

    private String volumeProductType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    private List<String> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<I18nLanguage> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public VolumeProductInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 产品ID。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public VolumeProductInfo withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 磁盘类型： - SATA: 普通IO磁盘 - SAS：高IO磁盘 - SSD：超高IO磁盘
     * @return volumeType
     */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public VolumeProductInfo withVolumeProductType(String volumeProductType) {
        this.volumeProductType = volumeProductType;
        return this;
    }

    /**
     * 产品类型：workspace。
     * @return volumeProductType
     */
    public String getVolumeProductType() {
        return volumeProductType;
    }

    public void setVolumeProductType(String volumeProductType) {
        this.volumeProductType = volumeProductType;
    }

    public VolumeProductInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public VolumeProductInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public VolumeProductInfo withDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public VolumeProductInfo addDomainIdsItem(String domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public VolumeProductInfo withDomainIds(Consumer<List<String>> domainIdsSetter) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        domainIdsSetter.accept(this.domainIds);
        return this;
    }

    /**
     * 该磁盘支持的专有域id（domainId）。
     * @return domainIds
     */
    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public VolumeProductInfo withName(List<I18nLanguage> name) {
        this.name = name;
        return this;
    }

    public VolumeProductInfo addNameItem(I18nLanguage nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public VolumeProductInfo withName(Consumer<List<I18nLanguage>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 磁盘名称。
     * @return name
     */
    public List<I18nLanguage> getName() {
        return name;
    }

    public void setName(List<I18nLanguage> name) {
        this.name = name;
    }

    public VolumeProductInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 产品状态，normal：正常、sellout：售空。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeProductInfo that = (VolumeProductInfo) obj;
        return Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.volumeType, that.volumeType)
            && Objects.equals(this.volumeProductType, that.volumeProductType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.domainIds, that.domainIds) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode,
            volumeType,
            volumeProductType,
            resourceType,
            cloudServiceType,
            domainIds,
            name,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeProductInfo {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeProductType: ").append(toIndentedString(volumeProductType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
