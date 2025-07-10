package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateDesktopPoolChangeOrderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orders")

    private List<OrderV5> orders = null;

    public CreateDesktopPoolChangeOrderResponse withOrders(List<OrderV5> orders) {
        this.orders = orders;
        return this;
    }

    public CreateDesktopPoolChangeOrderResponse addOrdersItem(OrderV5 ordersItem) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        this.orders.add(ordersItem);
        return this;
    }

    public CreateDesktopPoolChangeOrderResponse withOrders(Consumer<List<OrderV5>> ordersSetter) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        ordersSetter.accept(this.orders);
        return this;
    }

    /**
     * 批量生成订单结果。
     * @return orders
     */
    public List<OrderV5> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderV5> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDesktopPoolChangeOrderResponse that = (CreateDesktopPoolChangeOrderResponse) obj;
        return Objects.equals(this.orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDesktopPoolChangeOrderResponse {\n");
        sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
