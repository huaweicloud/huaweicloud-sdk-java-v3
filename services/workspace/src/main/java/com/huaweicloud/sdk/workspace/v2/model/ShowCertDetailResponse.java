package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCertDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply")

    private String apply;

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
    @JsonProperty(value = "not_before")

    private String notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_after")

    private String notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pem_code")

    private String pemCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_name")

    private String issuerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crl_configuration")

    private CrlConfigurationData crlConfiguration;

    public ShowCertDetailResponse withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * 证书id。
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public ShowCertDetailResponse withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 序列号。
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ShowCertDetailResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 证书类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowCertDetailResponse withApply(String apply) {
        this.apply = apply;
        return this;
    }

    /**
     * 证书应用范围。
     * @return apply
     */
    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }

    public ShowCertDetailResponse withDistinguishedName(DistinguishedName distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    public ShowCertDetailResponse withDistinguishedName(Consumer<DistinguishedName> distinguishedNameSetter) {
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

    public ShowCertDetailResponse withKeyAlgorithm(String keyAlgorithm) {
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

    public ShowCertDetailResponse withSignatureAlgorithm(String signatureAlgorithm) {
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

    public ShowCertDetailResponse withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 生效时间。
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    public ShowCertDetailResponse withNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * 过期时间。
     * @return notAfter
     */
    public String getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }

    public ShowCertDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 证书状态 DISABLE,ENABLE,EXPIRED,DELETE。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowCertDetailResponse withPemCode(String pemCode) {
        this.pemCode = pemCode;
        return this;
    }

    /**
     * 证书pem编码。
     * @return pemCode
     */
    public String getPemCode() {
        return pemCode;
    }

    public void setPemCode(String pemCode) {
        this.pemCode = pemCode;
    }

    public ShowCertDetailResponse withIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    /**
     * 颁发者名字。
     * @return issuerName
     */
    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public ShowCertDetailResponse withCrlConfiguration(CrlConfigurationData crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
        return this;
    }

    public ShowCertDetailResponse withCrlConfiguration(Consumer<CrlConfigurationData> crlConfigurationSetter) {
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
        ShowCertDetailResponse that = (ShowCertDetailResponse) obj;
        return Objects.equals(this.certId, that.certId) && Objects.equals(this.serialNumber, that.serialNumber)
            && Objects.equals(this.type, that.type) && Objects.equals(this.apply, that.apply)
            && Objects.equals(this.distinguishedName, that.distinguishedName)
            && Objects.equals(this.keyAlgorithm, that.keyAlgorithm)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.notBefore, that.notBefore) && Objects.equals(this.notAfter, that.notAfter)
            && Objects.equals(this.status, that.status) && Objects.equals(this.pemCode, that.pemCode)
            && Objects.equals(this.issuerName, that.issuerName)
            && Objects.equals(this.crlConfiguration, that.crlConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certId,
            serialNumber,
            type,
            apply,
            distinguishedName,
            keyAlgorithm,
            signatureAlgorithm,
            notBefore,
            notAfter,
            status,
            pemCode,
            issuerName,
            crlConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertDetailResponse {\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    apply: ").append(toIndentedString(apply)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    pemCode: ").append(toIndentedString(pemCode)).append("\n");
        sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
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
