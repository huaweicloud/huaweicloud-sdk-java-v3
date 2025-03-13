package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteVpnUsersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_server_id")

    private String vpnServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteVpnUsersRequestBody body;

    public BatchDeleteVpnUsersRequest withVpnServerId(String vpnServerId) {
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

    public BatchDeleteVpnUsersRequest withBody(BatchDeleteVpnUsersRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteVpnUsersRequest withBody(Consumer<BatchDeleteVpnUsersRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteVpnUsersRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteVpnUsersRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteVpnUsersRequestBody body) {
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
        BatchDeleteVpnUsersRequest that = (BatchDeleteVpnUsersRequest) obj;
        return Objects.equals(this.vpnServerId, that.vpnServerId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnServerId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteVpnUsersRequest {\n");
        sb.append("    vpnServerId: ").append(toIndentedString(vpnServerId)).append("\n");
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
