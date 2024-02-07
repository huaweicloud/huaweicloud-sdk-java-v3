package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * VpnGatewayCertificateConfig
 */
public class VpnGatewayCertificateConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vgw_id")

    private String vgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer")

    private String issuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_serial_number")

    private String certificateSerialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_subject")

    private String certificateSubject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_expire_time")

    private OffsetDateTime certificateExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain_serial_number")

    private String certificateChainSerialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain_subject")

    private String certificateChainSubject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain_expire_time")

    private OffsetDateTime certificateChainExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate_serial_number")

    private String encCertificateSerialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate_subject")

    private String encCertificateSubject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate_expire_time")

    private OffsetDateTime encCertificateExpireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public VpnGatewayCertificateConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * VPN网关证书ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VpnGatewayCertificateConfig withName(String name) {
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

    public VpnGatewayCertificateConfig withVgwId(String vgwId) {
        this.vgwId = vgwId;
        return this;
    }

    /**
     * VPN网关ID
     * @return vgwId
     */
    public String getVgwId() {
        return vgwId;
    }

    public void setVgwId(String vgwId) {
        this.vgwId = vgwId;
    }

    public VpnGatewayCertificateConfig withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * 证书颁发者，国密证书时为签名证书颁发者
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public VpnGatewayCertificateConfig withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 证书签名算法，国密证书时为签名证书签名算法
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public VpnGatewayCertificateConfig withCertificateSerialNumber(String certificateSerialNumber) {
        this.certificateSerialNumber = certificateSerialNumber;
        return this;
    }

    /**
     * 证书序列号，国密证书时为签名证书序列号
     * @return certificateSerialNumber
     */
    public String getCertificateSerialNumber() {
        return certificateSerialNumber;
    }

    public void setCertificateSerialNumber(String certificateSerialNumber) {
        this.certificateSerialNumber = certificateSerialNumber;
    }

    public VpnGatewayCertificateConfig withCertificateSubject(String certificateSubject) {
        this.certificateSubject = certificateSubject;
        return this;
    }

    /**
     * 证书主题，国密证书时为签名证书主题
     * @return certificateSubject
     */
    public String getCertificateSubject() {
        return certificateSubject;
    }

    public void setCertificateSubject(String certificateSubject) {
        this.certificateSubject = certificateSubject;
    }

    public VpnGatewayCertificateConfig withCertificateExpireTime(OffsetDateTime certificateExpireTime) {
        this.certificateExpireTime = certificateExpireTime;
        return this;
    }

    /**
     * 证书过期时间，国密证书时为签名证书过期时间
     * @return certificateExpireTime
     */
    public OffsetDateTime getCertificateExpireTime() {
        return certificateExpireTime;
    }

    public void setCertificateExpireTime(OffsetDateTime certificateExpireTime) {
        this.certificateExpireTime = certificateExpireTime;
    }

    public VpnGatewayCertificateConfig withCertificateChainSerialNumber(String certificateChainSerialNumber) {
        this.certificateChainSerialNumber = certificateChainSerialNumber;
        return this;
    }

    /**
     * CA证书序列号
     * @return certificateChainSerialNumber
     */
    public String getCertificateChainSerialNumber() {
        return certificateChainSerialNumber;
    }

    public void setCertificateChainSerialNumber(String certificateChainSerialNumber) {
        this.certificateChainSerialNumber = certificateChainSerialNumber;
    }

    public VpnGatewayCertificateConfig withCertificateChainSubject(String certificateChainSubject) {
        this.certificateChainSubject = certificateChainSubject;
        return this;
    }

    /**
     * CA证书主题
     * @return certificateChainSubject
     */
    public String getCertificateChainSubject() {
        return certificateChainSubject;
    }

    public void setCertificateChainSubject(String certificateChainSubject) {
        this.certificateChainSubject = certificateChainSubject;
    }

    public VpnGatewayCertificateConfig withCertificateChainExpireTime(OffsetDateTime certificateChainExpireTime) {
        this.certificateChainExpireTime = certificateChainExpireTime;
        return this;
    }

    /**
     * CA证书过期时间
     * @return certificateChainExpireTime
     */
    public OffsetDateTime getCertificateChainExpireTime() {
        return certificateChainExpireTime;
    }

    public void setCertificateChainExpireTime(OffsetDateTime certificateChainExpireTime) {
        this.certificateChainExpireTime = certificateChainExpireTime;
    }

    public VpnGatewayCertificateConfig withEncCertificateSerialNumber(String encCertificateSerialNumber) {
        this.encCertificateSerialNumber = encCertificateSerialNumber;
        return this;
    }

    /**
     * 国密证书的加密证书序列号，
     * @return encCertificateSerialNumber
     */
    public String getEncCertificateSerialNumber() {
        return encCertificateSerialNumber;
    }

    public void setEncCertificateSerialNumber(String encCertificateSerialNumber) {
        this.encCertificateSerialNumber = encCertificateSerialNumber;
    }

    public VpnGatewayCertificateConfig withEncCertificateSubject(String encCertificateSubject) {
        this.encCertificateSubject = encCertificateSubject;
        return this;
    }

    /**
     * 国密证书的加密证书主题
     * @return encCertificateSubject
     */
    public String getEncCertificateSubject() {
        return encCertificateSubject;
    }

    public void setEncCertificateSubject(String encCertificateSubject) {
        this.encCertificateSubject = encCertificateSubject;
    }

    public VpnGatewayCertificateConfig withEncCertificateExpireTime(OffsetDateTime encCertificateExpireTime) {
        this.encCertificateExpireTime = encCertificateExpireTime;
        return this;
    }

    /**
     * 国密证书的加密证书过期时间
     * @return encCertificateExpireTime
     */
    public OffsetDateTime getEncCertificateExpireTime() {
        return encCertificateExpireTime;
    }

    public void setEncCertificateExpireTime(OffsetDateTime encCertificateExpireTime) {
        this.encCertificateExpireTime = encCertificateExpireTime;
    }

    public VpnGatewayCertificateConfig withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpnGatewayCertificateConfig that = (VpnGatewayCertificateConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.vgwId, that.vgwId) && Objects.equals(this.issuer, that.issuer)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.certificateSerialNumber, that.certificateSerialNumber)
            && Objects.equals(this.certificateSubject, that.certificateSubject)
            && Objects.equals(this.certificateExpireTime, that.certificateExpireTime)
            && Objects.equals(this.certificateChainSerialNumber, that.certificateChainSerialNumber)
            && Objects.equals(this.certificateChainSubject, that.certificateChainSubject)
            && Objects.equals(this.certificateChainExpireTime, that.certificateChainExpireTime)
            && Objects.equals(this.encCertificateSerialNumber, that.encCertificateSerialNumber)
            && Objects.equals(this.encCertificateSubject, that.encCertificateSubject)
            && Objects.equals(this.encCertificateExpireTime, that.encCertificateExpireTime)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            vgwId,
            issuer,
            signatureAlgorithm,
            certificateSerialNumber,
            certificateSubject,
            certificateExpireTime,
            certificateChainSerialNumber,
            certificateChainSubject,
            certificateChainExpireTime,
            encCertificateSerialNumber,
            encCertificateSubject,
            encCertificateExpireTime,
            createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpnGatewayCertificateConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vgwId: ").append(toIndentedString(vgwId)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    certificateSerialNumber: ").append(toIndentedString(certificateSerialNumber)).append("\n");
        sb.append("    certificateSubject: ").append(toIndentedString(certificateSubject)).append("\n");
        sb.append("    certificateExpireTime: ").append(toIndentedString(certificateExpireTime)).append("\n");
        sb.append("    certificateChainSerialNumber: ")
            .append(toIndentedString(certificateChainSerialNumber))
            .append("\n");
        sb.append("    certificateChainSubject: ").append(toIndentedString(certificateChainSubject)).append("\n");
        sb.append("    certificateChainExpireTime: ").append(toIndentedString(certificateChainExpireTime)).append("\n");
        sb.append("    encCertificateSerialNumber: ").append(toIndentedString(encCertificateSerialNumber)).append("\n");
        sb.append("    encCertificateSubject: ").append(toIndentedString(encCertificateSubject)).append("\n");
        sb.append("    encCertificateExpireTime: ").append(toIndentedString(encCertificateExpireTime)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
