package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDomainSettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_url")

    @JacksonXmlProperty(localName = "login_url")

    private String loginUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_username")

    @JacksonXmlProperty(localName = "login_username")

    private String loginUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_password")

    @JacksonXmlProperty(localName = "login_password")

    private String loginPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_cookies")

    @JacksonXmlProperty(localName = "login_cookies")

    private String loginCookies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_url")

    @JacksonXmlProperty(localName = "verify_url")

    private String verifyUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_headers")

    @JacksonXmlProperty(localName = "http_headers")

    private Map<String, String> httpHeaders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    @JacksonXmlProperty(localName = "domain_name")

    private String domainName;

    public ShowDomainSettingsResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowDomainSettingsResponse withLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    /**
     * 网站需要登录时，设置登录页面
     * @return loginUrl
     */
    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public ShowDomainSettingsResponse withLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
        return this;
    }

    /**
     * 网站需要登录时，设置登录用户名
     * @return loginUsername
     */
    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public ShowDomainSettingsResponse withLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }

    /**
     * 网站需要登录时，设置登录密码
     * @return loginPassword
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public ShowDomainSettingsResponse withLoginCookies(String loginCookies) {
        this.loginCookies = loginCookies;
        return this;
    }

    /**
     * 网站需要登录时，设置登录cookie
     * @return loginCookies
     */
    public String getLoginCookies() {
        return loginCookies;
    }

    public void setLoginCookies(String loginCookies) {
        this.loginCookies = loginCookies;
    }

    public ShowDomainSettingsResponse withVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
        return this;
    }

    /**
     * 设置用于验证登录是否成功的网址
     * @return verifyUrl
     */
    public String getVerifyUrl() {
        return verifyUrl;
    }

    public void setVerifyUrl(String verifyUrl) {
        this.verifyUrl = verifyUrl;
    }

    public ShowDomainSettingsResponse withHttpHeaders(Map<String, String> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    public ShowDomainSettingsResponse putHttpHeadersItem(String key, String httpHeadersItem) {
        if (this.httpHeaders == null) {
            this.httpHeaders = new HashMap<>();
        }
        this.httpHeaders.put(key, httpHeadersItem);
        return this;
    }

    public ShowDomainSettingsResponse withHttpHeaders(Consumer<Map<String, String>> httpHeadersSetter) {
        if (this.httpHeaders == null) {
            this.httpHeaders = new HashMap<>();
        }
        httpHeadersSetter.accept(this.httpHeaders);
        return this;
    }

    /**
     * 设置自定义HTTP请求头
     * @return httpHeaders
     */
    public Map<String, String> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(Map<String, String> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public ShowDomainSettingsResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDomainSettingsResponse showDomainSettingsResponse = (ShowDomainSettingsResponse) o;
        return Objects.equals(this.domainId, showDomainSettingsResponse.domainId)
            && Objects.equals(this.loginUrl, showDomainSettingsResponse.loginUrl)
            && Objects.equals(this.loginUsername, showDomainSettingsResponse.loginUsername)
            && Objects.equals(this.loginPassword, showDomainSettingsResponse.loginPassword)
            && Objects.equals(this.loginCookies, showDomainSettingsResponse.loginCookies)
            && Objects.equals(this.verifyUrl, showDomainSettingsResponse.verifyUrl)
            && Objects.equals(this.httpHeaders, showDomainSettingsResponse.httpHeaders)
            && Objects.equals(this.domainName, showDomainSettingsResponse.domainName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(domainId, loginUrl, loginUsername, loginPassword, loginCookies, verifyUrl, httpHeaders, domainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainSettingsResponse {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    loginUrl: ").append(toIndentedString(loginUrl)).append("\n");
        sb.append("    loginUsername: ").append(toIndentedString(loginUsername)).append("\n");
        sb.append("    loginPassword: ").append(toIndentedString(loginPassword)).append("\n");
        sb.append("    loginCookies: ").append(toIndentedString(loginCookies)).append("\n");
        sb.append("    verifyUrl: ").append(toIndentedString(verifyUrl)).append("\n");
        sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
