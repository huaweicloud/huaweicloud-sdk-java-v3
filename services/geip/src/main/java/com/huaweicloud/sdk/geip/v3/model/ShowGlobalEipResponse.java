package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowGlobalEipResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip")

    private ShowGlobalEip globalEip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowGlobalEipResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowGlobalEipResponse withGlobalEip(ShowGlobalEip globalEip) {
        this.globalEip = globalEip;
        return this;
    }

    public ShowGlobalEipResponse withGlobalEip(Consumer<ShowGlobalEip> globalEipSetter) {
        if (this.globalEip == null) {
            this.globalEip = new ShowGlobalEip();
            globalEipSetter.accept(this.globalEip);
        }

        return this;
    }

    /**
     * Get globalEip
     * @return globalEip
     */
    public ShowGlobalEip getGlobalEip() {
        return globalEip;
    }

    public void setGlobalEip(ShowGlobalEip globalEip) {
        this.globalEip = globalEip;
    }

    public ShowGlobalEipResponse withXRequestId(String xRequestId) {
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
        ShowGlobalEipResponse that = (ShowGlobalEipResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.globalEip, that.globalEip)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, globalEip, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGlobalEipResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    globalEip: ").append(toIndentedString(globalEip)).append("\n");
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
