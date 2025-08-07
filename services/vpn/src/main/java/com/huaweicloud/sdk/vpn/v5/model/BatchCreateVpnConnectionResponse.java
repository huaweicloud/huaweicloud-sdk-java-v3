package com.huaweicloud.sdk.vpn.v5.model;

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
public class BatchCreateVpnConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_connections")

    private List<CreateResponseVpnConnection> vpnConnections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public BatchCreateVpnConnectionResponse withVpnConnections(List<CreateResponseVpnConnection> vpnConnections) {
        this.vpnConnections = vpnConnections;
        return this;
    }

    public BatchCreateVpnConnectionResponse addVpnConnectionsItem(CreateResponseVpnConnection vpnConnectionsItem) {
        if (this.vpnConnections == null) {
            this.vpnConnections = new ArrayList<>();
        }
        this.vpnConnections.add(vpnConnectionsItem);
        return this;
    }

    public BatchCreateVpnConnectionResponse withVpnConnections(
        Consumer<List<CreateResponseVpnConnection>> vpnConnectionsSetter) {
        if (this.vpnConnections == null) {
            this.vpnConnections = new ArrayList<>();
        }
        vpnConnectionsSetter.accept(this.vpnConnections);
        return this;
    }

    /**
     * VPN连接对象数组
     * @return vpnConnections
     */
    public List<CreateResponseVpnConnection> getVpnConnections() {
        return vpnConnections;
    }

    public void setVpnConnections(List<CreateResponseVpnConnection> vpnConnections) {
        this.vpnConnections = vpnConnections;
    }

    public BatchCreateVpnConnectionResponse withRequestId(String requestId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateVpnConnectionResponse that = (BatchCreateVpnConnectionResponse) obj;
        return Objects.equals(this.vpnConnections, that.vpnConnections)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnConnections, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateVpnConnectionResponse {\n");
        sb.append("    vpnConnections: ").append(toIndentedString(vpnConnections)).append("\n");
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
