package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OrderLineItemV3
 */
public class OrderLineItemV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_line_item_ids")

    private List<String> orderLineItemIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_mode")

    private Integer discountMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    private Double discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_ratio")

    private Double discountRatio;

    public OrderLineItemV3 withOrderLineItemIds(List<String> orderLineItemIds) {
        this.orderLineItemIds = orderLineItemIds;
        return this;
    }

    public OrderLineItemV3 addOrderLineItemIdsItem(String orderLineItemIdsItem) {
        if (this.orderLineItemIds == null) {
            this.orderLineItemIds = new ArrayList<>();
        }
        this.orderLineItemIds.add(orderLineItemIdsItem);
        return this;
    }

    public OrderLineItemV3 withOrderLineItemIds(Consumer<List<String>> orderLineItemIdsSetter) {
        if (this.orderLineItemIds == null) {
            this.orderLineItemIds = new ArrayList<>();
        }
        orderLineItemIdsSetter.accept(this.orderLineItemIds);
        return this;
    }

    /**
     * 可使用相同折扣的订单项合并后的订单项ID列表。 相同产品、相同规格（对于线性产品）、相同最终价格（例如，严选产品改价）的订单项将进行合并。
     * @return orderLineItemIds
     */
    public List<String> getOrderLineItemIds() {
        return orderLineItemIds;
    }

    public void setOrderLineItemIds(List<String> orderLineItemIds) {
        this.orderLineItemIds = orderLineItemIds;
    }

    public OrderLineItemV3 withDiscountMode(Integer discountMode) {
        this.discountMode = discountMode;
        return this;
    }

    /**
     * 订单可用折扣的模式 。 0：折扣1：一口价2：满减
     * @return discountMode
     */
    public Integer getDiscountMode() {
        return discountMode;
    }

    public void setDiscountMode(Integer discountMode) {
        this.discountMode = discountMode;
    }

    public OrderLineItemV3 withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 订单可用的折扣金额（即减免金额）。
     * @return discountAmount
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public OrderLineItemV3 withDiscountRatio(Double discountRatio) {
        this.discountRatio = discountRatio;
        return this;
    }

    /**
     * 订单可用的折扣比例。
     * @return discountRatio
     */
    public Double getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(Double discountRatio) {
        this.discountRatio = discountRatio;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderLineItemV3 orderLineItemV3 = (OrderLineItemV3) o;
        return Objects.equals(this.orderLineItemIds, orderLineItemV3.orderLineItemIds)
            && Objects.equals(this.discountMode, orderLineItemV3.discountMode)
            && Objects.equals(this.discountAmount, orderLineItemV3.discountAmount)
            && Objects.equals(this.discountRatio, orderLineItemV3.discountRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderLineItemIds, discountMode, discountAmount, discountRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderLineItemV3 {\n");
        sb.append("    orderLineItemIds: ").append(toIndentedString(orderLineItemIds)).append("\n");
        sb.append("    discountMode: ").append(toIndentedString(discountMode)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    discountRatio: ").append(toIndentedString(discountRatio)).append("\n");
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
