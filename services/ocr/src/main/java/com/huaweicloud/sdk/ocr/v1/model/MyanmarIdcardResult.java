package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** MyanmarIdcardResult */
public class MyanmarIdcardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "class")

    private String propertyClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrc_id")

    private String nrcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "father_name")

    private String fatherName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth")

    private String birth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bloodlines_religion")

    private String bloodlinesReligion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private String height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blood_group")

    private String bloodGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_id")

    private String cardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nrc_id_back")

    private String nrcIdBack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profession")

    private String profession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private MyanmarIdcardConfidence confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_type")

    private String idcardType;

    public MyanmarIdcardResult withSide(String side) {
        this.side = side;
        return this;
    }

    /** 标示正面还是反面，取值为front或back。
     * 
     * @return side */
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public MyanmarIdcardResult withPropertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
        return this;
    }

    /** 身份证类型。取值如下所示： - new_version：新版身份证 - old_version：旧版
     * 
     * @return propertyClass */
    public String getPropertyClass() {
        return propertyClass;
    }

    public void setPropertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
    }

    public MyanmarIdcardResult withNrcId(String nrcId) {
        this.nrcId = nrcId;
        return this;
    }

    /** 身份证号码。
     * 
     * @return nrcId */
    public String getNrcId() {
        return nrcId;
    }

    public void setNrcId(String nrcId) {
        this.nrcId = nrcId;
    }

    public MyanmarIdcardResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /** 签发日期。
     * 
     * @return issueDate */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public MyanmarIdcardResult withName(String name) {
        this.name = name;
        return this;
    }

    /** 姓名。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyanmarIdcardResult withFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    /** 父亲名字。
     * 
     * @return fatherName */
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public MyanmarIdcardResult withBirth(String birth) {
        this.birth = birth;
        return this;
    }

    /** 出生日期。
     * 
     * @return birth */
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public MyanmarIdcardResult withBloodlinesReligion(String bloodlinesReligion) {
        this.bloodlinesReligion = bloodlinesReligion;
        return this;
    }

    /** 族群或宗教。
     * 
     * @return bloodlinesReligion */
    public String getBloodlinesReligion() {
        return bloodlinesReligion;
    }

    public void setBloodlinesReligion(String bloodlinesReligion) {
        this.bloodlinesReligion = bloodlinesReligion;
    }

    public MyanmarIdcardResult withHeight(String height) {
        this.height = height;
        return this;
    }

    /** 身高。
     * 
     * @return height */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public MyanmarIdcardResult withBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    /** 血型。
     * 
     * @return bloodGroup */
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public MyanmarIdcardResult withCardId(String cardId) {
        this.cardId = cardId;
        return this;
    }

    /** 身份证的卡号（背面）。
     * 
     * @return cardId */
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public MyanmarIdcardResult withNrcIdBack(String nrcIdBack) {
        this.nrcIdBack = nrcIdBack;
        return this;
    }

    /** 背面的身份证号码。
     * 
     * @return nrcIdBack */
    public String getNrcIdBack() {
        return nrcIdBack;
    }

    public void setNrcIdBack(String nrcIdBack) {
        this.nrcIdBack = nrcIdBack;
    }

    public MyanmarIdcardResult withProfession(String profession) {
        this.profession = profession;
        return this;
    }

    /** 职业。
     * 
     * @return profession */
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public MyanmarIdcardResult withAddress(String address) {
        this.address = address;
        return this;
    }

    /** 地址。
     * 
     * @return address */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MyanmarIdcardResult withConfidence(MyanmarIdcardConfidence confidence) {
        this.confidence = confidence;
        return this;
    }

    public MyanmarIdcardResult withConfidence(Consumer<MyanmarIdcardConfidence> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new MyanmarIdcardConfidence();
            confidenceSetter.accept(this.confidence);
        }

        return this;
    }

    /** Get confidence
     * 
     * @return confidence */
    public MyanmarIdcardConfidence getConfidence() {
        return confidence;
    }

    public void setConfidence(MyanmarIdcardConfidence confidence) {
        this.confidence = confidence;
    }

    public MyanmarIdcardResult withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /** 头像的base64编码。 当输入参数“return_portrait_image”为“true”时，才返回该参数。
     * 
     * @return portraitImage */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public MyanmarIdcardResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public MyanmarIdcardResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public MyanmarIdcardResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        portraitLocationSetter.accept(this.portraitLocation);
        return this;
    }

    /** 头像在原图上的位置。
     * 当输入参数“return_portrait_location”为“true”时，才返回该参数。以列表形式显示，包含头像区域四个顶点的二维坐标（x,y），坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向
     * 
     * @return portraitLocation */
    public List<List<Integer>> getPortraitLocation() {
        return portraitLocation;
    }

    public void setPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
    }

    public MyanmarIdcardResult withIdcardType(String idcardType) {
        this.idcardType = idcardType;
        return this;
    }

    /** 身份证的类型。取值如下所示： - normal：身份证原件 - copy：复印的身份证 当输入参数“return_idcard_type”为“true”时，才返回该参数。
     * 
     * @return idcardType */
    public String getIdcardType() {
        return idcardType;
    }

    public void setIdcardType(String idcardType) {
        this.idcardType = idcardType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyanmarIdcardResult myanmarIdcardResult = (MyanmarIdcardResult) o;
        return Objects.equals(this.side, myanmarIdcardResult.side)
            && Objects.equals(this.propertyClass, myanmarIdcardResult.propertyClass)
            && Objects.equals(this.nrcId, myanmarIdcardResult.nrcId)
            && Objects.equals(this.issueDate, myanmarIdcardResult.issueDate)
            && Objects.equals(this.name, myanmarIdcardResult.name)
            && Objects.equals(this.fatherName, myanmarIdcardResult.fatherName)
            && Objects.equals(this.birth, myanmarIdcardResult.birth)
            && Objects.equals(this.bloodlinesReligion, myanmarIdcardResult.bloodlinesReligion)
            && Objects.equals(this.height, myanmarIdcardResult.height)
            && Objects.equals(this.bloodGroup, myanmarIdcardResult.bloodGroup)
            && Objects.equals(this.cardId, myanmarIdcardResult.cardId)
            && Objects.equals(this.nrcIdBack, myanmarIdcardResult.nrcIdBack)
            && Objects.equals(this.profession, myanmarIdcardResult.profession)
            && Objects.equals(this.address, myanmarIdcardResult.address)
            && Objects.equals(this.confidence, myanmarIdcardResult.confidence)
            && Objects.equals(this.portraitImage, myanmarIdcardResult.portraitImage)
            && Objects.equals(this.portraitLocation, myanmarIdcardResult.portraitLocation)
            && Objects.equals(this.idcardType, myanmarIdcardResult.idcardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side,
            propertyClass,
            nrcId,
            issueDate,
            name,
            fatherName,
            birth,
            bloodlinesReligion,
            height,
            bloodGroup,
            cardId,
            nrcIdBack,
            profession,
            address,
            confidence,
            portraitImage,
            portraitLocation,
            idcardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MyanmarIdcardResult {\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
        sb.append("    nrcId: ").append(toIndentedString(nrcId)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fatherName: ").append(toIndentedString(fatherName)).append("\n");
        sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
        sb.append("    bloodlinesReligion: ").append(toIndentedString(bloodlinesReligion)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bloodGroup: ").append(toIndentedString(bloodGroup)).append("\n");
        sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
        sb.append("    nrcIdBack: ").append(toIndentedString(nrcIdBack)).append("\n");
        sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    portraitImage: ").append(toIndentedString(portraitImage)).append("\n");
        sb.append("    portraitLocation: ").append(toIndentedString(portraitLocation)).append("\n");
        sb.append("    idcardType: ").append(toIndentedString(idcardType)).append("\n");
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
