//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

public class CreateTokenResponse extends SdkResponse {

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("accessToken")
    private String accessToken;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("tokenIp")
    private String tokenIp;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("validPeriod")
    private Long validPeriod;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("expireTime")
    private Long expireTime;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("user")
    private UserInfo user = null;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("clientType")
    private Integer clientType;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("forceLoginInd")
    private Integer forceLoginInd;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("firstLogin")
    private Boolean firstLogin = false;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("pwdExpired")
    private Boolean pwdExpired = false;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("daysPwdAvailable")
    private Integer daysPwdAvailable;

    public CreateTokenResponse withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public CreateTokenResponse withTokenIp(String tokenIp) {
        this.tokenIp = tokenIp;
        return this;
    }

    public String getTokenIp() {
        return this.tokenIp;
    }

    public void setTokenIp(String tokenIp) {
        this.tokenIp = tokenIp;
    }

    public CreateTokenResponse withValidPeriod(Long validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }

    public Long getValidPeriod() {
        return this.validPeriod;
    }

    public void setValidPeriod(Long validPeriod) {
        this.validPeriod = validPeriod;
    }

    public CreateTokenResponse withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public Long getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public CreateTokenResponse withUser(UserInfo user) {
        this.user = user;
        return this;
    }

    public CreateTokenResponse withUser(Consumer<UserInfo> userSetter) {
        if (this.user == null) {
            this.user = new UserInfo();
        }

        userSetter.accept(this.user);
        return this;
    }

    public UserInfo getUser() {
        return this.user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public CreateTokenResponse withClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }

    public Integer getClientType() {
        return this.clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public CreateTokenResponse withForceLoginInd(Integer forceLoginInd) {
        this.forceLoginInd = forceLoginInd;
        return this;
    }

    public Integer getForceLoginInd() {
        return this.forceLoginInd;
    }

    public void setForceLoginInd(Integer forceLoginInd) {
        this.forceLoginInd = forceLoginInd;
    }

    public CreateTokenResponse withFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
        return this;
    }

    public Boolean getFirstLogin() {
        return this.firstLogin;
    }

    public void setFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    public CreateTokenResponse withPwdExpired(Boolean pwdExpired) {
        this.pwdExpired = pwdExpired;
        return this;
    }

    public Boolean getPwdExpired() {
        return this.pwdExpired;
    }

    public void setPwdExpired(Boolean pwdExpired) {
        this.pwdExpired = pwdExpired;
    }

    public CreateTokenResponse withDaysPwdAvailable(Integer daysPwdAvailable) {
        this.daysPwdAvailable = daysPwdAvailable;
        return this;
    }

    public Integer getDaysPwdAvailable() {
        return this.daysPwdAvailable;
    }

    public void setDaysPwdAvailable(Integer daysPwdAvailable) {
        this.daysPwdAvailable = daysPwdAvailable;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            CreateTokenResponse createTokenResponse = (CreateTokenResponse) o;
            return Objects.equals(this.accessToken, createTokenResponse.accessToken)
                && Objects.equals(this.tokenIp, createTokenResponse.tokenIp)
                && Objects.equals(this.validPeriod, createTokenResponse.validPeriod)
                && Objects.equals(this.expireTime, createTokenResponse.expireTime)
                && Objects.equals(this.user, createTokenResponse.user)
                && Objects.equals(this.clientType, createTokenResponse.clientType)
                && Objects.equals(this.forceLoginInd, createTokenResponse.forceLoginInd)
                && Objects.equals(this.firstLogin, createTokenResponse.firstLogin)
                && Objects.equals(this.pwdExpired, createTokenResponse.pwdExpired)
                && Objects.equals(this.daysPwdAvailable, createTokenResponse.daysPwdAvailable);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(
            new Object[] {this.accessToken, this.tokenIp, this.validPeriod, this.expireTime, this.user, this.clientType,
                          this.forceLoginInd, this.firstLogin, this.pwdExpired, this.daysPwdAvailable});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTokenResponse {\n");
        sb.append("    accessToken: ").append(this.toIndentedString(this.accessToken)).append("\n");
        sb.append("    tokenIp: ").append(this.toIndentedString(this.tokenIp)).append("\n");
        sb.append("    validPeriod: ").append(this.toIndentedString(this.validPeriod)).append("\n");
        sb.append("    expireTime: ").append(this.toIndentedString(this.expireTime)).append("\n");
        sb.append("    user: ").append(this.toIndentedString(this.user)).append("\n");
        sb.append("    clientType: ").append(this.toIndentedString(this.clientType)).append("\n");
        sb.append("    forceLoginInd: ").append(this.toIndentedString(this.forceLoginInd)).append("\n");
        sb.append("    firstLogin: ").append(this.toIndentedString(this.firstLogin)).append("\n");
        sb.append("    pwdExpired: ").append(this.toIndentedString(this.pwdExpired)).append("\n");
        sb.append("    daysPwdAvailable: ").append(this.toIndentedString(this.daysPwdAvailable)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
