package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ImportCertificateRequestBody */
public class ImportCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_chain")

    private String certificateChain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    public ImportCertificateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 证书名称。字符长度为0~63位。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImportCertificateRequestBody withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /** 证书内容。回车换行需要使用转义字符\\n或者\\r\\n替换。
     * 
     * @return certificate */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public ImportCertificateRequestBody withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /** 证书链。回车换行需要使用转义字符\\n或者\\r\\n替换。
     * 
     * @return certificateChain */
    public String getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    public ImportCertificateRequestBody withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /** 证书私钥。 不能上传带有口令保护的私钥，回车换行需要使用转义字符\\n或者\\r\\n替换。
     * 
     * @return privateKey */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportCertificateRequestBody importCertificateRequestBody = (ImportCertificateRequestBody) o;
        return Objects.equals(this.name, importCertificateRequestBody.name)
            && Objects.equals(this.certificate, importCertificateRequestBody.certificate)
            && Objects.equals(this.certificateChain, importCertificateRequestBody.certificateChain)
            && Objects.equals(this.privateKey, importCertificateRequestBody.privateKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, certificate, certificateChain, privateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportCertificateRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
