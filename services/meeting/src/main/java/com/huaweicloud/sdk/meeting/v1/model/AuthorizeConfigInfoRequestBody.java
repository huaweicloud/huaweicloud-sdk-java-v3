package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** AuthorizeConfigInfoRequestBody */
public class AuthorizeConfigInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableSSO")

    private Boolean enableSSO;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizeUrl")

    private String authorizeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "getTokenUrl")

    private String getTokenUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientId")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientSecret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accFieldName")

    private String accFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "getUserInfoUrl")

    private String getUserInfoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth2ServerType")

    private Integer oauth2ServerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcSchemaUrl")

    private String pcSchemaUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "androidSchemaUrl")

    private String androidSchemaUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iosSchemaUrl")

    private String iosSchemaUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdName")

    private String thirdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdEmail")

    private String thirdEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdMobile")

    private String thirdMobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdAccessToken")

    private String thirdAccessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdHeadImgUrl")

    private String thirdHeadImgUrl;

    public AuthorizeConfigInfoRequestBody withEnableSSO(Boolean enableSSO) {
        this.enableSSO = enableSSO;
        return this;
    }

    /** 是否开启SSO登录
     * 
     * @return enableSSO */
    public Boolean getEnableSSO() {
        return enableSSO;
    }

    public void setEnableSSO(Boolean enableSSO) {
        this.enableSSO = enableSSO;
    }

    public AuthorizeConfigInfoRequestBody withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 企业域名 说明：开启SSO登录时必填
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public AuthorizeConfigInfoRequestBody withAuthorizeUrl(String authorizeUrl) {
        this.authorizeUrl = authorizeUrl;
        return this;
    }

    /** Oauth2授权地址 说明：开启SSO登录时必填
     * 
     * @return authorizeUrl */
    public String getAuthorizeUrl() {
        return authorizeUrl;
    }

    public void setAuthorizeUrl(String authorizeUrl) {
        this.authorizeUrl = authorizeUrl;
    }

    public AuthorizeConfigInfoRequestBody withGetTokenUrl(String getTokenUrl) {
        this.getTokenUrl = getTokenUrl;
        return this;
    }

    /** 获取Token URL 说明：开启SSO登录时必填
     * 
     * @return getTokenUrl */
    public String getGetTokenUrl() {
        return getTokenUrl;
    }

    public void setGetTokenUrl(String getTokenUrl) {
        this.getTokenUrl = getTokenUrl;
    }

    public AuthorizeConfigInfoRequestBody withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /** APPID 说明：开启SSO登录时必填
     * 
     * @return clientId */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public AuthorizeConfigInfoRequestBody withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /** APP秘钥 说明：开启SSO登录时，若不修改APP秘钥，则置空即可
     * 
     * @return clientSecret */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public AuthorizeConfigInfoRequestBody withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /** 授权范围，OAuth2.0的OIDC取值为“openid”
     * 
     * @return scope */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public AuthorizeConfigInfoRequestBody withAccFieldName(String accFieldName) {
        this.accFieldName = accFieldName;
        return this;
    }

    /** 第三方账号的字段名称 说明：开启SSO登录时必填
     * 
     * @return accFieldName */
    public String getAccFieldName() {
        return accFieldName;
    }

    public void setAccFieldName(String accFieldName) {
        this.accFieldName = accFieldName;
    }

    public AuthorizeConfigInfoRequestBody withGetUserInfoUrl(String getUserInfoUrl) {
        this.getUserInfoUrl = getUserInfoUrl;
        return this;
    }

    /** 用户信息查询URL
     * 
     * @return getUserInfoUrl */
    public String getGetUserInfoUrl() {
        return getUserInfoUrl;
    }

    public void setGetUserInfoUrl(String getUserInfoUrl) {
        this.getUserInfoUrl = getUserInfoUrl;
    }

    public AuthorizeConfigInfoRequestBody withOauth2ServerType(Integer oauth2ServerType) {
        this.oauth2ServerType = oauth2ServerType;
        return this;
    }

    /** 鉴权类型。OAuth2.0鉴权时取0 minimum: 0 maximum: 255
     * 
     * @return oauth2ServerType */
    public Integer getOauth2ServerType() {
        return oauth2ServerType;
    }

    public void setOauth2ServerType(Integer oauth2ServerType) {
        this.oauth2ServerType = oauth2ServerType;
    }

    public AuthorizeConfigInfoRequestBody withPcSchemaUrl(String pcSchemaUrl) {
        this.pcSchemaUrl = pcSchemaUrl;
        return this;
    }

    /** 拉起PC端终端的schema
     * 
     * @return pcSchemaUrl */
    public String getPcSchemaUrl() {
        return pcSchemaUrl;
    }

    public void setPcSchemaUrl(String pcSchemaUrl) {
        this.pcSchemaUrl = pcSchemaUrl;
    }

    public AuthorizeConfigInfoRequestBody withAndroidSchemaUrl(String androidSchemaUrl) {
        this.androidSchemaUrl = androidSchemaUrl;
        return this;
    }

    /** 拉起安卓端终端的schema
     * 
     * @return androidSchemaUrl */
    public String getAndroidSchemaUrl() {
        return androidSchemaUrl;
    }

    public void setAndroidSchemaUrl(String androidSchemaUrl) {
        this.androidSchemaUrl = androidSchemaUrl;
    }

    public AuthorizeConfigInfoRequestBody withIosSchemaUrl(String iosSchemaUrl) {
        this.iosSchemaUrl = iosSchemaUrl;
        return this;
    }

    /** 拉起ios端终端的schema
     * 
     * @return iosSchemaUrl */
    public String getIosSchemaUrl() {
        return iosSchemaUrl;
    }

    public void setIosSchemaUrl(String iosSchemaUrl) {
        this.iosSchemaUrl = iosSchemaUrl;
    }

    public AuthorizeConfigInfoRequestBody withThirdName(String thirdName) {
        this.thirdName = thirdName;
        return this;
    }

    /** 第三方姓名的字段名称
     * 
     * @return thirdName */
    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public AuthorizeConfigInfoRequestBody withThirdEmail(String thirdEmail) {
        this.thirdEmail = thirdEmail;
        return this;
    }

    /** 第三方邮箱的字段名称
     * 
     * @return thirdEmail */
    public String getThirdEmail() {
        return thirdEmail;
    }

    public void setThirdEmail(String thirdEmail) {
        this.thirdEmail = thirdEmail;
    }

    public AuthorizeConfigInfoRequestBody withThirdMobile(String thirdMobile) {
        this.thirdMobile = thirdMobile;
        return this;
    }

    /** 第三方手机号的字段名称
     * 
     * @return thirdMobile */
    public String getThirdMobile() {
        return thirdMobile;
    }

    public void setThirdMobile(String thirdMobile) {
        this.thirdMobile = thirdMobile;
    }

    public AuthorizeConfigInfoRequestBody withThirdAccessToken(String thirdAccessToken) {
        this.thirdAccessToken = thirdAccessToken;
        return this;
    }

    /** 第三方accessToken的字段名称 说明：开启SSO登录时必填
     * 
     * @return thirdAccessToken */
    public String getThirdAccessToken() {
        return thirdAccessToken;
    }

    public void setThirdAccessToken(String thirdAccessToken) {
        this.thirdAccessToken = thirdAccessToken;
    }

    public AuthorizeConfigInfoRequestBody withThirdHeadImgUrl(String thirdHeadImgUrl) {
        this.thirdHeadImgUrl = thirdHeadImgUrl;
        return this;
    }

    /** 第三方头像链接的字段名称
     * 
     * @return thirdHeadImgUrl */
    public String getThirdHeadImgUrl() {
        return thirdHeadImgUrl;
    }

    public void setThirdHeadImgUrl(String thirdHeadImgUrl) {
        this.thirdHeadImgUrl = thirdHeadImgUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizeConfigInfoRequestBody authorizeConfigInfoRequestBody = (AuthorizeConfigInfoRequestBody) o;
        return Objects.equals(this.enableSSO, authorizeConfigInfoRequestBody.enableSSO)
            && Objects.equals(this.domain, authorizeConfigInfoRequestBody.domain)
            && Objects.equals(this.authorizeUrl, authorizeConfigInfoRequestBody.authorizeUrl)
            && Objects.equals(this.getTokenUrl, authorizeConfigInfoRequestBody.getTokenUrl)
            && Objects.equals(this.clientId, authorizeConfigInfoRequestBody.clientId)
            && Objects.equals(this.clientSecret, authorizeConfigInfoRequestBody.clientSecret)
            && Objects.equals(this.scope, authorizeConfigInfoRequestBody.scope)
            && Objects.equals(this.accFieldName, authorizeConfigInfoRequestBody.accFieldName)
            && Objects.equals(this.getUserInfoUrl, authorizeConfigInfoRequestBody.getUserInfoUrl)
            && Objects.equals(this.oauth2ServerType, authorizeConfigInfoRequestBody.oauth2ServerType)
            && Objects.equals(this.pcSchemaUrl, authorizeConfigInfoRequestBody.pcSchemaUrl)
            && Objects.equals(this.androidSchemaUrl, authorizeConfigInfoRequestBody.androidSchemaUrl)
            && Objects.equals(this.iosSchemaUrl, authorizeConfigInfoRequestBody.iosSchemaUrl)
            && Objects.equals(this.thirdName, authorizeConfigInfoRequestBody.thirdName)
            && Objects.equals(this.thirdEmail, authorizeConfigInfoRequestBody.thirdEmail)
            && Objects.equals(this.thirdMobile, authorizeConfigInfoRequestBody.thirdMobile)
            && Objects.equals(this.thirdAccessToken, authorizeConfigInfoRequestBody.thirdAccessToken)
            && Objects.equals(this.thirdHeadImgUrl, authorizeConfigInfoRequestBody.thirdHeadImgUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableSSO,
            domain,
            authorizeUrl,
            getTokenUrl,
            clientId,
            clientSecret,
            scope,
            accFieldName,
            getUserInfoUrl,
            oauth2ServerType,
            pcSchemaUrl,
            androidSchemaUrl,
            iosSchemaUrl,
            thirdName,
            thirdEmail,
            thirdMobile,
            thirdAccessToken,
            thirdHeadImgUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeConfigInfoRequestBody {\n");
        sb.append("    enableSSO: ").append(toIndentedString(enableSSO)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    authorizeUrl: ").append(toIndentedString(authorizeUrl)).append("\n");
        sb.append("    getTokenUrl: ").append(toIndentedString(getTokenUrl)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    accFieldName: ").append(toIndentedString(accFieldName)).append("\n");
        sb.append("    getUserInfoUrl: ").append(toIndentedString(getUserInfoUrl)).append("\n");
        sb.append("    oauth2ServerType: ").append(toIndentedString(oauth2ServerType)).append("\n");
        sb.append("    pcSchemaUrl: ").append(toIndentedString(pcSchemaUrl)).append("\n");
        sb.append("    androidSchemaUrl: ").append(toIndentedString(androidSchemaUrl)).append("\n");
        sb.append("    iosSchemaUrl: ").append(toIndentedString(iosSchemaUrl)).append("\n");
        sb.append("    thirdName: ").append(toIndentedString(thirdName)).append("\n");
        sb.append("    thirdEmail: ").append(toIndentedString(thirdEmail)).append("\n");
        sb.append("    thirdMobile: ").append(toIndentedString(thirdMobile)).append("\n");
        sb.append("    thirdAccessToken: ").append(toIndentedString(thirdAccessToken)).append("\n");
        sb.append("    thirdHeadImgUrl: ").append(toIndentedString(thirdHeadImgUrl)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
