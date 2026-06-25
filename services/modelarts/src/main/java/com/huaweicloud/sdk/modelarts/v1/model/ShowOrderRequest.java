package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOrderRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_name")

    private String orderName;

    public ShowOrderRequest withOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }

    /**
     * **参数解释**：订单ID。取值自订单列表返回的orderName字段。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return orderName
     */
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOrderRequest that = (ShowOrderRequest) obj;
        return Objects.equals(this.orderName, that.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOrderRequest {\n");
        sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
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
