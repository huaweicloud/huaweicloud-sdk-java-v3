package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * MyanmarDriverLicenseConfidence
 */
public class MyanmarDriverLicenseConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_number")

    @JacksonXmlProperty(localName = "card_number")

    private Float cardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_number_en")

    @JacksonXmlProperty(localName = "card_number_en")

    private Float cardNumberEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private Float name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    @JacksonXmlProperty(localName = "name_en")

    private Float nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrc_id")

    @JacksonXmlProperty(localName = "nrc_id")

    private Float nrcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrc_id_en")

    @JacksonXmlProperty(localName = "nrc_id_en")

    private Float nrcIdEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Birth")

    @JacksonXmlProperty(localName = "Birth")

    private Float birth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_en")

    @JacksonXmlProperty(localName = "birth_en")

    private Float birthEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blood_group")

    @JacksonXmlProperty(localName = "blood_group")

    private Float bloodGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blood_group_en")

    @JacksonXmlProperty(localName = "blood_group_en")

    private Float bloodGroupEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiried_date")

    @JacksonXmlProperty(localName = "expiried_date")

    private Float expiriedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiried_date_en")

    @JacksonXmlProperty(localName = "expiried_date_en")

    private Float expiriedDateEn;

    public MyanmarDriverLicenseConfidence withCardNumber(Float cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    /**
     * 缅文驾驶证号置信度。 
     * @return cardNumber
     */
    public Float getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Float cardNumber) {
        this.cardNumber = cardNumber;
    }

    public MyanmarDriverLicenseConfidence withCardNumberEn(Float cardNumberEn) {
        this.cardNumberEn = cardNumberEn;
        return this;
    }

    /**
     * 英文驾驶证号置信度。 
     * @return cardNumberEn
     */
    public Float getCardNumberEn() {
        return cardNumberEn;
    }

    public void setCardNumberEn(Float cardNumberEn) {
        this.cardNumberEn = cardNumberEn;
    }

    public MyanmarDriverLicenseConfidence withName(Float name) {
        this.name = name;
        return this;
    }

    /**
     * 缅文名字置信度。 
     * @return name
     */
    public Float getName() {
        return name;
    }

    public void setName(Float name) {
        this.name = name;
    }

    public MyanmarDriverLicenseConfidence withNameEn(Float nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文名字置信度。 
     * @return nameEn
     */
    public Float getNameEn() {
        return nameEn;
    }

    public void setNameEn(Float nameEn) {
        this.nameEn = nameEn;
    }

    public MyanmarDriverLicenseConfidence withNrcId(Float nrcId) {
        this.nrcId = nrcId;
        return this;
    }

    /**
     * 缅文nrc号码置信度。 
     * @return nrcId
     */
    public Float getNrcId() {
        return nrcId;
    }

    public void setNrcId(Float nrcId) {
        this.nrcId = nrcId;
    }

    public MyanmarDriverLicenseConfidence withNrcIdEn(Float nrcIdEn) {
        this.nrcIdEn = nrcIdEn;
        return this;
    }

    /**
     * 英文nrc号码置信度。 
     * @return nrcIdEn
     */
    public Float getNrcIdEn() {
        return nrcIdEn;
    }

    public void setNrcIdEn(Float nrcIdEn) {
        this.nrcIdEn = nrcIdEn;
    }

    public MyanmarDriverLicenseConfidence withBirth(Float birth) {
        this.birth = birth;
        return this;
    }

    /**
     * 缅文出生日期置信度。 
     * @return birth
     */
    public Float getBirth() {
        return birth;
    }

    public void setBirth(Float birth) {
        this.birth = birth;
    }

    public MyanmarDriverLicenseConfidence withBirthEn(Float birthEn) {
        this.birthEn = birthEn;
        return this;
    }

    /**
     * 英文出生日期置信度。 
     * @return birthEn
     */
    public Float getBirthEn() {
        return birthEn;
    }

    public void setBirthEn(Float birthEn) {
        this.birthEn = birthEn;
    }

    public MyanmarDriverLicenseConfidence withBloodGroup(Float bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    /**
     * 缅文血型置信度。 
     * @return bloodGroup
     */
    public Float getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(Float bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public MyanmarDriverLicenseConfidence withBloodGroupEn(Float bloodGroupEn) {
        this.bloodGroupEn = bloodGroupEn;
        return this;
    }

    /**
     * 英文血型置信度。 
     * @return bloodGroupEn
     */
    public Float getBloodGroupEn() {
        return bloodGroupEn;
    }

    public void setBloodGroupEn(Float bloodGroupEn) {
        this.bloodGroupEn = bloodGroupEn;
    }

    public MyanmarDriverLicenseConfidence withExpiriedDate(Float expiriedDate) {
        this.expiriedDate = expiriedDate;
        return this;
    }

    /**
     * 缅文有效期置信度。 
     * @return expiriedDate
     */
    public Float getExpiriedDate() {
        return expiriedDate;
    }

    public void setExpiriedDate(Float expiriedDate) {
        this.expiriedDate = expiriedDate;
    }

    public MyanmarDriverLicenseConfidence withExpiriedDateEn(Float expiriedDateEn) {
        this.expiriedDateEn = expiriedDateEn;
        return this;
    }

    /**
     * 英文有效期置信度。 
     * @return expiriedDateEn
     */
    public Float getExpiriedDateEn() {
        return expiriedDateEn;
    }

    public void setExpiriedDateEn(Float expiriedDateEn) {
        this.expiriedDateEn = expiriedDateEn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyanmarDriverLicenseConfidence myanmarDriverLicenseConfidence = (MyanmarDriverLicenseConfidence) o;
        return Objects.equals(this.cardNumber, myanmarDriverLicenseConfidence.cardNumber)
            && Objects.equals(this.cardNumberEn, myanmarDriverLicenseConfidence.cardNumberEn)
            && Objects.equals(this.name, myanmarDriverLicenseConfidence.name)
            && Objects.equals(this.nameEn, myanmarDriverLicenseConfidence.nameEn)
            && Objects.equals(this.nrcId, myanmarDriverLicenseConfidence.nrcId)
            && Objects.equals(this.nrcIdEn, myanmarDriverLicenseConfidence.nrcIdEn)
            && Objects.equals(this.birth, myanmarDriverLicenseConfidence.birth)
            && Objects.equals(this.birthEn, myanmarDriverLicenseConfidence.birthEn)
            && Objects.equals(this.bloodGroup, myanmarDriverLicenseConfidence.bloodGroup)
            && Objects.equals(this.bloodGroupEn, myanmarDriverLicenseConfidence.bloodGroupEn)
            && Objects.equals(this.expiriedDate, myanmarDriverLicenseConfidence.expiriedDate)
            && Objects.equals(this.expiriedDateEn, myanmarDriverLicenseConfidence.expiriedDateEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber,
            cardNumberEn,
            name,
            nameEn,
            nrcId,
            nrcIdEn,
            birth,
            birthEn,
            bloodGroup,
            bloodGroupEn,
            expiriedDate,
            expiriedDateEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MyanmarDriverLicenseConfidence {\n");
        sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
        sb.append("    cardNumberEn: ").append(toIndentedString(cardNumberEn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    nrcId: ").append(toIndentedString(nrcId)).append("\n");
        sb.append("    nrcIdEn: ").append(toIndentedString(nrcIdEn)).append("\n");
        sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
        sb.append("    birthEn: ").append(toIndentedString(birthEn)).append("\n");
        sb.append("    bloodGroup: ").append(toIndentedString(bloodGroup)).append("\n");
        sb.append("    bloodGroupEn: ").append(toIndentedString(bloodGroupEn)).append("\n");
        sb.append("    expiriedDate: ").append(toIndentedString(expiriedDate)).append("\n");
        sb.append("    expiriedDateEn: ").append(toIndentedString(expiriedDateEn)).append("\n");
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
