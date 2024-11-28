package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ResizeDesktopPoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Service-Transaction-Id")

    private String serviceTransactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ResizeDesktopPoolReq body;

    public ResizeDesktopPoolRequest withServiceTransactionId(String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
        return this;
    }

    /**
     * CBC接口回调时，请求头里带上的业务ID
     * @return serviceTransactionId
     */
    public String getServiceTransactionId() {
        return serviceTransactionId;
    }

    public void setServiceTransactionId(String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
    }

    public ResizeDesktopPoolRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 桌面池ID。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ResizeDesktopPoolRequest withBody(ResizeDesktopPoolReq body) {
        this.body = body;
        return this;
    }

    public ResizeDesktopPoolRequest withBody(Consumer<ResizeDesktopPoolReq> bodySetter) {
        if (this.body == null) {
            this.body = new ResizeDesktopPoolReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ResizeDesktopPoolReq getBody() {
        return body;
    }

    public void setBody(ResizeDesktopPoolReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeDesktopPoolRequest that = (ResizeDesktopPoolRequest) obj;
        return Objects.equals(this.serviceTransactionId, that.serviceTransactionId)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceTransactionId, poolId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeDesktopPoolRequest {\n");
        sb.append("    serviceTransactionId: ").append(toIndentedString(serviceTransactionId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
