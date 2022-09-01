package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ChileIdCardConfidence
 */
public class ChileIdCardConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "surname")

    @JacksonXmlProperty(localName = "surname")

    private Float surname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "given_name")

    @JacksonXmlProperty(localName = "given_name")

    private Float givenName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nationality")

    @JacksonXmlProperty(localName = "nationality")

    private Float nationality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    @JacksonXmlProperty(localName = "sex")

    private Float sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth")

    @JacksonXmlProperty(localName = "birth")

    private Float birth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    @JacksonXmlProperty(localName = "issue_date")

    private Float issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    @JacksonXmlProperty(localName = "expiry_date")

    private Float expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_number")

    @JacksonXmlProperty(localName = "document_number")

    private Float documentNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    @JacksonXmlProperty(localName = "number")

    private Float number;

    public ChileIdCardConfidence withSurname(Float surname) {
        this.surname = surname;
        return this;
    }

    /**
     * 姓氏置信度。 
     * @return surname
     */
    public Float getSurname() {
        return surname;
    }

    public void setSurname(Float surname) {
        this.surname = surname;
    }

    public ChileIdCardConfidence withGivenName(Float givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * 名置信度。 
     * @return givenName
     */
    public Float getGivenName() {
        return givenName;
    }

    public void setGivenName(Float givenName) {
        this.givenName = givenName;
    }

    public ChileIdCardConfidence withNationality(Float nationality) {
        this.nationality = nationality;
        return this;
    }

    /**
     * 国籍置信度。 
     * @return nationality
     */
    public Float getNationality() {
        return nationality;
    }

    public void setNationality(Float nationality) {
        this.nationality = nationality;
    }

    public ChileIdCardConfidence withSex(Float sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别置信度。 
     * @return sex
     */
    public Float getSex() {
        return sex;
    }

    public void setSex(Float sex) {
        this.sex = sex;
    }

    public ChileIdCardConfidence withBirth(Float birth) {
        this.birth = birth;
        return this;
    }

    /**
     * 出生日置信度。 
     * @return birth
     */
    public Float getBirth() {
        return birth;
    }

    public void setBirth(Float birth) {
        this.birth = birth;
    }

    public ChileIdCardConfidence withIssueDate(Float issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 发行日置信度。 
     * @return issueDate
     */
    public Float getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Float issueDate) {
        this.issueDate = issueDate;
    }

    public ChileIdCardConfidence withExpiryDate(Float expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 有效期置信度。 
     * @return expiryDate
     */
    public Float getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Float expiryDate) {
        this.expiryDate = expiryDate;
    }

    public ChileIdCardConfidence withDocumentNumber(Float documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * 文档编号置信度。 
     * @return documentNumber
     */
    public Float getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Float documentNumber) {
        this.documentNumber = documentNumber;
    }

    public ChileIdCardConfidence withNumber(Float number) {
        this.number = number;
        return this;
    }

    /**
     * 身份证号置信度。 
     * @return number
     */
    public Float getNumber() {
        return number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChileIdCardConfidence chileIdCardConfidence = (ChileIdCardConfidence) o;
        return Objects.equals(this.surname, chileIdCardConfidence.surname)
            && Objects.equals(this.givenName, chileIdCardConfidence.givenName)
            && Objects.equals(this.nationality, chileIdCardConfidence.nationality)
            && Objects.equals(this.sex, chileIdCardConfidence.sex)
            && Objects.equals(this.birth, chileIdCardConfidence.birth)
            && Objects.equals(this.issueDate, chileIdCardConfidence.issueDate)
            && Objects.equals(this.expiryDate, chileIdCardConfidence.expiryDate)
            && Objects.equals(this.documentNumber, chileIdCardConfidence.documentNumber)
            && Objects.equals(this.number, chileIdCardConfidence.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, givenName, nationality, sex, birth, issueDate, expiryDate, documentNumber, number);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChileIdCardConfidence {\n");
        sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
        sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
