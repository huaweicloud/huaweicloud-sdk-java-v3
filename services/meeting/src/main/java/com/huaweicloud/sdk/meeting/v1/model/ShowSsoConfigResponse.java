package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSsoConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableSSO")

    @JacksonXmlProperty(localName = "enableSSO")

    private Boolean enableSSO;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizeUrl")

    @JacksonXmlProperty(localName = "authorizeUrl")

    private String authorizeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "getTokenUrl")

    @JacksonXmlProperty(localName = "getTokenUrl")

    private String getTokenUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientId")

    @JacksonXmlProperty(localName = "clientId")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientSecret")

    @JacksonXmlProperty(localName = "clientSecret")

    private String clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    @JacksonXmlProperty(localName = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accFieldName")

    @JacksonXmlProperty(localName = "accFieldName")

    private String accFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "getUserInfoUrl")

    @JacksonXmlProperty(localName = "getUserInfoUrl")

    private String getUserInfoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth2ServerType")

    @JacksonXmlProperty(localName = "oauth2ServerType")

    private Integer oauth2ServerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcSchemaUrl")

    @JacksonXmlProperty(localName = "pcSchemaUrl")

    private String pcSchemaUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "androidSchemaUrl")

    @JacksonXmlProperty(localName = "androidSchemaUrl")

    private String androidSchemaUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iosSchemaUrl")

    @JacksonXmlProperty(localName = "iosSchemaUrl")

    private String iosSchemaUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdName")

    @JacksonXmlProperty(localName = "thirdName")

    private String thirdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdEmail")

    @JacksonXmlProperty(localName = "thirdEmail")

    private String thirdEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdMobile")

    @JacksonXmlProperty(localName = "thirdMobile")

    private String thirdMobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdAccessToken")

    @JacksonXmlProperty(localName = "thirdAccessToken")

    private String thirdAccessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thirdHeadImgUrl")

    @JacksonXmlProperty(localName = "thirdHeadImgUrl")

    private String thirdHeadImgUrl;

    public ShowSsoConfigResponse withEnableSSO(Boolean enableSSO) {
        this.enableSSO = enableSSO;
        return this;
    }

    /**
     * 是否开启SSO登录
     * @return enableSSO
     */
    public Boolean getEnableSSO() {
        return enableSSO;
    }

    public void setEnableSSO(Boolean enableSSO) {
        this.enableSSO = enableSSO;
    }

    public ShowSsoConfigResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 企业域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ShowSsoConfigResponse withAuthorizeUrl(String authorizeUrl) {
        this.authorizeUrl = authorizeUrl;
        return this;
    }

    /**
     * Oauth2授权地址
     * @return authorizeUrl
     */
    public String getAuthorizeUrl() {
        return authorizeUrl;
    }

    public void setAuthorizeUrl(String authorizeUrl) {
        this.authorizeUrl = authorizeUrl;
    }

    public ShowSsoConfigResponse withGetTokenUrl(String getTokenUrl) {
        this.getTokenUrl = getTokenUrl;
        return this;
    }

    /**
     * 获取Token URL
     * @return getTokenUrl
     */
    public String getGetTokenUrl() {
        return getTokenUrl;
    }

    public void setGetTokenUrl(String getTokenUrl) {
        this.getTokenUrl = getTokenUrl;
    }

    public ShowSsoConfigResponse withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * APPID
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ShowSsoConfigResponse withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * APP秘钥
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public ShowSsoConfigResponse withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 授权范围，OAuth2.0的OIDC取值为“openid”
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ShowSsoConfigResponse withAccFieldName(String accFieldName) {
        this.accFieldName = accFieldName;
        return this;
    }

    /**
     * 第三方账号的字段名称
     * @return accFieldName
     */
    public String getAccFieldName() {
        return accFieldName;
    }

    public void setAccFieldName(String accFieldName) {
        this.accFieldName = accFieldName;
    }

    public ShowSsoConfigResponse withGetUserInfoUrl(String getUserInfoUrl) {
        this.getUserInfoUrl = getUserInfoUrl;
        return this;
    }

    /**
     * 用户信息查询URL
     * @return getUserInfoUrl
     */
    public String getGetUserInfoUrl() {
        return getUserInfoUrl;
    }

    public void setGetUserInfoUrl(String getUserInfoUrl) {
        this.getUserInfoUrl = getUserInfoUrl;
    }

    public ShowSsoConfigResponse withOauth2ServerType(Integer oauth2ServerType) {
        this.oauth2ServerType = oauth2ServerType;
        return this;
    }

    /**
     * 鉴权类型。OAuth2.0鉴权时取0
     * minimum: 0
     * maximum: 255
     * @return oauth2ServerType
     */
    public Integer getOauth2ServerType() {
        return oauth2ServerType;
    }

    public void setOauth2ServerType(Integer oauth2ServerType) {
        this.oauth2ServerType = oauth2ServerType;
    }

    public ShowSsoConfigResponse withPcSchemaUrl(String pcSchemaUrl) {
        this.pcSchemaUrl = pcSchemaUrl;
        return this;
    }

    /**
     * 拉起PC端终端的schema
     * @return pcSchemaUrl
     */
    public String getPcSchemaUrl() {
        return pcSchemaUrl;
    }

    public void setPcSchemaUrl(String pcSchemaUrl) {
        this.pcSchemaUrl = pcSchemaUrl;
    }

    public ShowSsoConfigResponse withAndroidSchemaUrl(String androidSchemaUrl) {
        this.androidSchemaUrl = androidSchemaUrl;
        return this;
    }

    /**
     * 拉起安卓端终端的schema
     * @return androidSchemaUrl
     */
    public String getAndroidSchemaUrl() {
        return androidSchemaUrl;
    }

    public void setAndroidSchemaUrl(String androidSchemaUrl) {
        this.androidSchemaUrl = androidSchemaUrl;
    }

    public ShowSsoConfigResponse withIosSchemaUrl(String iosSchemaUrl) {
        this.iosSchemaUrl = iosSchemaUrl;
        return this;
    }

    /**
     * 拉起ios端终端的schema
     * @return iosSchemaUrl
     */
    public String getIosSchemaUrl() {
        return iosSchemaUrl;
    }

    public void setIosSchemaUrl(String iosSchemaUrl) {
        this.iosSchemaUrl = iosSchemaUrl;
    }

    public ShowSsoConfigResponse withThirdName(String thirdName) {
        this.thirdName = thirdName;
        return this;
    }

    /**
     * 第三方姓名的字段名称
     * @return thirdName
     */
    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public ShowSsoConfigResponse withThirdEmail(String thirdEmail) {
        this.thirdEmail = thirdEmail;
        return this;
    }

    /**
     * 第三方邮箱的字段名称
     * @return thirdEmail
     */
    public String getThirdEmail() {
        return thirdEmail;
    }

    public void setThirdEmail(String thirdEmail) {
        this.thirdEmail = thirdEmail;
    }

    public ShowSsoConfigResponse withThirdMobile(String thirdMobile) {
        this.thirdMobile = thirdMobile;
        return this;
    }

    /**
     * 第三方手机号的字段名称
     * @return thirdMobile
     */
    public String getThirdMobile() {
        return thirdMobile;
    }

    public void setThirdMobile(String thirdMobile) {
        this.thirdMobile = thirdMobile;
    }

    public ShowSsoConfigResponse withThirdAccessToken(String thirdAccessToken) {
        this.thirdAccessToken = thirdAccessToken;
        return this;
    }

    /**
     * 第三方accessToken的字段名称
     * @return thirdAccessToken
     */
    public String getThirdAccessToken() {
        return thirdAccessToken;
    }

    public void setThirdAccessToken(String thirdAccessToken) {
        this.thirdAccessToken = thirdAccessToken;
    }

    public ShowSsoConfigResponse withThirdHeadImgUrl(String thirdHeadImgUrl) {
        this.thirdHeadImgUrl = thirdHeadImgUrl;
        return this;
    }

    /**
     * 第三方头像链接的字段名称
     * @return thirdHeadImgUrl
     */
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
        ShowSsoConfigResponse showSsoConfigResponse = (ShowSsoConfigResponse) o;
        return Objects.equals(this.enableSSO, showSsoConfigResponse.enableSSO)
            && Objects.equals(this.domain, showSsoConfigResponse.domain)
            && Objects.equals(this.authorizeUrl, showSsoConfigResponse.authorizeUrl)
            && Objects.equals(this.getTokenUrl, showSsoConfigResponse.getTokenUrl)
            && Objects.equals(this.clientId, showSsoConfigResponse.clientId)
            && Objects.equals(this.clientSecret, showSsoConfigResponse.clientSecret)
            && Objects.equals(this.scope, showSsoConfigResponse.scope)
            && Objects.equals(this.accFieldName, showSsoConfigResponse.accFieldName)
            && Objects.equals(this.getUserInfoUrl, showSsoConfigResponse.getUserInfoUrl)
            && Objects.equals(this.oauth2ServerType, showSsoConfigResponse.oauth2ServerType)
            && Objects.equals(this.pcSchemaUrl, showSsoConfigResponse.pcSchemaUrl)
            && Objects.equals(this.androidSchemaUrl, showSsoConfigResponse.androidSchemaUrl)
            && Objects.equals(this.iosSchemaUrl, showSsoConfigResponse.iosSchemaUrl)
            && Objects.equals(this.thirdName, showSsoConfigResponse.thirdName)
            && Objects.equals(this.thirdEmail, showSsoConfigResponse.thirdEmail)
            && Objects.equals(this.thirdMobile, showSsoConfigResponse.thirdMobile)
            && Objects.equals(this.thirdAccessToken, showSsoConfigResponse.thirdAccessToken)
            && Objects.equals(this.thirdHeadImgUrl, showSsoConfigResponse.thirdHeadImgUrl);
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
        sb.append("class ShowSsoConfigResponse {\n");
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
