package com.huaweicloud.sdk.cph.v1.model;

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
public class CreateCloudPhoneSingleServerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public CreateCloudPhoneSingleServerResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateCloudPhoneSingleServerResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID，不超过64个字节。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CreateCloudPhoneSingleServerResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID，不超过64个字节。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CreateCloudPhoneSingleServerResponse withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public CreateCloudPhoneSingleServerResponse addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public CreateCloudPhoneSingleServerResponse withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * 服务器ID列表。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    public CreateCloudPhoneSingleServerResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 任务错误码说明。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public CreateCloudPhoneSingleServerResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 任务错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCloudPhoneSingleServerResponse that = (CreateCloudPhoneSingleServerResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.serverIds, that.serverIds)
            && Objects.equals(this.errorMsg, that.errorMsg) && Objects.equals(this.errorCode, that.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, orderId, productId, serverIds, errorMsg, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPhoneSingleServerResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
