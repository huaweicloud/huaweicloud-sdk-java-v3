package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 证书申请信息。
 */
public class ShowCertificateResponseBodyApplicationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_name")

    private String companyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_province")

    private String companyProvince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_city")

    private String companyCity;

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

    public ShowCertificateResponseBodyApplicationInfo withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 国家。
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ShowCertificateResponseBodyApplicationInfo withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * 公司名称。
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ShowCertificateResponseBodyApplicationInfo withCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
        return this;
    }

    /**
     * 公司省份。
     * @return companyProvince
     */
    public String getCompanyProvince() {
        return companyProvince;
    }

    public void setCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
    }

    public ShowCertificateResponseBodyApplicationInfo withCompanyCity(String companyCity) {
        this.companyCity = companyCity;
        return this;
    }

    /**
     * 公司所在城市。
     * @return companyCity
     */
    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public ShowCertificateResponseBodyApplicationInfo withApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }

    /**
     * 申请人名称。
     * @return applicantName
     */
    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public ShowCertificateResponseBodyApplicationInfo withApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone;
        return this;
    }

    /**
     * 申请人电话。
     * @return applicantPhone
     */
    public String getApplicantPhone() {
        return applicantPhone;
    }

    public void setApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone;
    }

    public ShowCertificateResponseBodyApplicationInfo withApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
        return this;
    }

    /**
     * 申请人邮箱。
     * @return applicantEmail
     */
    public String getApplicantEmail() {
        return applicantEmail;
    }

    public void setApplicantEmail(String applicantEmail) {
        this.applicantEmail = applicantEmail;
    }

    public ShowCertificateResponseBodyApplicationInfo withContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * 技术联系人名称。
     * @return contactName
     */
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public ShowCertificateResponseBodyApplicationInfo withContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    /**
     * 技术联系人电话。
     * @return contactPhone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public ShowCertificateResponseBodyApplicationInfo withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * 技术联系人邮箱。
     * @return contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCertificateResponseBodyApplicationInfo that = (ShowCertificateResponseBodyApplicationInfo) obj;
        return Objects.equals(this.country, that.country) && Objects.equals(this.companyName, that.companyName)
            && Objects.equals(this.companyProvince, that.companyProvince)
            && Objects.equals(this.companyCity, that.companyCity)
            && Objects.equals(this.applicantName, that.applicantName)
            && Objects.equals(this.applicantPhone, that.applicantPhone)
            && Objects.equals(this.applicantEmail, that.applicantEmail)
            && Objects.equals(this.contactName, that.contactName)
            && Objects.equals(this.contactPhone, that.contactPhone)
            && Objects.equals(this.contactEmail, that.contactEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country,
            companyName,
            companyProvince,
            companyCity,
            applicantName,
            applicantPhone,
            applicantEmail,
            contactName,
            contactPhone,
            contactEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificateResponseBodyApplicationInfo {\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    companyProvince: ").append(toIndentedString(companyProvince)).append("\n");
        sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
        sb.append("    applicantName: ").append(toIndentedString(applicantName)).append("\n");
        sb.append("    applicantPhone: ").append(toIndentedString(applicantPhone)).append("\n");
        sb.append("    applicantEmail: ").append(toIndentedString(applicantEmail)).append("\n");
        sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
        sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
        sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
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
