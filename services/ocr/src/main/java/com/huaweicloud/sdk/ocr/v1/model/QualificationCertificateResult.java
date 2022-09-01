package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class QualificationCertificateResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    @JacksonXmlProperty(localName = "id_number")

    private String idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assessment_date")

    @JacksonXmlProperty(localName = "assessment_date")

    private String assessmentDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_number")

    @JacksonXmlProperty(localName = "certificate_number")

    private String certificateNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_number")

    @JacksonXmlProperty(localName = "file_number")

    private String fileNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "union_card_number")

    @JacksonXmlProperty(localName = "union_card_number")

    private String unionCardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continuing_education_info")

    @JacksonXmlProperty(localName = "continuing_education_info")

    private String continuingEducationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    @JacksonXmlProperty(localName = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_number")

    @JacksonXmlProperty(localName = "phone_number")

    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registration_date")

    @JacksonXmlProperty(localName = "registration_date")

    private String registrationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_unit")

    @JacksonXmlProperty(localName = "work_unit")

    private String workUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "integrity_assessment_info")

    @JacksonXmlProperty(localName = "integrity_assessment_info")

    private String integrityAssessmentInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nationality")

    @JacksonXmlProperty(localName = "nationality")

    private String nationality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    @JacksonXmlProperty(localName = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driving_class")

    @JacksonXmlProperty(localName = "driving_class")

    private String drivingClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    @JacksonXmlProperty(localName = "issuing_authority")

    private String issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    @JacksonXmlProperty(localName = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualification_category_list")

    @JacksonXmlProperty(localName = "qualification_category_list")

    private List<QualificationCategory> qualificationCategoryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private QualificationConfidence confidence;

    public QualificationCertificateResult withIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /**
     * 身份证号（非必有，依赖对应从业资格证板式）。 
     * @return idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public QualificationCertificateResult withAssessmentDate(String assessmentDate) {
        this.assessmentDate = assessmentDate;
        return this;
    }

    /**
     * 考核时间（非必有，依赖对应从业资格证板式）。 
     * @return assessmentDate
     */
    public String getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(String assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public QualificationCertificateResult withCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }

    /**
     * 从业资格证号。 
     * @return certificateNumber
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public QualificationCertificateResult withFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
        return this;
    }

    /**
     * 档案号（非必有，依赖对应从业资格证板式）。 
     * @return fileNumber
     */
    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public QualificationCertificateResult withUnionCardNumber(String unionCardNumber) {
        this.unionCardNumber = unionCardNumber;
        return this;
    }

    /**
     * 福路通号（非必有，依赖对应从业资格证板式）。 
     * @return unionCardNumber
     */
    public String getUnionCardNumber() {
        return unionCardNumber;
    }

    public void setUnionCardNumber(String unionCardNumber) {
        this.unionCardNumber = unionCardNumber;
    }

    public QualificationCertificateResult withContinuingEducationInfo(String continuingEducationInfo) {
        this.continuingEducationInfo = continuingEducationInfo;
        return this;
    }

    /**
     * 继续教育信息（非必有，依赖对应从业资格证板式）。 
     * @return continuingEducationInfo
     */
    public String getContinuingEducationInfo() {
        return continuingEducationInfo;
    }

    public void setContinuingEducationInfo(String continuingEducationInfo) {
        this.continuingEducationInfo = continuingEducationInfo;
    }

    public QualificationCertificateResult withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别（非必有，依赖对应从业资格证板式）。 
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public QualificationCertificateResult withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * 联系电话（非必有，依赖对应从业资格证板式）。 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public QualificationCertificateResult withRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /**
     * 登记时间（非必有，依赖对应从业资格证板式）。 
     * @return registrationDate
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public QualificationCertificateResult withWorkUnit(String workUnit) {
        this.workUnit = workUnit;
        return this;
    }

    /**
     * 单位（非必有，依赖对应从业资格证板式）。 
     * @return workUnit
     */
    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public QualificationCertificateResult withIntegrityAssessmentInfo(String integrityAssessmentInfo) {
        this.integrityAssessmentInfo = integrityAssessmentInfo;
        return this;
    }

    /**
     * 诚信考核信息（非必有，依赖对应从业资格证板式）。 
     * @return integrityAssessmentInfo
     */
    public String getIntegrityAssessmentInfo() {
        return integrityAssessmentInfo;
    }

    public void setIntegrityAssessmentInfo(String integrityAssessmentInfo) {
        this.integrityAssessmentInfo = integrityAssessmentInfo;
    }

    public QualificationCertificateResult withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    /**
     * 国籍（非必有，依赖对应从业资格证板式）。 
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public QualificationCertificateResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QualificationCertificateResult withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 住址。 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public QualificationCertificateResult withDrivingClass(String drivingClass) {
        this.drivingClass = drivingClass;
        return this;
    }

    /**
     * 准驾车型（非必有，依赖对应从业资格证板式）。 
     * @return drivingClass
     */
    public String getDrivingClass() {
        return drivingClass;
    }

    public void setDrivingClass(String drivingClass) {
        this.drivingClass = drivingClass;
    }

    public QualificationCertificateResult withIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * 发证机关（非必有，依赖对应从业资格证板式）。 
     * @return issuingAuthority
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public QualificationCertificateResult withBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * 出生日期（非必有，依赖对应从业资格证板式）。 
     * @return birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public QualificationCertificateResult withQualificationCategoryList(
        List<QualificationCategory> qualificationCategoryList) {
        this.qualificationCategoryList = qualificationCategoryList;
        return this;
    }

    public QualificationCertificateResult addQualificationCategoryListItem(
        QualificationCategory qualificationCategoryListItem) {
        if (this.qualificationCategoryList == null) {
            this.qualificationCategoryList = new ArrayList<>();
        }
        this.qualificationCategoryList.add(qualificationCategoryListItem);
        return this;
    }

    public QualificationCertificateResult withQualificationCategoryList(
        Consumer<List<QualificationCategory>> qualificationCategoryListSetter) {
        if (this.qualificationCategoryList == null) {
            this.qualificationCategoryList = new ArrayList<>();
        }
        qualificationCategoryListSetter.accept(this.qualificationCategoryList);
        return this;
    }

    /**
     * 从业资格列表。 
     * @return qualificationCategoryList
     */
    public List<QualificationCategory> getQualificationCategoryList() {
        return qualificationCategoryList;
    }

    public void setQualificationCategoryList(List<QualificationCategory> qualificationCategoryList) {
        this.qualificationCategoryList = qualificationCategoryList;
    }

    public QualificationCertificateResult withConfidence(QualificationConfidence confidence) {
        this.confidence = confidence;
        return this;
    }

    public QualificationCertificateResult withConfidence(Consumer<QualificationConfidence> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new QualificationConfidence();
            confidenceSetter.accept(this.confidence);
        }

        return this;
    }

    /**
     * Get confidence
     * @return confidence
     */
    public QualificationConfidence getConfidence() {
        return confidence;
    }

    public void setConfidence(QualificationConfidence confidence) {
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
        QualificationCertificateResult qualificationCertificateResult = (QualificationCertificateResult) o;
        return Objects.equals(this.idNumber, qualificationCertificateResult.idNumber)
            && Objects.equals(this.assessmentDate, qualificationCertificateResult.assessmentDate)
            && Objects.equals(this.certificateNumber, qualificationCertificateResult.certificateNumber)
            && Objects.equals(this.fileNumber, qualificationCertificateResult.fileNumber)
            && Objects.equals(this.unionCardNumber, qualificationCertificateResult.unionCardNumber)
            && Objects.equals(this.continuingEducationInfo, qualificationCertificateResult.continuingEducationInfo)
            && Objects.equals(this.sex, qualificationCertificateResult.sex)
            && Objects.equals(this.phoneNumber, qualificationCertificateResult.phoneNumber)
            && Objects.equals(this.registrationDate, qualificationCertificateResult.registrationDate)
            && Objects.equals(this.workUnit, qualificationCertificateResult.workUnit)
            && Objects.equals(this.integrityAssessmentInfo, qualificationCertificateResult.integrityAssessmentInfo)
            && Objects.equals(this.nationality, qualificationCertificateResult.nationality)
            && Objects.equals(this.name, qualificationCertificateResult.name)
            && Objects.equals(this.address, qualificationCertificateResult.address)
            && Objects.equals(this.drivingClass, qualificationCertificateResult.drivingClass)
            && Objects.equals(this.issuingAuthority, qualificationCertificateResult.issuingAuthority)
            && Objects.equals(this.birthDate, qualificationCertificateResult.birthDate)
            && Objects.equals(this.qualificationCategoryList, qualificationCertificateResult.qualificationCategoryList)
            && Objects.equals(this.confidence, qualificationCertificateResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber,
            assessmentDate,
            certificateNumber,
            fileNumber,
            unionCardNumber,
            continuingEducationInfo,
            sex,
            phoneNumber,
            registrationDate,
            workUnit,
            integrityAssessmentInfo,
            nationality,
            name,
            address,
            drivingClass,
            issuingAuthority,
            birthDate,
            qualificationCategoryList,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualificationCertificateResult {\n");
        sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
        sb.append("    assessmentDate: ").append(toIndentedString(assessmentDate)).append("\n");
        sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
        sb.append("    fileNumber: ").append(toIndentedString(fileNumber)).append("\n");
        sb.append("    unionCardNumber: ").append(toIndentedString(unionCardNumber)).append("\n");
        sb.append("    continuingEducationInfo: ").append(toIndentedString(continuingEducationInfo)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
        sb.append("    workUnit: ").append(toIndentedString(workUnit)).append("\n");
        sb.append("    integrityAssessmentInfo: ").append(toIndentedString(integrityAssessmentInfo)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    drivingClass: ").append(toIndentedString(drivingClass)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    qualificationCategoryList: ").append(toIndentedString(qualificationCategoryList)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
