package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class LoginPolicyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_validity_period")

    @JacksonXmlProperty(localName = "account_validity_period")

    private Integer accountValidityPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_info_for_login")

    @JacksonXmlProperty(localName = "custom_info_for_login")

    private String customInfoForLogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockout_duration")

    @JacksonXmlProperty(localName = "lockout_duration")

    private Integer lockoutDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_failed_times")

    @JacksonXmlProperty(localName = "login_failed_times")

    private Integer loginFailedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_with_login_failures")

    @JacksonXmlProperty(localName = "period_with_login_failures")

    private Integer periodWithLoginFailures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_timeout")

    @JacksonXmlProperty(localName = "session_timeout")

    private Integer sessionTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_recent_login_info")

    @JacksonXmlProperty(localName = "show_recent_login_info")

    private Boolean showRecentLoginInfo;

    public LoginPolicyResult withAccountValidityPeriod(Integer accountValidityPeriod) {
        this.accountValidityPeriod = accountValidityPeriod;
        return this;
    }

    /**
     * 账号在该值设置的有效期内未使用，则被停用。
     * @return accountValidityPeriod
     */
    public Integer getAccountValidityPeriod() {
        return accountValidityPeriod;
    }

    public void setAccountValidityPeriod(Integer accountValidityPeriod) {
        this.accountValidityPeriod = accountValidityPeriod;
    }

    public LoginPolicyResult withCustomInfoForLogin(String customInfoForLogin) {
        this.customInfoForLogin = customInfoForLogin;
        return this;
    }

    /**
     * 登录提示信息。
     * @return customInfoForLogin
     */
    public String getCustomInfoForLogin() {
        return customInfoForLogin;
    }

    public void setCustomInfoForLogin(String customInfoForLogin) {
        this.customInfoForLogin = customInfoForLogin;
    }

    public LoginPolicyResult withLockoutDuration(Integer lockoutDuration) {
        this.lockoutDuration = lockoutDuration;
        return this;
    }

    /**
     * 帐号锁定时长（分钟）。
     * @return lockoutDuration
     */
    public Integer getLockoutDuration() {
        return lockoutDuration;
    }

    public void setLockoutDuration(Integer lockoutDuration) {
        this.lockoutDuration = lockoutDuration;
    }

    public LoginPolicyResult withLoginFailedTimes(Integer loginFailedTimes) {
        this.loginFailedTimes = loginFailedTimes;
        return this;
    }

    /**
     * 限定时间内登录失败次数。
     * @return loginFailedTimes
     */
    public Integer getLoginFailedTimes() {
        return loginFailedTimes;
    }

    public void setLoginFailedTimes(Integer loginFailedTimes) {
        this.loginFailedTimes = loginFailedTimes;
    }

    public LoginPolicyResult withPeriodWithLoginFailures(Integer periodWithLoginFailures) {
        this.periodWithLoginFailures = periodWithLoginFailures;
        return this;
    }

    /**
     * 限定时间长度（分钟）。
     * @return periodWithLoginFailures
     */
    public Integer getPeriodWithLoginFailures() {
        return periodWithLoginFailures;
    }

    public void setPeriodWithLoginFailures(Integer periodWithLoginFailures) {
        this.periodWithLoginFailures = periodWithLoginFailures;
    }

    public LoginPolicyResult withSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }

    /**
     * 登录会话失效时间。
     * @return sessionTimeout
     */
    public Integer getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public LoginPolicyResult withShowRecentLoginInfo(Boolean showRecentLoginInfo) {
        this.showRecentLoginInfo = showRecentLoginInfo;
        return this;
    }

    /**
     * 是否显示最近一次的登录信息。
     * @return showRecentLoginInfo
     */
    public Boolean getShowRecentLoginInfo() {
        return showRecentLoginInfo;
    }

    public void setShowRecentLoginInfo(Boolean showRecentLoginInfo) {
        this.showRecentLoginInfo = showRecentLoginInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginPolicyResult loginPolicyResult = (LoginPolicyResult) o;
        return Objects.equals(this.accountValidityPeriod, loginPolicyResult.accountValidityPeriod)
            && Objects.equals(this.customInfoForLogin, loginPolicyResult.customInfoForLogin)
            && Objects.equals(this.lockoutDuration, loginPolicyResult.lockoutDuration)
            && Objects.equals(this.loginFailedTimes, loginPolicyResult.loginFailedTimes)
            && Objects.equals(this.periodWithLoginFailures, loginPolicyResult.periodWithLoginFailures)
            && Objects.equals(this.sessionTimeout, loginPolicyResult.sessionTimeout)
            && Objects.equals(this.showRecentLoginInfo, loginPolicyResult.showRecentLoginInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountValidityPeriod,
            customInfoForLogin,
            lockoutDuration,
            loginFailedTimes,
            periodWithLoginFailures,
            sessionTimeout,
            showRecentLoginInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginPolicyResult {\n");
        sb.append("    accountValidityPeriod: ").append(toIndentedString(accountValidityPeriod)).append("\n");
        sb.append("    customInfoForLogin: ").append(toIndentedString(customInfoForLogin)).append("\n");
        sb.append("    lockoutDuration: ").append(toIndentedString(lockoutDuration)).append("\n");
        sb.append("    loginFailedTimes: ").append(toIndentedString(loginFailedTimes)).append("\n");
        sb.append("    periodWithLoginFailures: ").append(toIndentedString(periodWithLoginFailures)).append("\n");
        sb.append("    sessionTimeout: ").append(toIndentedString(sessionTimeout)).append("\n");
        sb.append("    showRecentLoginInfo: ").append(toIndentedString(showRecentLoginInfo)).append("\n");
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
