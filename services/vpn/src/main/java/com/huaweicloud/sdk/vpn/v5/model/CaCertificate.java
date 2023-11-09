package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 对端网关CA证书信息
 */
public class CaCertificate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer")

    private String issuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private OffsetDateTime expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_updatable")

    private Boolean isUpdatable;

    public CaCertificate withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 证书序列号
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public CaCertificate withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 签名算法
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public CaCertificate withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * 证书颁发者
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public CaCertificate withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 证书主题
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public CaCertificate withExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 证书过期时间
     * @return expireTime
     */
    public OffsetDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public CaCertificate withIsUpdatable(Boolean isUpdatable) {
        this.isUpdatable = isUpdatable;
        return this;
    }

    /**
     * 是否能更新内容
     * @return isUpdatable
     */
    public Boolean getIsUpdatable() {
        return isUpdatable;
    }

    public void setIsUpdatable(Boolean isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaCertificate that = (CaCertificate) obj;
        return Objects.equals(this.serialNumber, that.serialNumber)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.issuer, that.issuer) && Objects.equals(this.subject, that.subject)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.isUpdatable, that.isUpdatable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, signatureAlgorithm, issuer, subject, expireTime, isUpdatable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaCertificate {\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    isUpdatable: ").append(toIndentedString(isUpdatable)).append("\n");
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
