package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** OrderRefundInfoV2 */
public class OrderRefundInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Double amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private String measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_name")

    private String serviceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_order_id")

    private String baseOrderId;

    public OrderRefundInfoV2 withId(String id) {
        this.id = id;
        return this;
    }

    /** 该记录的ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderRefundInfoV2 withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /** 金额。 金额为负数，表示退订金额。金额为正数，表示已消费金额或收取的退订手续费。
     * 
     * @return amount */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public OrderRefundInfoV2 withMeasureId(String measureId) {
        this.measureId = measureId;
        return this;
    }

    /** 金额的度量单位。 1：元
     * 
     * @return measureId */
    public String getMeasureId() {
        return measureId;
    }

    public void setMeasureId(String measureId) {
        this.measureId = measureId;
    }

    public OrderRefundInfoV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /** 客户账号ID。
     * 
     * @return customerId */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public OrderRefundInfoV2 withResourceTypeCode(String resourceTypeCode) {
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

    public OrderRefundInfoV2 withServiceTypeCode(String serviceTypeCode) {
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

    public OrderRefundInfoV2 withResourceTypeName(String resourceTypeName) {
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

    public OrderRefundInfoV2 withServiceTypeName(String serviceTypeName) {
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

    public OrderRefundInfoV2 withRegionCode(String regionCode) {
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

    public OrderRefundInfoV2 withBaseOrderId(String baseOrderId) {
        this.baseOrderId = baseOrderId;
        return this;
    }

    /** 退订金额、已消费金额或收取退订手续费对应的原订单ID。
     * 
     * @return baseOrderId */
    public String getBaseOrderId() {
        return baseOrderId;
    }

    public void setBaseOrderId(String baseOrderId) {
        this.baseOrderId = baseOrderId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderRefundInfoV2 orderRefundInfoV2 = (OrderRefundInfoV2) o;
        return Objects.equals(this.id, orderRefundInfoV2.id) && Objects.equals(this.amount, orderRefundInfoV2.amount)
            && Objects.equals(this.measureId, orderRefundInfoV2.measureId)
            && Objects.equals(this.customerId, orderRefundInfoV2.customerId)
            && Objects.equals(this.resourceTypeCode, orderRefundInfoV2.resourceTypeCode)
            && Objects.equals(this.serviceTypeCode, orderRefundInfoV2.serviceTypeCode)
            && Objects.equals(this.resourceTypeName, orderRefundInfoV2.resourceTypeName)
            && Objects.equals(this.serviceTypeName, orderRefundInfoV2.serviceTypeName)
            && Objects.equals(this.regionCode, orderRefundInfoV2.regionCode)
            && Objects.equals(this.baseOrderId, orderRefundInfoV2.baseOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            amount,
            measureId,
            customerId,
            resourceTypeCode,
            serviceTypeCode,
            resourceTypeName,
            serviceTypeName,
            regionCode,
            baseOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderRefundInfoV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    baseOrderId: ").append(toIndentedString(baseOrderId)).append("\n");
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
