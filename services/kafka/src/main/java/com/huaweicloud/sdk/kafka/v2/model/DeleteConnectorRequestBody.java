package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteConnectorRequestBody
 */
public class DeleteConnectorRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csb_instance_product_id")

    private String csbInstanceProductId;

    public DeleteConnectorRequestBody withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * cbc生成实例变更的订单 按需实例不传入此参数。 包周期实例传入删除connector时生成的订单，由cbc调用时传入。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public DeleteConnectorRequestBody withCsbInstanceProductId(String csbInstanceProductId) {
        this.csbInstanceProductId = csbInstanceProductId;
        return this;
    }

    /**
     * 包周期实例变更时的product id 按需实例不传入此参数。 包周期实例传入对变更实例规格的product，由cbc调用时传入。 
     * @return csbInstanceProductId
     */
    public String getCsbInstanceProductId() {
        return csbInstanceProductId;
    }

    public void setCsbInstanceProductId(String csbInstanceProductId) {
        this.csbInstanceProductId = csbInstanceProductId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteConnectorRequestBody that = (DeleteConnectorRequestBody) obj;
        return Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.csbInstanceProductId, that.csbInstanceProductId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, csbInstanceProductId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConnectorRequestBody {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    csbInstanceProductId: ").append(toIndentedString(csbInstanceProductId)).append("\n");
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
