package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** PeriodProductInfo */
public class PeriodProductInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec")

    private String resourceSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone")

    private String availableZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size_measure_id")

    private Integer sizeMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_num")

    private Integer subscriptionNum;

    public PeriodProductInfo withId(String id) {
        this.id = id;
        return this;
    }

    /** ID标识，同一次询价中不能重复，用于标识返回询价结果和请求的映射关系。
     * 
     * @return id */
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

    /** 云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。您可以调用查询云服务类型列表接口获取。
     * 
     * @return cloudServiceType */
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

    /** 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。
     * ResourceType是CloudServiceType中的一种资源，CloudServiceType由多种ResourceType组合提供。
     * 
     * @return resourceType */
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

    /** 云服务产品的资源规格。如果是VM的资源规格，则需要在规格后面添加“.win”或“.linux”，例如“s2.small.1.linux”。
     * 
     * @return resourceSpec */
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

    /** 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
     * 
     * @return region */
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

    /** 可用区标识。
     * 
     * @return availableZone */
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

    /** 资源容量大小，例如购买的卷大小或带宽大小。 线性产品时该参数不能为空。线性产品为包括硬盘，带宽等在订购时需要指定大小的产品。例如硬盘在订购时需选择10G、20G等不同大小。 minimum: 1 maximum:
     * 214783647
     * 
     * @return resourceSize */
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

    /** 资源容量度量标识。 15：Mbps（购买带宽时使用）17：GB（购买云硬盘时使用）14：个 线性产品时该参数不能为空。线性产品为包括硬盘，带宽等在订购时需要指定大小的产品。例如硬盘在订购时需选择10G、20G等不同大小。
     * 
     * @return sizeMeasureId */
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

    /** 订购包年/包月产品的周期类型。 0：天2：月3：年4：小时 minimum: 0 maximum: 4
     * 
     * @return periodType */
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

    /** 订购包年/包月产品的周期数。 minimum: 1 maximum: 214783647
     * 
     * @return periodNum */
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

    /** 订购包年/包月产品的数量。 minimum: 1 maximum: 10000
     * 
     * @return subscriptionNum */
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
        return Objects.equals(this.id, periodProductInfo.id)
            && Objects.equals(this.cloudServiceType, periodProductInfo.cloudServiceType)
            && Objects.equals(this.resourceType, periodProductInfo.resourceType)
            && Objects.equals(this.resourceSpec, periodProductInfo.resourceSpec)
            && Objects.equals(this.region, periodProductInfo.region)
            && Objects.equals(this.availableZone, periodProductInfo.availableZone)
            && Objects.equals(this.resourceSize, periodProductInfo.resourceSize)
            && Objects.equals(this.sizeMeasureId, periodProductInfo.sizeMeasureId)
            && Objects.equals(this.periodType, periodProductInfo.periodType)
            && Objects.equals(this.periodNum, periodProductInfo.periodNum)
            && Objects.equals(this.subscriptionNum, periodProductInfo.subscriptionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            cloudServiceType,
            resourceType,
            resourceSpec,
            region,
            availableZone,
            resourceSize,
            sizeMeasureId,
            periodType,
            periodNum,
            subscriptionNum);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
