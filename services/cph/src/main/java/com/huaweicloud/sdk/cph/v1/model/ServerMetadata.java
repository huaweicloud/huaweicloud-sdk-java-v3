package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订单以及产品相关信息。
 */
public class ServerMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    public ServerMetadata withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID，不超过64个字节。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ServerMetadata withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID，不超过64个字节。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ServerMetadata withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费类型。 [- 0：包周期](tag:hws,hws_hk,cmcc,ctc) [- 1：按需](tag:fcs)
     * minimum: 0
     * maximum: 1
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerMetadata that = (ServerMetadata) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.chargingMode, that.chargingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, orderId, chargingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerMetadata {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
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
