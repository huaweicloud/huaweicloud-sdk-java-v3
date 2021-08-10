package com.huaweicloud.sdk.bssintl.v2.model;

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
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_order_id")

    private String baseOrderId;

    public OrderRefundInfoV2 withId(String id) {
        this.id = id;
        return this;
    }

    /** |参数名称：该记录的ID。| |参数约束及描述：该记录的ID。|
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

    /** |参数名称：金额。金额为负数，表示退订金额。金额为正数，表示已消费金额或收取的退订手续费。| |参数的约束及描述：金额。金额为负数，表示退订金额。金额为正数，表示已消费金额或收取的退订手续费。|
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

    /** |参数名称：度量单位。1：元| |参数约束及描述：度量单位。1：元|
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

    /** |参数名称：客户ID。| |参数约束及描述：客户ID。|
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

    /** |参数名称：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型资源类型资源类型资源类型。|
     * |参数约束及描述：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型资源类型资源类型资源类型。|
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

    /** |参数名称：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。|
     * |参数约束及描述：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。|
     * 
     * @return serviceTypeCode */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public OrderRefundInfoV2 withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /** |参数名称：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。|
     * |参数约束及描述：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。|
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

    /** |参数名称：退订金额、已消费金额或收取退订手续费对应的原订单ID。| |参数约束及描述：退订金额、已消费金额或收取退订手续费对应的原订单ID。|
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
            && Objects.equals(this.regionCode, orderRefundInfoV2.regionCode)
            && Objects.equals(this.baseOrderId, orderRefundInfoV2.baseOrderId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, amount, measureId, customerId, resourceTypeCode, serviceTypeCode, regionCode, baseOrderId);
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
