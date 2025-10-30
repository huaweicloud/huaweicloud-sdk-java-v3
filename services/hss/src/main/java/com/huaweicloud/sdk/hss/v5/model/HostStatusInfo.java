package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HostStatusInfo
 */
public class HostStatusInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private List<String> publicIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private List<String> privateIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public HostStatusInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器ID **取值范围**: 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public HostStatusInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-128位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public HostStatusInfo withPublicIp(List<String> publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public HostStatusInfo addPublicIpItem(String publicIpItem) {
        if (this.publicIp == null) {
            this.publicIp = new ArrayList<>();
        }
        this.publicIp.add(publicIpItem);
        return this;
    }

    public HostStatusInfo withPublicIp(Consumer<List<String>> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new ArrayList<>();
        }
        publicIpSetter.accept(this.publicIp);
        return this;
    }

    /**
     * **参数解释**: 弹性公网IP地址 
     * @return publicIp
     */
    public List<String> getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(List<String> publicIp) {
        this.publicIp = publicIp;
    }

    public HostStatusInfo withPrivateIp(List<String> privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    public HostStatusInfo addPrivateIpItem(String privateIpItem) {
        if (this.privateIp == null) {
            this.privateIp = new ArrayList<>();
        }
        this.privateIp.add(privateIpItem);
        return this;
    }

    public HostStatusInfo withPrivateIp(Consumer<List<String>> privateIpSetter) {
        if (this.privateIp == null) {
            this.privateIp = new ArrayList<>();
        }
        privateIpSetter.accept(this.privateIp);
        return this;
    }

    /**
     * **参数解释**: 私有IP地址 
     * @return privateIp
     */
    public List<String> getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(List<String> privateIp) {
        this.privateIp = privateIp;
    }

    public HostStatusInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 服务器状态 **取值范围**: 字符长度1-128位 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HostStatusInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**: Vpc标识Id **取值范围**: 字符长度1-128位 
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostStatusInfo that = (HostStatusInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.status, that.status) && Objects.equals(this.vpcId, that.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, publicIp, privateIp, status, vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostStatusInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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
