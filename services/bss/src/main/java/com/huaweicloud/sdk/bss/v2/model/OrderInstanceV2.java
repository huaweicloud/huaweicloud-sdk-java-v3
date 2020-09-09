package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OrderInstanceV2
 */
public class OrderInstanceV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time")
    
    private String effectiveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_policy")
    
    private Integer expirePolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_main_resource")
    
    private Integer isMainResource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_resource_id")
    
    private String parentResourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_code")
    
    private String regionCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_spec_code")
    
    private String resourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_code")
    
    private String resourceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public OrderInstanceV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    


    /**
     * |参数名称：资源生效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。| |参数约束及描述：资源生效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。|
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public OrderInstanceV2 withExpirePolicy(Integer expirePolicy) {
        this.expirePolicy = expirePolicy;
        return this;
    }

    


    /**
     * |参数名称：到期策略：0：到期进入宽限期1：到期转按需2：到期后自动删除（从生效中直接删除）3：到期后自动续费4：到期后冻结5：到期后删除（从保留期删除）| |参数的约束及描述：到期策略：0：到期进入宽限期1：到期转按需2：到期后自动删除（从生效中直接删除）3：到期后自动续费4：到期后冻结5：到期后删除（从保留期删除）|
     * @return expirePolicy
     */
    public Integer getExpirePolicy() {
        return expirePolicy;
    }

    public void setExpirePolicy(Integer expirePolicy) {
        this.expirePolicy = expirePolicy;
    }

    public OrderInstanceV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * |参数名称：资源过期时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。| |参数约束及描述：资源过期时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。|
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public OrderInstanceV2 withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * |参数名称：标识要开通资源的内部ID，资源开通以后生成的ID为resource_id。对应订购关系ID。| |参数约束及描述：标识要开通资源的内部ID，资源开通以后生成的ID为resource_id。对应订购关系ID。|
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderInstanceV2 withIsMainResource(Integer isMainResource) {
        this.isMainResource = isMainResource;
        return this;
    }

    


    /**
     * |参数名称：是否是主资源。0：非主资源1：主资源| |参数的约束及描述：是否是主资源。0：非主资源1：主资源|
     * @return isMainResource
     */
    public Integer getIsMainResource() {
        return isMainResource;
    }

    public void setIsMainResource(Integer isMainResource) {
        this.isMainResource = isMainResource;
    }

    public OrderInstanceV2 withParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }

    


    /**
     * |参数名称：父资源实例ID。| |参数约束及描述：父资源实例ID。|
     * @return parentResourceId
     */
    public String getParentResourceId() {
        return parentResourceId;
    }

    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    public OrderInstanceV2 withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * |参数名称：产品ID。| |参数约束及描述：产品ID。|
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OrderInstanceV2 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * |参数名称：资源项目ID。| |参数约束及描述：资源项目ID。|
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public OrderInstanceV2 withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    


    /**
     * |参数名称：云服务资源池区域编码。| |参数约束及描述：云服务资源池区域编码。|
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public OrderInstanceV2 withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * |参数名称：资源实例ID。| |参数约束及描述：资源实例ID。|
     * @return resourceId
     */
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

    


    /**
     * |参数名称：资源实例名。| |参数约束及描述：资源实例名。|
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public OrderInstanceV2 withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    


    /**
     * |参数名称：云服务产品的资源规格，例如VM的资源规格举例为“s2.small.1.linux”。具体请参见对应云服务的相关介绍。| |参数约束及描述：云服务产品的资源规格，例如VM的资源规格举例为“s2.small.1.linux”。具体请参见对应云服务的相关介绍。|
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public OrderInstanceV2 withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    


    /**
     * |参数名称：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型资源类型资源类型资源类型。| |参数约束及描述：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型资源类型资源类型资源类型。|
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public OrderInstanceV2 withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    


    /**
     * |参数名称：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。| |参数约束及描述：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。|
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public OrderInstanceV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * |参数名称：资源状态：1：初始化2：已生效3：已过期4：已冻结5：宽限期6：冻结中7：冻结恢复中（预留，未启用）8：正在关闭| |参数的约束及描述：资源状态：1：初始化2：已生效3：已过期4：已冻结5：宽限期6：冻结中7：冻结恢复中（预留，未启用）8：正在关闭|
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return Objects.equals(this.effectiveTime, orderInstanceV2.effectiveTime) &&
            Objects.equals(this.expirePolicy, orderInstanceV2.expirePolicy) &&
            Objects.equals(this.expireTime, orderInstanceV2.expireTime) &&
            Objects.equals(this.id, orderInstanceV2.id) &&
            Objects.equals(this.isMainResource, orderInstanceV2.isMainResource) &&
            Objects.equals(this.parentResourceId, orderInstanceV2.parentResourceId) &&
            Objects.equals(this.productId, orderInstanceV2.productId) &&
            Objects.equals(this.projectId, orderInstanceV2.projectId) &&
            Objects.equals(this.regionCode, orderInstanceV2.regionCode) &&
            Objects.equals(this.resourceId, orderInstanceV2.resourceId) &&
            Objects.equals(this.resourceName, orderInstanceV2.resourceName) &&
            Objects.equals(this.resourceSpecCode, orderInstanceV2.resourceSpecCode) &&
            Objects.equals(this.resourceTypeCode, orderInstanceV2.resourceTypeCode) &&
            Objects.equals(this.serviceTypeCode, orderInstanceV2.serviceTypeCode) &&
            Objects.equals(this.status, orderInstanceV2.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(effectiveTime, expirePolicy, expireTime, id, isMainResource, parentResourceId, productId, projectId, regionCode, resourceId, resourceName, resourceSpecCode, resourceTypeCode, serviceTypeCode, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderInstanceV2 {\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expirePolicy: ").append(toIndentedString(expirePolicy)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isMainResource: ").append(toIndentedString(isMainResource)).append("\n");
        sb.append("    parentResourceId: ").append(toIndentedString(parentResourceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
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

