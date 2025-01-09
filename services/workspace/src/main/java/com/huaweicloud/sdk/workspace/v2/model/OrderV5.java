package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OrderV5
 */
public class OrderV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_status")

    private Integer orderStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_msg")

    private String resultMsg;

    public OrderV5 withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单id
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderV5 withOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * 订单状态:0:初始化; 1:待审核; 2:待退款; 3:处理中; 4:已取消; 5:已完成; 6:待支付; 7:补偿中; 8:待审批; 9:待确认; 10:待发货; 11:待收货; 12:待上门取货; 13:换新中; 14:待商家收货
     * @return orderStatus
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderV5 withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 结果，SUCCESS:成功； FAIL：失败
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public OrderV5 withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * result=FAIL时，必填，标识该订单失败原因
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public OrderV5 withResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }

    /**
     * 失败信息，和result_code结对出现
     * @return resultMsg
     */
    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderV5 that = (OrderV5) obj;
        return Objects.equals(this.orderId, that.orderId) && Objects.equals(this.orderStatus, that.orderStatus)
            && Objects.equals(this.result, that.result) && Objects.equals(this.resultCode, that.resultCode)
            && Objects.equals(this.resultMsg, that.resultMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderStatus, result, resultCode, resultMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderV5 {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    resultMsg: ").append(toIndentedString(resultMsg)).append("\n");
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
