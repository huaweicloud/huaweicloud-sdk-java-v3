package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ThailandIdcardConfidence
 */
public class ThailandIdcardConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    @JacksonXmlProperty(localName = "id_number")

    private Float idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_th")

    @JacksonXmlProperty(localName = "name_th")

    private Float nameTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_name_en")

    @JacksonXmlProperty(localName = "first_name_en")

    private Float firstNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_name_en")

    @JacksonXmlProperty(localName = "last_name_en")

    private Float lastNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_birth_th")

    @JacksonXmlProperty(localName = "date_of_birth_th")

    private Float dateOfBirthTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_birth_en")

    @JacksonXmlProperty(localName = "date_of_birth_en")

    private Float dateOfBirthEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "religion_th")

    @JacksonXmlProperty(localName = "religion_th")

    private Float religionTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_th")

    @JacksonXmlProperty(localName = "address_th")

    private Float addressTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_issue_th")

    @JacksonXmlProperty(localName = "date_of_issue_th")

    private Float dateOfIssueTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_issue_en")

    @JacksonXmlProperty(localName = "date_of_issue_en")

    private Float dateOfIssueEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_expiry_th")

    @JacksonXmlProperty(localName = "date_of_expiry_th")

    private Float dateOfExpiryTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_expiry_en")

    @JacksonXmlProperty(localName = "date_of_expiry_en")

    private Float dateOfExpiryEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    @JacksonXmlProperty(localName = "serial_number")

    private Float serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_number")

    @JacksonXmlProperty(localName = "card_number")

    private Float cardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "laser_number")

    @JacksonXmlProperty(localName = "laser_number")

    private Float laserNumber;

    public ThailandIdcardConfidence withIdNumber(Float idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /**
     * 身份证号置信度。 
     * @return idNumber
     */
    public Float getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Float idNumber) {
        this.idNumber = idNumber;
    }

    public ThailandIdcardConfidence withNameTh(Float nameTh) {
        this.nameTh = nameTh;
        return this;
    }

    /**
     * 泰文名字置信度。 
     * @return nameTh
     */
    public Float getNameTh() {
        return nameTh;
    }

    public void setNameTh(Float nameTh) {
        this.nameTh = nameTh;
    }

    public ThailandIdcardConfidence withFirstNameEn(Float firstNameEn) {
        this.firstNameEn = firstNameEn;
        return this;
    }

    /**
     * 英文名字置信度。 
     * @return firstNameEn
     */
    public Float getFirstNameEn() {
        return firstNameEn;
    }

    public void setFirstNameEn(Float firstNameEn) {
        this.firstNameEn = firstNameEn;
    }

    public ThailandIdcardConfidence withLastNameEn(Float lastNameEn) {
        this.lastNameEn = lastNameEn;
        return this;
    }

    /**
     * 英文姓氏置信度。 
     * @return lastNameEn
     */
    public Float getLastNameEn() {
        return lastNameEn;
    }

    public void setLastNameEn(Float lastNameEn) {
        this.lastNameEn = lastNameEn;
    }

    public ThailandIdcardConfidence withDateOfBirthTh(Float dateOfBirthTh) {
        this.dateOfBirthTh = dateOfBirthTh;
        return this;
    }

    /**
     * 泰文出生日期置信度。 
     * @return dateOfBirthTh
     */
    public Float getDateOfBirthTh() {
        return dateOfBirthTh;
    }

    public void setDateOfBirthTh(Float dateOfBirthTh) {
        this.dateOfBirthTh = dateOfBirthTh;
    }

    public ThailandIdcardConfidence withDateOfBirthEn(Float dateOfBirthEn) {
        this.dateOfBirthEn = dateOfBirthEn;
        return this;
    }

    /**
     * 英文出生日期置信度。 
     * @return dateOfBirthEn
     */
    public Float getDateOfBirthEn() {
        return dateOfBirthEn;
    }

    public void setDateOfBirthEn(Float dateOfBirthEn) {
        this.dateOfBirthEn = dateOfBirthEn;
    }

    public ThailandIdcardConfidence withReligionTh(Float religionTh) {
        this.religionTh = religionTh;
        return this;
    }

    /**
     * 宗教置信度。 
     * @return religionTh
     */
    public Float getReligionTh() {
        return religionTh;
    }

    public void setReligionTh(Float religionTh) {
        this.religionTh = religionTh;
    }

    public ThailandIdcardConfidence withAddressTh(Float addressTh) {
        this.addressTh = addressTh;
        return this;
    }

    /**
     * 地址置信度。 
     * @return addressTh
     */
    public Float getAddressTh() {
        return addressTh;
    }

    public void setAddressTh(Float addressTh) {
        this.addressTh = addressTh;
    }

    public ThailandIdcardConfidence withDateOfIssueTh(Float dateOfIssueTh) {
        this.dateOfIssueTh = dateOfIssueTh;
        return this;
    }

    /**
     * 泰文签发日期置信度。 
     * @return dateOfIssueTh
     */
    public Float getDateOfIssueTh() {
        return dateOfIssueTh;
    }

    public void setDateOfIssueTh(Float dateOfIssueTh) {
        this.dateOfIssueTh = dateOfIssueTh;
    }

    public ThailandIdcardConfidence withDateOfIssueEn(Float dateOfIssueEn) {
        this.dateOfIssueEn = dateOfIssueEn;
        return this;
    }

    /**
     * 英文签发日期置信度。 
     * @return dateOfIssueEn
     */
    public Float getDateOfIssueEn() {
        return dateOfIssueEn;
    }

    public void setDateOfIssueEn(Float dateOfIssueEn) {
        this.dateOfIssueEn = dateOfIssueEn;
    }

    public ThailandIdcardConfidence withDateOfExpiryTh(Float dateOfExpiryTh) {
        this.dateOfExpiryTh = dateOfExpiryTh;
        return this;
    }

    /**
     * 泰文有效期置信度。 
     * @return dateOfExpiryTh
     */
    public Float getDateOfExpiryTh() {
        return dateOfExpiryTh;
    }

    public void setDateOfExpiryTh(Float dateOfExpiryTh) {
        this.dateOfExpiryTh = dateOfExpiryTh;
    }

    public ThailandIdcardConfidence withDateOfExpiryEn(Float dateOfExpiryEn) {
        this.dateOfExpiryEn = dateOfExpiryEn;
        return this;
    }

    /**
     * 英文有效期置信度。 
     * @return dateOfExpiryEn
     */
    public Float getDateOfExpiryEn() {
        return dateOfExpiryEn;
    }

    public void setDateOfExpiryEn(Float dateOfExpiryEn) {
        this.dateOfExpiryEn = dateOfExpiryEn;
    }

    public ThailandIdcardConfidence withSerialNumber(Float serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 序列号置信度。 
     * @return serialNumber
     */
    public Float getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Float serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ThailandIdcardConfidence withCardNumber(Float cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    /**
     * 身份证反面卡号置信度。 
     * @return cardNumber
     */
    public Float getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Float cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ThailandIdcardConfidence withLaserNumber(Float laserNumber) {
        this.laserNumber = laserNumber;
        return this;
    }

    /**
     * 激光码置信度。 
     * @return laserNumber
     */
    public Float getLaserNumber() {
        return laserNumber;
    }

    public void setLaserNumber(Float laserNumber) {
        this.laserNumber = laserNumber;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThailandIdcardConfidence thailandIdcardConfidence = (ThailandIdcardConfidence) o;
        return Objects.equals(this.idNumber, thailandIdcardConfidence.idNumber)
            && Objects.equals(this.nameTh, thailandIdcardConfidence.nameTh)
            && Objects.equals(this.firstNameEn, thailandIdcardConfidence.firstNameEn)
            && Objects.equals(this.lastNameEn, thailandIdcardConfidence.lastNameEn)
            && Objects.equals(this.dateOfBirthTh, thailandIdcardConfidence.dateOfBirthTh)
            && Objects.equals(this.dateOfBirthEn, thailandIdcardConfidence.dateOfBirthEn)
            && Objects.equals(this.religionTh, thailandIdcardConfidence.religionTh)
            && Objects.equals(this.addressTh, thailandIdcardConfidence.addressTh)
            && Objects.equals(this.dateOfIssueTh, thailandIdcardConfidence.dateOfIssueTh)
            && Objects.equals(this.dateOfIssueEn, thailandIdcardConfidence.dateOfIssueEn)
            && Objects.equals(this.dateOfExpiryTh, thailandIdcardConfidence.dateOfExpiryTh)
            && Objects.equals(this.dateOfExpiryEn, thailandIdcardConfidence.dateOfExpiryEn)
            && Objects.equals(this.serialNumber, thailandIdcardConfidence.serialNumber)
            && Objects.equals(this.cardNumber, thailandIdcardConfidence.cardNumber)
            && Objects.equals(this.laserNumber, thailandIdcardConfidence.laserNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber,
            nameTh,
            firstNameEn,
            lastNameEn,
            dateOfBirthTh,
            dateOfBirthEn,
            religionTh,
            addressTh,
            dateOfIssueTh,
            dateOfIssueEn,
            dateOfExpiryTh,
            dateOfExpiryEn,
            serialNumber,
            cardNumber,
            laserNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThailandIdcardConfidence {\n");
        sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
        sb.append("    nameTh: ").append(toIndentedString(nameTh)).append("\n");
        sb.append("    firstNameEn: ").append(toIndentedString(firstNameEn)).append("\n");
        sb.append("    lastNameEn: ").append(toIndentedString(lastNameEn)).append("\n");
        sb.append("    dateOfBirthTh: ").append(toIndentedString(dateOfBirthTh)).append("\n");
        sb.append("    dateOfBirthEn: ").append(toIndentedString(dateOfBirthEn)).append("\n");
        sb.append("    religionTh: ").append(toIndentedString(religionTh)).append("\n");
        sb.append("    addressTh: ").append(toIndentedString(addressTh)).append("\n");
        sb.append("    dateOfIssueTh: ").append(toIndentedString(dateOfIssueTh)).append("\n");
        sb.append("    dateOfIssueEn: ").append(toIndentedString(dateOfIssueEn)).append("\n");
        sb.append("    dateOfExpiryTh: ").append(toIndentedString(dateOfExpiryTh)).append("\n");
        sb.append("    dateOfExpiryEn: ").append(toIndentedString(dateOfExpiryEn)).append("\n");
        sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
        sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
        sb.append("    laserNumber: ").append(toIndentedString(laserNumber)).append("\n");
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
