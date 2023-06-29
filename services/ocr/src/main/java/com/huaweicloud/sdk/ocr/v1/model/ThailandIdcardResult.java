package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThailandIdcardResult
 */
public class ThailandIdcardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_number")

    private String refNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    private String idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_th")

    private String nameTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_name_en")

    private String firstNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_name_en")

    private String lastNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_birth_th")

    private String dateOfBirthTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_birth_en")

    private String dateOfBirthEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "religion_th")

    private String religionTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_th")

    private String addressTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_issue_th")

    private String dateOfIssueTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_issue_en")

    private String dateOfIssueEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_expiry_th")

    private String dateOfExpiryTh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_of_expiry_en")

    private String dateOfExpiryEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_number")

    private String serialNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_number")

    private String cardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "laser_number")

    private String laserNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private ThailandIdcardConfidence confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_type")

    private String idcardType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    public ThailandIdcardResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 返回证件类型，\"normal\"表示普通泰文证件，\"pink\"表示外国人身份证件 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ThailandIdcardResult withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文名。 
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public ThailandIdcardResult withRefNumber(String refNumber) {
        this.refNumber = refNumber;
        return this;
    }

    /**
     * 参考编码。 
     * @return refNumber
     */
    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

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
     * 身份证的类型。取值如下所示： - normal：身份证原件 - copy：复印的身份证 - screen：屏幕翻拍 当输入参数“return_idcard_type”为“true”时，才返回该参数。 
     * @return idcardType
     */
    public String getIdcardType() {
        return idcardType;
    }

    public void setIdcardType(String idcardType) {
        this.idcardType = idcardType;
    }

    public ThailandIdcardResult withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /**
     * 对应所有在原图上识别到的字段位置信息，包含所有文字区域四个顶点的二维坐标（x,y）。采用图像坐标系，坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return textLocation
     */
    public Object getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Object textLocation) {
        this.textLocation = textLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThailandIdcardResult that = (ThailandIdcardResult) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.refNumber, that.refNumber) && Objects.equals(this.side, that.side)
            && Objects.equals(this.idNumber, that.idNumber) && Objects.equals(this.nameTh, that.nameTh)
            && Objects.equals(this.firstNameEn, that.firstNameEn) && Objects.equals(this.lastNameEn, that.lastNameEn)
            && Objects.equals(this.dateOfBirthTh, that.dateOfBirthTh)
            && Objects.equals(this.dateOfBirthEn, that.dateOfBirthEn)
            && Objects.equals(this.religionTh, that.religionTh) && Objects.equals(this.addressTh, that.addressTh)
            && Objects.equals(this.dateOfIssueTh, that.dateOfIssueTh)
            && Objects.equals(this.dateOfIssueEn, that.dateOfIssueEn)
            && Objects.equals(this.dateOfExpiryTh, that.dateOfExpiryTh)
            && Objects.equals(this.dateOfExpiryEn, that.dateOfExpiryEn)
            && Objects.equals(this.serialNumber, that.serialNumber) && Objects.equals(this.cardNumber, that.cardNumber)
            && Objects.equals(this.laserNumber, that.laserNumber) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.portraitImage, that.portraitImage)
            && Objects.equals(this.portraitLocation, that.portraitLocation)
            && Objects.equals(this.idcardType, that.idcardType) && Objects.equals(this.textLocation, that.textLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            nameEn,
            refNumber,
            side,
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
            idcardType,
            textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThailandIdcardResult {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
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
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
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
