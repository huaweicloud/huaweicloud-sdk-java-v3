package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 创建服务器证书请求返回对象 */
public class CertificateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public CertificateInfo withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** SSL证书的管理状态；暂不支持
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CertificateInfo withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /** HTTPS协议使用的证书内容。 取值范围：PEM编码格式。
     * 
     * @return certificate */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public CertificateInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /** SSL证书的描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CertificateInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 服务器证书所签域名。该字段仅type为server时有效。 总长度为0-1024，由若干普通域名或泛域名组成，域名之间以\",\"分割，不超过30个域名。
     * 普通域名：由若干字符串组成，字符串间以\".\"分割，单个字符串长度不超过63个字符，只能包含英文字母、数字或\"-\"，且必须以字母或数字开头和结尾。例：www.test.com；
     * 泛域名：在普通域名的基础上仅允许首字母为\"*\"。例：*.test.com
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CertificateInfo withId(String id) {
        this.id = id;
        return this;
    }

    /** 证书ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CertificateInfo withName(String name) {
        this.name = name;
        return this;
    }

    /** SSL证书的名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CertificateInfo withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /** 服务器证书的私钥。仅type为server时有效。type为server时必选。
     * 
     * @return privateKey */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public CertificateInfo withType(String type) {
        this.type = type;
        return this;
    }

    /** SSL证书的类型。分为服务器证书(server)和CA证书(client)。 默认值：server
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CertificateInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 证书创建时间。
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CertificateInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 证书更新时间。
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CertificateInfo withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /** 证书使用截止时间。
     * 
     * @return expireTime */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CertificateInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificateInfo certificateInfo = (CertificateInfo) o;
        return Objects.equals(this.adminStateUp, certificateInfo.adminStateUp)
            && Objects.equals(this.certificate, certificateInfo.certificate)
            && Objects.equals(this.description, certificateInfo.description)
            && Objects.equals(this.domain, certificateInfo.domain) && Objects.equals(this.id, certificateInfo.id)
            && Objects.equals(this.name, certificateInfo.name)
            && Objects.equals(this.privateKey, certificateInfo.privateKey)
            && Objects.equals(this.type, certificateInfo.type)
            && Objects.equals(this.createdAt, certificateInfo.createdAt)
            && Objects.equals(this.updatedAt, certificateInfo.updatedAt)
            && Objects.equals(this.expireTime, certificateInfo.expireTime)
            && Objects.equals(this.projectId, certificateInfo.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            certificate,
            description,
            domain,
            id,
            name,
            privateKey,
            type,
            createdAt,
            updatedAt,
            expireTime,
            projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateInfo {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
