package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ExtendedKeyUsage
 */
public class ExtendedKeyUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_auth")

    @JacksonXmlProperty(localName = "server_auth")

    private Boolean serverAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_auth")

    @JacksonXmlProperty(localName = "client_auth")

    private Boolean clientAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_signing")

    @JacksonXmlProperty(localName = "code_signing")

    private Boolean codeSigning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_protection")

    @JacksonXmlProperty(localName = "email_protection")

    private Boolean emailProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_stamping")

    @JacksonXmlProperty(localName = "time_stamping")

    private Boolean timeStamping;

    public ExtendedKeyUsage withServerAuth(Boolean serverAuth) {
        this.serverAuth = serverAuth;
        return this;
    }

    /**
     * 服务器身份验证，OID为：1.3.6.1.5.5.7.3.1。 - **true** - **false** > 服务器证书请启用本增强型密钥用法，默认为false。
     * @return serverAuth
     */
    public Boolean getServerAuth() {
        return serverAuth;
    }

    public void setServerAuth(Boolean serverAuth) {
        this.serverAuth = serverAuth;
    }

    public ExtendedKeyUsage withClientAuth(Boolean clientAuth) {
        this.clientAuth = clientAuth;
        return this;
    }

    /**
     * 客户端身份验证，OID为：1.3.6.1.5.5.7.3.2。 - **true** - **false** > 客户端证书请启用本增强型密钥用法，默认为false。
     * @return clientAuth
     */
    public Boolean getClientAuth() {
        return clientAuth;
    }

    public void setClientAuth(Boolean clientAuth) {
        this.clientAuth = clientAuth;
    }

    public ExtendedKeyUsage withCodeSigning(Boolean codeSigning) {
        this.codeSigning = codeSigning;
        return this;
    }

    /**
     * 代码签名，OID为：1.3.6.1.5.5.7.3.3。 - **true** - **false** > 签署可下载的可执行代码客户端认证，默认为false。
     * @return codeSigning
     */
    public Boolean getCodeSigning() {
        return codeSigning;
    }

    public void setCodeSigning(Boolean codeSigning) {
        this.codeSigning = codeSigning;
    }

    public ExtendedKeyUsage withEmailProtection(Boolean emailProtection) {
        this.emailProtection = emailProtection;
        return this;
    }

    /**
     * 安全电子邮件，OID为：1.3.6.1.5.5.7.3.4。 - **true** - **false** > 电子邮件保护，默认为false。
     * @return emailProtection
     */
    public Boolean getEmailProtection() {
        return emailProtection;
    }

    public void setEmailProtection(Boolean emailProtection) {
        this.emailProtection = emailProtection;
    }

    public ExtendedKeyUsage withTimeStamping(Boolean timeStamping) {
        this.timeStamping = timeStamping;
        return this;
    }

    /**
     * 时间戳，OID为：1.3.6.1.5.5.7.3.8。 - **true** - **false** > 将一个对象的哈希绑定到一个时间，默认为false。
     * @return timeStamping
     */
    public Boolean getTimeStamping() {
        return timeStamping;
    }

    public void setTimeStamping(Boolean timeStamping) {
        this.timeStamping = timeStamping;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendedKeyUsage extendedKeyUsage = (ExtendedKeyUsage) o;
        return Objects.equals(this.serverAuth, extendedKeyUsage.serverAuth)
            && Objects.equals(this.clientAuth, extendedKeyUsage.clientAuth)
            && Objects.equals(this.codeSigning, extendedKeyUsage.codeSigning)
            && Objects.equals(this.emailProtection, extendedKeyUsage.emailProtection)
            && Objects.equals(this.timeStamping, extendedKeyUsage.timeStamping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverAuth, clientAuth, codeSigning, emailProtection, timeStamping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendedKeyUsage {\n");
        sb.append("    serverAuth: ").append(toIndentedString(serverAuth)).append("\n");
        sb.append("    clientAuth: ").append(toIndentedString(clientAuth)).append("\n");
        sb.append("    codeSigning: ").append(toIndentedString(codeSigning)).append("\n");
        sb.append("    emailProtection: ").append(toIndentedString(emailProtection)).append("\n");
        sb.append("    timeStamping: ").append(toIndentedString(timeStamping)).append("\n");
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
