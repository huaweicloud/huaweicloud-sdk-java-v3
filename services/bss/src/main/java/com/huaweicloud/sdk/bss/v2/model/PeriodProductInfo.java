package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PeriodProductInfo
 */
public class PeriodProductInfo  {



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
    @JsonProperty(value="period_type")
    
    private Integer periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_num")
    
    private Integer periodNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscription_num")
    
    private Integer subscriptionNum;

    public PeriodProductInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * |参数名称：ID标识| |参数约束及描述：同一次询价中不能重复，用于标识返回询价结果和请求的映射关系|
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PeriodProductInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * |参数名称：用户购买云服务产品的云服务类型| |参数约束及描述：例如EC2，云服务类型为hws.service.type.ec2|
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public PeriodProductInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * |参数名称：用户购买云服务产品的资源类型| |参数约束及描述：例如EC2中的VM，资源类型为hws.resource.type.vm。ResourceType是CloudServiceType中的一种资源，CloudServiceType由多种ResourceType组合提供|
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public PeriodProductInfo withResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }

    


    /**
     * |参数名称：用户购买云服务产品的资源规格| |参数约束及描述：例如VM的小型规格，资源规格为m1.tiny|
     * @return resourceSpec
     */
    public String getResourceSpec() {
        return resourceSpec;
    }

    public void setResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    public PeriodProductInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * |参数名称：云服务区编码| |参数约束及描述：云服务区编码|
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public PeriodProductInfo withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    


    /**
     * |参数名称：可用区标识| |参数约束及描述：可用区标识|
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    public PeriodProductInfo withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    


    /**
     * |参数名称：资源容量大小| |参数约束及描述：例如购买的卷大小或带宽大小，只有线性产品才有这个字段|
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

    public PeriodProductInfo withSizeMeasureId(Integer sizeMeasureId) {
        this.sizeMeasureId = sizeMeasureId;
        return this;
    }

    


    /**
     * |参数名称：资源容量度量标识| |参数约束及描述：枚举值如下：15：Mbps（购买带宽时使用）17：GB（购买云硬盘时使用）14：个只有线性产品才有这个字段|
     * @return sizeMeasureId
     */
    public Integer getSizeMeasureId() {
        return sizeMeasureId;
    }

    public void setSizeMeasureId(Integer sizeMeasureId) {
        this.sizeMeasureId = sizeMeasureId;
    }

    public PeriodProductInfo withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * |参数名称：订购周期类型| |参数约束及描述：0：天；1：周；2：月；3：年；4：小时；|
     * minimum: 0
     * maximum: 4
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public PeriodProductInfo withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    


    /**
     * |参数名称：订购周期数| |参数约束及描述：订购周期数|
     * minimum: 1
     * maximum: 214783647
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public PeriodProductInfo withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    


    /**
     * |参数名称：订购数量| |参数约束及描述：订购数量,有值时不能小于0|
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
        PeriodProductInfo periodProductInfo = (PeriodProductInfo) o;
        return Objects.equals(this.id, periodProductInfo.id) &&
            Objects.equals(this.cloudServiceType, periodProductInfo.cloudServiceType) &&
            Objects.equals(this.resourceType, periodProductInfo.resourceType) &&
            Objects.equals(this.resourceSpec, periodProductInfo.resourceSpec) &&
            Objects.equals(this.region, periodProductInfo.region) &&
            Objects.equals(this.availableZone, periodProductInfo.availableZone) &&
            Objects.equals(this.resourceSize, periodProductInfo.resourceSize) &&
            Objects.equals(this.sizeMeasureId, periodProductInfo.sizeMeasureId) &&
            Objects.equals(this.periodType, periodProductInfo.periodType) &&
            Objects.equals(this.periodNum, periodProductInfo.periodNum) &&
            Objects.equals(this.subscriptionNum, periodProductInfo.subscriptionNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, cloudServiceType, resourceType, resourceSpec, region, availableZone, resourceSize, sizeMeasureId, periodType, periodNum, subscriptionNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodProductInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpec: ").append(toIndentedString(resourceSpec)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    sizeMeasureId: ").append(toIndentedString(sizeMeasureId)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
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

