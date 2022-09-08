package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PassportResult
 */
public class PassportResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passport_type")

    private String passportType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_code")

    private String countryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passport_number")

    private String passportNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nationality")

    private String nationality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "surname")

    private String surname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "given_name")

    private String givenName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_birth")

    private String dateOfBirth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_expiry")

    private String dateOfExpiry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_issue")

    private String dateOfIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "place_of_birth")

    private String placeOfBirth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "place_of_issue")

    private String placeOfIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private String issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private Object extraInfo;

    public PassportResult withPassportType(String passportType) {
        this.passportType = passportType;
        return this;
    }

    /**
     * 护照类型（P:普通因私护照、W:外交护照、G:公务护照）（英文）。 
     * @return passportType
     */
    public String getPassportType() {
        return passportType;
    }

    public void setPassportType(String passportType) {
        this.passportType = passportType;
    }

    public PassportResult withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 护照签发国的国家码（英文）。 
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public PassportResult withPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
        return this;
    }

    /**
     * 护照号码（英文）。 
     * @return passportNumber
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public PassportResult withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    /**
     * 护照持有人国籍（英文）。 
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public PassportResult withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * 姓（英文）。 
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PassportResult withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * 名字（英文）。 
     * @return givenName
     */
    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public PassportResult withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别（英文）。 
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public PassportResult withDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * 出生日期（英文）。 
     * @return dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public PassportResult withDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
        return this;
    }

    /**
     * 护照有效期（英文）。 
     * @return dateOfExpiry
     */
    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public PassportResult withDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
        return this;
    }

    /**
     * 护照签发日期（英文）。 
     * @return dateOfIssue
     */
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public PassportResult withPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }

    /**
     * 出生地（英文）。 
     * @return placeOfBirth
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public PassportResult withPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
        return this;
    }

    /**
     * 签发地（英文）。 
     * @return placeOfIssue
     */
    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    public PassportResult withIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * 签发机构（英文），其中对中国的英文简写统一输出为P.R.China。 
     * @return issuingAuthority
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public PassportResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    public PassportResult withExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /**
     * 默认为空。对于部分常见国家的护照OCR服务，extra_info内会包含护照上由本地官方语言描述的字段信息及其他信息。 如中国护照，里面会包含汉字表达的姓名、出生地等信息。 
     * @return extraInfo
     */
    public Object getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PassportResult passportResult = (PassportResult) o;
        return Objects.equals(this.passportType, passportResult.passportType)
            && Objects.equals(this.countryCode, passportResult.countryCode)
            && Objects.equals(this.passportNumber, passportResult.passportNumber)
            && Objects.equals(this.nationality, passportResult.nationality)
            && Objects.equals(this.surname, passportResult.surname)
            && Objects.equals(this.givenName, passportResult.givenName) && Objects.equals(this.sex, passportResult.sex)
            && Objects.equals(this.dateOfBirth, passportResult.dateOfBirth)
            && Objects.equals(this.dateOfExpiry, passportResult.dateOfExpiry)
            && Objects.equals(this.dateOfIssue, passportResult.dateOfIssue)
            && Objects.equals(this.placeOfBirth, passportResult.placeOfBirth)
            && Objects.equals(this.placeOfIssue, passportResult.placeOfIssue)
            && Objects.equals(this.issuingAuthority, passportResult.issuingAuthority)
            && Objects.equals(this.confidence, passportResult.confidence)
            && Objects.equals(this.extraInfo, passportResult.extraInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportType,
            countryCode,
            passportNumber,
            nationality,
            surname,
            givenName,
            sex,
            dateOfBirth,
            dateOfExpiry,
            dateOfIssue,
            placeOfBirth,
            placeOfIssue,
            issuingAuthority,
            confidence,
            extraInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PassportResult {\n");
        sb.append("    passportType: ").append(toIndentedString(passportType)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
        sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
        sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
        sb.append("    dateOfIssue: ").append(toIndentedString(dateOfIssue)).append("\n");
        sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
        sb.append("    placeOfIssue: ").append(toIndentedString(placeOfIssue)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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
