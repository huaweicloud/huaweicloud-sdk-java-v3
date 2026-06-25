package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHttpsConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_status")

    private Integer httpsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect_https")

    private Integer forceRedirectHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2")

    private Integer http2;

    public ShowHttpsConfigResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 来源，user表示用户自己上传，scm表示scm证书 
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ShowHttpsConfigResponse withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * 证书名称 
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public ShowHttpsConfigResponse withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * 证书id 
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public ShowHttpsConfigResponse withHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    /**
     * https配置 
     * minimum: 0
     * maximum: 1
     * @return httpsStatus
     */
    public Integer getHttpsStatus() {
        return httpsStatus;
    }

    public void setHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
    }

    public ShowHttpsConfigResponse withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书内容 
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public ShowHttpsConfigResponse withForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
        return this;
    }

    /**
     * 客户端请求是否强制重定向，0表示不重定向，1表示重定向 
     * minimum: 0
     * maximum: 1
     * @return forceRedirectHttps
     */
    public Integer getForceRedirectHttps() {
        return forceRedirectHttps;
    }

    public void setForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
    }

    public ShowHttpsConfigResponse withHttp2(Integer http2) {
        this.http2 = http2;
        return this;
    }

    /**
     * 是否使用HTTP2.0，0表示不使用HTTP2.0，1表示使用 
     * minimum: 0
     * maximum: 1
     * @return http2
     */
    public Integer getHttp2() {
        return http2;
    }

    public void setHttp2(Integer http2) {
        this.http2 = http2;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHttpsConfigResponse that = (ShowHttpsConfigResponse) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.certName, that.certName)
            && Objects.equals(this.certId, that.certId) && Objects.equals(this.httpsStatus, that.httpsStatus)
            && Objects.equals(this.certificate, that.certificate)
            && Objects.equals(this.forceRedirectHttps, that.forceRedirectHttps)
            && Objects.equals(this.http2, that.http2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, certName, certId, httpsStatus, certificate, forceRedirectHttps, http2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpsConfigResponse {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    httpsStatus: ").append(toIndentedString(httpsStatus)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    forceRedirectHttps: ").append(toIndentedString(forceRedirectHttps)).append("\n");
        sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
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
