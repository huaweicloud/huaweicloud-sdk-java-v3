package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GmCertificateInfo
 */
public class GmCertificateInfo {

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
    @JsonProperty(value = "sign_certificate")

    private String signCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_certificate_key")

    private String signCertificateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate")

    private String encCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate_key")

    private String encCertificateKey;

    public GmCertificateInfo withSource(String source) {
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

    public GmCertificateInfo withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * SCM证书名， 可选
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public GmCertificateInfo withCertId(String certId) {
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

    public GmCertificateInfo withSignCertificate(String signCertificate) {
        this.signCertificate = signCertificate;
        return this;
    }

    /**
     * 国密签名证书内容
     * @return signCertificate
     */
    public String getSignCertificate() {
        return signCertificate;
    }

    public void setSignCertificate(String signCertificate) {
        this.signCertificate = signCertificate;
    }

    public GmCertificateInfo withSignCertificateKey(String signCertificateKey) {
        this.signCertificateKey = signCertificateKey;
        return this;
    }

    /**
     * 国密签名私钥内容
     * @return signCertificateKey
     */
    public String getSignCertificateKey() {
        return signCertificateKey;
    }

    public void setSignCertificateKey(String signCertificateKey) {
        this.signCertificateKey = signCertificateKey;
    }

    public GmCertificateInfo withEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
        return this;
    }

    /**
     * 国密加密证书内容
     * @return encCertificate
     */
    public String getEncCertificate() {
        return encCertificate;
    }

    public void setEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
    }

    public GmCertificateInfo withEncCertificateKey(String encCertificateKey) {
        this.encCertificateKey = encCertificateKey;
        return this;
    }

    /**
     * 国密加密私钥内容
     * @return encCertificateKey
     */
    public String getEncCertificateKey() {
        return encCertificateKey;
    }

    public void setEncCertificateKey(String encCertificateKey) {
        this.encCertificateKey = encCertificateKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GmCertificateInfo that = (GmCertificateInfo) obj;
        return Objects.equals(this.source, that.source) && Objects.equals(this.certName, that.certName)
            && Objects.equals(this.certId, that.certId) && Objects.equals(this.signCertificate, that.signCertificate)
            && Objects.equals(this.signCertificateKey, that.signCertificateKey)
            && Objects.equals(this.encCertificate, that.encCertificate)
            && Objects.equals(this.encCertificateKey, that.encCertificateKey);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(source, certName, certId, signCertificate, signCertificateKey, encCertificate, encCertificateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GmCertificateInfo {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    signCertificate: ").append(toIndentedString(signCertificate)).append("\n");
        sb.append("    signCertificateKey: ").append(toIndentedString(signCertificateKey)).append("\n");
        sb.append("    encCertificate: ").append(toIndentedString(encCertificate)).append("\n");
        sb.append("    encCertificateKey: ").append(toIndentedString(encCertificateKey)).append("\n");
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
