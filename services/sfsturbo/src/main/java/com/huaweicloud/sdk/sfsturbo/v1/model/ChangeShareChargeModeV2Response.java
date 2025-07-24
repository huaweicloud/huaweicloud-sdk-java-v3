package com.huaweicloud.sdk.sfsturbo.v1.model;

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
public class ChangeShareChargeModeV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_ids")

    private List<String> orderIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ChangeShareChargeModeV2Response withOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public ChangeShareChargeModeV2Response addOrderIdsItem(String orderIdsItem) {
        if (this.orderIds == null) {
            this.orderIds = new ArrayList<>();
        }
        this.orderIds.add(orderIdsItem);
        return this;
    }

    public ChangeShareChargeModeV2Response withOrderIds(Consumer<List<String>> orderIdsSetter) {
        if (this.orderIds == null) {
            this.orderIds = new ArrayList<>();
        }
        orderIdsSetter.accept(this.orderIds);
        return this;
    }

    /**
     * 转包周期生成的订单数组
     * @return orderIds
     */
    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public ChangeShareChargeModeV2Response withXRequestId(String xRequestId) {
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
        ChangeShareChargeModeV2Response that = (ChangeShareChargeModeV2Response) obj;
        return Objects.equals(this.orderIds, that.orderIds) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderIds, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeShareChargeModeV2Response {\n");
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
