package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ExitEntryPermitConfidence
 */
public class ExitEntryPermitConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private Float name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    @JacksonXmlProperty(localName = "name_en")

    private Float nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    @JacksonXmlProperty(localName = "birth_date")

    private Float birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    @JacksonXmlProperty(localName = "sex")

    private Float sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    @JacksonXmlProperty(localName = "number")

    private Float number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_period")

    @JacksonXmlProperty(localName = "valid_period")

    private Float validPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    @JacksonXmlProperty(localName = "issuing_authority")

    private Float issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_place")

    @JacksonXmlProperty(localName = "issue_place")

    private Float issuePlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code")

    @JacksonXmlProperty(localName = "machine_code")

    private Float machineCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private Float type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    @JacksonXmlProperty(localName = "side")

    private Float side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endorsement_info_hk")

    @JacksonXmlProperty(localName = "endorsement_info_hk")

    private Object endorsementInfoHk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endorsement_info_mo")

    @JacksonXmlProperty(localName = "endorsement_info_mo")

    private Object endorsementInfoMo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endorsement_info_tw")

    @JacksonXmlProperty(localName = "endorsement_info_tw")

    private Object endorsementInfoTw;

    public ExitEntryPermitConfidence withName(Float name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名的置信度。 
     * @return name
     */
    public Float getName() {
        return name;
    }

    public void setName(Float name) {
        this.name = name;
    }

    public ExitEntryPermitConfidence withNameEn(Float nameEn) {
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

    public ExitEntryPermitConfidence withBirthDate(Float birthDate) {
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

    public ExitEntryPermitConfidence withSex(Float sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别的置信度 
     * @return sex
     */
    public Float getSex() {
        return sex;
    }

    public void setSex(Float sex) {
        this.sex = sex;
    }

    public ExitEntryPermitConfidence withNumber(Float number) {
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

    public ExitEntryPermitConfidence withValidPeriod(Float validPeriod) {
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

    public ExitEntryPermitConfidence withIssuingAuthority(Float issuingAuthority) {
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

    public ExitEntryPermitConfidence withIssuePlace(Float issuePlace) {
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

    public ExitEntryPermitConfidence withMachineCode(Float machineCode) {
        this.machineCode = machineCode;
        return this;
    }

    /**
     * 机器码的置信度。 
     * @return machineCode
     */
    public Float getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(Float machineCode) {
        this.machineCode = machineCode;
    }

    public ExitEntryPermitConfidence withType(Float type) {
        this.type = type;
        return this;
    }

    /**
     * 证件类型的置信度。 
     * @return type
     */
    public Float getType() {
        return type;
    }

    public void setType(Float type) {
        this.type = type;
    }

    public ExitEntryPermitConfidence withSide(Float side) {
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

    public ExitEntryPermitConfidence withEndorsementInfoHk(Object endorsementInfoHk) {
        this.endorsementInfoHk = endorsementInfoHk;
        return this;
    }

    /**
     * 香港签注信息的置信度。 
     * @return endorsementInfoHk
     */
    public Object getEndorsementInfoHk() {
        return endorsementInfoHk;
    }

    public void setEndorsementInfoHk(Object endorsementInfoHk) {
        this.endorsementInfoHk = endorsementInfoHk;
    }

    public ExitEntryPermitConfidence withEndorsementInfoMo(Object endorsementInfoMo) {
        this.endorsementInfoMo = endorsementInfoMo;
        return this;
    }

    /**
     * 澳门签注信息的置信度。 
     * @return endorsementInfoMo
     */
    public Object getEndorsementInfoMo() {
        return endorsementInfoMo;
    }

    public void setEndorsementInfoMo(Object endorsementInfoMo) {
        this.endorsementInfoMo = endorsementInfoMo;
    }

    public ExitEntryPermitConfidence withEndorsementInfoTw(Object endorsementInfoTw) {
        this.endorsementInfoTw = endorsementInfoTw;
        return this;
    }

    /**
     * 台湾签注信息的置信度。 
     * @return endorsementInfoTw
     */
    public Object getEndorsementInfoTw() {
        return endorsementInfoTw;
    }

    public void setEndorsementInfoTw(Object endorsementInfoTw) {
        this.endorsementInfoTw = endorsementInfoTw;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExitEntryPermitConfidence exitEntryPermitConfidence = (ExitEntryPermitConfidence) o;
        return Objects.equals(this.name, exitEntryPermitConfidence.name)
            && Objects.equals(this.nameEn, exitEntryPermitConfidence.nameEn)
            && Objects.equals(this.birthDate, exitEntryPermitConfidence.birthDate)
            && Objects.equals(this.sex, exitEntryPermitConfidence.sex)
            && Objects.equals(this.number, exitEntryPermitConfidence.number)
            && Objects.equals(this.validPeriod, exitEntryPermitConfidence.validPeriod)
            && Objects.equals(this.issuingAuthority, exitEntryPermitConfidence.issuingAuthority)
            && Objects.equals(this.issuePlace, exitEntryPermitConfidence.issuePlace)
            && Objects.equals(this.machineCode, exitEntryPermitConfidence.machineCode)
            && Objects.equals(this.type, exitEntryPermitConfidence.type)
            && Objects.equals(this.side, exitEntryPermitConfidence.side)
            && Objects.equals(this.endorsementInfoHk, exitEntryPermitConfidence.endorsementInfoHk)
            && Objects.equals(this.endorsementInfoMo, exitEntryPermitConfidence.endorsementInfoMo)
            && Objects.equals(this.endorsementInfoTw, exitEntryPermitConfidence.endorsementInfoTw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            nameEn,
            birthDate,
            sex,
            number,
            validPeriod,
            issuingAuthority,
            issuePlace,
            machineCode,
            type,
            side,
            endorsementInfoHk,
            endorsementInfoMo,
            endorsementInfoTw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExitEntryPermitConfidence {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    issuePlace: ").append(toIndentedString(issuePlace)).append("\n");
        sb.append("    machineCode: ").append(toIndentedString(machineCode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    endorsementInfoHk: ").append(toIndentedString(endorsementInfoHk)).append("\n");
        sb.append("    endorsementInfoMo: ").append(toIndentedString(endorsementInfoMo)).append("\n");
        sb.append("    endorsementInfoTw: ").append(toIndentedString(endorsementInfoTw)).append("\n");
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
