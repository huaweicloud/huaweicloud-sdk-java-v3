package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ChangeDemand2PeriodResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_ids")

    private List<String> orderIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ChangeDemand2PeriodResponse withOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public ChangeDemand2PeriodResponse addOrderIdsItem(String orderIdsItem) {
        if (this.orderIds == null) {
            this.orderIds = new ArrayList<>();
        }
        this.orderIds.add(orderIdsItem);
        return this;
    }

    public ChangeDemand2PeriodResponse withOrderIds(Consumer<List<String>> orderIdsSetter) {
        if (this.orderIds == null) {
            this.orderIds = new ArrayList<>();
        }
        orderIdsSetter.accept(this.orderIds);
        return this;
    }

    /**
     * **参数解释**: 订单ID的集合。
     * @return orderIds
     */
    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public ChangeDemand2PeriodResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeDemand2PeriodResponse that = (ChangeDemand2PeriodResponse) obj;
        return Objects.equals(this.orderIds, that.orderIds) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderIds, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeDemand2PeriodResponse {\n");
        sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
