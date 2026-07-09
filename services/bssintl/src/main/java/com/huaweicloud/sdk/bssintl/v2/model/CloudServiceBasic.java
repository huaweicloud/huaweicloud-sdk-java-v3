package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CloudServiceBasic
 */
public class CloudServiceBasic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_name")

    private String cloudServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec")

    private String resourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_name")

    private String resourceSpecName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    public CloudServiceBasic withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * |参数名称：云服务类型编码| |参数的约束及描述：云服务类型编码|
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public CloudServiceBasic withCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
        return this;
    }

    /**
     * |参数名称：云服务类型名称| |参数的约束及描述：云服务类型名称|
     * @return cloudServiceTypeName
     */
    public String getCloudServiceTypeName() {
        return cloudServiceTypeName;
    }

    public void setCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
    }

    public CloudServiceBasic withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * |参数名称：资源类型编码| |参数的约束及描述：资源类型编码|
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public CloudServiceBasic withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /**
     * |参数名称：资源类型名称| |参数的约束及描述：资源类型名称|
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public CloudServiceBasic withResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }

    /**
     * |参数名称：资源规格编码| |参数的约束及描述：资源规格编码|
     * @return resourceSpec
     */
    public String getResourceSpec() {
        return resourceSpec;
    }

    public void setResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    public CloudServiceBasic withResourceSpecName(String resourceSpecName) {
        this.resourceSpecName = resourceSpecName;
        return this;
    }

    /**
     * |参数名称：资源规格名称| |参数的约束及描述：资源规格名称|
     * @return resourceSpecName
     */
    public String getResourceSpecName() {
        return resourceSpecName;
    }

    public void setResourceSpecName(String resourceSpecName) {
        this.resourceSpecName = resourceSpecName;
    }

    public CloudServiceBasic withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * |参数名称：计费模式| |参数的约束及描述：1：包年/包月，3：按需|
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CloudServiceBasic withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * |参数名称：区域编码| |参数的约束及描述：区域编码|
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudServiceBasic that = (CloudServiceBasic) obj;
        return Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.cloudServiceTypeName, that.cloudServiceTypeName)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.resourceSpec, that.resourceSpec)
            && Objects.equals(this.resourceSpecName, that.resourceSpecName)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.regionCode, that.regionCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceType,
            cloudServiceTypeName,
            resourceType,
            resourceTypeName,
            resourceSpec,
            resourceSpecName,
            chargeMode,
            regionCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudServiceBasic {\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    cloudServiceTypeName: ").append(toIndentedString(cloudServiceTypeName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    resourceSpec: ").append(toIndentedString(resourceSpec)).append("\n");
        sb.append("    resourceSpecName: ").append(toIndentedString(resourceSpecName)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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
