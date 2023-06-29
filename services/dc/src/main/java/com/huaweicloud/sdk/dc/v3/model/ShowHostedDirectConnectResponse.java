package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHostedDirectConnectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_connect")

    private HostedDirectConnect hostedConnect;

    public ShowHostedDirectConnectResponse withRequestId(String requestId) {
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

    public ShowHostedDirectConnectResponse withHostedConnect(HostedDirectConnect hostedConnect) {
        this.hostedConnect = hostedConnect;
        return this;
    }

    public ShowHostedDirectConnectResponse withHostedConnect(Consumer<HostedDirectConnect> hostedConnectSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHostedDirectConnectResponse that = (ShowHostedDirectConnectResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.hostedConnect, that.hostedConnect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, hostedConnect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHostedDirectConnectResponse {\n");
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
