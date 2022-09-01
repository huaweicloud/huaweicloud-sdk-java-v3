package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThailandIdcardResult
 */
public class ThailandIdcardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    @JacksonXmlProperty(localName = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    @JacksonXmlProperty(localName = "id_number")

    private String idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_th")

    @JacksonXmlProperty(localName = "name_th")

    private String nameTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_name_en")

    @JacksonXmlProperty(localName = "first_name_en")

    private String firstNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_name_en")

    @JacksonXmlProperty(localName = "last_name_en")

    private String lastNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_birth_th")

    @JacksonXmlProperty(localName = "date_of_birth_th")

    private String dateOfBirthTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_birth_en")

    @JacksonXmlProperty(localName = "date_of_birth_en")

    private String dateOfBirthEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "religion_th")

    @JacksonXmlProperty(localName = "religion_th")

    private String religionTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_th")

    @JacksonXmlProperty(localName = "address_th")

    private String addressTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_issue_th")

    @JacksonXmlProperty(localName = "date_of_issue_th")

    private String dateOfIssueTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_issue_en")

    @JacksonXmlProperty(localName = "date_of_issue_en")

    private String dateOfIssueEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_expiry_th")

    @JacksonXmlProperty(localName = "date_of_expiry_th")

    private String dateOfExpiryTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_expiry_en")

    @JacksonXmlProperty(localName = "date_of_expiry_en")

    private String dateOfExpiryEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    @JacksonXmlProperty(localName = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_number")

    @JacksonXmlProperty(localName = "card_number")

    private String cardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "laser_number")

    @JacksonXmlProperty(localName = "laser_number")

    private String laserNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private ThailandIdcardConfidence confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    @JacksonXmlProperty(localName = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_location")

    @JacksonXmlProperty(localName = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_type")

    @JacksonXmlProperty(localName = "idcard_type")

    private String idcardType;

    public ThailandIdcardResult withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * 标示正面还是反面，取值为front或back。 
     * @return side
     */
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public ThailandIdcardResult withIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /**
     * 身份证号。 
     * @return idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public ThailandIdcardResult withNameTh(String nameTh) {
        this.nameTh = nameTh;
        return this;
    }

    /**
     * 泰文名字。 
     * @return nameTh
     */
    public String getNameTh() {
        return nameTh;
    }

    public void setNameTh(String nameTh) {
        this.nameTh = nameTh;
    }

    public ThailandIdcardResult withFirstNameEn(String firstNameEn) {
        this.firstNameEn = firstNameEn;
        return this;
    }

    /**
     * 英文名字。 
     * @return firstNameEn
     */
    public String getFirstNameEn() {
        return firstNameEn;
    }

    public void setFirstNameEn(String firstNameEn) {
        this.firstNameEn = firstNameEn;
    }

    public ThailandIdcardResult withLastNameEn(String lastNameEn) {
        this.lastNameEn = lastNameEn;
        return this;
    }

    /**
     * 英文姓氏。 
     * @return lastNameEn
     */
    public String getLastNameEn() {
        return lastNameEn;
    }

    public void setLastNameEn(String lastNameEn) {
        this.lastNameEn = lastNameEn;
    }

    public ThailandIdcardResult withDateOfBirthTh(String dateOfBirthTh) {
        this.dateOfBirthTh = dateOfBirthTh;
        return this;
    }

    /**
     * 泰文出生日期。 
     * @return dateOfBirthTh
     */
    public String getDateOfBirthTh() {
        return dateOfBirthTh;
    }

    public void setDateOfBirthTh(String dateOfBirthTh) {
        this.dateOfBirthTh = dateOfBirthTh;
    }

    public ThailandIdcardResult withDateOfBirthEn(String dateOfBirthEn) {
        this.dateOfBirthEn = dateOfBirthEn;
        return this;
    }

    /**
     * 英文出生日期。 
     * @return dateOfBirthEn
     */
    public String getDateOfBirthEn() {
        return dateOfBirthEn;
    }

    public void setDateOfBirthEn(String dateOfBirthEn) {
        this.dateOfBirthEn = dateOfBirthEn;
    }

    public ThailandIdcardResult withReligionTh(String religionTh) {
        this.religionTh = religionTh;
        return this;
    }

    /**
     * 宗教。 
     * @return religionTh
     */
    public String getReligionTh() {
        return religionTh;
    }

    public void setReligionTh(String religionTh) {
        this.religionTh = religionTh;
    }

    public ThailandIdcardResult withAddressTh(String addressTh) {
        this.addressTh = addressTh;
        return this;
    }

    /**
     * 地址。 
     * @return addressTh
     */
    public String getAddressTh() {
        return addressTh;
    }

    public void setAddressTh(String addressTh) {
        this.addressTh = addressTh;
    }

    public ThailandIdcardResult withDateOfIssueTh(String dateOfIssueTh) {
        this.dateOfIssueTh = dateOfIssueTh;
        return this;
    }

    /**
     * 泰文签发日期。 
     * @return dateOfIssueTh
     */
    public String getDateOfIssueTh() {
        return dateOfIssueTh;
    }

    public void setDateOfIssueTh(String dateOfIssueTh) {
        this.dateOfIssueTh = dateOfIssueTh;
    }

    public ThailandIdcardResult withDateOfIssueEn(String dateOfIssueEn) {
        this.dateOfIssueEn = dateOfIssueEn;
        return this;
    }

    /**
     * 英文签发日期。 
     * @return dateOfIssueEn
     */
    public String getDateOfIssueEn() {
        return dateOfIssueEn;
    }

    public void setDateOfIssueEn(String dateOfIssueEn) {
        this.dateOfIssueEn = dateOfIssueEn;
    }

    public ThailandIdcardResult withDateOfExpiryTh(String dateOfExpiryTh) {
        this.dateOfExpiryTh = dateOfExpiryTh;
        return this;
    }

    /**
     * 泰文有效期。 
     * @return dateOfExpiryTh
     */
    public String getDateOfExpiryTh() {
        return dateOfExpiryTh;
    }

    public void setDateOfExpiryTh(String dateOfExpiryTh) {
        this.dateOfExpiryTh = dateOfExpiryTh;
    }

    public ThailandIdcardResult withDateOfExpiryEn(String dateOfExpiryEn) {
        this.dateOfExpiryEn = dateOfExpiryEn;
        return this;
    }

    /**
     * 英文有效期。 
     * @return dateOfExpiryEn
     */
    public String getDateOfExpiryEn() {
        return dateOfExpiryEn;
    }

    public void setDateOfExpiryEn(String dateOfExpiryEn) {
        this.dateOfExpiryEn = dateOfExpiryEn;
    }

    public ThailandIdcardResult withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * 序列号。 
     * @return serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ThailandIdcardResult withCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    /**
     * 身份证反面卡号。 
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ThailandIdcardResult withLaserNumber(String laserNumber) {
        this.laserNumber = laserNumber;
        return this;
    }

    /**
     * 激光码。 
     * @return laserNumber
     */
    public String getLaserNumber() {
        return laserNumber;
    }

    public void setLaserNumber(String laserNumber) {
        this.laserNumber = laserNumber;
    }

    public ThailandIdcardResult withConfidence(ThailandIdcardConfidence confidence) {
        this.confidence = confidence;
        return this;
    }

    public ThailandIdcardResult withConfidence(Consumer<ThailandIdcardConfidence> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new ThailandIdcardConfidence();
            confidenceSetter.accept(this.confidence);
        }

        return this;
    }

    /**
     * Get confidence
     * @return confidence
     */
    public ThailandIdcardConfidence getConfidence() {
        return confidence;
    }

    public void setConfidence(ThailandIdcardConfidence confidence) {
        this.confidence = confidence;
    }

    public ThailandIdcardResult withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /**
     * 头像的base64编码。 当输入参数“return_portrait_image”为“true”时，才返回该参数。 
     * @return portraitImage
     */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public ThailandIdcardResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public ThailandIdcardResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public ThailandIdcardResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        portraitLocationSetter.accept(this.portraitLocation);
        return this;
    }

    /**
     * 头像在原图上的位置。 当输入参数“return_portrait_location”为“true”时，才返回该参数。以列表形式显示，包含头像区域四个顶点的二维坐标（x,y），坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向 
     * @return portraitLocation
     */
    public List<List<Integer>> getPortraitLocation() {
        return portraitLocation;
    }

    public void setPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
    }

    public ThailandIdcardResult withIdcardType(String idcardType) {
        this.idcardType = idcardType;
        return this;
    }

    /**
     * 身份证的类型。取值如下所示： - normal：身份证原件 - copy：复印的身份证 当输入参数“return_idcard_type”为“true”时，才返回该参数。 
     * @return idcardType
     */
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
        ThailandIdcardResult thailandIdcardResult = (ThailandIdcardResult) o;
        return Objects.equals(this.side, thailandIdcardResult.side)
            && Objects.equals(this.idNumber, thailandIdcardResult.idNumber)
            && Objects.equals(this.nameTh, thailandIdcardResult.nameTh)
            && Objects.equals(this.firstNameEn, thailandIdcardResult.firstNameEn)
            && Objects.equals(this.lastNameEn, thailandIdcardResult.lastNameEn)
            && Objects.equals(this.dateOfBirthTh, thailandIdcardResult.dateOfBirthTh)
            && Objects.equals(this.dateOfBirthEn, thailandIdcardResult.dateOfBirthEn)
            && Objects.equals(this.religionTh, thailandIdcardResult.religionTh)
            && Objects.equals(this.addressTh, thailandIdcardResult.addressTh)
            && Objects.equals(this.dateOfIssueTh, thailandIdcardResult.dateOfIssueTh)
            && Objects.equals(this.dateOfIssueEn, thailandIdcardResult.dateOfIssueEn)
            && Objects.equals(this.dateOfExpiryTh, thailandIdcardResult.dateOfExpiryTh)
            && Objects.equals(this.dateOfExpiryEn, thailandIdcardResult.dateOfExpiryEn)
            && Objects.equals(this.serialNumber, thailandIdcardResult.serialNumber)
            && Objects.equals(this.cardNumber, thailandIdcardResult.cardNumber)
            && Objects.equals(this.laserNumber, thailandIdcardResult.laserNumber)
            && Objects.equals(this.confidence, thailandIdcardResult.confidence)
            && Objects.equals(this.portraitImage, thailandIdcardResult.portraitImage)
            && Objects.equals(this.portraitLocation, thailandIdcardResult.portraitLocation)
            && Objects.equals(this.idcardType, thailandIdcardResult.idcardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side,
            idNumber,
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
            laserNumber,
            confidence,
            portraitImage,
            portraitLocation,
            idcardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThailandIdcardResult {\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
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
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    portraitImage: ").append(toIndentedString(portraitImage)).append("\n");
        sb.append("    portraitLocation: ").append(toIndentedString(portraitLocation)).append("\n");
        sb.append("    idcardType: ").append(toIndentedString(idcardType)).append("\n");
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
