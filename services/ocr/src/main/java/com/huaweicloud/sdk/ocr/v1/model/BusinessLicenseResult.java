package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class BusinessLicenseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registration_number")

    private String registrationNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legal_representative")

    private String legalRepresentative;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registered_capital")

    private String registeredCapital;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "found_date")

    private String foundDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_term")

    private String businessTerm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_scope")

    private String businessScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public BusinessLicenseResult withRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    /** - 老版本营业执照对应注册号。 - 新三证合一版本营业执照对应社会保障号。
     * 
     * @return registrationNumber */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public BusinessLicenseResult withName(String name) {
        this.name = name;
        return this;
    }

    /** 企业名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BusinessLicenseResult withType(String type) {
        this.type = type;
        return this;
    }

    /** 公司/企业类型/主体类型。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BusinessLicenseResult withAddress(String address) {
        this.address = address;
        return this;
    }

    /** 住所/营业场所/企业住所。
     * 
     * @return address */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BusinessLicenseResult withLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
        return this;
    }

    /** 法定代表人/负责人。
     * 
     * @return legalRepresentative */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public BusinessLicenseResult withRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
        return this;
    }

    /** 注册资本。
     * 
     * @return registeredCapital */
    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public BusinessLicenseResult withFoundDate(String foundDate) {
        this.foundDate = foundDate;
        return this;
    }

    /** 成立日期。
     * 
     * @return foundDate */
    public String getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    }

    public BusinessLicenseResult withBusinessTerm(String businessTerm) {
        this.businessTerm = businessTerm;
        return this;
    }

    /** 营业期限。
     * 
     * @return businessTerm */
    public String getBusinessTerm() {
        return businessTerm;
    }

    public void setBusinessTerm(String businessTerm) {
        this.businessTerm = businessTerm;
    }

    public BusinessLicenseResult withBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }

    /** 经营范围。
     * 
     * @return businessScope */
    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public BusinessLicenseResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /** 发照日期。
     * 
     * @return issueDate */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public BusinessLicenseResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /** 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。
     * 
     * @return confidence */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessLicenseResult businessLicenseResult = (BusinessLicenseResult) o;
        return Objects.equals(this.registrationNumber, businessLicenseResult.registrationNumber)
            && Objects.equals(this.name, businessLicenseResult.name)
            && Objects.equals(this.type, businessLicenseResult.type)
            && Objects.equals(this.address, businessLicenseResult.address)
            && Objects.equals(this.legalRepresentative, businessLicenseResult.legalRepresentative)
            && Objects.equals(this.registeredCapital, businessLicenseResult.registeredCapital)
            && Objects.equals(this.foundDate, businessLicenseResult.foundDate)
            && Objects.equals(this.businessTerm, businessLicenseResult.businessTerm)
            && Objects.equals(this.businessScope, businessLicenseResult.businessScope)
            && Objects.equals(this.issueDate, businessLicenseResult.issueDate)
            && Objects.equals(this.confidence, businessLicenseResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber,
            name,
            type,
            address,
            legalRepresentative,
            registeredCapital,
            foundDate,
            businessTerm,
            businessScope,
            issueDate,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessLicenseResult {\n");
        sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    legalRepresentative: ").append(toIndentedString(legalRepresentative)).append("\n");
        sb.append("    registeredCapital: ").append(toIndentedString(registeredCapital)).append("\n");
        sb.append("    foundDate: ").append(toIndentedString(foundDate)).append("\n");
        sb.append("    businessTerm: ").append(toIndentedString(businessTerm)).append("\n");
        sb.append("    businessScope: ").append(toIndentedString(businessScope)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
