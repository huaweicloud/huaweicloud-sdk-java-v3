package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * IdpCertificate
 */
public class IdpCertificate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_name")

    private String issuerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_after")

    private BigDecimal notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    private BigDecimal notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private BigDecimal serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number_string")

    private String serialNumberString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm_name")

    private String signatureAlgorithmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_name")

    private String subjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private BigDecimal version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x509_Certificate_in_pem")

    private String x509CertificateInPem;

    public IdpCertificate withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * 证书全局唯一标识符（ID）
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public IdpCertificate withIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }

    /**
     * 身份提供商签发者
     * @return issuerName
     */
    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public IdpCertificate withNotAfter(BigDecimal notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * 证书有效期
     * @return notAfter
     */
    public BigDecimal getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(BigDecimal notAfter) {
        this.notAfter = notAfter;
    }

    public IdpCertificate withNotBefore(BigDecimal notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 证书有效期
     * @return notBefore
     */
    public BigDecimal getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(BigDecimal notBefore) {
        this.notBefore = notBefore;
    }

    public IdpCertificate withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * 证书公钥
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public IdpCertificate withSerialNumber(BigDecimal serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 证书序列号
     * @return serialNumber
     */
    public BigDecimal getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(BigDecimal serialNumber) {
        this.serialNumber = serialNumber;
    }

    public IdpCertificate withSerialNumberString(String serialNumberString) {
        this.serialNumberString = serialNumberString;
        return this;
    }

    /**
     * 证书序列号文本
     * @return serialNumberString
     */
    public String getSerialNumberString() {
        return serialNumberString;
    }

    public void setSerialNumberString(String serialNumberString) {
        this.serialNumberString = serialNumberString;
    }

    public IdpCertificate withSignatureAlgorithmName(String signatureAlgorithmName) {
        this.signatureAlgorithmName = signatureAlgorithmName;
        return this;
    }

    /**
     * 签名算法
     * @return signatureAlgorithmName
     */
    public String getSignatureAlgorithmName() {
        return signatureAlgorithmName;
    }

    public void setSignatureAlgorithmName(String signatureAlgorithmName) {
        this.signatureAlgorithmName = signatureAlgorithmName;
    }

    public IdpCertificate withSubjectName(String subjectName) {
        this.subjectName = subjectName;
        return this;
    }

    /**
     * Subject
     * @return subjectName
     */
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public IdpCertificate withVersion(BigDecimal version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public IdpCertificate withX509CertificateInPem(String x509CertificateInPem) {
        this.x509CertificateInPem = x509CertificateInPem;
        return this;
    }

    /**
     * x509格式证书
     * @return x509CertificateInPem
     */
    public String getX509CertificateInPem() {
        return x509CertificateInPem;
    }

    public void setX509CertificateInPem(String x509CertificateInPem) {
        this.x509CertificateInPem = x509CertificateInPem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdpCertificate that = (IdpCertificate) obj;
        return Objects.equals(this.certificateId, that.certificateId)
            && Objects.equals(this.issuerName, that.issuerName) && Objects.equals(this.notAfter, that.notAfter)
            && Objects.equals(this.notBefore, that.notBefore) && Objects.equals(this.publicKey, that.publicKey)
            && Objects.equals(this.serialNumber, that.serialNumber)
            && Objects.equals(this.serialNumberString, that.serialNumberString)
            && Objects.equals(this.signatureAlgorithmName, that.signatureAlgorithmName)
            && Objects.equals(this.subjectName, that.subjectName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.x509CertificateInPem, that.x509CertificateInPem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateId,
            issuerName,
            notAfter,
            notBefore,
            publicKey,
            serialNumber,
            serialNumberString,
            signatureAlgorithmName,
            subjectName,
            version,
            x509CertificateInPem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdpCertificate {\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    serialNumberString: ").append(toIndentedString(serialNumberString)).append("\n");
        sb.append("    signatureAlgorithmName: ").append(toIndentedString(signatureAlgorithmName)).append("\n");
        sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    x509CertificateInPem: ").append(toIndentedString(x509CertificateInPem)).append("\n");
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
