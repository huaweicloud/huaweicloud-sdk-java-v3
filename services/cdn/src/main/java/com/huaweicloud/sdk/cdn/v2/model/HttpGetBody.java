package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 证书配置查询响应体。
 */
public class HttpGetBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_status")

    private String httpsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private String certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_source")

    private Integer certificateSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scm_certificate_id")

    private String scmCertificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_name")

    private String certificateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_value")

    private String certificateValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate_value")

    private String encCertificateValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificates")

    private List<CertificatesGetBody> certificates = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_status")

    private String http2Status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_version")

    private String tlsVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocsp_stapling_status")

    private String ocspStaplingStatus;

    public HttpGetBody withHttpsStatus(String httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    /**
     * HTTPS证书是否启用，on：开启，off：关闭。
     * @return httpsStatus
     */
    public String getHttpsStatus() {
        return httpsStatus;
    }

    public void setHttpsStatus(String httpsStatus) {
        this.httpsStatus = httpsStatus;
    }

    public HttpGetBody withCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * 证书类型。server：国际证书；server_sm：国密证书。
     * @return certificateType
     */
    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public HttpGetBody withCertificateSource(Integer certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }

    /**
     * 证书来源，1：华为云托管证书，0：自有证书。2：SCM证书。
     * @return certificateSource
     */
    public Integer getCertificateSource() {
        return certificateSource;
    }

    public void setCertificateSource(Integer certificateSource) {
        this.certificateSource = certificateSource;
    }

    public HttpGetBody withScmCertificateId(String scmCertificateId) {
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

    public HttpGetBody withCertificateName(String certificateName) {
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

    public HttpGetBody withCertificateValue(String certificateValue) {
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

    public HttpGetBody withExpireTime(Long expireTime) {
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

    public HttpGetBody withEncCertificateValue(String encCertificateValue) {
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

    public HttpGetBody withCertificates(List<CertificatesGetBody> certificates) {
        this.certificates = certificates;
        return this;
    }

    public HttpGetBody addCertificatesItem(CertificatesGetBody certificatesItem) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        this.certificates.add(certificatesItem);
        return this;
    }

    public HttpGetBody withCertificates(Consumer<List<CertificatesGetBody>> certificatesSetter) {
        if (this.certificates == null) {
            this.certificates = new ArrayList<>();
        }
        certificatesSetter.accept(this.certificates);
        return this;
    }

    /**
     * Get certificates
     * @return certificates
     */
    public List<CertificatesGetBody> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<CertificatesGetBody> certificates) {
        this.certificates = certificates;
    }

    public HttpGetBody withHttp2Status(String http2Status) {
        this.http2Status = http2Status;
        return this;
    }

    /**
     * 是否使用HTTP2.0，on：是，off：否。
     * @return http2Status
     */
    public String getHttp2Status() {
        return http2Status;
    }

    public void setHttp2Status(String http2Status) {
        this.http2Status = http2Status;
    }

    public HttpGetBody withTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
        return this;
    }

    /**
     * 传输层安全性协议。
     * @return tlsVersion
     */
    public String getTlsVersion() {
        return tlsVersion;
    }

    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }

    public HttpGetBody withOcspStaplingStatus(String ocspStaplingStatus) {
        this.ocspStaplingStatus = ocspStaplingStatus;
        return this;
    }

    /**
     * 是否开启ocsp stapling,on：是，off：否。
     * @return ocspStaplingStatus
     */
    public String getOcspStaplingStatus() {
        return ocspStaplingStatus;
    }

    public void setOcspStaplingStatus(String ocspStaplingStatus) {
        this.ocspStaplingStatus = ocspStaplingStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpGetBody that = (HttpGetBody) obj;
        return Objects.equals(this.httpsStatus, that.httpsStatus)
            && Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.certificateSource, that.certificateSource)
            && Objects.equals(this.scmCertificateId, that.scmCertificateId)
            && Objects.equals(this.certificateName, that.certificateName)
            && Objects.equals(this.certificateValue, that.certificateValue)
            && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.encCertificateValue, that.encCertificateValue)
            && Objects.equals(this.certificates, that.certificates)
            && Objects.equals(this.http2Status, that.http2Status) && Objects.equals(this.tlsVersion, that.tlsVersion)
            && Objects.equals(this.ocspStaplingStatus, that.ocspStaplingStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpsStatus,
            certificateType,
            certificateSource,
            scmCertificateId,
            certificateName,
            certificateValue,
            expireTime,
            encCertificateValue,
            certificates,
            http2Status,
            tlsVersion,
            ocspStaplingStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpGetBody {\n");
        sb.append("    httpsStatus: ").append(toIndentedString(httpsStatus)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    certificateSource: ").append(toIndentedString(certificateSource)).append("\n");
        sb.append("    scmCertificateId: ").append(toIndentedString(scmCertificateId)).append("\n");
        sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
        sb.append("    certificateValue: ").append(toIndentedString(certificateValue)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    encCertificateValue: ").append(toIndentedString(encCertificateValue)).append("\n");
        sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
        sb.append("    http2Status: ").append(toIndentedString(http2Status)).append("\n");
        sb.append("    tlsVersion: ").append(toIndentedString(tlsVersion)).append("\n");
        sb.append("    ocspStaplingStatus: ").append(toIndentedString(ocspStaplingStatus)).append("\n");
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
