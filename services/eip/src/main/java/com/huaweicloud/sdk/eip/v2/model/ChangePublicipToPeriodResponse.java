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
public class ChangePublicipToPeriodResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_ids")

    private List<String> publicipIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ChangePublicipToPeriodResponse withPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
        return this;
    }

    public ChangePublicipToPeriodResponse addPublicipIdsItem(String publicipIdsItem) {
        if (this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        this.publicipIds.add(publicipIdsItem);
        return this;
    }

    public ChangePublicipToPeriodResponse withPublicipIds(Consumer<List<String>> publicipIdsSetter) {
        if (this.publicipIds == null) {
            this.publicipIds = new ArrayList<>();
        }
        publicipIdsSetter.accept(this.publicipIds);
        return this;
    }

    /**
     * 转包IP列表
     * @return publicipIds
     */
    public List<String> getPublicipIds() {
        return publicipIds;
    }

    public void setPublicipIds(List<String> publicipIds) {
        this.publicipIds = publicipIds;
    }

    public ChangePublicipToPeriodResponse withOrderId(String orderId) {
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

    public ChangePublicipToPeriodResponse withRequestId(String requestId) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangePublicipToPeriodResponse changePublicipToPeriodResponse = (ChangePublicipToPeriodResponse) o;
        return Objects.equals(this.publicipIds, changePublicipToPeriodResponse.publicipIds)
            && Objects.equals(this.orderId, changePublicipToPeriodResponse.orderId)
            && Objects.equals(this.requestId, changePublicipToPeriodResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipIds, orderId, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangePublicipToPeriodResponse {\n");
        sb.append("    publicipIds: ").append(toIndentedString(publicipIds)).append("\n");
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
