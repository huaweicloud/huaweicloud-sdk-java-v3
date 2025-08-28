package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 插件信息
 */
public class PluginResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_status")

    private String pluginStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_status")

    private String upgradeStatus;

    public PluginResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public PluginResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public PluginResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 私有IP地址
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public PluginResponseInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 公有IP地址
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public PluginResponseInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public PluginResponseInfo withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * 插件名称
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public PluginResponseInfo withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * 插件版本
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public PluginResponseInfo withPluginStatus(String pluginStatus) {
        this.pluginStatus = pluginStatus;
        return this;
    }

    /**
     * 插件状态
     * @return pluginStatus
     */
    public String getPluginStatus() {
        return pluginStatus;
    }

    public void setPluginStatus(String pluginStatus) {
        this.pluginStatus = pluginStatus;
    }

    public PluginResponseInfo withUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
        return this;
    }

    /**
     * 插件升级状态
     * @return upgradeStatus
     */
    public String getUpgradeStatus() {
        return upgradeStatus;
    }

    public void setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginResponseInfo that = (PluginResponseInfo) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.pluginVersion, that.pluginVersion)
            && Objects.equals(this.pluginStatus, that.pluginStatus)
            && Objects.equals(this.upgradeStatus, that.upgradeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName,
            hostId,
            privateIp,
            publicIp,
            osType,
            pluginName,
            pluginVersion,
            pluginStatus,
            upgradeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginResponseInfo {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    pluginStatus: ").append(toIndentedString(pluginStatus)).append("\n");
        sb.append("    upgradeStatus: ").append(toIndentedString(upgradeStatus)).append("\n");
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
