package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** OrderV3 */
public class OrderV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_line_items")

    private List<OrderLineItemV3> orderLineItems = null;

    public OrderV3 withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** 可使用折扣的订单ID。
     * 
     * @return orderId */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderV3 withOrderLineItems(List<OrderLineItemV3> orderLineItems) {
        this.orderLineItems = orderLineItems;
        return this;
    }

    public OrderV3 addOrderLineItemsItem(OrderLineItemV3 orderLineItemsItem) {
        if (this.orderLineItems == null) {
            this.orderLineItems = new ArrayList<>();
        }
        this.orderLineItems.add(orderLineItemsItem);
        return this;
    }

    public OrderV3 withOrderLineItems(Consumer<List<OrderLineItemV3>> orderLineItemsSetter) {
        if (this.orderLineItems == null) {
            this.orderLineItems = new ArrayList<>();
        }
        orderLineItemsSetter.accept(this.orderLineItems);
        return this;
    }

    /** 可使用折扣的订单项列表，具体参见表4。
     * 
     * @return orderLineItems */
    public List<OrderLineItemV3> getOrderLineItems() {
        return orderLineItems;
    }

    public void setOrderLineItems(List<OrderLineItemV3> orderLineItems) {
        this.orderLineItems = orderLineItems;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderV3 orderV3 = (OrderV3) o;
        return Objects.equals(this.orderId, orderV3.orderId)
            && Objects.equals(this.orderLineItems, orderV3.orderLineItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderLineItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderV3 {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    orderLineItems: ").append(toIndentedString(orderLineItems)).append("\n");
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
