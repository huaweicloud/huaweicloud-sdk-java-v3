package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 设置证书请求体
 */
public class HttpPutBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_status")

    @JacksonXmlProperty(localName = "https_status")

    private String httpsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_name")

    @JacksonXmlProperty(localName = "certificate_name")

    private String certificateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_value")

    @JacksonXmlProperty(localName = "certificate_value")

    private String certificateValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    @JacksonXmlProperty(localName = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_source")

    @JacksonXmlProperty(localName = "certificate_source")

    private Integer certificateSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_status")

    @JacksonXmlProperty(localName = "http2_status")

    private String http2Status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_version")

    @JacksonXmlProperty(localName = "tls_version")

    private String tlsVersion;

    public HttpPutBody withHttpsStatus(String httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    /**
     * HTTPS证书是否启用。（on：开启，off：关闭）
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
     * 证书名字。（长度限制为3-32字符）。当证书开启时必传。
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
     * HTTPS协议使用的证书内容，当证书开启时必传。取值范围：PEM编码格式。
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
     * HTTPS协议使用的私钥，当证书开启时必传。取值范围：PEM编码格式。
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
     * 证书来源。1：代表华为云托管证书；0：表示自有证书。 默认值0。当证书开启时必传。
     * @return certificateSource
     */
    public Integer getCertificateSource() {
        return certificateSource;
    }

    public void setCertificateSource(Integer certificateSource) {
        this.certificateSource = certificateSource;
    }

    public HttpPutBody withHttp2Status(String http2Status) {
        this.http2Status = http2Status;
        return this;
    }

    /**
     * 是否使用HTTP2.0。（on：是，off：否。）,默认关闭，https_status=off时，该值不生效。
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
     * 传输层安全性协议。目前支持TLSv1.0/1.1/1.2/1.3四个版本的协议。默认全部开启，不可全部关闭，只可开启连续或单个版本号。多版本开启时，使用逗号拼接传输，例：TLSv1.1,TLSv1.2。
     * @return tlsVersion
     */
    public String getTlsVersion() {
        return tlsVersion;
    }

    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
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
            && Objects.equals(this.http2Status, httpPutBody.http2Status)
            && Objects.equals(this.tlsVersion, httpPutBody.tlsVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpsStatus,
            certificateName,
            certificateValue,
            privateKey,
            certificateSource,
            http2Status,
            tlsVersion);
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
        sb.append("    http2Status: ").append(toIndentedString(http2Status)).append("\n");
        sb.append("    tlsVersion: ").append(toIndentedString(tlsVersion)).append("\n");
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
