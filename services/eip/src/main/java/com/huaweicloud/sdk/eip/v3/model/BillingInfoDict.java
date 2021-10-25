package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 订单信息, 有订单表示包周期 */
public class BillingInfoDict {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    public BillingInfoDict withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** 订单信息
     * 
     * @return orderId */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BillingInfoDict withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /** 产品id
     * 
     * @return productId */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingInfoDict billingInfoDict = (BillingInfoDict) o;
        return Objects.equals(this.orderId, billingInfoDict.orderId)
            && Objects.equals(this.productId, billingInfoDict.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingInfoDict {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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
