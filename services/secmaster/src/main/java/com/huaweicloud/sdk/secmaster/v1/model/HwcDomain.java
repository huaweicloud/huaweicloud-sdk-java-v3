package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云域名详情
 */
public class HwcDomain {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_date")

    private String expireDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_status")

    private String auditStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_unpass_reason")

    private String auditUnpassReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_status")

    private String transferStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reg_type")

    private String regType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy_protection")

    private String privacyProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_server")

    private List<String> nameServer = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_type")

    private String credentialType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_id")

    private String credentialId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registrar")

    private String registrar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact")

    private List<HwcDomainContact> contact = null;

    public HwcDomain withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名名称
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public HwcDomain withExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    /**
     * 域名到期时间，eg：2023-01-10
     * @return expireDate
     */
    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public HwcDomain withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 域名服务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HwcDomain withAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }

    /**
     * 域名实名认证状态。 取值范围： NONAUDIT：未实名认证 SUCCEED：已实名认证 FAILED：实名认证失败 AUDITING：实名认证审核中
     * @return auditStatus
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public HwcDomain withAuditUnpassReason(String auditUnpassReason) {
        this.auditUnpassReason = auditUnpassReason;
        return this;
    }

    /**
     * 域名实名认证失败原因
     * @return auditUnpassReason
     */
    public String getAuditUnpassReason() {
        return auditUnpassReason;
    }

    public void setAuditUnpassReason(String auditUnpassReason) {
        this.auditUnpassReason = auditUnpassReason;
    }

    public HwcDomain withTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
        return this;
    }

    /**
     * 过户状态
     * @return transferStatus
     */
    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public HwcDomain withRegType(String regType) {
        this.regType = regType;
        return this;
    }

    /**
     * 注册类型 取值范围： PERSONAL：个人 COMPANY：企业
     * @return regType
     */
    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public HwcDomain withPrivacyProtection(String privacyProtection) {
        this.privacyProtection = privacyProtection;
        return this;
    }

    /**
     * 是否开启隐私保护
     * @return privacyProtection
     */
    public String getPrivacyProtection() {
        return privacyProtection;
    }

    public void setPrivacyProtection(String privacyProtection) {
        this.privacyProtection = privacyProtection;
    }

    public HwcDomain withNameServer(List<String> nameServer) {
        this.nameServer = nameServer;
        return this;
    }

    public HwcDomain addNameServerItem(String nameServerItem) {
        if (this.nameServer == null) {
            this.nameServer = new ArrayList<>();
        }
        this.nameServer.add(nameServerItem);
        return this;
    }

    public HwcDomain withNameServer(Consumer<List<String>> nameServerSetter) {
        if (this.nameServer == null) {
            this.nameServer = new ArrayList<>();
        }
        nameServerSetter.accept(this.nameServer);
        return this;
    }

    /**
     * 域名服务器列表
     * @return nameServer
     */
    public List<String> getNameServer() {
        return nameServer;
    }

    public void setNameServer(List<String> nameServer) {
        this.nameServer = nameServer;
    }

    public HwcDomain withCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }

    /**
     * 证件类型
     * @return credentialType
     */
    public String getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType;
    }

    public HwcDomain withCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }

    /**
     * 证件号码
     * @return credentialId
     */
    public String getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(String credentialId) {
        this.credentialId = credentialId;
    }

    public HwcDomain withRegistrar(String registrar) {
        this.registrar = registrar;
        return this;
    }

    /**
     * 域名所属注册商
     * @return registrar
     */
    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    public HwcDomain withContact(List<HwcDomainContact> contact) {
        this.contact = contact;
        return this;
    }

    public HwcDomain addContactItem(HwcDomainContact contactItem) {
        if (this.contact == null) {
            this.contact = new ArrayList<>();
        }
        this.contact.add(contactItem);
        return this;
    }

    public HwcDomain withContact(Consumer<List<HwcDomainContact>> contactSetter) {
        if (this.contact == null) {
            this.contact = new ArrayList<>();
        }
        contactSetter.accept(this.contact);
        return this;
    }

    /**
     * 联系人信息
     * @return contact
     */
    public List<HwcDomainContact> getContact() {
        return contact;
    }

    public void setContact(List<HwcDomainContact> contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HwcDomain that = (HwcDomain) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.expireDate, that.expireDate)
            && Objects.equals(this.status, that.status) && Objects.equals(this.auditStatus, that.auditStatus)
            && Objects.equals(this.auditUnpassReason, that.auditUnpassReason)
            && Objects.equals(this.transferStatus, that.transferStatus) && Objects.equals(this.regType, that.regType)
            && Objects.equals(this.privacyProtection, that.privacyProtection)
            && Objects.equals(this.nameServer, that.nameServer)
            && Objects.equals(this.credentialType, that.credentialType)
            && Objects.equals(this.credentialId, that.credentialId) && Objects.equals(this.registrar, that.registrar)
            && Objects.equals(this.contact, that.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName,
            expireDate,
            status,
            auditStatus,
            auditUnpassReason,
            transferStatus,
            regType,
            privacyProtection,
            nameServer,
            credentialType,
            credentialId,
            registrar,
            contact);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HwcDomain {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
        sb.append("    auditUnpassReason: ").append(toIndentedString(auditUnpassReason)).append("\n");
        sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
        sb.append("    regType: ").append(toIndentedString(regType)).append("\n");
        sb.append("    privacyProtection: ").append(toIndentedString(privacyProtection)).append("\n");
        sb.append("    nameServer: ").append(toIndentedString(nameServer)).append("\n");
        sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
        sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
        sb.append("    registrar: ").append(toIndentedString(registrar)).append("\n");
        sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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
