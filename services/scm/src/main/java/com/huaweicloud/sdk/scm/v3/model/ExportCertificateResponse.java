package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExportCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entire_certificate")

    private String entireCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain")

    private String certificateChain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate")

    private String encCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_private_key")

    private String encPrivateKey;

    public ExportCertificateResponse withEntireCertificate(String entireCertificate) {
        this.entireCertificate = entireCertificate;
        return this;
    }

    /**
     * 证书及证书链。
     * @return entireCertificate
     */
    public String getEntireCertificate() {
        return entireCertificate;
    }

    public void setEntireCertificate(String entireCertificate) {
        this.entireCertificate = entireCertificate;
    }

    public ExportCertificateResponse withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书内容，不包含证书链。
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
     * 国密证书返回，加密证书私钥。 - 自己生成csr的方式：该字段是加密状态，需要解密。   解密思路如下:    1、从数字信封中获取“对称密钥密文”和“加密私钥密文”；   2、使用签名私钥解密“对称密钥密文”，得到“对称密钥明文”；   3、使用对称密钥解密“加密私钥密文”，得到“加密私钥明文”。 - 非自己生成csr的方式：该字段不需要解密。
     * @return encPrivateKey
     */
    public String getEncPrivateKey() {
        return encPrivateKey;
    }

    public void setEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
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
        return Objects.equals(this.entireCertificate, that.entireCertificate)
            && Objects.equals(this.certificate, that.certificate)
            && Objects.equals(this.certificateChain, that.certificateChain)
            && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.encCertificate, that.encCertificate)
            && Objects.equals(this.encPrivateKey, that.encPrivateKey);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(entireCertificate, certificate, certificateChain, privateKey, encCertificate, encPrivateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCertificateResponse {\n");
        sb.append("    entireCertificate: ").append(toIndentedString(entireCertificate)).append("\n");
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
