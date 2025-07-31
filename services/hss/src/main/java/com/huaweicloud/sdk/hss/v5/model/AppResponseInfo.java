package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 软件信息
 */
public class AppResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent_scan_time")

    private Long recentScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    public AppResponseInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: Agent ID **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AppResponseInfo withHostId(String hostId) {
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

    public AppResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public AppResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**: 主机IP **取值范围**: 字符长度1-128位 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public AppResponseInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**: 软件名称 **取值范围**: 字符长度1-256位 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppResponseInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 版本号 **取值范围**: 字符长度1-128位 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AppResponseInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**: 更新时间，最近一次更新的时间，用毫秒表示 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 2147483647
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public AppResponseInfo withRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间，用毫秒表示 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 2147483647
     * @return recentScanTime
     */
    public Long getRecentScanTime() {
        return recentScanTime;
    }

    public void setRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
    }

    public AppResponseInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 容器ID **取值范围**: 字符长度1-128位 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public AppResponseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**： 容器实例名称 **取值范围**： 字符长度1-256位 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppResponseInfo that = (AppResponseInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.recentScanTime, that.recentScanTime)
            && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            hostId,
            hostName,
            hostIp,
            appName,
            version,
            updateTime,
            recentScanTime,
            containerId,
            containerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppResponseInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    recentScanTime: ").append(toIndentedString(recentScanTime)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
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
