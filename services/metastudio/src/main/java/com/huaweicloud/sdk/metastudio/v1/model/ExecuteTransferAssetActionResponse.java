package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ExecuteTransferAssetActionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accept_respone")

    private TransAcceptResponse acceptRespone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ExecuteTransferAssetActionResponse withAcceptRespone(TransAcceptResponse acceptRespone) {
        this.acceptRespone = acceptRespone;
        return this;
    }

    public ExecuteTransferAssetActionResponse withAcceptRespone(Consumer<TransAcceptResponse> acceptResponeSetter) {
        if (this.acceptRespone == null) {
            this.acceptRespone = new TransAcceptResponse();
            acceptResponeSetter.accept(this.acceptRespone);
        }

        return this;
    }

    /**
     * Get acceptRespone
     * @return acceptRespone
     */
    public TransAcceptResponse getAcceptRespone() {
        return acceptRespone;
    }

    public void setAcceptRespone(TransAcceptResponse acceptRespone) {
        this.acceptRespone = acceptRespone;
    }

    public ExecuteTransferAssetActionResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
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
        ExecuteTransferAssetActionResponse that = (ExecuteTransferAssetActionResponse) obj;
        return Objects.equals(this.acceptRespone, that.acceptRespone)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceptRespone, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteTransferAssetActionResponse {\n");
        sb.append("    acceptRespone: ").append(toIndentedString(acceptRespone)).append("\n");
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
