package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户信息
 */
public class EventUserResponseInfo {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_hash")

    private String pwdHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_with_fuzzing")

    private String pwdWithFuzzing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_used_days")

    private Integer pwdUsedDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_min_days")

    private Integer pwdMinDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_max_days")

    private Integer pwdMaxDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_warn_left_days")

    private Integer pwdWarnLeftDays;

    public EventUserResponseInfo withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户uid
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

    public EventUserResponseInfo withUserGid(Integer userGid) {
        this.userGid = userGid;
        return this;
    }

    /**
     * 用户gid
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

    public EventUserResponseInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public EventUserResponseInfo withUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }

    /**
     * 用户组名称
     * @return userGroupName
     */
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public EventUserResponseInfo withUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
        return this;
    }

    /**
     * 用户home目录
     * @return userHomeDir
     */
    public String getUserHomeDir() {
        return userHomeDir;
    }

    public void setUserHomeDir(String userHomeDir) {
        this.userHomeDir = userHomeDir;
    }

    public EventUserResponseInfo withLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    /**
     * 用户登录ip
     * @return loginIp
     */
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public EventUserResponseInfo withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型，包含如下:   - system   - mysql   - redis
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public EventUserResponseInfo withServicePort(Integer servicePort) {
        this.servicePort = servicePort;
        return this;
    }

    /**
     * 登录服务端口
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

    public EventUserResponseInfo withLoginMode(Integer loginMode) {
        this.loginMode = loginMode;
        return this;
    }

    /**
     * 登录方式
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

    public EventUserResponseInfo withLoginLastTime(Long loginLastTime) {
        this.loginLastTime = loginLastTime;
        return this;
    }

    /**
     * 用户最后一次登录时间
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

    public EventUserResponseInfo withLoginFailCount(Integer loginFailCount) {
        this.loginFailCount = loginFailCount;
        return this;
    }

    /**
     * 用户登录失败次数
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

    public EventUserResponseInfo withPwdHash(String pwdHash) {
        this.pwdHash = pwdHash;
        return this;
    }

    /**
     * 口令hash
     * @return pwdHash
     */
    public String getPwdHash() {
        return pwdHash;
    }

    public void setPwdHash(String pwdHash) {
        this.pwdHash = pwdHash;
    }

    public EventUserResponseInfo withPwdWithFuzzing(String pwdWithFuzzing) {
        this.pwdWithFuzzing = pwdWithFuzzing;
        return this;
    }

    /**
     * 匿名化处理后的口令
     * @return pwdWithFuzzing
     */
    public String getPwdWithFuzzing() {
        return pwdWithFuzzing;
    }

    public void setPwdWithFuzzing(String pwdWithFuzzing) {
        this.pwdWithFuzzing = pwdWithFuzzing;
    }

    public EventUserResponseInfo withPwdUsedDays(Integer pwdUsedDays) {
        this.pwdUsedDays = pwdUsedDays;
        return this;
    }

    /**
     * 密码使用的天数
     * minimum: 0
     * maximum: 2147483647
     * @return pwdUsedDays
     */
    public Integer getPwdUsedDays() {
        return pwdUsedDays;
    }

    public void setPwdUsedDays(Integer pwdUsedDays) {
        this.pwdUsedDays = pwdUsedDays;
    }

    public EventUserResponseInfo withPwdMinDays(Integer pwdMinDays) {
        this.pwdMinDays = pwdMinDays;
        return this;
    }

    /**
     * 口令的最短有效期限
     * minimum: 0
     * maximum: 2147483647
     * @return pwdMinDays
     */
    public Integer getPwdMinDays() {
        return pwdMinDays;
    }

    public void setPwdMinDays(Integer pwdMinDays) {
        this.pwdMinDays = pwdMinDays;
    }

    public EventUserResponseInfo withPwdMaxDays(Integer pwdMaxDays) {
        this.pwdMaxDays = pwdMaxDays;
        return this;
    }

    /**
     * 口令的最长有效期限
     * minimum: 0
     * maximum: 2147483647
     * @return pwdMaxDays
     */
    public Integer getPwdMaxDays() {
        return pwdMaxDays;
    }

    public void setPwdMaxDays(Integer pwdMaxDays) {
        this.pwdMaxDays = pwdMaxDays;
    }

    public EventUserResponseInfo withPwdWarnLeftDays(Integer pwdWarnLeftDays) {
        this.pwdWarnLeftDays = pwdWarnLeftDays;
        return this;
    }

    /**
     * 口令无效时提前告警天数
     * minimum: 0
     * maximum: 2147483647
     * @return pwdWarnLeftDays
     */
    public Integer getPwdWarnLeftDays() {
        return pwdWarnLeftDays;
    }

    public void setPwdWarnLeftDays(Integer pwdWarnLeftDays) {
        this.pwdWarnLeftDays = pwdWarnLeftDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventUserResponseInfo that = (EventUserResponseInfo) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.userGid, that.userGid)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userGroupName, that.userGroupName)
            && Objects.equals(this.userHomeDir, that.userHomeDir) && Objects.equals(this.loginIp, that.loginIp)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.servicePort, that.servicePort)
            && Objects.equals(this.loginMode, that.loginMode) && Objects.equals(this.loginLastTime, that.loginLastTime)
            && Objects.equals(this.loginFailCount, that.loginFailCount) && Objects.equals(this.pwdHash, that.pwdHash)
            && Objects.equals(this.pwdWithFuzzing, that.pwdWithFuzzing)
            && Objects.equals(this.pwdUsedDays, that.pwdUsedDays) && Objects.equals(this.pwdMinDays, that.pwdMinDays)
            && Objects.equals(this.pwdMaxDays, that.pwdMaxDays)
            && Objects.equals(this.pwdWarnLeftDays, that.pwdWarnLeftDays);
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
            loginFailCount,
            pwdHash,
            pwdWithFuzzing,
            pwdUsedDays,
            pwdMinDays,
            pwdMaxDays,
            pwdWarnLeftDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventUserResponseInfo {\n");
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
        sb.append("    pwdHash: ").append(toIndentedString(pwdHash)).append("\n");
        sb.append("    pwdWithFuzzing: ").append(toIndentedString(pwdWithFuzzing)).append("\n");
        sb.append("    pwdUsedDays: ").append(toIndentedString(pwdUsedDays)).append("\n");
        sb.append("    pwdMinDays: ").append(toIndentedString(pwdMinDays)).append("\n");
        sb.append("    pwdMaxDays: ").append(toIndentedString(pwdMaxDays)).append("\n");
        sb.append("    pwdWarnLeftDays: ").append(toIndentedString(pwdWarnLeftDays)).append("\n");
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
