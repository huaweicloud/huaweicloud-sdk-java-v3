package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExportCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    @JacksonXmlProperty(localName = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain")

    @JacksonXmlProperty(localName = "certificate_chain")

    private String certificateChain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    @JacksonXmlProperty(localName = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate")

    @JacksonXmlProperty(localName = "enc_certificate")

    private String encCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_private_key")

    @JacksonXmlProperty(localName = "enc_private_key")

    private String encPrivateKey;

    public ExportCertificateResponse withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书内容。
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public ExportCertificateResponse withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /**
     * 证书链。
     * @return certificateChain
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    public ExportCertificateResponse withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 证书私钥。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public ExportCertificateResponse withEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
        return this;
    }

    /**
     * 国密证书返回，加密证书内容。
     * @return encCertificate
     */
    public String getEncCertificate() {
        return encCertificate;
    }

    public void setEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
    }

    public ExportCertificateResponse withEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
        return this;
    }

    /**
     * 国密证书返回，加密证书私钥。
     * @return encPrivateKey
     */
    public String getEncPrivateKey() {
        return encPrivateKey;
    }

    public void setEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportCertificateResponse exportCertificateResponse = (ExportCertificateResponse) o;
        return Objects.equals(this.certificate, exportCertificateResponse.certificate)
            && Objects.equals(this.certificateChain, exportCertificateResponse.certificateChain)
            && Objects.equals(this.privateKey, exportCertificateResponse.privateKey)
            && Objects.equals(this.encCertificate, exportCertificateResponse.encCertificate)
            && Objects.equals(this.encPrivateKey, exportCertificateResponse.encPrivateKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate, certificateChain, privateKey, encCertificate, encPrivateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCertificateResponse {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    encCertificate: ").append(toIndentedString(encCertificate)).append("\n");
        sb.append("    encPrivateKey: ").append(toIndentedString(encPrivateKey)).append("\n");
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
