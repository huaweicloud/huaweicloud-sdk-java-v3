package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CustomerOnDemandResource
 */
public class CustomerOnDemandResource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_code")
    
    private String regionCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_code")
    
    private String availabilityZoneCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_code")
    
    private String resourceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time")
    
    private String effectiveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_spec_code")
    
    private String resourceSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_info")
    
    private String resourceInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_spec_desc")
    
    private String productSpecDesc;

    public CustomerOnDemandResource withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：所属的客户ID。| |参数约束及描述：所属的客户ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CustomerOnDemandResource withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    


    /**
     * |参数名称：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。| |参数约束及描述：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。|
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public CustomerOnDemandResource withAvailabilityZoneCode(String availabilityZoneCode) {
        this.availabilityZoneCode = availabilityZoneCode;
        return this;
    }

    


    /**
     * |参数名称：所属的AZ的编码。| |参数约束及描述：所属的AZ的编码。|
     * @return availabilityZoneCode
     */
    public String getAvailabilityZoneCode() {
        return availabilityZoneCode;
    }

    public void setAvailabilityZoneCode(String availabilityZoneCode) {
        this.availabilityZoneCode = availabilityZoneCode;
    }

    public CustomerOnDemandResource withServiceTypeCode(String serviceTypeCode) {
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

    public CustomerOnDemandResource withResourceTypeCode(String resourceTypeCode) {
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

    public CustomerOnDemandResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * |参数名称：具体资源的ID。| |参数约束及描述：具体资源的ID。|
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CustomerOnDemandResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * |参数名称：资源实例的名称。| |参数约束及描述：资源实例的名称。|
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public CustomerOnDemandResource withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    


    /**
     * |参数名称：生效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数约束及描述：生效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。|
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public CustomerOnDemandResource withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * |参数名称：失效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数约束及描述：失效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。|
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CustomerOnDemandResource withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * |参数名称：资源状态：1：正常（已开通）；2：宽限期；3：冻结中；4：变更中；5：正在关闭；6：已关闭。| |参数的约束及描述：资源状态：1：正常（已开通）；2：宽限期；3：冻结中；4：变更中；5：正在关闭；6：已关闭。|
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CustomerOnDemandResource withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    


    /**
     * |参数名称：按需资源规格编码。| |参数约束及描述：按需资源规格编码。|
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public CustomerOnDemandResource withResourceInfo(String resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }

    


    /**
     * |参数名称：资源容量大小。格式如| |参数约束及描述：资源容量大小。格式如：\"resourceInfo\": \"{\\\"specSize\\\":40.0}\"|
     * @return resourceInfo
     */
    public String getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(String resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public CustomerOnDemandResource withProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
        return this;
    }

    


    /**
     * |参数名称：产品规格描述| |参数约束及描述：譬如虚拟机为：\"通用计算增强型|c6.2xlarge.4|8vCPUs|32GB|linux\"，硬盘为：\"云硬盘_SATA_LXH01|40.0GB\"|
     * @return productSpecDesc
     */
    public String getProductSpecDesc() {
        return productSpecDesc;
    }

    public void setProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerOnDemandResource customerOnDemandResource = (CustomerOnDemandResource) o;
        return Objects.equals(this.customerId, customerOnDemandResource.customerId) &&
            Objects.equals(this.regionCode, customerOnDemandResource.regionCode) &&
            Objects.equals(this.availabilityZoneCode, customerOnDemandResource.availabilityZoneCode) &&
            Objects.equals(this.serviceTypeCode, customerOnDemandResource.serviceTypeCode) &&
            Objects.equals(this.resourceTypeCode, customerOnDemandResource.resourceTypeCode) &&
            Objects.equals(this.resourceId, customerOnDemandResource.resourceId) &&
            Objects.equals(this.resourceName, customerOnDemandResource.resourceName) &&
            Objects.equals(this.effectiveTime, customerOnDemandResource.effectiveTime) &&
            Objects.equals(this.expireTime, customerOnDemandResource.expireTime) &&
            Objects.equals(this.status, customerOnDemandResource.status) &&
            Objects.equals(this.resourceSpecCode, customerOnDemandResource.resourceSpecCode) &&
            Objects.equals(this.resourceInfo, customerOnDemandResource.resourceInfo) &&
            Objects.equals(this.productSpecDesc, customerOnDemandResource.productSpecDesc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, regionCode, availabilityZoneCode, serviceTypeCode, resourceTypeCode, resourceId, resourceName, effectiveTime, expireTime, status, resourceSpecCode, resourceInfo, productSpecDesc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerOnDemandResource {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    availabilityZoneCode: ").append(toIndentedString(availabilityZoneCode)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceInfo: ").append(toIndentedString(resourceInfo)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
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

