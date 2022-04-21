package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DiscountInfoV3
 */
public class DiscountInfoV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_id")

    private String discountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_value")

    private String discountValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_type")

    private Integer discountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orders")

    private List<OrderV3> orders = null;

    public DiscountInfoV3 withDiscountId(String discountId) {
        this.discountId = discountId;
        return this;
    }

    /**
     * 订单的可用折扣ID。 支付订单时，输入该参数的值，即可使用折扣。
     * @return discountId
     */
    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public DiscountInfoV3 withDiscountValue(String discountValue) {
        this.discountValue = discountValue;
        return this;
    }

    /**
     * 折扣率或者满减值，如果折扣模式是一口价，这个值为空。
     * @return discountValue
     */
    public String getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(String discountValue) {
        this.discountValue = discountValue;
    }

    public DiscountInfoV3 withDiscountType(Integer discountType) {
        this.discountType = discountType;
        return this;
    }

    /**
     * 折扣类型，取值为 0：促销折扣1：合同折扣2：商务优惠3：合作伙伴授予折扣609：订单调价折扣
     * @return discountType
     */
    public Integer getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    public DiscountInfoV3 withOrders(List<OrderV3> orders) {
        this.orders = orders;
        return this;
    }

    public DiscountInfoV3 addOrdersItem(OrderV3 ordersItem) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        this.orders.add(ordersItem);
        return this;
    }

    public DiscountInfoV3 withOrders(Consumer<List<OrderV3>> ordersSetter) {
        if (this.orders == null) {
            this.orders = new ArrayList<>();
        }
        ordersSetter.accept(this.orders);
        return this;
    }

    /**
     * 可使用折扣的订单列表。 具体请参见表3。
     * @return orders
     */
    public List<OrderV3> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderV3> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscountInfoV3 discountInfoV3 = (DiscountInfoV3) o;
        return Objects.equals(this.discountId, discountInfoV3.discountId)
            && Objects.equals(this.discountValue, discountInfoV3.discountValue)
            && Objects.equals(this.discountType, discountInfoV3.discountType)
            && Objects.equals(this.orders, discountInfoV3.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId, discountValue, discountType, orders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscountInfoV3 {\n");
        sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
        sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
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
