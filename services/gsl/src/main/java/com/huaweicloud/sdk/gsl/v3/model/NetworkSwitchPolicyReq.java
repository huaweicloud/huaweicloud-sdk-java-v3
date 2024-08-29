package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NetworkSwitchPolicyReq
 */
public class NetworkSwitchPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_switch_policy_id")

    private Long networkSwitchPolicyId;

    public NetworkSwitchPolicyReq withNetworkSwitchPolicyId(Long networkSwitchPolicyId) {
        this.networkSwitchPolicyId = networkSwitchPolicyId;
        return this;
    }

    /**
     * 网络切换策略标识
     * @return networkSwitchPolicyId
     */
    public Long getNetworkSwitchPolicyId() {
        return networkSwitchPolicyId;
    }

    public void setNetworkSwitchPolicyId(Long networkSwitchPolicyId) {
        this.networkSwitchPolicyId = networkSwitchPolicyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkSwitchPolicyReq that = (NetworkSwitchPolicyReq) obj;
        return Objects.equals(this.networkSwitchPolicyId, that.networkSwitchPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkSwitchPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkSwitchPolicyReq {\n");
        sb.append("    networkSwitchPolicyId: ").append(toIndentedString(networkSwitchPolicyId)).append("\n");
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
