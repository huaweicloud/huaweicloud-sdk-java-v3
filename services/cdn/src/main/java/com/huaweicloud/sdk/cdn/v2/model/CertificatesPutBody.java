package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置双证书时必传，需要同时传入国际证书和国密证书，不支持传两个国际证书或两个国密证书。   &gt; - 您也可以在certificates参数下传入一个国际证书或一个国密证书。   &gt; - 如果certificates传了证书（国际证书、国密证书或国际+国密双证书），外层证书配置将失效，仅保留当前参数传入的证书信息。
 */
public class CertificatesPutBody {

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
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_certificate_value")

    private String encCertificateValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enc_private_key")

    private String encPrivateKey;

    public CertificatesPutBody withCertificateType(String certificateType) {
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

    public CertificatesPutBody withCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }

    /**
     * 证书名字，长度限制为3-64字符。
     * @return certificateName
     */
    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public CertificatesPutBody withCertificateValue(String certificateValue) {
        this.certificateValue = certificateValue;
        return this;
    }

    /**
     * HTTPS协议使用的证书内容。  > PEM编码格式。
     * @return certificateValue
     */
    public String getCertificateValue() {
        return certificateValue;
    }

    public void setCertificateValue(String certificateValue) {
        this.certificateValue = certificateValue;
    }

    public CertificatesPutBody withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * HTTPS协议使用的私钥。  > PEM编码格式。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public CertificatesPutBody withEncCertificateValue(String encCertificateValue) {
        this.encCertificateValue = encCertificateValue;
        return this;
    }

    /**
     * 加密证书内容，证书类型为国密证书时必传。  > PEM编码格式。
     * @return encCertificateValue
     */
    public String getEncCertificateValue() {
        return encCertificateValue;
    }

    public void setEncCertificateValue(String encCertificateValue) {
        this.encCertificateValue = encCertificateValue;
    }

    public CertificatesPutBody withEncPrivateKey(String encPrivateKey) {
        this.encPrivateKey = encPrivateKey;
        return this;
    }

    /**
     * 加密私钥内容，证书类型为国密证书时必传。  > PEM编码格式。
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
        CertificatesPutBody that = (CertificatesPutBody) obj;
        return Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.certificateName, that.certificateName)
            && Objects.equals(this.certificateValue, that.certificateValue)
            && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.encCertificateValue, that.encCertificateValue)
            && Objects.equals(this.encPrivateKey, that.encPrivateKey);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(certificateType, certificateName, certificateValue, privateKey, encCertificateValue, encPrivateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificatesPutBody {\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    certificateName: ").append(toIndentedString(certificateName)).append("\n");
        sb.append("    certificateValue: ").append(toIndentedString(certificateValue)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    encCertificateValue: ").append(toIndentedString(encCertificateValue)).append("\n");
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
