package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 用户调查取证信息 **取值范围**： 不涉及
 */
public class EventForensicInfoUserForensic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private Integer userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_gid")

    private Integer userGid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_name")

    private String userGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_home_dir")

    private String userHomeDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_ip")

    private String loginIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_port")

    private Integer servicePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_mode")

    private Integer loginMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_last_time")

    private Long loginLastTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_fail_count")

    private Integer loginFailCount;

    public EventForensicInfoUserForensic withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**： 用户uid **取值范围**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public EventForensicInfoUserForensic withUserGid(Integer userGid) {
        this.userGid = userGid;
        return this;
    }

    /**
     * **参数解释**： 用户gid **取值范围**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return userGid
     */
    public Integer getUserGid() {
        return userGid;
    }

    public void setUserGid(Integer userGid) {
        this.userGid = userGid;
    }

    public EventForensicInfoUserForensic withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**： 用户名称 **取值范围**： 不涉及
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public EventForensicInfoUserForensic withUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }

    /**
     * **参数解释**： 用户组名称 **取值范围**： 不涉及
     * @return userGroupName
     */
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public EventForensicInfoUserForensic withUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
        return this;
    }

    /**
     * **参数解释**： 用户home目录 **取值范围**： 不涉及
     * @return userHomeDir
     */
    public String getUserHomeDir() {
        return userHomeDir;
    }

    public void setUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
    }

    public EventForensicInfoUserForensic withLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    /**
     * **参数解释**： 用户登录ip **取值范围**： 不涉及
     * @return loginIp
     */
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public EventForensicInfoUserForensic withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * **参数解释**： 登录的服务类型 **取值范围**： 不涉及
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public EventForensicInfoUserForensic withServicePort(Integer servicePort) {
        this.servicePort = servicePort;
        return this;
    }

    /**
     * **参数解释**： 登录服务端口 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return servicePort
     */
    public Integer getServicePort() {
        return servicePort;
    }

    public void setServicePort(Integer servicePort) {
        this.servicePort = servicePort;
    }

    public EventForensicInfoUserForensic withLoginMode(Integer loginMode) {
        this.loginMode = loginMode;
        return this;
    }

    /**
     * **参数解释**： 登录方式 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return loginMode
     */
    public Integer getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(Integer loginMode) {
        this.loginMode = loginMode;
    }

    public EventForensicInfoUserForensic withLoginLastTime(Long loginLastTime) {
        this.loginLastTime = loginLastTime;
        return this;
    }

    /**
     * **参数解释**： 用户最后一次登录时间 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 9223372036854775807
     * @return loginLastTime
     */
    public Long getLoginLastTime() {
        return loginLastTime;
    }

    public void setLoginLastTime(Long loginLastTime) {
        this.loginLastTime = loginLastTime;
    }

    public EventForensicInfoUserForensic withLoginFailCount(Integer loginFailCount) {
        this.loginFailCount = loginFailCount;
        return this;
    }

    /**
     * **参数解释**： 用户登录失败次数 **取值范围**： 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return loginFailCount
     */
    public Integer getLoginFailCount() {
        return loginFailCount;
    }

    public void setLoginFailCount(Integer loginFailCount) {
        this.loginFailCount = loginFailCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfoUserForensic that = (EventForensicInfoUserForensic) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.userGid, that.userGid)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userGroupName, that.userGroupName)
            && Objects.equals(this.userHomeDir, that.userHomeDir) && Objects.equals(this.loginIp, that.loginIp)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.servicePort, that.servicePort)
            && Objects.equals(this.loginMode, that.loginMode) && Objects.equals(this.loginLastTime, that.loginLastTime)
            && Objects.equals(this.loginFailCount, that.loginFailCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId,
            userGid,
            userName,
            userGroupName,
            userHomeDir,
            loginIp,
            serviceType,
            servicePort,
            loginMode,
            loginLastTime,
            loginFailCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfoUserForensic {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userGid: ").append(toIndentedString(userGid)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
        sb.append("    userHomeDir: ").append(toIndentedString(userHomeDir)).append("\n");
        sb.append("    loginIp: ").append(toIndentedString(loginIp)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
        sb.append("    loginMode: ").append(toIndentedString(loginMode)).append("\n");
        sb.append("    loginLastTime: ").append(toIndentedString(loginLastTime)).append("\n");
        sb.append("    loginFailCount: ").append(toIndentedString(loginFailCount)).append("\n");
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
