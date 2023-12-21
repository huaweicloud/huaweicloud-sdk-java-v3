package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网络信息。
 */
public class InstanceDetailNetwork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip")

    private String vip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_port")

    private String webPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_id")

    private String publicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    public InstanceDetailNetwork withVip(String vip) {
        this.vip = vip;
        return this;
    }

    /**
     * 云堡垒机实例浮动ip。(实例为主备模式时返回对应的值)
     * @return vip
     */
    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public InstanceDetailNetwork withWebPort(String webPort) {
        this.webPort = webPort;
        return this;
    }

    /**
     * 云堡垒机实例WEB界面访问的端口号。
     * @return webPort
     */
    public String getWebPort() {
        return webPort;
    }

    public void setWebPort(String webPort) {
        this.webPort = webPort;
    }

    public InstanceDetailNetwork withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 云堡垒机实例弹性公网IP。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public InstanceDetailNetwork withPublicId(String publicId) {
        this.publicId = publicId;
        return this;
    }

    /**
     * 云堡垒机实例绑定公网的弹性IP的ID，UUID格式表示。
     * @return publicId
     */
    public String getPublicId() {
        return publicId;
    }

    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    public InstanceDetailNetwork withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 云堡垒机实例私有ip。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public InstanceDetailNetwork withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 云堡垒机实例所在虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceDetailNetwork withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 云堡垒机实例所在子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public InstanceDetailNetwork withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 云堡垒机实例所属的安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceDetailNetwork that = (InstanceDetailNetwork) obj;
        return Objects.equals(this.vip, that.vip) && Objects.equals(this.webPort, that.webPort)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.publicId, that.publicId)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vip, webPort, publicIp, publicId, privateIp, vpcId, subnetId, securityGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceDetailNetwork {\n");
        sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
        sb.append("    webPort: ").append(toIndentedString(webPort)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
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
