package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class InsurancePolicyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bank_name")

    private String bankName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_number")

    private InsurancePolicyDetail billNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company")

    private InsurancePolicyDetail company;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_date")

    private InsurancePolicyDetail effectiveDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_name")

    private InsurancePolicyDetail applicantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_sex")

    private InsurancePolicyDetail applicantSex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_birthday")

    private InsurancePolicyDetail applicantBirthday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_id_type")

    private InsurancePolicyDetail applicantIdType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applicant_id_number")

    private InsurancePolicyDetail applicantIdNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurant_list")

    private List<InsurantItem> insurantList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "beneficiary_list")

    private List<BeneficiaryItem> beneficiaryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insurance_list")

    private List<InsuranceItem> insuranceList = null;

    public InsurancePolicyResult withBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    /** 发卡行。
     * 
     * @return bankName */
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public InsurancePolicyResult withBillNumber(InsurancePolicyDetail billNumber) {
        this.billNumber = billNumber;
        return this;
    }

    public InsurancePolicyResult withBillNumber(Consumer<InsurancePolicyDetail> billNumberSetter) {
        if (this.billNumber == null) {
            this.billNumber = new InsurancePolicyDetail();
            billNumberSetter.accept(this.billNumber);
        }

        return this;
    }

    /** Get billNumber
     * 
     * @return billNumber */
    public InsurancePolicyDetail getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(InsurancePolicyDetail billNumber) {
        this.billNumber = billNumber;
    }

    public InsurancePolicyResult withCompany(InsurancePolicyDetail company) {
        this.company = company;
        return this;
    }

    public InsurancePolicyResult withCompany(Consumer<InsurancePolicyDetail> companySetter) {
        if (this.company == null) {
            this.company = new InsurancePolicyDetail();
            companySetter.accept(this.company);
        }

        return this;
    }

    /** Get company
     * 
     * @return company */
    public InsurancePolicyDetail getCompany() {
        return company;
    }

    public void setCompany(InsurancePolicyDetail company) {
        this.company = company;
    }

    public InsurancePolicyResult withEffectiveDate(InsurancePolicyDetail effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public InsurancePolicyResult withEffectiveDate(Consumer<InsurancePolicyDetail> effectiveDateSetter) {
        if (this.effectiveDate == null) {
            this.effectiveDate = new InsurancePolicyDetail();
            effectiveDateSetter.accept(this.effectiveDate);
        }

        return this;
    }

    /** Get effectiveDate
     * 
     * @return effectiveDate */
    public InsurancePolicyDetail getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(InsurancePolicyDetail effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public InsurancePolicyResult withApplicantName(InsurancePolicyDetail applicantName) {
        this.applicantName = applicantName;
        return this;
    }

    public InsurancePolicyResult withApplicantName(Consumer<InsurancePolicyDetail> applicantNameSetter) {
        if (this.applicantName == null) {
            this.applicantName = new InsurancePolicyDetail();
            applicantNameSetter.accept(this.applicantName);
        }

        return this;
    }

    /** Get applicantName
     * 
     * @return applicantName */
    public InsurancePolicyDetail getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(InsurancePolicyDetail applicantName) {
        this.applicantName = applicantName;
    }

    public InsurancePolicyResult withApplicantSex(InsurancePolicyDetail applicantSex) {
        this.applicantSex = applicantSex;
        return this;
    }

    public InsurancePolicyResult withApplicantSex(Consumer<InsurancePolicyDetail> applicantSexSetter) {
        if (this.applicantSex == null) {
            this.applicantSex = new InsurancePolicyDetail();
            applicantSexSetter.accept(this.applicantSex);
        }

        return this;
    }

    /** Get applicantSex
     * 
     * @return applicantSex */
    public InsurancePolicyDetail getApplicantSex() {
        return applicantSex;
    }

    public void setApplicantSex(InsurancePolicyDetail applicantSex) {
        this.applicantSex = applicantSex;
    }

    public InsurancePolicyResult withApplicantBirthday(InsurancePolicyDetail applicantBirthday) {
        this.applicantBirthday = applicantBirthday;
        return this;
    }

    public InsurancePolicyResult withApplicantBirthday(Consumer<InsurancePolicyDetail> applicantBirthdaySetter) {
        if (this.applicantBirthday == null) {
            this.applicantBirthday = new InsurancePolicyDetail();
            applicantBirthdaySetter.accept(this.applicantBirthday);
        }

        return this;
    }

    /** Get applicantBirthday
     * 
     * @return applicantBirthday */
    public InsurancePolicyDetail getApplicantBirthday() {
        return applicantBirthday;
    }

    public void setApplicantBirthday(InsurancePolicyDetail applicantBirthday) {
        this.applicantBirthday = applicantBirthday;
    }

    public InsurancePolicyResult withApplicantIdType(InsurancePolicyDetail applicantIdType) {
        this.applicantIdType = applicantIdType;
        return this;
    }

    public InsurancePolicyResult withApplicantIdType(Consumer<InsurancePolicyDetail> applicantIdTypeSetter) {
        if (this.applicantIdType == null) {
            this.applicantIdType = new InsurancePolicyDetail();
            applicantIdTypeSetter.accept(this.applicantIdType);
        }

        return this;
    }

    /** Get applicantIdType
     * 
     * @return applicantIdType */
    public InsurancePolicyDetail getApplicantIdType() {
        return applicantIdType;
    }

    public void setApplicantIdType(InsurancePolicyDetail applicantIdType) {
        this.applicantIdType = applicantIdType;
    }

    public InsurancePolicyResult withApplicantIdNumber(InsurancePolicyDetail applicantIdNumber) {
        this.applicantIdNumber = applicantIdNumber;
        return this;
    }

    public InsurancePolicyResult withApplicantIdNumber(Consumer<InsurancePolicyDetail> applicantIdNumberSetter) {
        if (this.applicantIdNumber == null) {
            this.applicantIdNumber = new InsurancePolicyDetail();
            applicantIdNumberSetter.accept(this.applicantIdNumber);
        }

        return this;
    }

    /** Get applicantIdNumber
     * 
     * @return applicantIdNumber */
    public InsurancePolicyDetail getApplicantIdNumber() {
        return applicantIdNumber;
    }

    public void setApplicantIdNumber(InsurancePolicyDetail applicantIdNumber) {
        this.applicantIdNumber = applicantIdNumber;
    }

    public InsurancePolicyResult withInsurantList(List<InsurantItem> insurantList) {
        this.insurantList = insurantList;
        return this;
    }

    public InsurancePolicyResult addInsurantListItem(InsurantItem insurantListItem) {
        if (this.insurantList == null) {
            this.insurantList = new ArrayList<>();
        }
        this.insurantList.add(insurantListItem);
        return this;
    }

    public InsurancePolicyResult withInsurantList(Consumer<List<InsurantItem>> insurantListSetter) {
        if (this.insurantList == null) {
            this.insurantList = new ArrayList<>();
        }
        insurantListSetter.accept(this.insurantList);
        return this;
    }

    /** 被保人列表（第一个默认为主被保人）。
     * 
     * @return insurantList */
    public List<InsurantItem> getInsurantList() {
        return insurantList;
    }

    public void setInsurantList(List<InsurantItem> insurantList) {
        this.insurantList = insurantList;
    }

    public InsurancePolicyResult withBeneficiaryList(List<BeneficiaryItem> beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
        return this;
    }

    public InsurancePolicyResult addBeneficiaryListItem(BeneficiaryItem beneficiaryListItem) {
        if (this.beneficiaryList == null) {
            this.beneficiaryList = new ArrayList<>();
        }
        this.beneficiaryList.add(beneficiaryListItem);
        return this;
    }

    public InsurancePolicyResult withBeneficiaryList(Consumer<List<BeneficiaryItem>> beneficiaryListSetter) {
        if (this.beneficiaryList == null) {
            this.beneficiaryList = new ArrayList<>();
        }
        beneficiaryListSetter.accept(this.beneficiaryList);
        return this;
    }

    /** 受益人列表。
     * 
     * @return beneficiaryList */
    public List<BeneficiaryItem> getBeneficiaryList() {
        return beneficiaryList;
    }

    public void setBeneficiaryList(List<BeneficiaryItem> beneficiaryList) {
        this.beneficiaryList = beneficiaryList;
    }

    public InsurancePolicyResult withInsuranceList(List<InsuranceItem> insuranceList) {
        this.insuranceList = insuranceList;
        return this;
    }

    public InsurancePolicyResult addInsuranceListItem(InsuranceItem insuranceListItem) {
        if (this.insuranceList == null) {
            this.insuranceList = new ArrayList<>();
        }
        this.insuranceList.add(insuranceListItem);
        return this;
    }

    public InsurancePolicyResult withInsuranceList(Consumer<List<InsuranceItem>> insuranceListSetter) {
        if (this.insuranceList == null) {
            this.insuranceList = new ArrayList<>();
        }
        insuranceListSetter.accept(this.insuranceList);
        return this;
    }

    /** 保险项目信息列表。
     * 
     * @return insuranceList */
    public List<InsuranceItem> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(List<InsuranceItem> insuranceList) {
        this.insuranceList = insuranceList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsurancePolicyResult insurancePolicyResult = (InsurancePolicyResult) o;
        return Objects.equals(this.bankName, insurancePolicyResult.bankName)
            && Objects.equals(this.billNumber, insurancePolicyResult.billNumber)
            && Objects.equals(this.company, insurancePolicyResult.company)
            && Objects.equals(this.effectiveDate, insurancePolicyResult.effectiveDate)
            && Objects.equals(this.applicantName, insurancePolicyResult.applicantName)
            && Objects.equals(this.applicantSex, insurancePolicyResult.applicantSex)
            && Objects.equals(this.applicantBirthday, insurancePolicyResult.applicantBirthday)
            && Objects.equals(this.applicantIdType, insurancePolicyResult.applicantIdType)
            && Objects.equals(this.applicantIdNumber, insurancePolicyResult.applicantIdNumber)
            && Objects.equals(this.insurantList, insurancePolicyResult.insurantList)
            && Objects.equals(this.beneficiaryList, insurancePolicyResult.beneficiaryList)
            && Objects.equals(this.insuranceList, insurancePolicyResult.insuranceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName,
            billNumber,
            company,
            effectiveDate,
            applicantName,
            applicantSex,
            applicantBirthday,
            applicantIdType,
            applicantIdNumber,
            insurantList,
            beneficiaryList,
            insuranceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsurancePolicyResult {\n");
        sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
        sb.append("    billNumber: ").append(toIndentedString(billNumber)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    applicantName: ").append(toIndentedString(applicantName)).append("\n");
        sb.append("    applicantSex: ").append(toIndentedString(applicantSex)).append("\n");
        sb.append("    applicantBirthday: ").append(toIndentedString(applicantBirthday)).append("\n");
        sb.append("    applicantIdType: ").append(toIndentedString(applicantIdType)).append("\n");
        sb.append("    applicantIdNumber: ").append(toIndentedString(applicantIdNumber)).append("\n");
        sb.append("    insurantList: ").append(toIndentedString(insurantList)).append("\n");
        sb.append("    beneficiaryList: ").append(toIndentedString(beneficiaryList)).append("\n");
        sb.append("    insuranceList: ").append(toIndentedString(insuranceList)).append("\n");
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
