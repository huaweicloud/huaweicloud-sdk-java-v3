package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** This is a auto create Body Object */
public class UpdateCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    public UpdateCertificateRequestBody withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /** SSL证书对象
     * 
     * @return certificate */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public UpdateCertificateRequestBody withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /** 服务端的私有密钥。 格式：私钥为PEM格式。
     * 
     * @return privateKey */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public UpdateCertificateRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** SSL证书的描述信息。 支持的最大字符长度：255
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCertificateRequestBody withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 服务端证书所签的域名。默认值：null； 支持的最大字符长度：100 取值范围：
     * 普通域名由若干字符串组成，总长度为0-100，字符串间以\".\"分割，单个字符串长度不超过63个字符，只能包含英文字母、数字或\"-\"，且必须以字母或数字开头和结尾。
     * 泛域名在普通域名的基础上仅允许首字母为\"*\"。该字段仅type为server时有效。
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public UpdateCertificateRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** SSL证书的名称。 支持的最大字符长度：255
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCertificateRequestBody withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** SSL证书的管理状态； 取值范围： true/false。 该字段为预留字段，暂未启用。只支持设定为true。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCertificateRequestBody updateCertificateRequestBody = (UpdateCertificateRequestBody) o;
        return Objects.equals(this.certificate, updateCertificateRequestBody.certificate)
            && Objects.equals(this.privateKey, updateCertificateRequestBody.privateKey)
            && Objects.equals(this.description, updateCertificateRequestBody.description)
            && Objects.equals(this.domain, updateCertificateRequestBody.domain)
            && Objects.equals(this.name, updateCertificateRequestBody.name)
            && Objects.equals(this.adminStateUp, updateCertificateRequestBody.adminStateUp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificate, privateKey, description, domain, name, adminStateUp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCertificateRequestBody {\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
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
