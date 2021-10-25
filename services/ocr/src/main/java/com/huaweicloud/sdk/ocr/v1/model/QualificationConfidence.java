package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** QualificationConfidence */
public class QualificationConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    private Float idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assessment_date")

    private Float assessmentDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_number")

    private Float certificateNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_number")

    private Float fileNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "union_card_number")

    private Float unionCardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continuing_education_info")

    private Float continuingEducationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private Float sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_number")

    private Float phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registration_date")

    private Float registrationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_unit")

    private Float workUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "integrity_assessment_info")

    private Float integrityAssessmentInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nationality")

    private Float nationality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private Float name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private Float address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driving_class")

    private Float drivingClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private Float issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private Float birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualification_category_list")

    private List<QualificationCategoryConfidence> qualificationCategoryList = null;

    public QualificationConfidence withIdNumber(Float idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /** 身份证号置信度。
     * 
     * @return idNumber */
    public Float getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Float idNumber) {
        this.idNumber = idNumber;
    }

    public QualificationConfidence withAssessmentDate(Float assessmentDate) {
        this.assessmentDate = assessmentDate;
        return this;
    }

    /** 考核时间置信度。
     * 
     * @return assessmentDate */
    public Float getAssessmentDate() {
        return assessmentDate;
    }

    public void setAssessmentDate(Float assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public QualificationConfidence withCertificateNumber(Float certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }

    /** 从业资格证号置信度。
     * 
     * @return certificateNumber */
    public Float getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(Float certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public QualificationConfidence withFileNumber(Float fileNumber) {
        this.fileNumber = fileNumber;
        return this;
    }

    /** 档案号置信度。
     * 
     * @return fileNumber */
    public Float getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(Float fileNumber) {
        this.fileNumber = fileNumber;
    }

    public QualificationConfidence withUnionCardNumber(Float unionCardNumber) {
        this.unionCardNumber = unionCardNumber;
        return this;
    }

    /** 福路通号置信度。
     * 
     * @return unionCardNumber */
    public Float getUnionCardNumber() {
        return unionCardNumber;
    }

    public void setUnionCardNumber(Float unionCardNumber) {
        this.unionCardNumber = unionCardNumber;
    }

    public QualificationConfidence withContinuingEducationInfo(Float continuingEducationInfo) {
        this.continuingEducationInfo = continuingEducationInfo;
        return this;
    }

    /** 继续教育信息置信度。
     * 
     * @return continuingEducationInfo */
    public Float getContinuingEducationInfo() {
        return continuingEducationInfo;
    }

    public void setContinuingEducationInfo(Float continuingEducationInfo) {
        this.continuingEducationInfo = continuingEducationInfo;
    }

    public QualificationConfidence withSex(Float sex) {
        this.sex = sex;
        return this;
    }

    /** 性别置信度。
     * 
     * @return sex */
    public Float getSex() {
        return sex;
    }

    public void setSex(Float sex) {
        this.sex = sex;
    }

    public QualificationConfidence withPhoneNumber(Float phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /** 联系电话置信度。
     * 
     * @return phoneNumber */
    public Float getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Float phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public QualificationConfidence withRegistrationDate(Float registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /** 登记时间置信度。
     * 
     * @return registrationDate */
    public Float getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Float registrationDate) {
        this.registrationDate = registrationDate;
    }

    public QualificationConfidence withWorkUnit(Float workUnit) {
        this.workUnit = workUnit;
        return this;
    }

    /** 单位置信度。
     * 
     * @return workUnit */
    public Float getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(Float workUnit) {
        this.workUnit = workUnit;
    }

    public QualificationConfidence withIntegrityAssessmentInfo(Float integrityAssessmentInfo) {
        this.integrityAssessmentInfo = integrityAssessmentInfo;
        return this;
    }

    /** 诚信考核信息置信度。
     * 
     * @return integrityAssessmentInfo */
    public Float getIntegrityAssessmentInfo() {
        return integrityAssessmentInfo;
    }

    public void setIntegrityAssessmentInfo(Float integrityAssessmentInfo) {
        this.integrityAssessmentInfo = integrityAssessmentInfo;
    }

    public QualificationConfidence withNationality(Float nationality) {
        this.nationality = nationality;
        return this;
    }

    /** 国籍置信度。
     * 
     * @return nationality */
    public Float getNationality() {
        return nationality;
    }

    public void setNationality(Float nationality) {
        this.nationality = nationality;
    }

    public QualificationConfidence withName(Float name) {
        this.name = name;
        return this;
    }

    /** 姓名置信度。
     * 
     * @return name */
    public Float getName() {
        return name;
    }

    public void setName(Float name) {
        this.name = name;
    }

    public QualificationConfidence withAddress(Float address) {
        this.address = address;
        return this;
    }

    /** 住址置信度。
     * 
     * @return address */
    public Float getAddress() {
        return address;
    }

    public void setAddress(Float address) {
        this.address = address;
    }

    public QualificationConfidence withDrivingClass(Float drivingClass) {
        this.drivingClass = drivingClass;
        return this;
    }

    /** 准驾车型置信度。
     * 
     * @return drivingClass */
    public Float getDrivingClass() {
        return drivingClass;
    }

    public void setDrivingClass(Float drivingClass) {
        this.drivingClass = drivingClass;
    }

    public QualificationConfidence withIssuingAuthority(Float issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /** 发证机关置信度。
     * 
     * @return issuingAuthority */
    public Float getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(Float issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public QualificationConfidence withBirthDate(Float birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /** 出生日期置信度。
     * 
     * @return birthDate */
    public Float getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Float birthDate) {
        this.birthDate = birthDate;
    }

    public QualificationConfidence withQualificationCategoryList(
        List<QualificationCategoryConfidence> qualificationCategoryList) {
        this.qualificationCategoryList = qualificationCategoryList;
        return this;
    }

    public QualificationConfidence addQualificationCategoryListItem(
        QualificationCategoryConfidence qualificationCategoryListItem) {
        if (this.qualificationCategoryList == null) {
            this.qualificationCategoryList = new ArrayList<>();
        }
        this.qualificationCategoryList.add(qualificationCategoryListItem);
        return this;
    }

    public QualificationConfidence withQualificationCategoryList(
        Consumer<List<QualificationCategoryConfidence>> qualificationCategoryListSetter) {
        if (this.qualificationCategoryList == null) {
            this.qualificationCategoryList = new ArrayList<>();
        }
        qualificationCategoryListSetter.accept(this.qualificationCategoryList);
        return this;
    }

    /** 从业资格列表置信度。
     * 
     * @return qualificationCategoryList */
    public List<QualificationCategoryConfidence> getQualificationCategoryList() {
        return qualificationCategoryList;
    }

    public void setQualificationCategoryList(List<QualificationCategoryConfidence> qualificationCategoryList) {
        this.qualificationCategoryList = qualificationCategoryList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualificationConfidence qualificationConfidence = (QualificationConfidence) o;
        return Objects.equals(this.idNumber, qualificationConfidence.idNumber)
            && Objects.equals(this.assessmentDate, qualificationConfidence.assessmentDate)
            && Objects.equals(this.certificateNumber, qualificationConfidence.certificateNumber)
            && Objects.equals(this.fileNumber, qualificationConfidence.fileNumber)
            && Objects.equals(this.unionCardNumber, qualificationConfidence.unionCardNumber)
            && Objects.equals(this.continuingEducationInfo, qualificationConfidence.continuingEducationInfo)
            && Objects.equals(this.sex, qualificationConfidence.sex)
            && Objects.equals(this.phoneNumber, qualificationConfidence.phoneNumber)
            && Objects.equals(this.registrationDate, qualificationConfidence.registrationDate)
            && Objects.equals(this.workUnit, qualificationConfidence.workUnit)
            && Objects.equals(this.integrityAssessmentInfo, qualificationConfidence.integrityAssessmentInfo)
            && Objects.equals(this.nationality, qualificationConfidence.nationality)
            && Objects.equals(this.name, qualificationConfidence.name)
            && Objects.equals(this.address, qualificationConfidence.address)
            && Objects.equals(this.drivingClass, qualificationConfidence.drivingClass)
            && Objects.equals(this.issuingAuthority, qualificationConfidence.issuingAuthority)
            && Objects.equals(this.birthDate, qualificationConfidence.birthDate)
            && Objects.equals(this.qualificationCategoryList, qualificationConfidence.qualificationCategoryList);
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
            qualificationCategoryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualificationConfidence {\n");
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
