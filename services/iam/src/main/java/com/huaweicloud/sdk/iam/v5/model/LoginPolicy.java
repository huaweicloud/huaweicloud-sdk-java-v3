package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 登录策略。
 */
public class LoginPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_validity_period")

    private Integer userValidityPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_info_for_login")

    private String customInfoForLogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockout_duration")

    private Integer lockoutDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_failed_times")

    private Integer loginFailedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_with_login_failures")

    private Integer periodWithLoginFailures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_timeout")

    private Integer sessionTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_recent_login_info")

    private Boolean showRecentLoginInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_address_netmasks")

    private List<AllowAddressNetmask> allowAddressNetmasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_ip_ranges")

    private List<AllowIpRange> allowIpRanges = null;

    public LoginPolicy withUserValidityPeriod(Integer userValidityPeriod) {
        this.userValidityPeriod = userValidityPeriod;
        return this;
    }

    /**
     * 如果IAM用户在该值设置的有效期（天）内未登录，则被停用，不适用于根用户。
     * @return userValidityPeriod
     */
    public Integer getUserValidityPeriod() {
        return userValidityPeriod;
    }

    public void setUserValidityPeriod(Integer userValidityPeriod) {
        this.userValidityPeriod = userValidityPeriod;
    }

    public LoginPolicy withCustomInfoForLogin(String customInfoForLogin) {
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

    public LoginPolicy withLockoutDuration(Integer lockoutDuration) {
        this.lockoutDuration = lockoutDuration;
        return this;
    }

    /**
     * IAM用户登录锁定时长（分钟）。
     * @return lockoutDuration
     */
    public Integer getLockoutDuration() {
        return lockoutDuration;
    }

    public void setLockoutDuration(Integer lockoutDuration) {
        this.lockoutDuration = lockoutDuration;
    }

    public LoginPolicy withLoginFailedTimes(Integer loginFailedTimes) {
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

    public LoginPolicy withPeriodWithLoginFailures(Integer periodWithLoginFailures) {
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

    public LoginPolicy withSessionTimeout(Integer sessionTimeout) {
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

    public LoginPolicy withShowRecentLoginInfo(Boolean showRecentLoginInfo) {
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

    public LoginPolicy withAllowAddressNetmasks(List<AllowAddressNetmask> allowAddressNetmasks) {
        this.allowAddressNetmasks = allowAddressNetmasks;
        return this;
    }

    public LoginPolicy addAllowAddressNetmasksItem(AllowAddressNetmask allowAddressNetmasksItem) {
        if (this.allowAddressNetmasks == null) {
            this.allowAddressNetmasks = new ArrayList<>();
        }
        this.allowAddressNetmasks.add(allowAddressNetmasksItem);
        return this;
    }

    public LoginPolicy withAllowAddressNetmasks(Consumer<List<AllowAddressNetmask>> allowAddressNetmasksSetter) {
        if (this.allowAddressNetmasks == null) {
            this.allowAddressNetmasks = new ArrayList<>();
        }
        allowAddressNetmasksSetter.accept(this.allowAddressNetmasks);
        return this;
    }

    /**
     * 允许访问的IP地址或网段。
     * @return allowAddressNetmasks
     */
    public List<AllowAddressNetmask> getAllowAddressNetmasks() {
        return allowAddressNetmasks;
    }

    public void setAllowAddressNetmasks(List<AllowAddressNetmask> allowAddressNetmasks) {
        this.allowAddressNetmasks = allowAddressNetmasks;
    }

    public LoginPolicy withAllowIpRanges(List<AllowIpRange> allowIpRanges) {
        this.allowIpRanges = allowIpRanges;
        return this;
    }

    public LoginPolicy addAllowIpRangesItem(AllowIpRange allowIpRangesItem) {
        if (this.allowIpRanges == null) {
            this.allowIpRanges = new ArrayList<>();
        }
        this.allowIpRanges.add(allowIpRangesItem);
        return this;
    }

    public LoginPolicy withAllowIpRanges(Consumer<List<AllowIpRange>> allowIpRangesSetter) {
        if (this.allowIpRanges == null) {
            this.allowIpRanges = new ArrayList<>();
        }
        allowIpRangesSetter.accept(this.allowIpRanges);
        return this;
    }

    /**
     * 允许访问的IP地址区间。
     * @return allowIpRanges
     */
    public List<AllowIpRange> getAllowIpRanges() {
        return allowIpRanges;
    }

    public void setAllowIpRanges(List<AllowIpRange> allowIpRanges) {
        this.allowIpRanges = allowIpRanges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoginPolicy that = (LoginPolicy) obj;
        return Objects.equals(this.userValidityPeriod, that.userValidityPeriod)
            && Objects.equals(this.customInfoForLogin, that.customInfoForLogin)
            && Objects.equals(this.lockoutDuration, that.lockoutDuration)
            && Objects.equals(this.loginFailedTimes, that.loginFailedTimes)
            && Objects.equals(this.periodWithLoginFailures, that.periodWithLoginFailures)
            && Objects.equals(this.sessionTimeout, that.sessionTimeout)
            && Objects.equals(this.showRecentLoginInfo, that.showRecentLoginInfo)
            && Objects.equals(this.allowAddressNetmasks, that.allowAddressNetmasks)
            && Objects.equals(this.allowIpRanges, that.allowIpRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userValidityPeriod,
            customInfoForLogin,
            lockoutDuration,
            loginFailedTimes,
            periodWithLoginFailures,
            sessionTimeout,
            showRecentLoginInfo,
            allowAddressNetmasks,
            allowIpRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginPolicy {\n");
        sb.append("    userValidityPeriod: ").append(toIndentedString(userValidityPeriod)).append("\n");
        sb.append("    customInfoForLogin: ").append(toIndentedString(customInfoForLogin)).append("\n");
        sb.append("    lockoutDuration: ").append(toIndentedString(lockoutDuration)).append("\n");
        sb.append("    loginFailedTimes: ").append(toIndentedString(loginFailedTimes)).append("\n");
        sb.append("    periodWithLoginFailures: ").append(toIndentedString(periodWithLoginFailures)).append("\n");
        sb.append("    sessionTimeout: ").append(toIndentedString(sessionTimeout)).append("\n");
        sb.append("    showRecentLoginInfo: ").append(toIndentedString(showRecentLoginInfo)).append("\n");
        sb.append("    allowAddressNetmasks: ").append(toIndentedString(allowAddressNetmasks)).append("\n");
        sb.append("    allowIpRanges: ").append(toIndentedString(allowIpRanges)).append("\n");
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
