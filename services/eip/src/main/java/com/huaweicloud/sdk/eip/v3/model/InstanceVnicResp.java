package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例port的信息
 */
public class InstanceVnicResp {

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
    @JsonProperty(value = "mac")

    private String mac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vtep")

    private String vtep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vni")

    private Integer vni;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_profile")

    private String portProfile;

    public InstanceVnicResp withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * 实例port的ip地址
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public InstanceVnicResp withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * port的device_id
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public InstanceVnicResp withDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    /**
     * port的device_owner
     * @return deviceOwner
     */
    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public InstanceVnicResp withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * port的vpc_id
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public InstanceVnicResp withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * port的uuid
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public InstanceVnicResp withMac(String mac) {
        this.mac = mac;
        return this;
    }

    /**
     * port的mac地址
     * @return mac
     */
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public InstanceVnicResp withVtep(String vtep) {
        this.vtep = vtep;
        return this;
    }

    /**
     * port的vtep地址
     * @return vtep
     */
    public String getVtep() {
        return vtep;
    }

    public void setVtep(String vtep) {
        this.vtep = vtep;
    }

    public InstanceVnicResp withVni(Integer vni) {
        this.vni = vni;
        return this;
    }

    /**
     * port的vni
     * minimum: 0
     * maximum: 999999
     * @return vni
     */
    public Integer getVni() {
        return vni;
    }

    public void setVni(Integer vni) {
        this.vni = vni;
    }

    public InstanceVnicResp withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * port的实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceVnicResp withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * port的实例类型
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public InstanceVnicResp withPortProfile(String portProfile) {
        this.portProfile = portProfile;
        return this;
    }

    /**
     * port的profile
     * @return portProfile
     */
    public String getPortProfile() {
        return portProfile;
    }

    public void setPortProfile(String portProfile) {
        this.portProfile = portProfile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceVnicResp that = (InstanceVnicResp) obj;
        return Objects.equals(this.privateIpAddress, that.privateIpAddress)
            && Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.deviceOwner, that.deviceOwner)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.mac, that.mac) && Objects.equals(this.vtep, that.vtep)
            && Objects.equals(this.vni, that.vni) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.portProfile, that.portProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateIpAddress,
            deviceId,
            deviceOwner,
            vpcId,
            portId,
            mac,
            vtep,
            vni,
            instanceId,
            instanceType,
            portProfile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceVnicResp {\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
        sb.append("    vtep: ").append(toIndentedString(vtep)).append("\n");
        sb.append("    vni: ").append(toIndentedString(vni)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    portProfile: ").append(toIndentedString(portProfile)).append("\n");
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
