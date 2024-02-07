package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateVpnGatewayCertificateRequestBodyContent
 */
public class UpdateVpnGatewayCertificateRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain")

    private String certificateChain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate")

    private String encCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_private_key")

    private String encPrivateKey;

    public UpdateVpnGatewayCertificateRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VPN网关证书名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateVpnGatewayCertificateRequestBodyContent withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书内容，国密证书时为签名证书内容
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public UpdateVpnGatewayCertificateRequestBodyContent withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 证书私钥，国密证书时为签名证书私钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public UpdateVpnGatewayCertificateRequestBodyContent withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /**
     * VPN网关CA证书内容
     * @return certificateChain
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    public UpdateVpnGatewayCertificateRequestBodyContent withEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
        return this;
    }

    /**
     * 国密证书的加密证书内容
     * @return encCertificate
     */
    public String getEncCertificate() {
        return encCertificate;
    }

    public void setEncCertificate(String encCertificate) {
        this.encCertificate = encCertificate;
    }

    public UpdateVpnGatewayCertificateRequestBodyContent withEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
        return this;
    }

    /**
     * 国密证书的加密证书私钥
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
        UpdateVpnGatewayCertificateRequestBodyContent that = (UpdateVpnGatewayCertificateRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.certificate, that.certificate)
            && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.certificateChain, that.certificateChain)
            && Objects.equals(this.encCertificate, that.encCertificate)
            && Objects.equals(this.encPrivateKey, that.encPrivateKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, certificate, privateKey, certificateChain, encCertificate, encPrivateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpnGatewayCertificateRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
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
