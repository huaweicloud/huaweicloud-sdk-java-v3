package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowServerCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_certificate_id")

    private String serverCertificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_name")

    private String commonName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_pem")

    private String certificatePem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_date")

    private String effectiveDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_owner")

    private String certificateOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_issuer")

    private String certificateIssuer;

    public ShowServerCertificateResponse withServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }

    /**
     * 唯一标识ID
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return serverCertificateId;
    }

    public void setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
    }

    public ShowServerCertificateResponse withCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * **参数说明**：证书通用名
     * @return commonName
     */
    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public ShowServerCertificateResponse withCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
        return this;
    }

    /**
     * **参数说明**：证书内容，PEM格式
     * @return certificatePem
     */
    public String getCertificatePem() {
        return certificatePem;
    }

    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    public ShowServerCertificateResponse withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * 证书生效日期。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return effectiveDate
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public ShowServerCertificateResponse withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 证书失效日期。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public ShowServerCertificateResponse withCertificateOwner(String certificateOwner) {
        this.certificateOwner = certificateOwner;
        return this;
    }

    /**
     * 证书所有者。
     * @return certificateOwner
     */
    public String getCertificateOwner() {
        return certificateOwner;
    }

    public void setCertificateOwner(String certificateOwner) {
        this.certificateOwner = certificateOwner;
    }

    public ShowServerCertificateResponse withCertificateIssuer(String certificateIssuer) {
        this.certificateIssuer = certificateIssuer;
        return this;
    }

    /**
     * 证书颁发者。
     * @return certificateIssuer
     */
    public String getCertificateIssuer() {
        return certificateIssuer;
    }

    public void setCertificateIssuer(String certificateIssuer) {
        this.certificateIssuer = certificateIssuer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerCertificateResponse that = (ShowServerCertificateResponse) obj;
        return Objects.equals(this.serverCertificateId, that.serverCertificateId)
            && Objects.equals(this.commonName, that.commonName)
            && Objects.equals(this.certificatePem, that.certificatePem)
            && Objects.equals(this.effectiveDate, that.effectiveDate)
            && Objects.equals(this.expiryDate, that.expiryDate)
            && Objects.equals(this.certificateOwner, that.certificateOwner)
            && Objects.equals(this.certificateIssuer, that.certificateIssuer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverCertificateId,
            commonName,
            certificatePem,
            effectiveDate,
            expiryDate,
            certificateOwner,
            certificateIssuer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerCertificateResponse {\n");
        sb.append("    serverCertificateId: ").append(toIndentedString(serverCertificateId)).append("\n");
        sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
        sb.append("    certificatePem: ").append(toIndentedString(certificatePem)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    certificateOwner: ").append(toIndentedString(certificateOwner)).append("\n");
        sb.append("    certificateIssuer: ").append(toIndentedString(certificateIssuer)).append("\n");
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
