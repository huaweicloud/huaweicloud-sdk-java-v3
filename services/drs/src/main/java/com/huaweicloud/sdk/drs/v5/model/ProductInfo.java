package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 产品信息。
 */
public class ProductInfo {

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
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_factor")

    private String usageFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_value")

    private Double usageValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_measure_id")

    private Integer usageMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size_measure_id")

    private Integer resourceSizeMeasureId;

    public ProductInfo withId(String id) {
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

    public ProductInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 用户购买云服务产品的云服务类型，例如EC2，云服务类型为hws.service.type.ec2。 取值：hws.service.type.drs
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ProductInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 用户购买云服务产品的资源类型，例如EC2中的VM，资源类型为hws.resource.type.vm。 hws.resource.type.drs.instance：instance（实例） hws.resource.type.drs.vm：vm（虚机） hws.resource.type.drs.volume：volume（磁盘） dbs.instanceName：instanceName（实例名称--适配DT） hws.resource.type.drs.flow：flow（DRS流量费） dbs.tag：tag（用户标签） dbs.enterpriseProjectId：enterpriseProjectId（企业项目）
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ProductInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 用户购买云服务产品的资源规格，例如VM的小型规格，资源规格为m1.tiny。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ProductInfo withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 资源容量度量标识。
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public ProductInfo withUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
        return this;
    }

    /**
     * 使用量因子，按需计费必填，取值和话单中的使用量因子一致，云服务和使用量因子对应关系如下： - Duration：云服务器 - flow：流量
     * @return usageFactor
     */
    public String getUsageFactor() {
        return usageFactor;
    }

    public void setUsageFactor(String usageFactor) {
        this.usageFactor = usageFactor;
    }

    public ProductInfo withUsageValue(Double usageValue) {
        this.usageValue = usageValue;
        return this;
    }

    /**
     * 使用量值，按需询价必填，例如按小时询价，使用量值为1，使用量单位为小时。
     * @return usageValue
     */
    public Double getUsageValue() {
        return usageValue;
    }

    public void setUsageValue(Double usageValue) {
        this.usageValue = usageValue;
    }

    public ProductInfo withUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
        return this;
    }

    /**
     * 使用量单位标识，按需询价必填，例如按小时询价，使用量值为1，使用量单位为小时。 - 4：小时 - 10：GB - 11：MB - 13：Byte - 17：FLOW_GB
     * @return usageMeasureId
     */
    public Integer getUsageMeasureId() {
        return usageMeasureId;
    }

    public void setUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
    }

    public ProductInfo withResourceSizeMeasureId(Integer resourceSizeMeasureId) {
        this.resourceSizeMeasureId = resourceSizeMeasureId;
        return this;
    }

    /**
     * 资源容量大小，例如购买的卷大小或带宽大小。
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
        ProductInfo that = (ProductInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.resourceSize, that.resourceSize)
            && Objects.equals(this.usageFactor, that.usageFactor) && Objects.equals(this.usageValue, that.usageValue)
            && Objects.equals(this.usageMeasureId, that.usageMeasureId)
            && Objects.equals(this.resourceSizeMeasureId, that.resourceSizeMeasureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            cloudServiceType,
            resourceType,
            resourceSpecCode,
            resourceSize,
            usageFactor,
            usageValue,
            usageMeasureId,
            resourceSizeMeasureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    usageFactor: ").append(toIndentedString(usageFactor)).append("\n");
        sb.append("    usageValue: ").append(toIndentedString(usageValue)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
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
