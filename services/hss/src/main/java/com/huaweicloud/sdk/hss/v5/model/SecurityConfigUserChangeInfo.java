package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 主机账户的历史变动记录
 */
public class SecurityConfigUserChangeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private String changeType;

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
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    public SecurityConfigUserChangeInfo withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * **参数解释**： 主机账户历史变动类型 **取值范围**： - add：添加 - delete：删除 - modify：修改 
     * @return changeType
     */
    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public SecurityConfigUserChangeInfo withLoginPermission(Boolean loginPermission) {
        this.loginPermission = loginPermission;
        return this;
    }

    /**
     * **参数解释**： 是否有登陆权限 **取值范围**： - true：有登录权限 - false：无登录权限 
     * @return loginPermission
     */
    public Boolean getLoginPermission() {
        return loginPermission;
    }

    public void setLoginPermission(Boolean loginPermission) {
        this.loginPermission = loginPermission;
    }

    public SecurityConfigUserChangeInfo withRootPermission(Boolean rootPermission) {
        this.rootPermission = rootPermission;
        return this;
    }

    /**
     * **参数解释**： 是否有root权限 **取值范围**： - true：有root权限 - false：无root权限 
     * @return rootPermission
     */
    public Boolean getRootPermission() {
        return rootPermission;
    }

    public void setRootPermission(Boolean rootPermission) {
        this.rootPermission = rootPermission;
    }

    public SecurityConfigUserChangeInfo withUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }

    /**
     * **参数解释**： 用户组 **取值范围**： 不涉及 
     * @return userGroupName
     */
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public SecurityConfigUserChangeInfo withUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
        return this;
    }

    /**
     * **参数解释**： 用户目录 **取值范围**： 不涉及 
     * @return userHomeDir
     */
    public String getUserHomeDir() {
        return userHomeDir;
    }

    public void setUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
    }

    public SecurityConfigUserChangeInfo withShell(String shell) {
        this.shell = shell;
        return this;
    }

    /**
     * **参数解释**： 用户启动shell **取值范围**： 不涉及 
     * @return shell
     */
    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public SecurityConfigUserChangeInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 用户名 **取值范围**： 不涉及 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SecurityConfigUserChangeInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 最新扫描时间，采用时间戳，默认毫秒 **取值范围**： 不涉及 
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityConfigUserChangeInfo that = (SecurityConfigUserChangeInfo) obj;
        return Objects.equals(this.changeType, that.changeType)
            && Objects.equals(this.loginPermission, that.loginPermission)
            && Objects.equals(this.rootPermission, that.rootPermission)
            && Objects.equals(this.userGroupName, that.userGroupName)
            && Objects.equals(this.userHomeDir, that.userHomeDir) && Objects.equals(this.shell, that.shell)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.scanTime, that.scanTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(changeType, loginPermission, rootPermission, userGroupName, userHomeDir, shell, userName, scanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityConfigUserChangeInfo {\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    loginPermission: ").append(toIndentedString(loginPermission)).append("\n");
        sb.append("    rootPermission: ").append(toIndentedString(rootPermission)).append("\n");
        sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
        sb.append("    userHomeDir: ").append(toIndentedString(userHomeDir)).append("\n");
        sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
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
