package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 沙箱额外配置,包括VPN引流沙箱，linux沙箱，RDP沙箱，mysql沙箱，其他沙箱默认为空
 */
public class ContainerExtraInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openvpn")

    private ContainerExtraOpenvpnInfo openvpn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux")

    private ContainerExtraLinuxInfo linux;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdp")

    private ContainerExtraRdpInfo rdp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mysql")

    private ContainerExtraMysqlInfo mysql;

    public ContainerExtraInfo withOpenvpn(ContainerExtraOpenvpnInfo openvpn) {
        this.openvpn = openvpn;
        return this;
    }

    public ContainerExtraInfo withOpenvpn(Consumer<ContainerExtraOpenvpnInfo> openvpnSetter) {
        if (this.openvpn == null) {
            this.openvpn = new ContainerExtraOpenvpnInfo();
            openvpnSetter.accept(this.openvpn);
        }

        return this;
    }

    /**
     * Get openvpn
     * @return openvpn
     */
    public ContainerExtraOpenvpnInfo getOpenvpn() {
        return openvpn;
    }

    public void setOpenvpn(ContainerExtraOpenvpnInfo openvpn) {
        this.openvpn = openvpn;
    }

    public ContainerExtraInfo withLinux(ContainerExtraLinuxInfo linux) {
        this.linux = linux;
        return this;
    }

    public ContainerExtraInfo withLinux(Consumer<ContainerExtraLinuxInfo> linuxSetter) {
        if (this.linux == null) {
            this.linux = new ContainerExtraLinuxInfo();
            linuxSetter.accept(this.linux);
        }

        return this;
    }

    /**
     * Get linux
     * @return linux
     */
    public ContainerExtraLinuxInfo getLinux() {
        return linux;
    }

    public void setLinux(ContainerExtraLinuxInfo linux) {
        this.linux = linux;
    }

    public ContainerExtraInfo withRdp(ContainerExtraRdpInfo rdp) {
        this.rdp = rdp;
        return this;
    }

    public ContainerExtraInfo withRdp(Consumer<ContainerExtraRdpInfo> rdpSetter) {
        if (this.rdp == null) {
            this.rdp = new ContainerExtraRdpInfo();
            rdpSetter.accept(this.rdp);
        }

        return this;
    }

    /**
     * Get rdp
     * @return rdp
     */
    public ContainerExtraRdpInfo getRdp() {
        return rdp;
    }

    public void setRdp(ContainerExtraRdpInfo rdp) {
        this.rdp = rdp;
    }

    public ContainerExtraInfo withMysql(ContainerExtraMysqlInfo mysql) {
        this.mysql = mysql;
        return this;
    }

    public ContainerExtraInfo withMysql(Consumer<ContainerExtraMysqlInfo> mysqlSetter) {
        if (this.mysql == null) {
            this.mysql = new ContainerExtraMysqlInfo();
            mysqlSetter.accept(this.mysql);
        }

        return this;
    }

    /**
     * Get mysql
     * @return mysql
     */
    public ContainerExtraMysqlInfo getMysql() {
        return mysql;
    }

    public void setMysql(ContainerExtraMysqlInfo mysql) {
        this.mysql = mysql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContainerExtraInfo that = (ContainerExtraInfo) obj;
        return Objects.equals(this.openvpn, that.openvpn) && Objects.equals(this.linux, that.linux)
            && Objects.equals(this.rdp, that.rdp) && Objects.equals(this.mysql, that.mysql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openvpn, linux, rdp, mysql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerExtraInfo {\n");
        sb.append("    openvpn: ").append(toIndentedString(openvpn)).append("\n");
        sb.append("    linux: ").append(toIndentedString(linux)).append("\n");
        sb.append("    rdp: ").append(toIndentedString(rdp)).append("\n");
        sb.append("    mysql: ").append(toIndentedString(mysql)).append("\n");
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
