package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DemandProductInfo
 */
public class DemandProductInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_spec")
    
    private String resourceSpec;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zone")
    
    private String availableZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_size")
    
    private Integer resourceSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size_measure_id")
    
    private Integer sizeMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage_factor")
    
    private String usageFactor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage_value")
    
    private Double usageValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage_measure_id")
    
    private Integer usageMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscription_num")
    
    private Integer subscriptionNum;

    public DemandProductInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * ID标识，同一次询价中不能重复，用于标识返回询价结果和请求的映射关系。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public DemandProductInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * 云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。您可以调用查询云服务类型列表接口获取。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    

    public DemandProductInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。 ResourceType是CloudServiceType中的一种资源，CloudServiceType由多种ResourceType组合提供。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public DemandProductInfo withResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }

    


    /**
     * 云服务产品的资源规格。如果是VM的资源规格，则需要在规格后面添加“.win”或“.linux”，例如“s2.small.1.linux”。具体请参见对应云服务的相关介绍。
     * @return resourceSpec
     */
    public String getResourceSpec() {
        return resourceSpec;
    }

    public void setResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    

    public DemandProductInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public DemandProductInfo withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    


    /**
     * 可用区标识。
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    

    public DemandProductInfo withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    


    /**
     * 资源容量大小，例如购买的卷大小或带宽大小。 线性产品时该参数不能为空。
     * minimum: 1
     * maximum: 214783647
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    

    public DemandProductInfo withSizeMeasureId(Integer sizeMeasureId) {
        this.sizeMeasureId = sizeMeasureId;
        return this;
    }

    


    /**
     * 资源容量度量标识，枚举值如下： 15：Mbps（购买带宽时使用）17：GB（购买云硬盘时使用）14：个（次） 线性产品时该参数不能为空。
     * @return sizeMeasureId
     */
    public Integer getSizeMeasureId() {
        return sizeMeasureId;
    }

    public void setSizeMeasureId(Integer sizeMeasureId) {
        this.sizeMeasureId = sizeMeasureId;
    }

    

    public DemandProductInfo withUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
        return this;
    }

    


    /**
     * 使用量因子编码，取值和话单中的使用量因子一致，云服务和使用量因子对应关系举例如下： 云服务器：Duration云硬盘：Duration弹性IP：Duration带宽：Duration或upflow市场镜像：Duration 您可以调用查询使用量类型列表接口获取响应参数表3中参数code的取值，即每种云服务对应的计费因子。
     * @return usageFactor
     */
    public String getUsageFactor() {
        return usageFactor;
    }

    public void setUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
    }

    

    public DemandProductInfo withUsageValue(Double usageValue) {
        this.usageValue = usageValue;
        return this;
    }

    


    /**
     * 使用量值。 例如按小时询价，使用量值为1，使用量单位为小时。
     * @return usageValue
     */
    public Double getUsageValue() {
        return usageValue;
    }

    public void setUsageValue(Double usageValue) {
        this.usageValue = usageValue;
    }

    

    public DemandProductInfo withUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
        return this;
    }

    


    /**
     * 使用量度量单位，您可以调用查询使用量单位列表接口获取。 例如按小时询价，使用量值为1，使用量单位为小时。
     * minimum: 0
     * maximum: 100
     * @return usageMeasureId
     */
    public Integer getUsageMeasureId() {
        return usageMeasureId;
    }

    public void setUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
    }

    

    public DemandProductInfo withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    


    /**
     * 订购数量。
     * minimum: 1
     * maximum: 10000
     * @return subscriptionNum
     */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DemandProductInfo demandProductInfo = (DemandProductInfo) o;
        return Objects.equals(this.id, demandProductInfo.id) &&
            Objects.equals(this.cloudServiceType, demandProductInfo.cloudServiceType) &&
            Objects.equals(this.resourceType, demandProductInfo.resourceType) &&
            Objects.equals(this.resourceSpec, demandProductInfo.resourceSpec) &&
            Objects.equals(this.region, demandProductInfo.region) &&
            Objects.equals(this.availableZone, demandProductInfo.availableZone) &&
            Objects.equals(this.resourceSize, demandProductInfo.resourceSize) &&
            Objects.equals(this.sizeMeasureId, demandProductInfo.sizeMeasureId) &&
            Objects.equals(this.usageFactor, demandProductInfo.usageFactor) &&
            Objects.equals(this.usageValue, demandProductInfo.usageValue) &&
            Objects.equals(this.usageMeasureId, demandProductInfo.usageMeasureId) &&
            Objects.equals(this.subscriptionNum, demandProductInfo.subscriptionNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, cloudServiceType, resourceType, resourceSpec, region, availableZone, resourceSize, sizeMeasureId, usageFactor, usageValue, usageMeasureId, subscriptionNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemandProductInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpec: ").append(toIndentedString(resourceSpec)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    sizeMeasureId: ").append(toIndentedString(sizeMeasureId)).append("\n");
        sb.append("    usageFactor: ").append(toIndentedString(usageFactor)).append("\n");
        sb.append("    usageValue: ").append(toIndentedString(usageValue)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
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

