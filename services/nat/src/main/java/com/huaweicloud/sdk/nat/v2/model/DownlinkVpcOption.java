package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 私网NAT网关实例所属的VPC实例。
 */
public class DownlinkVpcOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ngport_ip_address")

    private String ngportIpAddress;

    public DownlinkVpcOption withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * 私网NAT网关实例所属的子网的ID。
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public DownlinkVpcOption withNgportIpAddress(String ngportIpAddress) {
        this.ngportIpAddress = ngportIpAddress;
        return this;
    }

    /**
     * 私网NAT网关的ngport_ip_addrss。
     * @return ngportIpAddress
     */
    public String getNgportIpAddress() {
        return ngportIpAddress;
    }

    public void setNgportIpAddress(String ngportIpAddress) {
        this.ngportIpAddress = ngportIpAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownlinkVpcOption that = (DownlinkVpcOption) obj;
        return Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.ngportIpAddress, that.ngportIpAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virsubnetId, ngportIpAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownlinkVpcOption {\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    ngportIpAddress: ").append(toIndentedString(ngportIpAddress)).append("\n");
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
