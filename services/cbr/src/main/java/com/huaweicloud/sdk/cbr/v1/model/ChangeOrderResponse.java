package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ChangeOrderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderId")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retCode")

    private BigDecimal retCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retMsg")

    private String retMsg;

    public ChangeOrderResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ChangeOrderResponse withRetCode(BigDecimal retCode) {
        this.retCode = retCode;
        return this;
    }

    /**
     * 变更状态码
     * @return retCode
     */
    public BigDecimal getRetCode() {
        return retCode;
    }

    public void setRetCode(BigDecimal retCode) {
        this.retCode = retCode;
    }

    public ChangeOrderResponse withRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }

    /**
     * 变更信息
     * @return retMsg
     */
    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeOrderResponse that = (ChangeOrderResponse) obj;
        return Objects.equals(this.orderId, that.orderId) && Objects.equals(this.retCode, that.retCode)
            && Objects.equals(this.retMsg, that.retMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, retCode, retMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeOrderResponse {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
        sb.append("    retMsg: ").append(toIndentedString(retMsg)).append("\n");
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
