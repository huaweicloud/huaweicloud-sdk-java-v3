package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ScaleNodePoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderID")

    private String orderID;

    public ScaleNodePoolResponse withOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    /**
     * **参数解释**： 订单ID，仅扩容包周期节点时返回 **取值范围**： 不涉及
     * @return orderID
     */
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleNodePoolResponse that = (ScaleNodePoolResponse) obj;
        return Objects.equals(this.orderID, that.orderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleNodePoolResponse {\n");
        sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
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
