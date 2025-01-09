package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 小时包套餐详情。
 */
public class HourPackage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_resource_spec_code")

    private String desktopResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descriptions")

    private ResourcePackageDescription descriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_duration")

    private Integer packageDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    private List<String> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public HourPackage withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 资源所属云服务类型编码。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public HourPackage withResourceType(String resourceType) {
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

    public HourPackage withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 小时包的资源规格编码。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public HourPackage withDesktopResourceSpecCode(String desktopResourceSpecCode) {
        this.desktopResourceSpecCode = desktopResourceSpecCode;
        return this;
    }

    /**
     * 小时包对应的按需桌面的资源规格编码。
     * @return desktopResourceSpecCode
     */
    public String getDesktopResourceSpecCode() {
        return desktopResourceSpecCode;
    }

    public void setDesktopResourceSpecCode(String desktopResourceSpecCode) {
        this.desktopResourceSpecCode = desktopResourceSpecCode;
    }

    public HourPackage withDescriptions(ResourcePackageDescription descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    public HourPackage withDescriptions(Consumer<ResourcePackageDescription> descriptionsSetter) {
        if (this.descriptions == null) {
            this.descriptions = new ResourcePackageDescription();
            descriptionsSetter.accept(this.descriptions);
        }

        return this;
    }

    /**
     * Get descriptions
     * @return descriptions
     */
    public ResourcePackageDescription getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(ResourcePackageDescription descriptions) {
        this.descriptions = descriptions;
    }

    public HourPackage withPackageDuration(Integer packageDuration) {
        this.packageDuration = packageDuration;
        return this;
    }

    /**
     * 套餐可使用时长，单位：小时。
     * @return packageDuration
     */
    public Integer getPackageDuration() {
        return packageDuration;
    }

    public void setPackageDuration(Integer packageDuration) {
        this.packageDuration = packageDuration;
    }

    public HourPackage withDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public HourPackage addDomainIdsItem(String domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public HourPackage withDomainIds(Consumer<List<String>> domainIdsSetter) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        domainIdsSetter.accept(this.domainIds);
        return this;
    }

    /**
     * 该产品套餐支持的专有域id（domainId）。
     * @return domainIds
     */
    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public HourPackage withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 产品状态，normal：正常、sellout：售空、abandon：下线。
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
        HourPackage that = (HourPackage) obj;
        return Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.desktopResourceSpecCode, that.desktopResourceSpecCode)
            && Objects.equals(this.descriptions, that.descriptions)
            && Objects.equals(this.packageDuration, that.packageDuration)
            && Objects.equals(this.domainIds, that.domainIds) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceType,
            resourceType,
            resourceSpecCode,
            desktopResourceSpecCode,
            descriptions,
            packageDuration,
            domainIds,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HourPackage {\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    desktopResourceSpecCode: ").append(toIndentedString(desktopResourceSpecCode)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    packageDuration: ").append(toIndentedString(packageDuration)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
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
