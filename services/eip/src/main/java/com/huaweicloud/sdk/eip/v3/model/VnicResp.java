package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 弹性公网IP中的vnic对象，存储绑定PORT的相关信息
 */
public class VnicResp {

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
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    public VnicResp withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * - 功能说明：PORT的内网地址
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public VnicResp withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * - 功能说明：PORT的device_id - 约束：存在PORT时，此字段associate_instance_id相同，都为实例ID
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public VnicResp withDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    /**
     * - 功能说明：PORT的device_owner - 约束：存在PORT时，此字段和associate_instance_type都可区分实例类型
     * @return deviceOwner
     */
    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public VnicResp withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * - 功能说明：PORT所在VPC的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public VnicResp withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * - 功能说明：PORT的唯一标识
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public VnicResp withMac(String mac) {
        this.mac = mac;
        return this;
    }

    /**
     * - 功能说明：PORT的MAC信息
     * @return mac
     */
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public VnicResp withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * - 功能说明：PORT的使用者，不同于device_id的归属者。举例：vip port的device_owner为vip，但是这个port实际使用者可能是虚机或其他
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public VnicResp withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * - 功能说明：标记PORT使用者，与instance_id组合使用
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VnicResp that = (VnicResp) obj;
        return Objects.equals(this.privateIpAddress, that.privateIpAddress)
            && Objects.equals(this.deviceId, that.deviceId) && Objects.equals(this.deviceOwner, that.deviceOwner)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.mac, that.mac) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceType, that.instanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateIpAddress, deviceId, deviceOwner, vpcId, portId, mac, instanceId, instanceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VnicResp {\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
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
