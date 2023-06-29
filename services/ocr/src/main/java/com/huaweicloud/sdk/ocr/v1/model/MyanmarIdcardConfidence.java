package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MyanmarIdcardConfidence
 */
public class MyanmarIdcardConfidence {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrc_id")

    private Float nrcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private Float issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private Float name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth")

    private Float birth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bloodlines_religion")

    private Float bloodlinesReligion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Float height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blood_group")

    private Float bloodGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_id")

    private Float cardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrc_id_back")

    private Float nrcIdBack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profession")

    private Float profession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private Float address;

    public MyanmarIdcardConfidence withNrcId(Float nrcId) {
        this.nrcId = nrcId;
        return this;
    }

    /**
     * 身份证号码置信度。 
     * @return nrcId
     */
    public Float getNrcId() {
        return nrcId;
    }

    public void setNrcId(Float nrcId) {
        this.nrcId = nrcId;
    }

    public MyanmarIdcardConfidence withIssueDate(Float issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 签发日期置信度。 
     * @return issueDate
     */
    public Float getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Float issueDate) {
        this.issueDate = issueDate;
    }

    public MyanmarIdcardConfidence withName(Float name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名置信度。 
     * @return name
     */
    public Float getName() {
        return name;
    }

    public void setName(Float name) {
        this.name = name;
    }

    public MyanmarIdcardConfidence withBirth(Float birth) {
        this.birth = birth;
        return this;
    }

    /**
     * 出生日期置信度。 
     * @return birth
     */
    public Float getBirth() {
        return birth;
    }

    public void setBirth(Float birth) {
        this.birth = birth;
    }

    public MyanmarIdcardConfidence withBloodlinesReligion(Float bloodlinesReligion) {
        this.bloodlinesReligion = bloodlinesReligion;
        return this;
    }

    /**
     * 族群或宗教置信度。 
     * @return bloodlinesReligion
     */
    public Float getBloodlinesReligion() {
        return bloodlinesReligion;
    }

    public void setBloodlinesReligion(Float bloodlinesReligion) {
        this.bloodlinesReligion = bloodlinesReligion;
    }

    public MyanmarIdcardConfidence withHeight(Float height) {
        this.height = height;
        return this;
    }

    /**
     * 身高置信度。 
     * @return height
     */
    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public MyanmarIdcardConfidence withBloodGroup(Float bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    /**
     * 血型置信度。 
     * @return bloodGroup
     */
    public Float getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(Float bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public MyanmarIdcardConfidence withCardId(Float cardId) {
        this.cardId = cardId;
        return this;
    }

    /**
     * 身份证的卡号（背面）置信度。 
     * @return cardId
     */
    public Float getCardId() {
        return cardId;
    }

    public void setCardId(Float cardId) {
        this.cardId = cardId;
    }

    public MyanmarIdcardConfidence withNrcIdBack(Float nrcIdBack) {
        this.nrcIdBack = nrcIdBack;
        return this;
    }

    /**
     * 背面的身份证号码。 
     * @return nrcIdBack
     */
    public Float getNrcIdBack() {
        return nrcIdBack;
    }

    public void setNrcIdBack(Float nrcIdBack) {
        this.nrcIdBack = nrcIdBack;
    }

    public MyanmarIdcardConfidence withProfession(Float profession) {
        this.profession = profession;
        return this;
    }

    /**
     * 职业置信度。 
     * @return profession
     */
    public Float getProfession() {
        return profession;
    }

    public void setProfession(Float profession) {
        this.profession = profession;
    }

    public MyanmarIdcardConfidence withAddress(Float address) {
        this.address = address;
        return this;
    }

    /**
     * 地址置信度。 
     * @return address
     */
    public Float getAddress() {
        return address;
    }

    public void setAddress(Float address) {
        this.address = address;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyanmarIdcardConfidence that = (MyanmarIdcardConfidence) obj;
        return Objects.equals(this.nrcId, that.nrcId) && Objects.equals(this.issueDate, that.issueDate)
            && Objects.equals(this.name, that.name) && Objects.equals(this.birth, that.birth)
            && Objects.equals(this.bloodlinesReligion, that.bloodlinesReligion)
            && Objects.equals(this.height, that.height) && Objects.equals(this.bloodGroup, that.bloodGroup)
            && Objects.equals(this.cardId, that.cardId) && Objects.equals(this.nrcIdBack, that.nrcIdBack)
            && Objects.equals(this.profession, that.profession) && Objects.equals(this.address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrcId,
            issueDate,
            name,
            birth,
            bloodlinesReligion,
            height,
            bloodGroup,
            cardId,
            nrcIdBack,
            profession,
            address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MyanmarIdcardConfidence {\n");
        sb.append("    nrcId: ").append(toIndentedString(nrcId)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
        sb.append("    bloodlinesReligion: ").append(toIndentedString(bloodlinesReligion)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bloodGroup: ").append(toIndentedString(bloodGroup)).append("\n");
        sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
        sb.append("    nrcIdBack: ").append(toIndentedString(nrcIdBack)).append("\n");
        sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
