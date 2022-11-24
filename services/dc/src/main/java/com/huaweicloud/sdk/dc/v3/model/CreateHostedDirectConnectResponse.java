package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateHostedDirectConnectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_connect")

    private HostedDirectConnect hostedConnect;

    public CreateHostedDirectConnectResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 操作请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateHostedDirectConnectResponse withHostedConnect(HostedDirectConnect hostedConnect) {
        this.hostedConnect = hostedConnect;
        return this;
    }

    public CreateHostedDirectConnectResponse withHostedConnect(Consumer<HostedDirectConnect> hostedConnectSetter) {
        if (this.hostedConnect == null) {
            this.hostedConnect = new HostedDirectConnect();
            hostedConnectSetter.accept(this.hostedConnect);
        }

        return this;
    }

    /**
     * Get hostedConnect
     * @return hostedConnect
     */
    public HostedDirectConnect getHostedConnect() {
        return hostedConnect;
    }

    public void setHostedConnect(HostedDirectConnect hostedConnect) {
        this.hostedConnect = hostedConnect;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateHostedDirectConnectResponse createHostedDirectConnectResponse = (CreateHostedDirectConnectResponse) o;
        return Objects.equals(this.requestId, createHostedDirectConnectResponse.requestId)
            && Objects.equals(this.hostedConnect, createHostedDirectConnectResponse.hostedConnect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, hostedConnect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHostedDirectConnectResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    hostedConnect: ").append(toIndentedString(hostedConnect)).append("\n");
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
