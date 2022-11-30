package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订单以及产品相关信息
 */
public class ShowCloudPhoneServerDetailResponseBodyMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    public ShowCloudPhoneServerDetailResponseBodyMetadata withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 订单ID，不超过64个字节
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ShowCloudPhoneServerDetailResponseBodyMetadata withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 产品ID，不超过64个字节
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCloudPhoneServerDetailResponseBodyMetadata showCloudPhoneServerDetailResponseBodyMetadata =
            (ShowCloudPhoneServerDetailResponseBodyMetadata) o;
        return Objects.equals(this.productId, showCloudPhoneServerDetailResponseBodyMetadata.productId)
            && Objects.equals(this.orderId, showCloudPhoneServerDetailResponseBodyMetadata.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCloudPhoneServerDetailResponseBodyMetadata {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
