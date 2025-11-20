package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建服务器证书请求体。
 */
public class CreateServerCertificateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_pem")

    private String certificatePem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key_password")

    private String privateKeyPassword;

    public CreateServerCertificateDTO withCertificatePem(String certificatePem) {
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

    public CreateServerCertificateDTO withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * **参数说明**：证书私钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public CreateServerCertificateDTO withPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
        return this;
    }

    /**
     * **参数说明**：私钥密码
     * @return privateKeyPassword
     */
    public String getPrivateKeyPassword() {
        return privateKeyPassword;
    }

    public void setPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateServerCertificateDTO that = (CreateServerCertificateDTO) obj;
        return Objects.equals(this.certificatePem, that.certificatePem)
            && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.privateKeyPassword, that.privateKeyPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificatePem, privateKey, privateKeyPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerCertificateDTO {\n");
        sb.append("    certificatePem: ").append(toIndentedString(certificatePem)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    privateKeyPassword: ").append(toIndentedString(privateKeyPassword)).append("\n");
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
