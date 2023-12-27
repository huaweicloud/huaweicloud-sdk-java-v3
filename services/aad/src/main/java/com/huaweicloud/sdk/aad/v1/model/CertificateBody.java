package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CertificateBody
 */
public class CertificateBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_type")

    private Integer opType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_file")

    private String certFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_key_file")

    private String certKeyFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    public CertificateBody withOpType(Integer opType) {
        this.opType = opType;
        return this;
    }

    /**
     * 操作类型。0 - 上传， 1 - 更换
     * @return opType
     */
    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    public CertificateBody withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * 证书名称
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public CertificateBody withCertFile(String certFile) {
        this.certFile = certFile;
        return this;
    }

    /**
     * 证书文件。上传新证书(op_type为0)时必填，更换为已有证书(op_type为1)时置空
     * @return certFile
     */
    public String getCertFile() {
        return certFile;
    }

    public void setCertFile(String certFile) {
        this.certFile = certFile;
    }

    public CertificateBody withCertKeyFile(String certKeyFile) {
        this.certKeyFile = certKeyFile;
        return this;
    }

    /**
     * 私钥文件。上传新证书(op_type为0)时必填，更换为已有证书(op_type为1)时置空
     * @return certKeyFile
     */
    public String getCertKeyFile() {
        return certKeyFile;
    }

    public void setCertKeyFile(String certKeyFile) {
        this.certKeyFile = certKeyFile;
    }

    public CertificateBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 域名id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertificateBody that = (CertificateBody) obj;
        return Objects.equals(this.opType, that.opType) && Objects.equals(this.certName, that.certName)
            && Objects.equals(this.certFile, that.certFile) && Objects.equals(this.certKeyFile, that.certKeyFile)
            && Objects.equals(this.domainId, that.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opType, certName, certFile, certKeyFile, domainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateBody {\n");
        sb.append("    opType: ").append(toIndentedString(opType)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certFile: ").append(toIndentedString(certFile)).append("\n");
        sb.append("    certKeyFile: ").append(toIndentedString(certKeyFile)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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
