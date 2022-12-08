package com.huaweicloud.sdk.dsc.v1.model;

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
public class ShowSpecificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_infos")

    private List<ProductOrderInfo> orderInfos = null;

    public ShowSpecificationResponse withOrderInfos(List<ProductOrderInfo> orderInfos) {
        this.orderInfos = orderInfos;
        return this;
    }

    public ShowSpecificationResponse addOrderInfosItem(ProductOrderInfo orderInfosItem) {
        if (this.orderInfos == null) {
            this.orderInfos = new ArrayList<>();
        }
        this.orderInfos.add(orderInfosItem);
        return this;
    }

    public ShowSpecificationResponse withOrderInfos(Consumer<List<ProductOrderInfo>> orderInfosSetter) {
        if (this.orderInfos == null) {
            this.orderInfos = new ArrayList<>();
        }
        orderInfosSetter.accept(this.orderInfos);
        return this;
    }

    /**
     * 订单列表
     * @return orderInfos
     */
    public List<ProductOrderInfo> getOrderInfos() {
        return orderInfos;
    }

    public void setOrderInfos(List<ProductOrderInfo> orderInfos) {
        this.orderInfos = orderInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSpecificationResponse showSpecificationResponse = (ShowSpecificationResponse) o;
        return Objects.equals(this.orderInfos, showSpecificationResponse.orderInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSpecificationResponse {\n");
        sb.append("    orderInfos: ").append(toIndentedString(orderInfos)).append("\n");
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
