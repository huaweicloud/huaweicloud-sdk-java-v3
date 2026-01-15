package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 校验域控请求体。
 */
public class ValidateDcRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_ip")

    private String dcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_name")

    private String dcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_admin_account")

    private String domainAdminAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_password")

    private String domainPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ldaps_enable")

    private Boolean isLdapsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ldaps_certificate")

    private String ldapsCertificate;

    public ValidateDcRequestBody withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ValidateDcRequestBody withDcIp(String dcIp) {
        this.dcIp = dcIp;
        return this;
    }

    /**
     * 域控制器IP地址。
     * @return dcIp
     */
    public String getDcIp() {
        return dcIp;
    }

    public void setDcIp(String dcIp) {
        this.dcIp = dcIp;
    }

    public ValidateDcRequestBody withDcName(String dcName) {
        this.dcName = dcName;
        return this;
    }

    /**
     * 域控制器名称。
     * @return dcName
     */
    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    public ValidateDcRequestBody withDomainAdminAccount(String domainAdminAccount) {
        this.domainAdminAccount = domainAdminAccount;
        return this;
    }

    /**
     * 域管理员账号。
     * @return domainAdminAccount
     */
    public String getDomainAdminAccount() {
        return domainAdminAccount;
    }

    public void setDomainAdminAccount(String domainAdminAccount) {
        this.domainAdminAccount = domainAdminAccount;
    }

    public ValidateDcRequestBody withDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }

    /**
     * 域管理员账号密码。
     * @return domainPassword
     */
    public String getDomainPassword() {
        return domainPassword;
    }

    public void setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
    }

    public ValidateDcRequestBody withIsLdapsEnable(Boolean isLdapsEnable) {
        this.isLdapsEnable = isLdapsEnable;
        return this;
    }

    /**
     * 是否开启LDAPS。
     * @return isLdapsEnable
     */
    public Boolean getIsLdapsEnable() {
        return isLdapsEnable;
    }

    public void setIsLdapsEnable(Boolean isLdapsEnable) {
        this.isLdapsEnable = isLdapsEnable;
    }

    public ValidateDcRequestBody withLdapsCertificate(String ldapsCertificate) {
        this.ldapsCertificate = ldapsCertificate;
        return this;
    }

    /**
     * LDAPS用的密钥证书。
     * @return ldapsCertificate
     */
    public String getLdapsCertificate() {
        return ldapsCertificate;
    }

    public void setLdapsCertificate(String ldapsCertificate) {
        this.ldapsCertificate = ldapsCertificate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateDcRequestBody that = (ValidateDcRequestBody) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.dcIp, that.dcIp)
            && Objects.equals(this.dcName, that.dcName)
            && Objects.equals(this.domainAdminAccount, that.domainAdminAccount)
            && Objects.equals(this.domainPassword, that.domainPassword)
            && Objects.equals(this.isLdapsEnable, that.isLdapsEnable)
            && Objects.equals(this.ldapsCertificate, that.ldapsCertificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, dcIp, dcName, domainAdminAccount, domainPassword, isLdapsEnable, ldapsCertificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateDcRequestBody {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    dcIp: ").append(toIndentedString(dcIp)).append("\n");
        sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
        sb.append("    domainAdminAccount: ").append(toIndentedString(domainAdminAccount)).append("\n");
        sb.append("    domainPassword: ").append(toIndentedString(domainPassword)).append("\n");
        sb.append("    isLdapsEnable: ").append(toIndentedString(isLdapsEnable)).append("\n");
        sb.append("    ldapsCertificate: ").append(toIndentedString(ldapsCertificate)).append("\n");
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
