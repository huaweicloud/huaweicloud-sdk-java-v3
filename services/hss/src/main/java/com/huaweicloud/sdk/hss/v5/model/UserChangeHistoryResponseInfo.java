package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释** 账号变动历史信息 
 */
public class UserChangeHistoryResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private String changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

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
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent_scan_time")

    private Long recentScanTime;

    public UserChangeHistoryResponseInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释** agent标识 **取值范围** 长度1-128 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public UserChangeHistoryResponseInfo withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * **参数解释** 变更类型 **取值范围** - ADD ：添加 - DELETE ：删除 - MODIFY ： 修改 
     * @return changeType
     */
    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public UserChangeHistoryResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释** 主机ID **取值范围** 长度1-128 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public UserChangeHistoryResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释** 服务器名称 **取值范围** 长度1-128 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public UserChangeHistoryResponseInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释** 服务器私有IP **取值范围** 长度1-128 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public UserChangeHistoryResponseInfo withLoginPermission(Boolean loginPermission) {
        this.loginPermission = loginPermission;
        return this;
    }

    /**
     * **参数解释** 是否有登录权限 **取值范围** true: 具有登录权限 false: 不具有登录权限 
     * @return loginPermission
     */
    public Boolean getLoginPermission() {
        return loginPermission;
    }

    public void setLoginPermission(Boolean loginPermission) {
        this.loginPermission = loginPermission;
    }

    public UserChangeHistoryResponseInfo withRootPermission(Boolean rootPermission) {
        this.rootPermission = rootPermission;
        return this;
    }

    /**
     * **参数解释** 是否有root权限 **取值范围** true: 具有root权限 false: 不具有root权限 
     * @return rootPermission
     */
    public Boolean getRootPermission() {
        return rootPermission;
    }

    public void setRootPermission(Boolean rootPermission) {
        this.rootPermission = rootPermission;
    }

    public UserChangeHistoryResponseInfo withUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }

    /**
     * **参数解释** 用户组名称 **取值范围** 长度1-128 
     * @return userGroupName
     */
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public UserChangeHistoryResponseInfo withUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
        return this;
    }

    /**
     * **参数解释** 用户目录 **取值范围** 长度1-128 
     * @return userHomeDir
     */
    public String getUserHomeDir() {
        return userHomeDir;
    }

    public void setUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
    }

    public UserChangeHistoryResponseInfo withShell(String shell) {
        this.shell = shell;
        return this;
    }

    /**
     * **参数解释** 用户启动shell **取值范围** 长度1-128 
     * @return shell
     */
    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public UserChangeHistoryResponseInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释** 用户名称 **取值范围** 长度1-128 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserChangeHistoryResponseInfo withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * **参数解释** 到期时间，采用时间戳，默认毫秒 **取值范围** 长度0-4070880000000 
     * minimum: 0
     * maximum: 4070880000000
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public UserChangeHistoryResponseInfo withRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
        return this;
    }

    /**
     * **参数解释** 账号增加、修改、删除等操作的变更时间 **取值范围** 长度0-4070880000000 
     * minimum: 0
     * maximum: 4070880000000
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
        UserChangeHistoryResponseInfo that = (UserChangeHistoryResponseInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.changeType, that.changeType)
            && Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.loginPermission, that.loginPermission)
            && Objects.equals(this.rootPermission, that.rootPermission)
            && Objects.equals(this.userGroupName, that.userGroupName)
            && Objects.equals(this.userHomeDir, that.userHomeDir) && Objects.equals(this.shell, that.shell)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.recentScanTime, that.recentScanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            changeType,
            hostId,
            hostName,
            privateIp,
            loginPermission,
            rootPermission,
            userGroupName,
            userHomeDir,
            shell,
            userName,
            expireTime,
            recentScanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserChangeHistoryResponseInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    loginPermission: ").append(toIndentedString(loginPermission)).append("\n");
        sb.append("    rootPermission: ").append(toIndentedString(rootPermission)).append("\n");
        sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
        sb.append("    userHomeDir: ").append(toIndentedString(userHomeDir)).append("\n");
        sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
