package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TlsCertificateInfo
 */
public class TlsCertificateInfo {

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
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_key")

    private String certificateKey;

    public TlsCertificateInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 证书来源， 可选,  scm: 云证书管理服务，user：默认，用户自有
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public TlsCertificateInfo withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * SCM证书名， 证书来源为scm时可选
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public TlsCertificateInfo withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * SCM证书ID, 证书来源为scm时必选
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public TlsCertificateInfo withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书内容，证书来源为user时必选
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public TlsCertificateInfo withCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
        return this;
    }

    /**
     * 私钥内容，证书来源为user时必选
     * @return certificateKey
     */
    public String getCertificateKey() {
        return certificateKey;
    }

    public void setCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TlsCertificateInfo that = (TlsCertificateInfo) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.certName, that.certName)
            && Objects.equals(this.certId, that.certId) && Objects.equals(this.certificate, that.certificate)
            && Objects.equals(this.certificateKey, that.certificateKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, certName, certId, certificate, certificateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TlsCertificateInfo {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateKey: ").append(toIndentedString(certificateKey)).append("\n");
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
