package com.huaweicloud.sdk.eip.v2.model;

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
public class ChangeBandwidthToPeriodResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_ids")

    private List<String> bandwidthIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ChangeBandwidthToPeriodResponse withBandwidthIds(List<String> bandwidthIds) {
        this.bandwidthIds = bandwidthIds;
        return this;
    }

    public ChangeBandwidthToPeriodResponse addBandwidthIdsItem(String bandwidthIdsItem) {
        if (this.bandwidthIds == null) {
            this.bandwidthIds = new ArrayList<>();
        }
        this.bandwidthIds.add(bandwidthIdsItem);
        return this;
    }

    public ChangeBandwidthToPeriodResponse withBandwidthIds(Consumer<List<String>> bandwidthIdsSetter) {
        if (this.bandwidthIds == null) {
            this.bandwidthIds = new ArrayList<>();
        }
        bandwidthIdsSetter.accept(this.bandwidthIds);
        return this;
    }

    /**
     * 转包带宽列表
     * @return bandwidthIds
     */
    public List<String> getBandwidthIds() {
        return bandwidthIds;
    }

    public void setBandwidthIds(List<String> bandwidthIds) {
        this.bandwidthIds = bandwidthIds;
    }

    public ChangeBandwidthToPeriodResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ChangeBandwidthToPeriodResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeBandwidthToPeriodResponse that = (ChangeBandwidthToPeriodResponse) obj;
        return Objects.equals(this.bandwidthIds, that.bandwidthIds) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthIds, orderId, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeBandwidthToPeriodResponse {\n");
        sb.append("    bandwidthIds: ").append(toIndentedString(bandwidthIds)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
