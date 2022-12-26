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

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_grp_status")

    private String securityGrpStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_status")

    private Boolean firewallStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_eip_status")

    private Boolean publicEipStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private Boolean nics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_eip_statu")

    private Boolean publicEipStatu;

    public ChangeInstanceNetworkResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ChangeInstanceNetworkResponse withSecurityGrpStatus(String securityGrpStatus) {
        this.securityGrpStatus = securityGrpStatus;
        return this;
    }

    /**
     * 安全组
     * @return securityGrpStatus
     */
    public String getSecurityGrpStatus() {
        return securityGrpStatus;
    }

    public void setSecurityGrpStatus(String securityGrpStatus) {
        this.securityGrpStatus = securityGrpStatus;
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

    public ChangeInstanceNetworkResponse withPublicEipStatus(Boolean publicEipStatus) {
        this.publicEipStatus = publicEipStatus;
        return this;
    }

    /**
     * 公共EIP状态
     * @return publicEipStatus
     */
    public Boolean getPublicEipStatus() {
        return publicEipStatus;
    }

    public void setPublicEipStatus(Boolean publicEipStatus) {
        this.publicEipStatus = publicEipStatus;
    }

    public ChangeInstanceNetworkResponse withNics(Boolean nics) {
        this.nics = nics;
        return this;
    }

    /**
     * 防火墙状态(兼容)
     * @return nics
     */
    public Boolean getNics() {
        return nics;
    }

    public void setNics(Boolean nics) {
        this.nics = nics;
    }

    public ChangeInstanceNetworkResponse withPublicEipStatu(Boolean publicEipStatu) {
        this.publicEipStatu = publicEipStatu;
        return this;
    }

    /**
     * 公共EIP状态(兼容)
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
        return Objects.equals(this.status, changeInstanceNetworkResponse.status)
            && Objects.equals(this.securityGrpStatus, changeInstanceNetworkResponse.securityGrpStatus)
            && Objects.equals(this.firewallStatus, changeInstanceNetworkResponse.firewallStatus)
            && Objects.equals(this.publicEipStatus, changeInstanceNetworkResponse.publicEipStatus)
            && Objects.equals(this.nics, changeInstanceNetworkResponse.nics)
            && Objects.equals(this.publicEipStatu, changeInstanceNetworkResponse.publicEipStatu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, securityGrpStatus, firewallStatus, publicEipStatus, nics, publicEipStatu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeInstanceNetworkResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    securityGrpStatus: ").append(toIndentedString(securityGrpStatus)).append("\n");
        sb.append("    firewallStatus: ").append(toIndentedString(firewallStatus)).append("\n");
        sb.append("    publicEipStatus: ").append(toIndentedString(publicEipStatus)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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
