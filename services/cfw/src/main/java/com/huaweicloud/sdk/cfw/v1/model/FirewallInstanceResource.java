package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FirewallInstanceResource
 */
public class FirewallInstanceResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

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
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size_measure_id")

    private Integer resourceSizeMeasureId;

    public FirewallInstanceResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id，包括防火墙资源id，带宽资源id，eip资源id，vpc资源id，cbc回调后返回id。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public FirewallInstanceResource withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 服务类型，用于CBC使用，特指：hws.service.type.cfw
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public FirewallInstanceResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型 包括:   1、云防火墙:hws.resource.type.cfw   2、EIP:hws.resource.type.cfw.exp.eip   3、带宽:hws.resource.type.cfw.exp.bandwidth   4、VPC:hws.resource.type.cfw.exp
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public FirewallInstanceResource withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 库存单位码，包括：1、防火墙标准版cfw.standard 2、防火墙专业版cfw.professional 3、eip标准版cfw.expack.eip.standard 4、eip专业版cfw.expack.eip.professional 5、带宽基础版cfw.expack.bandwidth.standard 6、带宽专业版cfw.expack.bandwidth.professional 7、vpc专业版cfw.expack.vpc.professional
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public FirewallInstanceResource withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 资源数量
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public FirewallInstanceResource withResourceSizeMeasureId(Integer resourceSizeMeasureId) {
        this.resourceSizeMeasureId = resourceSizeMeasureId;
        return this;
    }

    /**
     * 资源单位
     * @return resourceSizeMeasureId
     */
    public Integer getResourceSizeMeasureId() {
        return resourceSizeMeasureId;
    }

    public void setResourceSizeMeasureId(Integer resourceSizeMeasureId) {
        this.resourceSizeMeasureId = resourceSizeMeasureId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallInstanceResource that = (FirewallInstanceResource) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.resourceSize, that.resourceSize)
            && Objects.equals(this.resourceSizeMeasureId, that.resourceSizeMeasureId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(resourceId, cloudServiceType, resourceType, resourceSpecCode, resourceSize, resourceSizeMeasureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallInstanceResource {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    resourceSizeMeasureId: ").append(toIndentedString(resourceSizeMeasureId)).append("\n");
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
