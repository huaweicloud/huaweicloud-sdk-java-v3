package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** OrderInstanceV2 */
public class OrderInstanceV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_name")

    private String serviceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_resource_id")

    private String parentResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_main_resource")

    private Integer isMainResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_policy")

    private Integer expirePolicy;

    public OrderInstanceV2 withId(String id) {
        this.id = id;
        return this;
    }

    /** 标识要开通资源的内部ID，资源开通以后生成的ID为resource_id。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderInstanceV2 withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** 资源ID。
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public OrderInstanceV2 withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /** 资源实例名。
     * 
     * @return resourceName */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public OrderInstanceV2 withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /** 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
     * 
     * @return regionCode */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public OrderInstanceV2 withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /** 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用查询云服务类型列表接口获取。
     * 
     * @return serviceTypeCode */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public OrderInstanceV2 withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    /** 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。
     * 
     * @return resourceTypeCode */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public OrderInstanceV2 withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /** 资源类型名称。例如ECS的资源类型名称为“云主机”。
     * 
     * @return resourceTypeName */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public OrderInstanceV2 withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /** 云服务类型名称。例如ECS的云服务类型名称为“弹性云服务器”。
     * 
     * @return serviceTypeName */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public OrderInstanceV2 withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /** 云服务产品的资源规格。如果是VM的资源规格，则需要在规格后面添加“.win”或“.linux”，例如“s2.small.1.linux”。
     * 
     * @return resourceSpecCode */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public OrderInstanceV2 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 资源项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public OrderInstanceV2 withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /** 产品ID。
     * 
     * @return productId */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OrderInstanceV2 withParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }

    /** 父资源ID。
     * 
     * @return parentResourceId */
    public String getParentResourceId() {
        return parentResourceId;
    }

    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    public OrderInstanceV2 withIsMainResource(Integer isMainResource) {
        this.isMainResource = isMainResource;
        return this;
    }

    /** 是否是主资源。 0：非主资源1：主资源
     * 
     * @return isMainResource */
    public Integer getIsMainResource() {
        return isMainResource;
    }

    public void setIsMainResource(Integer isMainResource) {
        this.isMainResource = isMainResource;
    }

    public OrderInstanceV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 资源状态。状态说明请参见资源状态说明。 2：使用中3：已关闭（页面不展示这个状态）4：已冻结5：已过期
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public OrderInstanceV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /** 资源生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * 
     * @return effectiveTime */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public OrderInstanceV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /** 资源过期时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * 
     * @return expireTime */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public OrderInstanceV2 withExpirePolicy(Integer expirePolicy) {
        this.expirePolicy = expirePolicy;
        return this;
    }

    /** 资源到期后的扣费策略： 1：到期转按需2：到期后自动删除（从生效中直接删除）3：到期后自动续费4：到期后冻结5：到期后删除（从保留期删除） 说明： 只有“3”表示该资源是自动续订，其他情况下，都是非自动续订下的到期策略。
     * 
     * @return expirePolicy */
    public Integer getExpirePolicy() {
        return expirePolicy;
    }

    public void setExpirePolicy(Integer expirePolicy) {
        this.expirePolicy = expirePolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderInstanceV2 orderInstanceV2 = (OrderInstanceV2) o;
        return Objects.equals(this.id, orderInstanceV2.id)
            && Objects.equals(this.resourceId, orderInstanceV2.resourceId)
            && Objects.equals(this.resourceName, orderInstanceV2.resourceName)
            && Objects.equals(this.regionCode, orderInstanceV2.regionCode)
            && Objects.equals(this.serviceTypeCode, orderInstanceV2.serviceTypeCode)
            && Objects.equals(this.resourceTypeCode, orderInstanceV2.resourceTypeCode)
            && Objects.equals(this.resourceTypeName, orderInstanceV2.resourceTypeName)
            && Objects.equals(this.serviceTypeName, orderInstanceV2.serviceTypeName)
            && Objects.equals(this.resourceSpecCode, orderInstanceV2.resourceSpecCode)
            && Objects.equals(this.projectId, orderInstanceV2.projectId)
            && Objects.equals(this.productId, orderInstanceV2.productId)
            && Objects.equals(this.parentResourceId, orderInstanceV2.parentResourceId)
            && Objects.equals(this.isMainResource, orderInstanceV2.isMainResource)
            && Objects.equals(this.status, orderInstanceV2.status)
            && Objects.equals(this.effectiveTime, orderInstanceV2.effectiveTime)
            && Objects.equals(this.expireTime, orderInstanceV2.expireTime)
            && Objects.equals(this.expirePolicy, orderInstanceV2.expirePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceId,
            resourceName,
            regionCode,
            serviceTypeCode,
            resourceTypeCode,
            resourceTypeName,
            serviceTypeName,
            resourceSpecCode,
            projectId,
            productId,
            parentResourceId,
            isMainResource,
            status,
            effectiveTime,
            expireTime,
            expirePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderInstanceV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    parentResourceId: ").append(toIndentedString(parentResourceId)).append("\n");
        sb.append("    isMainResource: ").append(toIndentedString(isMainResource)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    expirePolicy: ").append(toIndentedString(expirePolicy)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
