package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建证书请求体。
 */
public class CreateCertificateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    private DistinguishedName distinguishedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_algorithm")

    private String keyAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity")

    private CertValidityData validity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_configuration")

    private CrlConfigurationData crlConfiguration;

    public CreateCertificateReq withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public CreateCertificateReq withDistinguishedName(Consumer<DistinguishedName> distinguishedNameSetter) {
        if (this.distinguishedName == null) {
            this.distinguishedName = new DistinguishedName();
            distinguishedNameSetter.accept(this.distinguishedName);
        }

        return this;
    }

    /**
     * Get distinguishedName
     * @return distinguishedName
     */
    public DistinguishedName getDistinguishedName() {
        return distinguishedName;
    }

    public void setDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    public CreateCertificateReq withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /**
     * 密钥对生成算法 RSA-2048 RSA-3072。
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public CreateCertificateReq withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 签名哈希算法 SHA-256 SHA-512。
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public CreateCertificateReq withValidity(CertValidityData validity) {
        this.validity = validity;
        return this;
    }

    public CreateCertificateReq withValidity(Consumer<CertValidityData> validitySetter) {
        if (this.validity == null) {
            this.validity = new CertValidityData();
            validitySetter.accept(this.validity);
        }

        return this;
    }

    /**
     * Get validity
     * @return validity
     */
    public CertValidityData getValidity() {
        return validity;
    }

    public void setValidity(CertValidityData validity) {
        this.validity = validity;
    }

    public CreateCertificateReq withCrlConfiguration(CrlConfigurationData crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
        return this;
    }

    public CreateCertificateReq withCrlConfiguration(Consumer<CrlConfigurationData> crlConfigurationSetter) {
        if (this.crlConfiguration == null) {
            this.crlConfiguration = new CrlConfigurationData();
            crlConfigurationSetter.accept(this.crlConfiguration);
        }

        return this;
    }

    /**
     * Get crlConfiguration
     * @return crlConfiguration
     */
    public CrlConfigurationData getCrlConfiguration() {
        return crlConfiguration;
    }

    public void setCrlConfiguration(CrlConfigurationData crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCertificateReq that = (CreateCertificateReq) obj;
        return Objects.equals(this.distinguishedName, that.distinguishedName)
            && Objects.equals(this.keyAlgorithm, that.keyAlgorithm)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.validity, that.validity)
            && Objects.equals(this.crlConfiguration, that.crlConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distinguishedName, keyAlgorithm, signatureAlgorithm, validity, crlConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateReq {\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
        sb.append("    crlConfiguration: ").append(toIndentedString(crlConfiguration)).append("\n");
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
