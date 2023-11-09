package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桌面网络信息：vpc、子网、私有ip、弹性ip、安全组
 */
public class NetworkInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_info")

    private Vpc vpcInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_info")

    private Subnet subnetInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_info")

    private Port portInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_info")

    private PublicIp publicIpInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    public NetworkInfo withVpcInfo(Vpc vpcInfo) {
        this.vpcInfo = vpcInfo;
        return this;
    }

    public NetworkInfo withVpcInfo(Consumer<Vpc> vpcInfoSetter) {
        if (this.vpcInfo == null) {
            this.vpcInfo = new Vpc();
            vpcInfoSetter.accept(this.vpcInfo);
        }

        return this;
    }

    /**
     * Get vpcInfo
     * @return vpcInfo
     */
    public Vpc getVpcInfo() {
        return vpcInfo;
    }

    public void setVpcInfo(Vpc vpcInfo) {
        this.vpcInfo = vpcInfo;
    }

    public NetworkInfo withSubnetInfo(Subnet subnetInfo) {
        this.subnetInfo = subnetInfo;
        return this;
    }

    public NetworkInfo withSubnetInfo(Consumer<Subnet> subnetInfoSetter) {
        if (this.subnetInfo == null) {
            this.subnetInfo = new Subnet();
            subnetInfoSetter.accept(this.subnetInfo);
        }

        return this;
    }

    /**
     * Get subnetInfo
     * @return subnetInfo
     */
    public Subnet getSubnetInfo() {
        return subnetInfo;
    }

    public void setSubnetInfo(Subnet subnetInfo) {
        this.subnetInfo = subnetInfo;
    }

    public NetworkInfo withPortInfo(Port portInfo) {
        this.portInfo = portInfo;
        return this;
    }

    public NetworkInfo withPortInfo(Consumer<Port> portInfoSetter) {
        if (this.portInfo == null) {
            this.portInfo = new Port();
            portInfoSetter.accept(this.portInfo);
        }

        return this;
    }

    /**
     * Get portInfo
     * @return portInfo
     */
    public Port getPortInfo() {
        return portInfo;
    }

    public void setPortInfo(Port portInfo) {
        this.portInfo = portInfo;
    }

    public NetworkInfo withPublicIpInfo(PublicIp publicIpInfo) {
        this.publicIpInfo = publicIpInfo;
        return this;
    }

    public NetworkInfo withPublicIpInfo(Consumer<PublicIp> publicIpInfoSetter) {
        if (this.publicIpInfo == null) {
            this.publicIpInfo = new PublicIp();
            publicIpInfoSetter.accept(this.publicIpInfo);
        }

        return this;
    }

    /**
     * Get publicIpInfo
     * @return publicIpInfo
     */
    public PublicIp getPublicIpInfo() {
        return publicIpInfo;
    }

    public void setPublicIpInfo(PublicIp publicIpInfo) {
        this.publicIpInfo = publicIpInfo;
    }

    public NetworkInfo withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public NetworkInfo addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NetworkInfo withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 桌面绑定的安全组列表
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkInfo that = (NetworkInfo) obj;
        return Objects.equals(this.vpcInfo, that.vpcInfo) && Objects.equals(this.subnetInfo, that.subnetInfo)
            && Objects.equals(this.portInfo, that.portInfo) && Objects.equals(this.publicIpInfo, that.publicIpInfo)
            && Objects.equals(this.securityGroups, that.securityGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcInfo, subnetInfo, portInfo, publicIpInfo, securityGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkInfo {\n");
        sb.append("    vpcInfo: ").append(toIndentedString(vpcInfo)).append("\n");
        sb.append("    subnetInfo: ").append(toIndentedString(subnetInfo)).append("\n");
        sb.append("    portInfo: ").append(toIndentedString(portInfo)).append("\n");
        sb.append("    publicIpInfo: ").append(toIndentedString(publicIpInfo)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
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
