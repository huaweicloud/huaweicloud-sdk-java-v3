package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ChileIdCardResult */
public class ChileIdCardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "surname")

    private List<String> surname = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "given_name")

    private String givenName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nationality")

    private String nationality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth")

    private String birth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_number")

    private String documentNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private ChileIdCardConfidence confidence;

    public ChileIdCardResult withSurname(List<String> surname) {
        this.surname = surname;
        return this;
    }

    public ChileIdCardResult addSurnameItem(String surnameItem) {
        if (this.surname == null) {
            this.surname = new ArrayList<>();
        }
        this.surname.add(surnameItem);
        return this;
    }

    public ChileIdCardResult withSurname(Consumer<List<String>> surnameSetter) {
        if (this.surname == null) {
            this.surname = new ArrayList<>();
        }
        surnameSetter.accept(this.surname);
        return this;
    }

    /** 姓氏。
     * 
     * @return surname */
    public List<String> getSurname() {
        return surname;
    }

    public void setSurname(List<String> surname) {
        this.surname = surname;
    }

    public ChileIdCardResult withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /** 名。
     * 
     * @return givenName */
    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public ChileIdCardResult withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    /** 国籍。
     * 
     * @return nationality */
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ChileIdCardResult withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /** 性别。
     * 
     * @return sex */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ChileIdCardResult withBirth(String birth) {
        this.birth = birth;
        return this;
    }

    /** 出生日。
     * 
     * @return birth */
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public ChileIdCardResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /** 发行日。
     * 
     * @return issueDate */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public ChileIdCardResult withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /** 有效期。
     * 
     * @return expiryDate */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public ChileIdCardResult withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /** 文档编号。
     * 
     * @return documentNumber */
    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public ChileIdCardResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /** 身份证号。
     * 
     * @return number */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ChileIdCardResult withConfidence(ChileIdCardConfidence confidence) {
        this.confidence = confidence;
        return this;
    }

    public ChileIdCardResult withConfidence(Consumer<ChileIdCardConfidence> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new ChileIdCardConfidence();
            confidenceSetter.accept(this.confidence);
        }

        return this;
    }

    /** Get confidence
     * 
     * @return confidence */
    public ChileIdCardConfidence getConfidence() {
        return confidence;
    }

    public void setConfidence(ChileIdCardConfidence confidence) {
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
        ChileIdCardResult chileIdCardResult = (ChileIdCardResult) o;
        return Objects.equals(this.surname, chileIdCardResult.surname)
            && Objects.equals(this.givenName, chileIdCardResult.givenName)
            && Objects.equals(this.nationality, chileIdCardResult.nationality)
            && Objects.equals(this.sex, chileIdCardResult.sex) && Objects.equals(this.birth, chileIdCardResult.birth)
            && Objects.equals(this.issueDate, chileIdCardResult.issueDate)
            && Objects.equals(this.expiryDate, chileIdCardResult.expiryDate)
            && Objects.equals(this.documentNumber, chileIdCardResult.documentNumber)
            && Objects.equals(this.number, chileIdCardResult.number)
            && Objects.equals(this.confidence, chileIdCardResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname,
            givenName,
            nationality,
            sex,
            birth,
            issueDate,
            expiryDate,
            documentNumber,
            number,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChileIdCardResult {\n");
        sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
        sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
