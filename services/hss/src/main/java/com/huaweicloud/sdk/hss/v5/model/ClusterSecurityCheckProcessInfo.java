package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 进程信息
 */
public class ClusterSecurityCheckProcessInfo {

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
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private String permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "launch_params")

    private String launchParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    public ClusterSecurityCheckProcessInfo withContainerId(String containerId) {
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

    public ClusterSecurityCheckProcessInfo withContainerName(String containerName) {
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

    public ClusterSecurityCheckProcessInfo withHostName(String hostName) {
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

    public ClusterSecurityCheckProcessInfo withPrivateIp(String privateIp) {
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

    public ClusterSecurityCheckProcessInfo withPublicIp(String publicIp) {
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

    public ClusterSecurityCheckProcessInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 启动时间 **取值范围**： 不涉及 
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ClusterSecurityCheckProcessInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**： 进程PID **取值范围**： 不涉及 
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public ClusterSecurityCheckProcessInfo withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * **参数解释**： 文件权限 **取值范围**： 不涉及 
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public ClusterSecurityCheckProcessInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 运行用户 **取值范围**： 不涉及 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ClusterSecurityCheckProcessInfo withLaunchParams(String launchParams) {
        this.launchParams = launchParams;
        return this;
    }

    /**
     * **参数解释**： 启动参数 **取值范围**： 不涉及 
     * @return launchParams
     */
    public String getLaunchParams() {
        return launchParams;
    }

    public void setLaunchParams(String launchParams) {
        this.launchParams = launchParams;
    }

    public ClusterSecurityCheckProcessInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * **参数解释**： 文件hash **取值范围**： 不涉及 
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterSecurityCheckProcessInfo that = (ClusterSecurityCheckProcessInfo) obj;
        return Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.permission, that.permission) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.launchParams, that.launchParams) && Objects.equals(this.hash, that.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerId,
            containerName,
            hostName,
            privateIp,
            publicIp,
            startTime,
            pid,
            permission,
            userName,
            launchParams,
            hash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterSecurityCheckProcessInfo {\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    launchParams: ").append(toIndentedString(launchParams)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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
