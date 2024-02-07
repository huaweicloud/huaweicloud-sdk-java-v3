package com.huaweicloud.sdk.orgid.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CAS3.0认证成功响应属性
 */
public class CasAuthenticationSuccessAttributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authenticationDate")

    private String authenticationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longTermAuthenticationRequestTokenUsed")

    private Boolean longTermAuthenticationRequestTokenUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isFromNewLogin")

    private Boolean isFromNewLogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo")

    private String logo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayName")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    public CasAuthenticationSuccessAttributes withAuthenticationDate(String authenticationDate) {
        this.authenticationDate = authenticationDate;
        return this;
    }

    /**
     * 认证时间
     * @return authenticationDate
     */
    public String getAuthenticationDate() {
        return authenticationDate;
    }

    public void setAuthenticationDate(String authenticationDate) {
        this.authenticationDate = authenticationDate;
    }

    public CasAuthenticationSuccessAttributes withLongTermAuthenticationRequestTokenUsed(
        Boolean longTermAuthenticationRequestTokenUsed) {
        this.longTermAuthenticationRequestTokenUsed = longTermAuthenticationRequestTokenUsed;
        return this;
    }

    /**
     * longTermAuthenticationRequestTokenUsed
     * @return longTermAuthenticationRequestTokenUsed
     */
    public Boolean getLongTermAuthenticationRequestTokenUsed() {
        return longTermAuthenticationRequestTokenUsed;
    }

    public void setLongTermAuthenticationRequestTokenUsed(Boolean longTermAuthenticationRequestTokenUsed) {
        this.longTermAuthenticationRequestTokenUsed = longTermAuthenticationRequestTokenUsed;
    }

    public CasAuthenticationSuccessAttributes withIsFromNewLogin(Boolean isFromNewLogin) {
        this.isFromNewLogin = isFromNewLogin;
        return this;
    }

    /**
     * isFromNewLogin
     * @return isFromNewLogin
     */
    public Boolean getIsFromNewLogin() {
        return isFromNewLogin;
    }

    public void setIsFromNewLogin(Boolean isFromNewLogin) {
        this.isFromNewLogin = isFromNewLogin;
    }

    public CasAuthenticationSuccessAttributes withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 用户获取用户信息的token
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CasAuthenticationSuccessAttributes withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * 用户头像URL
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public CasAuthenticationSuccessAttributes withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 用户显示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CasAuthenticationSuccessAttributes withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 华为账号uid
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CasAuthenticationSuccessAttributes that = (CasAuthenticationSuccessAttributes) obj;
        return Objects.equals(this.authenticationDate, that.authenticationDate)
            && Objects.equals(this.longTermAuthenticationRequestTokenUsed, that.longTermAuthenticationRequestTokenUsed)
            && Objects.equals(this.isFromNewLogin, that.isFromNewLogin) && Objects.equals(this.token, that.token)
            && Objects.equals(this.logo, that.logo) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.uid, that.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationDate,
            longTermAuthenticationRequestTokenUsed,
            isFromNewLogin,
            token,
            logo,
            displayName,
            uid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CasAuthenticationSuccessAttributes {\n");
        sb.append("    authenticationDate: ").append(toIndentedString(authenticationDate)).append("\n");
        sb.append("    longTermAuthenticationRequestTokenUsed: ")
            .append(toIndentedString(longTermAuthenticationRequestTokenUsed))
            .append("\n");
        sb.append("    isFromNewLogin: ").append(toIndentedString(isFromNewLogin)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
