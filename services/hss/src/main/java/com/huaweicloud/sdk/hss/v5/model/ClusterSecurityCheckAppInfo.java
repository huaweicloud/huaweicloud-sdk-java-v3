package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 应用信息
 */
public class ClusterSecurityCheckAppInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent_scan_time")

    private Long recentScanTime;

    public ClusterSecurityCheckAppInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**： 软件名称 **取值范围**： 不涉及 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ClusterSecurityCheckAppInfo withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * **参数解释**： 软件版本 **取值范围**： 不涉及 
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public ClusterSecurityCheckAppInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**： 容器ID **取值范围**： 不涉及 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ClusterSecurityCheckAppInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**： 容器名称 **取值范围**： 不涉及 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ClusterSecurityCheckAppInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**： 节点名称 **取值范围**： 不涉及 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ClusterSecurityCheckAppInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**： 私有IP地址 **取值范围**： 不涉及 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ClusterSecurityCheckAppInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**： 公有IP地址 **取值范围**： 不涉及 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ClusterSecurityCheckAppInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 更新时间 **取值范围**： 不涉及 
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ClusterSecurityCheckAppInfo withRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
        return this;
    }

    /**
     * **参数解释**： 最近扫描时间 **取值范围**： 不涉及 
     * @return recentScanTime
     */
    public Long getRecentScanTime() {
        return recentScanTime;
    }

    public void setRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSecurityCheckAppInfo that = (ClusterSecurityCheckAppInfo) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.appVersion, that.appVersion)
            && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.recentScanTime, that.recentScanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName,
            appVersion,
            containerId,
            containerName,
            hostName,
            privateIp,
            publicIp,
            updateTime,
            recentScanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSecurityCheckAppInfo {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    recentScanTime: ").append(toIndentedString(recentScanTime)).append("\n");
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
