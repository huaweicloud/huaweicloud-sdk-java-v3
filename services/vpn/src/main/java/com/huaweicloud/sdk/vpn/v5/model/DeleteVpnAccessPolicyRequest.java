package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVpnAccessPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_server_id")

    private String vpnServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    public DeleteVpnAccessPolicyRequest withVpnServerId(String vpnServerId) {
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

    public DeleteVpnAccessPolicyRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * VPN访问策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVpnAccessPolicyRequest that = (DeleteVpnAccessPolicyRequest) obj;
        return Objects.equals(this.vpnServerId, that.vpnServerId) && Objects.equals(this.policyId, that.policyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnServerId, policyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVpnAccessPolicyRequest {\n");
        sb.append("    vpnServerId: ").append(toIndentedString(vpnServerId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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
