package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateVpnUsersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_server_id")

    private String vpnServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")

    private String xClientToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateVpnUsersRequestBody body;

    public BatchCreateVpnUsersRequest withVpnServerId(String vpnServerId) {
        this.vpnServerId = vpnServerId;
        return this;
    }

    /**
     * VPN服务端 ID
     * @return vpnServerId
     */
    public String getVpnServerId() {
        return vpnServerId;
    }

    public void setVpnServerId(String vpnServerId) {
        this.vpnServerId = vpnServerId;
    }

    public BatchCreateVpnUsersRequest withXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
        return this;
    }

    /**
     * 幂等性标识
     * @return xClientToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")
    public String getXClientToken() {
        return xClientToken;
    }

    public void setXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
    }

    public BatchCreateVpnUsersRequest withBody(BatchCreateVpnUsersRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateVpnUsersRequest withBody(Consumer<BatchCreateVpnUsersRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateVpnUsersRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateVpnUsersRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateVpnUsersRequestBody body) {
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
        BatchCreateVpnUsersRequest that = (BatchCreateVpnUsersRequest) obj;
        return Objects.equals(this.vpnServerId, that.vpnServerId)
            && Objects.equals(this.xClientToken, that.xClientToken) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnServerId, xClientToken, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateVpnUsersRequest {\n");
        sb.append("    vpnServerId: ").append(toIndentedString(vpnServerId)).append("\n");
        sb.append("    xClientToken: ").append(toIndentedString(xClientToken)).append("\n");
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
