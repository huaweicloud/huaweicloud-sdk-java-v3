package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExportCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain")

    private String certificateChain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate")

    private String encCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_private_key")

    private String encPrivateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_sm2_enveloped_key")

    private String encSm2EnvelopedKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signed_and_enveloped_data")

    private String signedAndEnvelopedData;

    public ExportCertificateResponse withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 私钥内容。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

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
     * 证书链内容。
     * @return certificateChain
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    public ExportCertificateResponse withEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
        return this;
    }

    /**
     * 加密证书内容。
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
     * 加密私钥内容。
     * @return encPrivateKey
     */
    public String getEncPrivateKey() {
        return encPrivateKey;
    }

    public void setEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
    }

    public ExportCertificateResponse withEncSm2EnvelopedKey(String encSm2EnvelopedKey) {
        this.encSm2EnvelopedKey = encSm2EnvelopedKey;
        return this;
    }

    /**
     * 加密私钥的国密GMT0009标准规范SM2数字信封。
     * @return encSm2EnvelopedKey
     */
    public String getEncSm2EnvelopedKey() {
        return encSm2EnvelopedKey;
    }

    public void setEncSm2EnvelopedKey(String encSm2EnvelopedKey) {
        this.encSm2EnvelopedKey = encSm2EnvelopedKey;
    }

    public ExportCertificateResponse withSignedAndEnvelopedData(String signedAndEnvelopedData) {
        this.signedAndEnvelopedData = signedAndEnvelopedData;
        return this;
    }

    /**
     * 加密私钥的国密GMT0010标准规范签名数字信封。
     * @return signedAndEnvelopedData
     */
    public String getSignedAndEnvelopedData() {
        return signedAndEnvelopedData;
    }

    public void setSignedAndEnvelopedData(String signedAndEnvelopedData) {
        this.signedAndEnvelopedData = signedAndEnvelopedData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportCertificateResponse that = (ExportCertificateResponse) obj;
        return Objects.equals(this.privateKey, that.privateKey) && Objects.equals(this.certificate, that.certificate)
            && Objects.equals(this.certificateChain, that.certificateChain)
            && Objects.equals(this.encCertificate, that.encCertificate)
            && Objects.equals(this.encPrivateKey, that.encPrivateKey)
            && Objects.equals(this.encSm2EnvelopedKey, that.encSm2EnvelopedKey)
            && Objects.equals(this.signedAndEnvelopedData, that.signedAndEnvelopedData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateKey,
            certificate,
            certificateChain,
            encCertificate,
            encPrivateKey,
            encSm2EnvelopedKey,
            signedAndEnvelopedData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCertificateResponse {\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
        sb.append("    encCertificate: ").append(toIndentedString(encCertificate)).append("\n");
        sb.append("    encPrivateKey: ").append(toIndentedString(encPrivateKey)).append("\n");
        sb.append("    encSm2EnvelopedKey: ").append(toIndentedString(encSm2EnvelopedKey)).append("\n");
        sb.append("    signedAndEnvelopedData: ").append(toIndentedString(signedAndEnvelopedData)).append("\n");
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
