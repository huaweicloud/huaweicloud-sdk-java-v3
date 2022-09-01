package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MyanmarDriverLicenseResult
 */
public class MyanmarDriverLicenseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_number")

    @JacksonXmlProperty(localName = "card_number")

    private String cardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_number_en")

    @JacksonXmlProperty(localName = "card_number_en")

    private String cardNumberEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    @JacksonXmlProperty(localName = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrc_id")

    @JacksonXmlProperty(localName = "nrc_id")

    private String nrcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrc_id_en")

    @JacksonXmlProperty(localName = "nrc_id_en")

    private String nrcIdEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Birth")

    @JacksonXmlProperty(localName = "Birth")

    private String birth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_en")

    @JacksonXmlProperty(localName = "birth_en")

    private String birthEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blood_group")

    @JacksonXmlProperty(localName = "blood_group")

    private String bloodGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blood_group_en")

    @JacksonXmlProperty(localName = "blood_group_en")

    private String bloodGroupEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiried_date")

    @JacksonXmlProperty(localName = "expiried_date")

    private String expiriedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiried_date_en")

    @JacksonXmlProperty(localName = "expiried_date_en")

    private String expiriedDateEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private MyanmarDriverLicenseConfidence confidence;

    public MyanmarDriverLicenseResult withCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    /**
     * 缅文驾驶证号。 
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public MyanmarDriverLicenseResult withCardNumberEn(String cardNumberEn) {
        this.cardNumberEn = cardNumberEn;
        return this;
    }

    /**
     * 英文驾驶证号。 
     * @return cardNumberEn
     */
    public String getCardNumberEn() {
        return cardNumberEn;
    }

    public void setCardNumberEn(String cardNumberEn) {
        this.cardNumberEn = cardNumberEn;
    }

    public MyanmarDriverLicenseResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 缅文名字。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyanmarDriverLicenseResult withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文名字。 
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public MyanmarDriverLicenseResult withNrcId(String nrcId) {
        this.nrcId = nrcId;
        return this;
    }

    /**
     * 缅文nrc号码。 
     * @return nrcId
     */
    public String getNrcId() {
        return nrcId;
    }

    public void setNrcId(String nrcId) {
        this.nrcId = nrcId;
    }

    public MyanmarDriverLicenseResult withNrcIdEn(String nrcIdEn) {
        this.nrcIdEn = nrcIdEn;
        return this;
    }

    /**
     * 英文nrc号码。 
     * @return nrcIdEn
     */
    public String getNrcIdEn() {
        return nrcIdEn;
    }

    public void setNrcIdEn(String nrcIdEn) {
        this.nrcIdEn = nrcIdEn;
    }

    public MyanmarDriverLicenseResult withBirth(String birth) {
        this.birth = birth;
        return this;
    }

    /**
     * 缅文出生日期。 
     * @return birth
     */
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public MyanmarDriverLicenseResult withBirthEn(String birthEn) {
        this.birthEn = birthEn;
        return this;
    }

    /**
     * 英文出生日期。 
     * @return birthEn
     */
    public String getBirthEn() {
        return birthEn;
    }

    public void setBirthEn(String birthEn) {
        this.birthEn = birthEn;
    }

    public MyanmarDriverLicenseResult withBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    /**
     * 缅文血型。 
     * @return bloodGroup
     */
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public MyanmarDriverLicenseResult withBloodGroupEn(String bloodGroupEn) {
        this.bloodGroupEn = bloodGroupEn;
        return this;
    }

    /**
     * 英文血型。 
     * @return bloodGroupEn
     */
    public String getBloodGroupEn() {
        return bloodGroupEn;
    }

    public void setBloodGroupEn(String bloodGroupEn) {
        this.bloodGroupEn = bloodGroupEn;
    }

    public MyanmarDriverLicenseResult withExpiriedDate(String expiriedDate) {
        this.expiriedDate = expiriedDate;
        return this;
    }

    /**
     * 缅文有效期。 
     * @return expiriedDate
     */
    public String getExpiriedDate() {
        return expiriedDate;
    }

    public void setExpiriedDate(String expiriedDate) {
        this.expiriedDate = expiriedDate;
    }

    public MyanmarDriverLicenseResult withExpiriedDateEn(String expiriedDateEn) {
        this.expiriedDateEn = expiriedDateEn;
        return this;
    }

    /**
     * 英文有效期。 
     * @return expiriedDateEn
     */
    public String getExpiriedDateEn() {
        return expiriedDateEn;
    }

    public void setExpiriedDateEn(String expiriedDateEn) {
        this.expiriedDateEn = expiriedDateEn;
    }

    public MyanmarDriverLicenseResult withConfidence(MyanmarDriverLicenseConfidence confidence) {
        this.confidence = confidence;
        return this;
    }

    public MyanmarDriverLicenseResult withConfidence(Consumer<MyanmarDriverLicenseConfidence> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new MyanmarDriverLicenseConfidence();
            confidenceSetter.accept(this.confidence);
        }

        return this;
    }

    /**
     * Get confidence
     * @return confidence
     */
    public MyanmarDriverLicenseConfidence getConfidence() {
        return confidence;
    }

    public void setConfidence(MyanmarDriverLicenseConfidence confidence) {
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
        MyanmarDriverLicenseResult myanmarDriverLicenseResult = (MyanmarDriverLicenseResult) o;
        return Objects.equals(this.cardNumber, myanmarDriverLicenseResult.cardNumber)
            && Objects.equals(this.cardNumberEn, myanmarDriverLicenseResult.cardNumberEn)
            && Objects.equals(this.name, myanmarDriverLicenseResult.name)
            && Objects.equals(this.nameEn, myanmarDriverLicenseResult.nameEn)
            && Objects.equals(this.nrcId, myanmarDriverLicenseResult.nrcId)
            && Objects.equals(this.nrcIdEn, myanmarDriverLicenseResult.nrcIdEn)
            && Objects.equals(this.birth, myanmarDriverLicenseResult.birth)
            && Objects.equals(this.birthEn, myanmarDriverLicenseResult.birthEn)
            && Objects.equals(this.bloodGroup, myanmarDriverLicenseResult.bloodGroup)
            && Objects.equals(this.bloodGroupEn, myanmarDriverLicenseResult.bloodGroupEn)
            && Objects.equals(this.expiriedDate, myanmarDriverLicenseResult.expiriedDate)
            && Objects.equals(this.expiriedDateEn, myanmarDriverLicenseResult.expiriedDateEn)
            && Objects.equals(this.confidence, myanmarDriverLicenseResult.confidence);
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
            expiriedDateEn,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MyanmarDriverLicenseResult {\n");
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
