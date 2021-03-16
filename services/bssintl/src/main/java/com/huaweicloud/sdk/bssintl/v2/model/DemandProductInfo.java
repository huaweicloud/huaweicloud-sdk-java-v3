package com.huaweicloud.sdk.bssintl.v2.model;





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
     * |参数名称：ID标识| |参数约束及描述：同一次询价中不能重复，用于标识返回询价结果和请求的映射关系|
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
     * |参数名称：用户购买云服务产品的云服务类型| |参数约束及描述：例如EC2，云服务类型为hws.service.type.ec2|
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
     * |参数名称：用户购买云服务产品的资源类型| |参数约束及描述：例如EC2中的VM，资源类型为hws.resource.type.vm。ResourceType是CloudServiceType中的一种资源，CloudServiceType由多种ResourceType组合提供|
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
     * |参数名称：用户购买云服务产品的资源规格| |参数约束及描述：例如VM的小型规格，资源规格为m1.tiny|
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
     * |参数名称：云服务区编码| |参数约束及描述：云服务区编码|
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
     * |参数名称：可用区标识| |参数约束及描述：可用区标识|
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

    

    public DemandProductInfo withSizeMeasureId(Integer sizeMeasureId) {
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

    

    public DemandProductInfo withUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
        return this;
    }

    


    /**
     * |参数名称：使用量因子编码| |参数约束及描述：云服务器：Duration云硬盘：Duration弹性IP：Duration带宽：Duration或upflow市场镜像：Duration具体每种云服务使用什么样的计费因子，需要找具体云服务确认，全集请参考|
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
     * |参数名称：使用量值| |参数约束及描述：例如按小时询价，使用量值为1，使用量单位为小时|
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
     * |参数名称：使用量单位标识| |参数约束及描述：例如按小时询价，使用量值为1，使用量单位为小时，枚举值如下：4：小时全量枚举如下：0：天（时长）；1：元（货币）；2：角（货币）；3：分（货币）；4：小时（时长）；5：分钟（时长）；6：秒（时长）；7：EB（流量）；8：PB（流量）；9：TB（流量）；10：GB（流量）；11：MB（流量）；12：KB（流量）；13：Byte（流量）；14：个(次)（数量）；15：Mbps（流量）；16：Byte（容量）；17：GB（容量）；18：KLOC（行数）；19：年（周期）；20：月（周期）；21：MB（容量）；22：赫兹（频率）；23：核（数量）；24：天（周期）；25：小时（周期）；30：个数（个数）；31：千次（数量）；32：百万次（数量）；33：十亿次（数量）；34：bps（带宽速率）；35：kbps（带宽速率）；36：Mbps（带宽速率）；37：Gbps（带宽速率）；38：Tbps（带宽速率）；39：GB-秒（容量时长）；40：次（数量）；41：个（数量）；42：千个（数量）；43：张（数量）；44：千张（数量）；45：每秒查询率（查询速率）；46：人/天（数量）；47：TB（容量）；48：PB（容量）。具体某个云服务应该使用什么单位，需要和云服务确认。|
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
     * |参数名称：订购数量| |参数约束及描述：订购数量,有值时不能小于0，默认为1|
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

