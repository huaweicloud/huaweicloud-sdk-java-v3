package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 账号信息
 */
public class UserResponseInfo {

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
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_permission")

    private Boolean loginPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_permission")

    private Boolean rootPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_name")

    private String userGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_home_dir")

    private String userHomeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shell")

    private String shell;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent_scan_time")

    private Long recentScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    public UserResponseInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: Agent ID **取值范围**: 字符长度1-64位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public UserResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public UserResponseInfo withHostName(String hostName) {
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

    public UserResponseInfo withHostIp(String hostIp) {
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

    public UserResponseInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserResponseInfo withLoginPermission(Boolean loginPermission) {
        this.loginPermission = loginPermission;
        return this;
    }

    /**
     * **参数解释**: 是否允许登录 **约束限制**: 不涉及 **取值范围**: - true：是 - false：否  **默认取值**: 不涉及 
     * @return loginPermission
     */
    public Boolean getLoginPermission() {
        return loginPermission;
    }

    public void setLoginPermission(Boolean loginPermission) {
        this.loginPermission = loginPermission;
    }

    public UserResponseInfo withRootPermission(Boolean rootPermission) {
        this.rootPermission = rootPermission;
        return this;
    }

    /**
     * **参数解释**： 管理员权限 **取值范围**： - true：是 - false：否 
     * @return rootPermission
     */
    public Boolean getRootPermission() {
        return rootPermission;
    }

    public void setRootPermission(Boolean rootPermission) {
        this.rootPermission = rootPermission;
    }

    public UserResponseInfo withUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }

    /**
     * **参数解释**： 用户组 **取值范围**： 字符长度1-128位 
     * @return userGroupName
     */
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public UserResponseInfo withUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
        return this;
    }

    /**
     * **参数解释**： 用户目录 **取值范围**： 字符长度1-256位 
     * @return userHomeDir
     */
    public String getUserHomeDir() {
        return userHomeDir;
    }

    public void setUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
    }

    public UserResponseInfo withShell(String shell) {
        this.shell = shell;
        return this;
    }

    /**
     * **参数解释**: 用户启动shell **取值范围**: 字符长度1-128位 
     * @return shell
     */
    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public UserResponseInfo withRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return recentScanTime
     */
    public Long getRecentScanTime() {
        return recentScanTime;
    }

    public void setRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
    }

    public UserResponseInfo withFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * **参数解释**: 首次扫描时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstScanTime
     */
    public Long getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    public UserResponseInfo withContainerId(String containerId) {
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

    public UserResponseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**： 容器实例名称，只有容器类型的告警有 **取值范围**： 字符长度1-256位 
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
        UserResponseInfo that = (UserResponseInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.loginPermission, that.loginPermission)
            && Objects.equals(this.rootPermission, that.rootPermission)
            && Objects.equals(this.userGroupName, that.userGroupName)
            && Objects.equals(this.userHomeDir, that.userHomeDir) && Objects.equals(this.shell, that.shell)
            && Objects.equals(this.recentScanTime, that.recentScanTime)
            && Objects.equals(this.firstScanTime, that.firstScanTime)
            && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            hostId,
            hostName,
            hostIp,
            userName,
            loginPermission,
            rootPermission,
            userGroupName,
            userHomeDir,
            shell,
            recentScanTime,
            firstScanTime,
            containerId,
            containerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserResponseInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    loginPermission: ").append(toIndentedString(loginPermission)).append("\n");
        sb.append("    rootPermission: ").append(toIndentedString(rootPermission)).append("\n");
        sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
        sb.append("    userHomeDir: ").append(toIndentedString(userHomeDir)).append("\n");
        sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
        sb.append("    recentScanTime: ").append(toIndentedString(recentScanTime)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
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
