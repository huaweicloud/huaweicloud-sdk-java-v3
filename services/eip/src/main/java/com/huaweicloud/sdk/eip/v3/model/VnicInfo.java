package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 公网IP中的vnic对象，存储绑定PORT的相关信息
 */
public class VnicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private String privateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_owner")

    private String deviceOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_profile")

    private String portProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac")

    private String mac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vtep")

    private String vtep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vni")

    private String vni;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    public VnicInfo withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * 功能说明：私网IP地址
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public VnicInfo withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 功能说明：端口所属设备ID 约束：不支持设置和更新,由系统自动维护
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public VnicInfo withDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    /**
     * 功能说明：设备所属 取值范围：合法设备所属,如network:dhcp、network:VIP_PORT、network:router_interface_distributed、network:router_centralized_snat 约束：不支持设置和更新,由系统自动维护
     * @return deviceOwner
     */
    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public VnicInfo withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 功能说明：虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public VnicInfo withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 功能说明：端口ID
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public VnicInfo withPortProfile(String portProfile) {
        this.portProfile = portProfile;
        return this;
    }

    /**
     * 功能说明：端口profile信息
     * @return portProfile
     */
    public String getPortProfile() {
        return portProfile;
    }

    public void setPortProfile(String portProfile) {
        this.portProfile = portProfile;
    }

    public VnicInfo withMac(String mac) {
        this.mac = mac;
        return this;
    }

    /**
     * 功能说明：端口MAC地址 约束：由系统分配,不支持指定
     * @return mac
     */
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public VnicInfo withVtep(String vtep) {
        this.vtep = vtep;
        return this;
    }

    /**
     * 功能说明：VTEP IP
     * @return vtep
     */
    public String getVtep() {
        return vtep;
    }

    public void setVtep(String vtep) {
        this.vtep = vtep;
    }

    public VnicInfo withVni(String vni) {
        this.vni = vni;
        return this;
    }

    /**
     * 功能说明：VXLAN ID
     * @return vni
     */
    public String getVni() {
        return vni;
    }

    public void setVni(String vni) {
        this.vni = vni;
    }

    public VnicInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 功能说明：端口所属实例ID,例如RDS实例ID 约束：不支持设置和更新,由系统自动维护
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public VnicInfo withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 功能说明：端口所属实例类型,例如“RDS” 约束：不支持设置和更新,由系统自动维护
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VnicInfo vnicInfo = (VnicInfo) o;
        return Objects.equals(this.privateIpAddress, vnicInfo.privateIpAddress)
            && Objects.equals(this.deviceId, vnicInfo.deviceId)
            && Objects.equals(this.deviceOwner, vnicInfo.deviceOwner) && Objects.equals(this.vpcId, vnicInfo.vpcId)
            && Objects.equals(this.portId, vnicInfo.portId) && Objects.equals(this.portProfile, vnicInfo.portProfile)
            && Objects.equals(this.mac, vnicInfo.mac) && Objects.equals(this.vtep, vnicInfo.vtep)
            && Objects.equals(this.vni, vnicInfo.vni) && Objects.equals(this.instanceId, vnicInfo.instanceId)
            && Objects.equals(this.instanceType, vnicInfo.instanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateIpAddress,
            deviceId,
            deviceOwner,
            vpcId,
            portId,
            portProfile,
            mac,
            vtep,
            vni,
            instanceId,
            instanceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VnicInfo {\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    portProfile: ").append(toIndentedString(portProfile)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    vtep: ").append(toIndentedString(vtep)).append("\n");
        sb.append("    vni: ").append(toIndentedString(vni)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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
