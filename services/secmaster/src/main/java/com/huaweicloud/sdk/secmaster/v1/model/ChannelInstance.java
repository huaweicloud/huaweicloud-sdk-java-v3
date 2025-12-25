package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChannelInstance
 */
public class ChannelInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private ConfigStatus configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mini_on_online")

    private Boolean miniOnOnline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor")

    private Monitor monitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private String privateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    private String publicIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_write")

    private ReadWrite readWrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public ChannelInstance withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * 分组名称
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public ChannelInstance withConfigStatus(ConfigStatus configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * Get configStatus
     * @return configStatus
     */
    public ConfigStatus getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(ConfigStatus configStatus) {
        this.configStatus = configStatus;
    }

    public ChannelInstance withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * Iam用户ID
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ChannelInstance withMiniOnOnline(Boolean miniOnOnline) {
        this.miniOnOnline = miniOnOnline;
        return this;
    }

    /**
     * 是否在线
     * @return miniOnOnline
     */
    public Boolean getMiniOnOnline() {
        return miniOnOnline;
    }

    public void setMiniOnOnline(Boolean miniOnOnline) {
        this.miniOnOnline = miniOnOnline;
    }

    public ChannelInstance withMonitor(Monitor monitor) {
        this.monitor = monitor;
        return this;
    }

    public ChannelInstance withMonitor(Consumer<Monitor> monitorSetter) {
        if (this.monitor == null) {
            this.monitor = new Monitor();
            monitorSetter.accept(this.monitor);
        }

        return this;
    }

    /**
     * Get monitor
     * @return monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public ChannelInstance withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 分组名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ChannelInstance withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * IP地址
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public ChannelInstance withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * IP地址
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public ChannelInstance withReadWrite(ReadWrite readWrite) {
        this.readWrite = readWrite;
        return this;
    }

    public ChannelInstance withReadWrite(Consumer<ReadWrite> readWriteSetter) {
        if (this.readWrite == null) {
            this.readWrite = new ReadWrite();
            readWriteSetter.accept(this.readWrite);
        }

        return this;
    }

    /**
     * Get readWrite
     * @return readWrite
     */
    public ReadWrite getReadWrite() {
        return readWrite;
    }

    public void setReadWrite(ReadWrite readWrite) {
        this.readWrite = readWrite;
    }

    public ChannelInstance withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地区
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChannelInstance that = (ChannelInstance) obj;
        return Objects.equals(this.channelName, that.channelName)
            && Objects.equals(this.configStatus, that.configStatus) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.miniOnOnline, that.miniOnOnline) && Objects.equals(this.monitor, that.monitor)
            && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.privateIpAddress, that.privateIpAddress)
            && Objects.equals(this.publicIpAddress, that.publicIpAddress)
            && Objects.equals(this.readWrite, that.readWrite) && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelName,
            configStatus,
            createBy,
            miniOnOnline,
            monitor,
            nodeName,
            privateIpAddress,
            publicIpAddress,
            readWrite,
            region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelInstance {\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    miniOnOnline: ").append(toIndentedString(miniOnOnline)).append("\n");
        sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    readWrite: ").append(toIndentedString(readWrite)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
