package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowCertKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert")

    private String cert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca")

    private String ca;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_mgmt_cert")

    private String targetMgmtCert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_mgmt_private_key")

    private String targetMgmtPrivateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_data_cert")

    private String targetDataCert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_data_private_key")

    private String targetDataPrivateKey;

    public ShowCertKeyResponse withCert(String cert) {
        this.cert = cert;
        return this;
    }

    /**
     * 源端证书
     * @return cert
     */
    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public ShowCertKeyResponse withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 源端私钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public ShowCertKeyResponse withCa(String ca) {
        this.ca = ca;
        return this;
    }

    /**
     * ca证书
     * @return ca
     */
    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public ShowCertKeyResponse withTargetMgmtCert(String targetMgmtCert) {
        this.targetMgmtCert = targetMgmtCert;
        return this;
    }

    /**
     * 目的端管理层证书
     * @return targetMgmtCert
     */
    public String getTargetMgmtCert() {
        return targetMgmtCert;
    }

    public void setTargetMgmtCert(String targetMgmtCert) {
        this.targetMgmtCert = targetMgmtCert;
    }

    public ShowCertKeyResponse withTargetMgmtPrivateKey(String targetMgmtPrivateKey) {
        this.targetMgmtPrivateKey = targetMgmtPrivateKey;
        return this;
    }

    /**
     * 目的端管理层私钥
     * @return targetMgmtPrivateKey
     */
    public String getTargetMgmtPrivateKey() {
        return targetMgmtPrivateKey;
    }

    public void setTargetMgmtPrivateKey(String targetMgmtPrivateKey) {
        this.targetMgmtPrivateKey = targetMgmtPrivateKey;
    }

    public ShowCertKeyResponse withTargetDataCert(String targetDataCert) {
        this.targetDataCert = targetDataCert;
        return this;
    }

    /**
     * 目的端数据层证书
     * @return targetDataCert
     */
    public String getTargetDataCert() {
        return targetDataCert;
    }

    public void setTargetDataCert(String targetDataCert) {
        this.targetDataCert = targetDataCert;
    }

    public ShowCertKeyResponse withTargetDataPrivateKey(String targetDataPrivateKey) {
        this.targetDataPrivateKey = targetDataPrivateKey;
        return this;
    }

    /**
     * 目的端数据层私钥
     * @return targetDataPrivateKey
     */
    public String getTargetDataPrivateKey() {
        return targetDataPrivateKey;
    }

    public void setTargetDataPrivateKey(String targetDataPrivateKey) {
        this.targetDataPrivateKey = targetDataPrivateKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCertKeyResponse that = (ShowCertKeyResponse) obj;
        return Objects.equals(this.cert, that.cert) && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.ca, that.ca) && Objects.equals(this.targetMgmtCert, that.targetMgmtCert)
            && Objects.equals(this.targetMgmtPrivateKey, that.targetMgmtPrivateKey)
            && Objects.equals(this.targetDataCert, that.targetDataCert)
            && Objects.equals(this.targetDataPrivateKey, that.targetDataPrivateKey);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(cert, privateKey, ca, targetMgmtCert, targetMgmtPrivateKey, targetDataCert, targetDataPrivateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertKeyResponse {\n");
        sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
        sb.append("    targetMgmtCert: ").append(toIndentedString(targetMgmtCert)).append("\n");
        sb.append("    targetMgmtPrivateKey: ").append(toIndentedString(targetMgmtPrivateKey)).append("\n");
        sb.append("    targetDataCert: ").append(toIndentedString(targetDataCert)).append("\n");
        sb.append("    targetDataPrivateKey: ").append(toIndentedString(targetDataPrivateKey)).append("\n");
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
