package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ChangeInstanceNetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private String securityGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_status")

    private Boolean firewallStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_eip_statu")

    private Boolean publicEipStatu;

    public ChangeInstanceNetworkResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 状态
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ChangeInstanceNetworkResponse withSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * 安全组
     * @return securityGroups
     */
    public String getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ChangeInstanceNetworkResponse withFirewallStatus(Boolean firewallStatus) {
        this.firewallStatus = firewallStatus;
        return this;
    }

    /**
     * 防火墙状态
     * @return firewallStatus
     */
    public Boolean getFirewallStatus() {
        return firewallStatus;
    }

    public void setFirewallStatus(Boolean firewallStatus) {
        this.firewallStatus = firewallStatus;
    }

    public ChangeInstanceNetworkResponse withPublicEipStatu(Boolean publicEipStatu) {
        this.publicEipStatu = publicEipStatu;
        return this;
    }

    /**
     * 公共EIP状态
     * @return publicEipStatu
     */
    public Boolean getPublicEipStatu() {
        return publicEipStatu;
    }

    public void setPublicEipStatu(Boolean publicEipStatu) {
        this.publicEipStatu = publicEipStatu;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeInstanceNetworkResponse changeInstanceNetworkResponse = (ChangeInstanceNetworkResponse) o;
        return Objects.equals(this.type, changeInstanceNetworkResponse.type)
            && Objects.equals(this.securityGroups, changeInstanceNetworkResponse.securityGroups)
            && Objects.equals(this.firewallStatus, changeInstanceNetworkResponse.firewallStatus)
            && Objects.equals(this.publicEipStatu, changeInstanceNetworkResponse.publicEipStatu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, securityGroups, firewallStatus, publicEipStatu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeInstanceNetworkResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    firewallStatus: ").append(toIndentedString(firewallStatus)).append("\n");
        sb.append("    publicEipStatu: ").append(toIndentedString(publicEipStatu)).append("\n");
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
