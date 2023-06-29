package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MainlandTravelPermitConfidence
 */
public class MainlandTravelPermitConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private Float name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private Float nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private Float birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private Float sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_period")

    private Float validPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private Float issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Float number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_place")

    private Float issuePlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_times")

    private Float issueTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Float type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    private Float side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_name")

    private Float idName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    private Float idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code1")

    private Float machineCode1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code2")

    private Float machineCode2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code3")

    private Float machineCode3;

    public MainlandTravelPermitConfidence withName(Float name) {
        this.name = name;
        return this;
    }

    /**
     * 中文姓名的置信度。 
     * @return name
     */
    public Float getName() {
        return name;
    }

    public void setName(Float name) {
        this.name = name;
    }

    public MainlandTravelPermitConfidence withNameEn(Float nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文姓名的置信度。 
     * @return nameEn
     */
    public Float getNameEn() {
        return nameEn;
    }

    public void setNameEn(Float nameEn) {
        this.nameEn = nameEn;
    }

    public MainlandTravelPermitConfidence withBirthDate(Float birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * 出生日期的置信度。 
     * @return birthDate
     */
    public Float getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Float birthDate) {
        this.birthDate = birthDate;
    }

    public MainlandTravelPermitConfidence withSex(Float sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别的置信度。 
     * @return sex
     */
    public Float getSex() {
        return sex;
    }

    public void setSex(Float sex) {
        this.sex = sex;
    }

    public MainlandTravelPermitConfidence withValidPeriod(Float validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }

    /**
     * 有效期限的置信度。 
     * @return validPeriod
     */
    public Float getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Float validPeriod) {
        this.validPeriod = validPeriod;
    }

    public MainlandTravelPermitConfidence withIssuingAuthority(Float issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * 签发机关的置信度。 
     * @return issuingAuthority
     */
    public Float getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(Float issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public MainlandTravelPermitConfidence withNumber(Float number) {
        this.number = number;
        return this;
    }

    /**
     * 证件号的置信度。 
     * @return number
     */
    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public MainlandTravelPermitConfidence withIssuePlace(Float issuePlace) {
        this.issuePlace = issuePlace;
        return this;
    }

    /**
     * 签发地点的置信度。 
     * @return issuePlace
     */
    public Float getIssuePlace() {
        return issuePlace;
    }

    public void setIssuePlace(Float issuePlace) {
        this.issuePlace = issuePlace;
    }

    public MainlandTravelPermitConfidence withIssueTimes(Float issueTimes) {
        this.issueTimes = issueTimes;
        return this;
    }

    /**
     * 签发次数的置信度。 
     * @return issueTimes
     */
    public Float getIssueTimes() {
        return issueTimes;
    }

    public void setIssueTimes(Float issueTimes) {
        this.issueTimes = issueTimes;
    }

    public MainlandTravelPermitConfidence withType(Float type) {
        this.type = type;
        return this;
    }

    /**
     * 证件类别的置信度。 
     * @return type
     */
    public Float getType() {
        return type;
    }

    public void setType(Float type) {
        this.type = type;
    }

    public MainlandTravelPermitConfidence withSide(Float side) {
        this.side = side;
        return this;
    }

    /**
     * 证件图片正反面信息的置信度。 
     * @return side
     */
    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

    public MainlandTravelPermitConfidence withIdName(Float idName) {
        this.idName = idName;
        return this;
    }

    /**
     * 回乡证背面的香港/澳门/台湾身份证姓名的置信度。 
     * @return idName
     */
    public Float getIdName() {
        return idName;
    }

    public void setIdName(Float idName) {
        this.idName = idName;
    }

    public MainlandTravelPermitConfidence withIdNumber(Float idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /**
     * 回乡证背面的香港/澳门/台湾身份证号码的置信度。 
     * @return idNumber
     */
    public Float getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Float idNumber) {
        this.idNumber = idNumber;
    }

    public MainlandTravelPermitConfidence withMachineCode1(Float machineCode1) {
        this.machineCode1 = machineCode1;
        return this;
    }

    /**
     * 机读码第一行的置信度。 
     * @return machineCode1
     */
    public Float getMachineCode1() {
        return machineCode1;
    }

    public void setMachineCode1(Float machineCode1) {
        this.machineCode1 = machineCode1;
    }

    public MainlandTravelPermitConfidence withMachineCode2(Float machineCode2) {
        this.machineCode2 = machineCode2;
        return this;
    }

    /**
     * 机读码第二行的置信度。 
     * @return machineCode2
     */
    public Float getMachineCode2() {
        return machineCode2;
    }

    public void setMachineCode2(Float machineCode2) {
        this.machineCode2 = machineCode2;
    }

    public MainlandTravelPermitConfidence withMachineCode3(Float machineCode3) {
        this.machineCode3 = machineCode3;
        return this;
    }

    /**
     * 机读码第三行的置信度。 
     * @return machineCode3
     */
    public Float getMachineCode3() {
        return machineCode3;
    }

    public void setMachineCode3(Float machineCode3) {
        this.machineCode3 = machineCode3;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MainlandTravelPermitConfidence that = (MainlandTravelPermitConfidence) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.birthDate, that.birthDate) && Objects.equals(this.sex, that.sex)
            && Objects.equals(this.validPeriod, that.validPeriod)
            && Objects.equals(this.issuingAuthority, that.issuingAuthority) && Objects.equals(this.number, that.number)
            && Objects.equals(this.issuePlace, that.issuePlace) && Objects.equals(this.issueTimes, that.issueTimes)
            && Objects.equals(this.type, that.type) && Objects.equals(this.side, that.side)
            && Objects.equals(this.idName, that.idName) && Objects.equals(this.idNumber, that.idNumber)
            && Objects.equals(this.machineCode1, that.machineCode1)
            && Objects.equals(this.machineCode2, that.machineCode2)
            && Objects.equals(this.machineCode3, that.machineCode3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            nameEn,
            birthDate,
            sex,
            validPeriod,
            issuingAuthority,
            number,
            issuePlace,
            issueTimes,
            type,
            side,
            idName,
            idNumber,
            machineCode1,
            machineCode2,
            machineCode3);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MainlandTravelPermitConfidence {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    issuePlace: ").append(toIndentedString(issuePlace)).append("\n");
        sb.append("    issueTimes: ").append(toIndentedString(issueTimes)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    idName: ").append(toIndentedString(idName)).append("\n");
        sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
        sb.append("    machineCode1: ").append(toIndentedString(machineCode1)).append("\n");
        sb.append("    machineCode2: ").append(toIndentedString(machineCode2)).append("\n");
        sb.append("    machineCode3: ").append(toIndentedString(machineCode3)).append("\n");
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
