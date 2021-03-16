package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PublicIps
 */
public class PublicIps  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private Integer ipVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ipv6_address")
    
    private String publicIpv6Address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip_address")
    
    private String publicIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ip_address")
    
    private String privateIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_id")
    
    private String portId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_id")
    
    private String bandwidthId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth_name")
    
    private String bandwidthName;

    public PublicIps withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 弹性公网IP的状态。 取值范围： FREEZED：冻结； BIND_ERROR：绑定失败； BINDING：绑定中； PENDING_DELETE：释放中； PENDING_CREATE：创建中； PENDING_UPDATE：更新中； DOWN：未绑定； ACTIVE：绑定； ELB：绑定ELB； ERROR：异常失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public PublicIps withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 弹性公网IP的类型。 取值范围：5_telcom（电信）、5_union（联通）、5_bgp（全动态BGP）、5_sbgp（静态BGP）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public PublicIps withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * IP版本信息，取值范围是4和6。 4：表示IPv4； 6：表示IPv6。
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    

    public PublicIps withPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
        return this;
    }

    


    /**
     * IPv4时无此字段，IPv6时为申请到的弹性公网IP地址。
     * @return publicIpv6Address
     */
    public String getPublicIpv6Address() {
        return publicIpv6Address;
    }

    public void setPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
    }

    

    public PublicIps withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    


    /**
     * IPv4时是申请到的弹性公网IP地址，IPv6时是IPv6地址对应的IPv4地址。
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    

    public PublicIps withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    


    /**
     * 绑定弹性公网IP的私有IP地址。
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    

    public PublicIps withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 弹性公网IP所属虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public PublicIps withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    


    /**
     * 端口id。 约束：只有绑定了的弹性公网IP查询才会返回该参数。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    

    public PublicIps withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * 端口所属设备ID。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    

    public PublicIps withBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
        return this;
    }

    


    /**
     * 弹性公网IP对应带宽ID。
     * @return bandwidthId
     */
    public String getBandwidthId() {
        return bandwidthId;
    }

    public void setBandwidthId(String bandwidthId) {
        this.bandwidthId = bandwidthId;
    }

    

    public PublicIps withBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
        return this;
    }

    


    /**
     * 带宽名称。
     * @return bandwidthName
     */
    public String getBandwidthName() {
        return bandwidthName;
    }

    public void setBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicIps publicIps = (PublicIps) o;
        return Objects.equals(this.status, publicIps.status) &&
            Objects.equals(this.type, publicIps.type) &&
            Objects.equals(this.ipVersion, publicIps.ipVersion) &&
            Objects.equals(this.publicIpv6Address, publicIps.publicIpv6Address) &&
            Objects.equals(this.publicIpAddress, publicIps.publicIpAddress) &&
            Objects.equals(this.privateIpAddress, publicIps.privateIpAddress) &&
            Objects.equals(this.vpcId, publicIps.vpcId) &&
            Objects.equals(this.portId, publicIps.portId) &&
            Objects.equals(this.deviceId, publicIps.deviceId) &&
            Objects.equals(this.bandwidthId, publicIps.bandwidthId) &&
            Objects.equals(this.bandwidthName, publicIps.bandwidthName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, type, ipVersion, publicIpv6Address, publicIpAddress, privateIpAddress, vpcId, portId, deviceId, bandwidthId, bandwidthName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIps {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    publicIpv6Address: ").append(toIndentedString(publicIpv6Address)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    bandwidthId: ").append(toIndentedString(bandwidthId)).append("\n");
        sb.append("    bandwidthName: ").append(toIndentedString(bandwidthName)).append("\n");
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

