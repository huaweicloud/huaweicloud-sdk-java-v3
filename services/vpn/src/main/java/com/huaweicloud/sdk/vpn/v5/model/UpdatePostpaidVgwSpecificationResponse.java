package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdatePostpaidVgwSpecificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_gateway")

    private UpdateResponseVpnGateway vpnGateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header-response-token")

    private String headerResponseToken;

    public UpdatePostpaidVgwSpecificationResponse withVpnGateway(UpdateResponseVpnGateway vpnGateway) {
        this.vpnGateway = vpnGateway;
        return this;
    }

    public UpdatePostpaidVgwSpecificationResponse withVpnGateway(Consumer<UpdateResponseVpnGateway> vpnGatewaySetter) {
        if (this.vpnGateway == null) {
            this.vpnGateway = new UpdateResponseVpnGateway();
            vpnGatewaySetter.accept(this.vpnGateway);
        }

        return this;
    }

    /**
     * Get vpnGateway
     * @return vpnGateway
     */
    public UpdateResponseVpnGateway getVpnGateway() {
        return vpnGateway;
    }

    public void setVpnGateway(UpdateResponseVpnGateway vpnGateway) {
        this.vpnGateway = vpnGateway;
    }

    public UpdatePostpaidVgwSpecificationResponse withRequestId(String requestId) {
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

    public UpdatePostpaidVgwSpecificationResponse withHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
        return this;
    }

    /**
     * Get headerResponseToken
     * @return headerResponseToken
     */
    public String getHeaderResponseToken() {
        return headerResponseToken;
    }

    public void setHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePostpaidVgwSpecificationResponse that = (UpdatePostpaidVgwSpecificationResponse) obj;
        return Objects.equals(this.vpnGateway, that.vpnGateway) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.headerResponseToken, that.headerResponseToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnGateway, requestId, headerResponseToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePostpaidVgwSpecificationResponse {\n");
        sb.append("    vpnGateway: ").append(toIndentedString(vpnGateway)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    headerResponseToken: ").append(toIndentedString(headerResponseToken)).append("\n");
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
