package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApplyCertificateRequestBody
 */
public class ApplyCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sans")

    private String sans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csr")

    private String csr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_name")

    private String companyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_unit")

    private String companyUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_province")

    private String companyProvince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_city")

    private String companyCity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_name")

    private String applicantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_phone")

    private String applicantPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_email")

    private String applicantEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_name")

    private String contactName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_phone")

    private String contactPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contact_email")

    private String contactEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_dns_auth")

    private Boolean autoDnsAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agree_privacy_protection")

    private Boolean agreePrivacyProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_method")

    private String domainMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_algorithm")

    private String keyAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_hash_algorithm")

    private String caHashAlgorithm;

    public ApplyCertificateRequestBody withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 该证书绑定的域名。 - 当购买的证书为“单域名”或“泛域名”类型的证书时，请直接填写单域名或泛域名即可。 - 当购买的证书为“多域名”类型的证书时，需要选择1个域名作为主域名。 示例：www.example.com
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ApplyCertificateRequestBody withSans(String sans) {
        this.sans = sans;
        return this;
    }

    /**
     * 绑定多域名类型证书的附加域名。 当购买的证书为“多域名”类型的证书，且有可增加附加域名的额度时，才需要设置该值。 多个域名需要以“;”隔开。 示例：www.example.com;www.example1.com;www.example2.com
     * @return sans
     */
    public String getSans() {
        return sans;
    }

    public void setSans(String sans) {
        this.sans = sans;
    }

    public ApplyCertificateRequestBody withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    /**
     * 证书CSR串，与域名必须匹配。
     * @return csr
     */
    public String getCsr() {
        return csr;
    }

    public void setCsr(String csr) {
        this.csr = csr;
    }

    public ApplyCertificateRequestBody withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * 公司名称，OV和EV型证书必填。字符长度为0~63位。
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ApplyCertificateRequestBody withCompanyUnit(String companyUnit) {
        this.companyUnit = companyUnit;
        return this;
    }

    /**
     * 部门名称。字符长度为0~63位。
     * @return companyUnit
     */
    public String getCompanyUnit() {
        return companyUnit;
    }

    public void setCompanyUnit(String companyUnit) {
        this.companyUnit = companyUnit;
    }

    public ApplyCertificateRequestBody withCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
        return this;
    }

    /**
     * 公司所在省份，OV和EV型证书必填。字符长度为0~63位。
     * @return companyProvince
     */
    public String getCompanyProvince() {
        return companyProvince;
    }

    public void setCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
    }

    public ApplyCertificateRequestBody withCompanyCity(String companyCity) {
        this.companyCity = companyCity;
        return this;
    }

    /**
     * 公司所在市区，OV和EV型证书必填。字符长度为0~63位。
     * @return companyCity
     */
    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public ApplyCertificateRequestBody withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * OV和EV型证书必填,国家编码，需符合正则\"**[A-Za-z]{2}**\"。
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ApplyCertificateRequestBody withApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }

    /**
     * 申请人的姓名。请输入中文、英文字符，下划线，中划线，英文逗号，英文句点，且长度为4到100字节。
     * @return applicantName
     */
    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public ApplyCertificateRequestBody withApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone;
        return this;
    }

    /**
     * 申请人的电话号码。示例：13212345678
     * @return applicantPhone
     */
    public String getApplicantPhone() {
        return applicantPhone;
    }

    public void setApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone;
    }

    public ApplyCertificateRequestBody withApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
        return this;
    }

    /**
     * 申请人的邮箱。示例：example@huawei.com
     * @return applicantEmail
     */
    public String getApplicantEmail() {
        return applicantEmail;
    }

    public void setApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    public ApplyCertificateRequestBody withContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * 技术联系人的姓名。字符长度为0~63位。
     * @return contactName
     */
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public ApplyCertificateRequestBody withContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    /**
     * 技术联系人的电话号码。示例：13212345678
     * @return contactPhone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public ApplyCertificateRequestBody withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * 技术联系人的邮箱。示例：example@huawei.com
     * @return contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public ApplyCertificateRequestBody withAutoDnsAuth(Boolean autoDnsAuth) {
        this.autoDnsAuth = autoDnsAuth;
        return this;
    }

    /**
     * 是否将DNS验证信息推送到华为云解析服务。 - true：推送。 - false：不推送。
     * @return autoDnsAuth
     */
    public Boolean getAutoDnsAuth() {
        return autoDnsAuth;
    }

    public void setAutoDnsAuth(Boolean autoDnsAuth) {
        this.autoDnsAuth = autoDnsAuth;
    }

    public ApplyCertificateRequestBody withAgreePrivacyProtection(Boolean agreePrivacyProtection) {
        this.agreePrivacyProtection = agreePrivacyProtection;
        return this;
    }

    /**
     * 是否同意授权隐私协议。此处仅能设置为true才能成功申请证书。 - true：同意隐私协议。 - false：不同意隐私协议。
     * @return agreePrivacyProtection
     */
    public Boolean getAgreePrivacyProtection() {
        return agreePrivacyProtection;
    }

    public void setAgreePrivacyProtection(Boolean agreePrivacyProtection) {
        this.agreePrivacyProtection = agreePrivacyProtection;
    }

    public ApplyCertificateRequestBody withDomainMethod(String domainMethod) {
        this.domainMethod = domainMethod;
        return this;
    }

    /**
     * 域名验证方式。 - DNS：DNS验证，指在域名管理平台通过解析指定的DNS记录，验证域名所有权。 - FILE：文件验证，指通过在服务器上创建指定文件的方式来验证域名所有权。 - EMAIL：邮箱验证，指登录域名管理员邮箱，接收域名确认邮件并根据提示进行操作来验证域名所有权。 DV域名型和DV基础版证书（GeoTrust入门级SSL证书和DigiCert免费SSL证书）默认通过“DNS验证”方式进行验证。 纯IP（公网IP）的证书仅支持通过“文件验证”方式进行验证，且仅纯IP证书支持“文件验证”方式验证。
     * @return domainMethod
     */
    public String getDomainMethod() {
        return domainMethod;
    }

    public void setDomainMethod(String domainMethod) {
        this.domainMethod = domainMethod;
    }

    public ApplyCertificateRequestBody withKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }

    /**
     * 密钥算法。默认RSA_2048
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    public ApplyCertificateRequestBody withCaHashAlgorithm(String caHashAlgorithm) {
        this.caHashAlgorithm = caHashAlgorithm;
        return this;
    }

    /**
     * 签名算法。Geo OV证书必填。 - DEFAULT - SHA-256
     * @return caHashAlgorithm
     */
    public String getCaHashAlgorithm() {
        return caHashAlgorithm;
    }

    public void setCaHashAlgorithm(String caHashAlgorithm) {
        this.caHashAlgorithm = caHashAlgorithm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyCertificateRequestBody that = (ApplyCertificateRequestBody) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.sans, that.sans)
            && Objects.equals(this.csr, that.csr) && Objects.equals(this.companyName, that.companyName)
            && Objects.equals(this.companyUnit, that.companyUnit)
            && Objects.equals(this.companyProvince, that.companyProvince)
            && Objects.equals(this.companyCity, that.companyCity) && Objects.equals(this.country, that.country)
            && Objects.equals(this.applicantName, that.applicantName)
            && Objects.equals(this.applicantPhone, that.applicantPhone)
            && Objects.equals(this.applicantEmail, that.applicantEmail)
            && Objects.equals(this.contactName, that.contactName)
            && Objects.equals(this.contactPhone, that.contactPhone)
            && Objects.equals(this.contactEmail, that.contactEmail)
            && Objects.equals(this.autoDnsAuth, that.autoDnsAuth)
            && Objects.equals(this.agreePrivacyProtection, that.agreePrivacyProtection)
            && Objects.equals(this.domainMethod, that.domainMethod)
            && Objects.equals(this.keyAlgorithm, that.keyAlgorithm)
            && Objects.equals(this.caHashAlgorithm, that.caHashAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain,
            sans,
            csr,
            companyName,
            companyUnit,
            companyProvince,
            companyCity,
            country,
            applicantName,
            applicantPhone,
            applicantEmail,
            contactName,
            contactPhone,
            contactEmail,
            autoDnsAuth,
            agreePrivacyProtection,
            domainMethod,
            keyAlgorithm,
            caHashAlgorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyCertificateRequestBody {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    sans: ").append(toIndentedString(sans)).append("\n");
        sb.append("    csr: ").append(toIndentedString(csr)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    companyUnit: ").append(toIndentedString(companyUnit)).append("\n");
        sb.append("    companyProvince: ").append(toIndentedString(companyProvince)).append("\n");
        sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    applicantName: ").append(toIndentedString(applicantName)).append("\n");
        sb.append("    applicantPhone: ").append(toIndentedString(applicantPhone)).append("\n");
        sb.append("    applicantEmail: ").append(toIndentedString(applicantEmail)).append("\n");
        sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
        sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
        sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
        sb.append("    autoDnsAuth: ").append(toIndentedString(autoDnsAuth)).append("\n");
        sb.append("    agreePrivacyProtection: ").append(toIndentedString(agreePrivacyProtection)).append("\n");
        sb.append("    domainMethod: ").append(toIndentedString(domainMethod)).append("\n");
        sb.append("    keyAlgorithm: ").append(toIndentedString(keyAlgorithm)).append("\n");
        sb.append("    caHashAlgorithm: ").append(toIndentedString(caHashAlgorithm)).append("\n");
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
