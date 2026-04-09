package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlBody;

import java.util.Objects;

/**
 * 自定义域名证书配置容器。 
 */
@JacksonXmlRootElement(localName = "CustomDomainConfiguration")
public class SetBucketCustomDomainBody extends SdkXmlBody<SetBucketCustomDomainBody> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Name")

    @JacksonXmlProperty(localName = "Name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CertificateId")

    @JacksonXmlProperty(localName = "CertificateId")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Certificate")

    @JacksonXmlProperty(localName = "Certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CertificateChain")

    @JacksonXmlProperty(localName = "CertificateChain")

    private String certificateChain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PrivateKey")

    @JacksonXmlProperty(localName = "PrivateKey")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CertificateType")

    @JacksonXmlProperty(localName = "CertificateType")

    private String certificateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ENCCertificate")

    @JacksonXmlProperty(localName = "ENCCertificate")

    private String enCCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ENCPrivateKey")

    @JacksonXmlProperty(localName = "ENCPrivateKey")

    private String enCPrivateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DeleteCertificate")

    @JacksonXmlProperty(localName = "DeleteCertificate")

    private String deleteCertificate;

    public SetBucketCustomDomainBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书名称。字符长度为3~63位。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SetBucketCustomDomainBody withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * 自定义域名证书ID。 
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public SetBucketCustomDomainBody withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书内容，可包含中间证书及根证书。若certificate_chain字段传入证书链，则该字段只取证书本身。回车换行需要使用转义字符\\n或者\\r\\n替换。 
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public SetBucketCustomDomainBody withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    /**
     * 证书内容，可包含中间证书及根证书。若certificate_chain字段传入证书链，则该字段只取证书本身。回车换行需要使用转义字符\\n或者\\r\\n替换。 
     * @return certificateChain
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    public SetBucketCustomDomainBody withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 证书私钥。 不能上传带有口令保护的私钥，回车换行需要使用转义字符\\n或者\\r\\n替换。 
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public SetBucketCustomDomainBody withCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * 证书类型。 
     * @return certificateType
     */
    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public SetBucketCustomDomainBody withEnCCertificate(String enCCertificate) {
        this.enCCertificate = enCCertificate;
        return this;
    }

    /**
     * 国密证书的加密证书内容。 
     * @return enCCertificate
     */
    public String getEnCCertificate() {
        return enCCertificate;
    }

    public void setEnCCertificate(String enCCertificate) {
        this.enCCertificate = enCCertificate;
    }

    public SetBucketCustomDomainBody withEnCPrivateKey(String enCPrivateKey) {
        this.enCPrivateKey = enCPrivateKey;
        return this;
    }

    /**
     * 国密证书的加密私钥，回车换行需要使用转义字符\\n或者\\r\\n替换。 
     * @return enCPrivateKey
     */
    public String getEnCPrivateKey() {
        return enCPrivateKey;
    }

    public void setEnCPrivateKey(String enCPrivateKey) {
        this.enCPrivateKey = enCPrivateKey;
    }

    public SetBucketCustomDomainBody withDeleteCertificate(String deleteCertificate) {
        this.deleteCertificate = deleteCertificate;
        return this;
    }

    /**
     * 证书操作类型，是否删除证书。 
     * @return deleteCertificate
     */
    public String getDeleteCertificate() {
        return deleteCertificate;
    }

    public void setDeleteCertificate(String deleteCertificate) {
        this.deleteCertificate = deleteCertificate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBucketCustomDomainBody that = (SetBucketCustomDomainBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.certificateId, that.certificateId)
            && Objects.equals(this.certificate, that.certificate)
            && Objects.equals(this.certificateChain, that.certificateChain)
            && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.certificateType, that.certificateType)
            && Objects.equals(this.enCCertificate, that.enCCertificate)
            && Objects.equals(this.enCPrivateKey, that.enCPrivateKey)
            && Objects.equals(this.deleteCertificate, that.deleteCertificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            certificateId,
            certificate,
            certificateChain,
            privateKey,
            certificateType,
            enCCertificate,
            enCPrivateKey,
            deleteCertificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketCustomDomainBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    enCCertificate: ").append(toIndentedString(enCCertificate)).append("\n");
        sb.append("    enCPrivateKey: ").append(toIndentedString(enCPrivateKey)).append("\n");
        sb.append("    deleteCertificate: ").append(toIndentedString(deleteCertificate)).append("\n");
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
