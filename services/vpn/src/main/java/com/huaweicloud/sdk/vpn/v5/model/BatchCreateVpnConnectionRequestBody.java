package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateVpnConnectionRequestBody
 */
public class BatchCreateVpnConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_connections")

    private List<CreateVpnConnectionRequestBodyContent> vpnConnections = null;

    public BatchCreateVpnConnectionRequestBody withVpnConnections(
        List<CreateVpnConnectionRequestBodyContent> vpnConnections) {
        this.vpnConnections = vpnConnections;
        return this;
    }

    public BatchCreateVpnConnectionRequestBody addVpnConnectionsItem(
        CreateVpnConnectionRequestBodyContent vpnConnectionsItem) {
        if (this.vpnConnections == null) {
            this.vpnConnections = new ArrayList<>();
        }
        this.vpnConnections.add(vpnConnectionsItem);
        return this;
    }

    public BatchCreateVpnConnectionRequestBody withVpnConnections(
        Consumer<List<CreateVpnConnectionRequestBodyContent>> vpnConnectionsSetter) {
        if (this.vpnConnections == null) {
            this.vpnConnections = new ArrayList<>();
        }
        vpnConnectionsSetter.accept(this.vpnConnections);
        return this;
    }

    /**
     * Get vpnConnections
     * @return vpnConnections
     */
    public List<CreateVpnConnectionRequestBodyContent> getVpnConnections() {
        return vpnConnections;
    }

    public void setVpnConnections(List<CreateVpnConnectionRequestBodyContent> vpnConnections) {
        this.vpnConnections = vpnConnections;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateVpnConnectionRequestBody that = (BatchCreateVpnConnectionRequestBody) obj;
        return Objects.equals(this.vpnConnections, that.vpnConnections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnConnections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateVpnConnectionRequestBody {\n");
        sb.append("    vpnConnections: ").append(toIndentedString(vpnConnections)).append("\n");
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
