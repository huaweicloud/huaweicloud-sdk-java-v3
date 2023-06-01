package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 证书设置
 */
public class HttpPutBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_status")

    private String httpsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_name")

    private String certificateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_value")

    private String certificateValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_source")

    private Integer certificateSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private String certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_status")

    private String http2Status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_version")

    private String tlsVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocsp_stapling_status")

    private String ocspStaplingStatus;

    public HttpPutBody withHttpsStatus(String httpsStatus) {
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

    public HttpPutBody withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * 证书名字，长度限制为3-64字符。  > 当证书开启时必传。
     * @return certificateName
     */
    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public HttpPutBody withCertificateValue(String certificateValue) {
        this.certificateValue = certificateValue;
        return this;
    }

    /**
     * HTTPS协议使用的证书内容，当证书开启时必传。  > PEM编码格式。
     * @return certificateValue
     */
    public String getCertificateValue() {
        return certificateValue;
    }

    public void setCertificateValue(String certificateValue) {
        this.certificateValue = certificateValue;
    }

    public HttpPutBody withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * HTTPS协议使用的私钥，当证书开启时必传。  > PEM编码格式。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public HttpPutBody withCertificateSource(Integer certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }

    /**
     * 证书来源,1：华为云托管证书,0：自有证书, 默认值0。  > 证书开启时必传
     * @return certificateSource
     */
    public Integer getCertificateSource() {
        return certificateSource;
    }

    public void setCertificateSource(Integer certificateSource) {
        this.certificateSource = certificateSource;
    }

    public HttpPutBody withCertificateType(String certificateType) {
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

    public HttpPutBody withHttp2Status(String http2Status) {
        this.http2Status = http2Status;
        return this;
    }

    /**
     * 是否使用HTTP2.0，on：是，off：否。  > 默认关闭，https_status=off时，该值不生效。
     * @return http2Status
     */
    public String getHttp2Status() {
        return http2Status;
    }

    public void setHttp2Status(String http2Status) {
        this.http2Status = http2Status;
    }

    public HttpPutBody withTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
        return this;
    }

    /**
     * 传输层安全性协议， 目前支持TLSv1.0/1.1/1.2/1.3四个版本的协议，CDN默认开启TLS1.1/1.2/1.3，不可全部关闭。  > 1.需开启连续或单个版本号，例：不可仅开启TLS1.0/1.2而关闭TLS1.1。  > 2.多版本开启时，使用逗号拼接传输，例：TLSv1.1,TLSv1.2。
     * @return tlsVersion
     */
    public String getTlsVersion() {
        return tlsVersion;
    }

    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }

    public HttpPutBody withOcspStaplingStatus(String ocspStaplingStatus) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpPutBody httpPutBody = (HttpPutBody) o;
        return Objects.equals(this.httpsStatus, httpPutBody.httpsStatus)
            && Objects.equals(this.certificateName, httpPutBody.certificateName)
            && Objects.equals(this.certificateValue, httpPutBody.certificateValue)
            && Objects.equals(this.privateKey, httpPutBody.privateKey)
            && Objects.equals(this.certificateSource, httpPutBody.certificateSource)
            && Objects.equals(this.certificateType, httpPutBody.certificateType)
            && Objects.equals(this.http2Status, httpPutBody.http2Status)
            && Objects.equals(this.tlsVersion, httpPutBody.tlsVersion)
            && Objects.equals(this.ocspStaplingStatus, httpPutBody.ocspStaplingStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpsStatus,
            certificateName,
            certificateValue,
            privateKey,
            certificateSource,
            certificateType,
            http2Status,
            tlsVersion,
            ocspStaplingStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpPutBody {\n");
        sb.append("    httpsStatus: ").append(toIndentedString(httpsStatus)).append("\n");
        sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
        sb.append("    certificateValue: ").append(toIndentedString(certificateValue)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificateSource: ").append(toIndentedString(certificateSource)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
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
