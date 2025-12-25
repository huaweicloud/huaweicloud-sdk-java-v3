package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 线下机房ip
 */
public class OcaIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private OcaIpNetwork network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_value")

    private String relativeValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_room")

    private String serverRoom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_rack")

    private String serverRack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_center")

    private OcaIpDataCenter dataCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_addr")

    private String macAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "important")

    private String important;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_properties")

    private OcaIpExtendProperties extendProperties;

    public OcaIp withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 资产值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OcaIp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 资产类型：  ipv4、ipv6
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OcaIp withNetwork(OcaIpNetwork network) {
        this.network = network;
        return this;
    }

    public OcaIp withNetwork(Consumer<OcaIpNetwork> networkSetter) {
        if (this.network == null) {
            this.network = new OcaIpNetwork();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public OcaIpNetwork getNetwork() {
        return network;
    }

    public void setNetwork(OcaIpNetwork network) {
        this.network = network;
    }

    public OcaIp withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 资产备注
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public OcaIp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产名称，默认为资产值
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OcaIp withRelativeValue(String relativeValue) {
        this.relativeValue = relativeValue;
        return this;
    }

    /**
     * 相对值，如资产为ipv4，则为对应的ipv6
     * @return relativeValue
     */
    public String getRelativeValue() {
        return relativeValue;
    }

    public void setRelativeValue(String relativeValue) {
        this.relativeValue = relativeValue;
    }

    public OcaIp withServerRoom(String serverRoom) {
        this.serverRoom = serverRoom;
        return this;
    }

    /**
     * 机房
     * @return serverRoom
     */
    public String getServerRoom() {
        return serverRoom;
    }

    public void setServerRoom(String serverRoom) {
        this.serverRoom = serverRoom;
    }

    public OcaIp withServerRack(String serverRack) {
        this.serverRack = serverRack;
        return this;
    }

    /**
     * 机柜
     * @return serverRack
     */
    public String getServerRack() {
        return serverRack;
    }

    public void setServerRack(String serverRack) {
        this.serverRack = serverRack;
    }

    public OcaIp withDataCenter(OcaIpDataCenter dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    public OcaIp withDataCenter(Consumer<OcaIpDataCenter> dataCenterSetter) {
        if (this.dataCenter == null) {
            this.dataCenter = new OcaIpDataCenter();
            dataCenterSetter.accept(this.dataCenter);
        }

        return this;
    }

    /**
     * Get dataCenter
     * @return dataCenter
     */
    public OcaIpDataCenter getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(OcaIpDataCenter dataCenter) {
        this.dataCenter = dataCenter;
    }

    public OcaIp withMacAddr(String macAddr) {
        this.macAddr = macAddr;
        return this;
    }

    /**
     * mac地址
     * @return macAddr
     */
    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public OcaIp withImportant(String important) {
        this.important = important;
        return this;
    }

    /**
     * 重要等级0 ：不重要 1：重要
     * @return important
     */
    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public OcaIp withExtendProperties(OcaIpExtendProperties extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }

    public OcaIp withExtendProperties(Consumer<OcaIpExtendProperties> extendPropertiesSetter) {
        if (this.extendProperties == null) {
            this.extendProperties = new OcaIpExtendProperties();
            extendPropertiesSetter.accept(this.extendProperties);
        }

        return this;
    }

    /**
     * Get extendProperties
     * @return extendProperties
     */
    public OcaIpExtendProperties getExtendProperties() {
        return extendProperties;
    }

    public void setExtendProperties(OcaIpExtendProperties extendProperties) {
        this.extendProperties = extendProperties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OcaIp that = (OcaIp) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.version, that.version)
            && Objects.equals(this.network, that.network) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.name, that.name) && Objects.equals(this.relativeValue, that.relativeValue)
            && Objects.equals(this.serverRoom, that.serverRoom) && Objects.equals(this.serverRack, that.serverRack)
            && Objects.equals(this.dataCenter, that.dataCenter) && Objects.equals(this.macAddr, that.macAddr)
            && Objects.equals(this.important, that.important)
            && Objects.equals(this.extendProperties, that.extendProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value,
            version,
            network,
            remark,
            name,
            relativeValue,
            serverRoom,
            serverRack,
            dataCenter,
            macAddr,
            important,
            extendProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OcaIp {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    relativeValue: ").append(toIndentedString(relativeValue)).append("\n");
        sb.append("    serverRoom: ").append(toIndentedString(serverRoom)).append("\n");
        sb.append("    serverRack: ").append(toIndentedString(serverRack)).append("\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
        sb.append("    important: ").append(toIndentedString(important)).append("\n");
        sb.append("    extendProperties: ").append(toIndentedString(extendProperties)).append("\n");
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
