package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 双证书配置查询响应体。
 */
public class CertificatesGetBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_source")

    private Integer certificateSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_certificate_id")

    private String scmCertificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private String certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_name")

    private String certificateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_value")

    private String certificateValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate_value")

    private String encCertificateValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    public CertificatesGetBody withCertificateSource(Integer certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }

    /**
     * 证书来源,0：自有证书。2：SCM证书。
     * @return certificateSource
     */
    public Integer getCertificateSource() {
        return certificateSource;
    }

    public void setCertificateSource(Integer certificateSource) {
        this.certificateSource = certificateSource;
    }

    public CertificatesGetBody withScmCertificateId(String scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
        return this;
    }

    /**
     * SCM证书id
     * @return scmCertificateId
     */
    public String getScmCertificateId() {
        return scmCertificateId;
    }

    public void setScmCertificateId(String scmCertificateId) {
        this.scmCertificateId = scmCertificateId;
    }

    public CertificatesGetBody withCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * 证书类型，server：国际证书；server_sm：国密证书。
     * @return certificateType
     */
    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public CertificatesGetBody withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * 证书名字。
     * @return certificateName
     */
    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public CertificatesGetBody withCertificateValue(String certificateValue) {
        this.certificateValue = certificateValue;
        return this;
    }

    /**
     * HTTPS协议使用的证书内容，PEM编码格式。
     * @return certificateValue
     */
    public String getCertificateValue() {
        return certificateValue;
    }

    public void setCertificateValue(String certificateValue) {
        this.certificateValue = certificateValue;
    }

    public CertificatesGetBody withEncCertificateValue(String encCertificateValue) {
        this.encCertificateValue = encCertificateValue;
        return this;
    }

    /**
     * 国密证书加密证书内容，PEM编码格式。
     * @return encCertificateValue
     */
    public String getEncCertificateValue() {
        return encCertificateValue;
    }

    public void setEncCertificateValue(String encCertificateValue) {
        this.encCertificateValue = encCertificateValue;
    }

    public CertificatesGetBody withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 证书过期时间。  > UTC时间。
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertificatesGetBody that = (CertificatesGetBody) obj;
        return Objects.equals(this.certificateSource, that.certificateSource)
            && Objects.equals(this.scmCertificateId, that.scmCertificateId)
            && Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.certificateName, that.certificateName)
            && Objects.equals(this.certificateValue, that.certificateValue)
            && Objects.equals(this.encCertificateValue, that.encCertificateValue)
            && Objects.equals(this.expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateSource,
            scmCertificateId,
            certificateType,
            certificateName,
            certificateValue,
            encCertificateValue,
            expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificatesGetBody {\n");
        sb.append("    certificateSource: ").append(toIndentedString(certificateSource)).append("\n");
        sb.append("    scmCertificateId: ").append(toIndentedString(scmCertificateId)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
        sb.append("    certificateValue: ").append(toIndentedString(certificateValue)).append("\n");
        sb.append("    encCertificateValue: ").append(toIndentedString(encCertificateValue)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
