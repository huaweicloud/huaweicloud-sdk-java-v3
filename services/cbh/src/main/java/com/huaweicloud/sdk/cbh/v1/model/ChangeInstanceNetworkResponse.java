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
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_grp_status")

    private Boolean securityGrpStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_status")

    private Boolean firewallStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_eip_status")

    private Boolean publicEipStatus;

    public ChangeInstanceNetworkResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 云堡垒机实例网络状态。下面3个正常则正常，有一个不正常，网络状态为失败。
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ChangeInstanceNetworkResponse withSecurityGrpStatus(Boolean securityGrpStatus) {
        this.securityGrpStatus = securityGrpStatus;
        return this;
    }

    /**
     * 云堡垒机实例安全组状态。 - true  正常 - false 失败
     * @return securityGrpStatus
     */
    public Boolean getSecurityGrpStatus() {
        return securityGrpStatus;
    }

    public void setSecurityGrpStatus(Boolean securityGrpStatus) {
        this.securityGrpStatus = securityGrpStatus;
    }

    public ChangeInstanceNetworkResponse withFirewallStatus(Boolean firewallStatus) {
        this.firewallStatus = firewallStatus;
        return this;
    }

    /**
     * 云堡垒机实例防火墙状态。 - true  正常 - false 失败
     * @return firewallStatus
     */
    public Boolean getFirewallStatus() {
        return firewallStatus;
    }

    public void setFirewallStatus(Boolean firewallStatus) {
        this.firewallStatus = firewallStatus;
    }

    public ChangeInstanceNetworkResponse withPublicEipStatus(Boolean publicEipStatus) {
        this.publicEipStatus = publicEipStatus;
        return this;
    }

    /**
     * 云堡垒机实例公网IP状态。 - true  正常 - false 失败
     * @return publicEipStatus
     */
    public Boolean getPublicEipStatus() {
        return publicEipStatus;
    }

    public void setPublicEipStatus(Boolean publicEipStatus) {
        this.publicEipStatus = publicEipStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeInstanceNetworkResponse that = (ChangeInstanceNetworkResponse) obj;
        return Objects.equals(this.status, that.status)
            && Objects.equals(this.securityGrpStatus, that.securityGrpStatus)
            && Objects.equals(this.firewallStatus, that.firewallStatus)
            && Objects.equals(this.publicEipStatus, that.publicEipStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, securityGrpStatus, firewallStatus, publicEipStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeInstanceNetworkResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    securityGrpStatus: ").append(toIndentedString(securityGrpStatus)).append("\n");
        sb.append("    firewallStatus: ").append(toIndentedString(firewallStatus)).append("\n");
        sb.append("    publicEipStatus: ").append(toIndentedString(publicEipStatus)).append("\n");
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
