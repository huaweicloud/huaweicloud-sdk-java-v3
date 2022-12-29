package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OrderForm
 */
public class OrderForm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Integer amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_amount")

    private Integer usedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbc_order_id")

    private String cbcOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_type")

    private String deviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_update_time")

    private String orderUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public OrderForm withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 订单数量
     * @return amount
     */
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public OrderForm withUsedAmount(Integer usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }

    /**
     * 订到已使用数量
     * @return usedAmount
     */
    public Integer getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(Integer usedAmount) {
        this.usedAmount = usedAmount;
    }

    public OrderForm withCbcOrderId(String cbcOrderId) {
        this.cbcOrderId = cbcOrderId;
        return this;
    }

    /**
     * cbc订单Id
     * @return cbcOrderId
     */
    public String getCbcOrderId() {
        return cbcOrderId;
    }

    public void setCbcOrderId(String cbcOrderId) {
        this.cbcOrderId = cbcOrderId;
    }

    public OrderForm withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * 设备类别
     * @return deviceType
     */
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public OrderForm withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订单Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrderForm withOrderUpdateTime(String orderUpdateTime) {
        this.orderUpdateTime = orderUpdateTime;
        return this;
    }

    /**
     * 订单更新时间
     * @return orderUpdateTime
     */
    public String getOrderUpdateTime() {
        return orderUpdateTime;
    }

    public void setOrderUpdateTime(String orderUpdateTime) {
        this.orderUpdateTime = orderUpdateTime;
    }

    public OrderForm withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 订单状态
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
        OrderForm orderForm = (OrderForm) o;
        return Objects.equals(this.amount, orderForm.amount) && Objects.equals(this.usedAmount, orderForm.usedAmount)
            && Objects.equals(this.cbcOrderId, orderForm.cbcOrderId)
            && Objects.equals(this.deviceType, orderForm.deviceType) && Objects.equals(this.id, orderForm.id)
            && Objects.equals(this.orderUpdateTime, orderForm.orderUpdateTime)
            && Objects.equals(this.status, orderForm.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, usedAmount, cbcOrderId, deviceType, id, orderUpdateTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderForm {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
        sb.append("    cbcOrderId: ").append(toIndentedString(cbcOrderId)).append("\n");
        sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    orderUpdateTime: ").append(toIndentedString(orderUpdateTime)).append("\n");
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
