package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTransitIpResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip")

    private TransitIp transitIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ShowTransitIpResponse withTransitIp(TransitIp transitIp) {
        this.transitIp = transitIp;
        return this;
    }

    public ShowTransitIpResponse withTransitIp(Consumer<TransitIp> transitIpSetter) {
        if (this.transitIp == null) {
            this.transitIp = new TransitIp();
            transitIpSetter.accept(this.transitIp);
        }

        return this;
    }

    /**
     * Get transitIp
     * @return transitIp
     */
    public TransitIp getTransitIp() {
        return transitIp;
    }

    public void setTransitIp(TransitIp transitIp) {
        this.transitIp = transitIp;
    }

    public ShowTransitIpResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
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
        ShowTransitIpResponse showTransitIpResponse = (ShowTransitIpResponse) o;
        return Objects.equals(this.transitIp, showTransitIpResponse.transitIp)
            && Objects.equals(this.requestId, showTransitIpResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitIp, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTransitIpResponse {\n");
        sb.append("    transitIp: ").append(toIndentedString(transitIp)).append("\n");
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
