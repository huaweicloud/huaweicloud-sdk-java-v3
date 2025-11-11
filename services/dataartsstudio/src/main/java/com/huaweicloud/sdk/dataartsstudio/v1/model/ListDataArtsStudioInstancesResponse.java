package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListDataArtsStudioInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_check")

    private Boolean billingCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commodity_orders")

    private List<ApigCommodityOrder> commodityOrders = null;

    public ListDataArtsStudioInstancesResponse withBillingCheck(Boolean billingCheck) {
        this.billingCheck = billingCheck;
        return this;
    }

    /**
     * 是否需要账单
     * @return billingCheck
     */
    public Boolean getBillingCheck() {
        return billingCheck;
    }

    public void setBillingCheck(Boolean billingCheck) {
        this.billingCheck = billingCheck;
    }

    public ListDataArtsStudioInstancesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 返回记录总数
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListDataArtsStudioInstancesResponse withCommodityOrders(List<ApigCommodityOrder> commodityOrders) {
        this.commodityOrders = commodityOrders;
        return this;
    }

    public ListDataArtsStudioInstancesResponse addCommodityOrdersItem(ApigCommodityOrder commodityOrdersItem) {
        if (this.commodityOrders == null) {
            this.commodityOrders = new ArrayList<>();
        }
        this.commodityOrders.add(commodityOrdersItem);
        return this;
    }

    public ListDataArtsStudioInstancesResponse withCommodityOrders(
        Consumer<List<ApigCommodityOrder>> commodityOrdersSetter) {
        if (this.commodityOrders == null) {
            this.commodityOrders = new ArrayList<>();
        }
        commodityOrdersSetter.accept(this.commodityOrders);
        return this;
    }

    /**
     * 返回实例列表
     * @return commodityOrders
     */
    public List<ApigCommodityOrder> getCommodityOrders() {
        return commodityOrders;
    }

    public void setCommodityOrders(List<ApigCommodityOrder> commodityOrders) {
        this.commodityOrders = commodityOrders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataArtsStudioInstancesResponse that = (ListDataArtsStudioInstancesResponse) obj;
        return Objects.equals(this.billingCheck, that.billingCheck) && Objects.equals(this.count, that.count)
            && Objects.equals(this.commodityOrders, that.commodityOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingCheck, count, commodityOrders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataArtsStudioInstancesResponse {\n");
        sb.append("    billingCheck: ").append(toIndentedString(billingCheck)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    commodityOrders: ").append(toIndentedString(commodityOrders)).append("\n");
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
