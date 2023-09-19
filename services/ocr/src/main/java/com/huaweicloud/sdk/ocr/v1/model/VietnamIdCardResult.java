package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class VietnamIdCardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name")

    private String fullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nationality")

    private String nationality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_place")

    private String originPlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "residence_place")

    private String residencePlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "personal_identification")

    private String personalIdentification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code1")

    private String machineCode1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code2")

    private String machineCode2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code3")

    private String machineCode3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

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

    public VietnamIdCardResult withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * 返回证件正反面。字段值为“front”或“back” 
     * @return side
     */
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public VietnamIdCardResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 卡证编号。 
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VietnamIdCardResult withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * 姓名。 
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public VietnamIdCardResult withBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * 出生日期。 
     * @return birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public VietnamIdCardResult withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别。 
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public VietnamIdCardResult withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    /**
     * 国籍。 
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public VietnamIdCardResult withOriginPlace(String originPlace) {
        this.originPlace = originPlace;
        return this;
    }

    /**
     * 籍贯。 
     * @return originPlace
     */
    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public VietnamIdCardResult withResidencePlace(String residencePlace) {
        this.residencePlace = residencePlace;
        return this;
    }

    /**
     * 居住地。 
     * @return residencePlace
     */
    public String getResidencePlace() {
        return residencePlace;
    }

    public void setResidencePlace(String residencePlace) {
        this.residencePlace = residencePlace;
    }

    public VietnamIdCardResult withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 有效日期。 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public VietnamIdCardResult withPersonalIdentification(String personalIdentification) {
        this.personalIdentification = personalIdentification;
        return this;
    }

    /**
     * 个人识别。当参数“side”为back时，返回此字段。 
     * @return personalIdentification
     */
    public String getPersonalIdentification() {
        return personalIdentification;
    }

    public void setPersonalIdentification(String personalIdentification) {
        this.personalIdentification = personalIdentification;
    }

    public VietnamIdCardResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 签发日期。当参数“side”为back时，返回此字段。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public VietnamIdCardResult withMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
        return this;
    }

    /**
     * 身份证背面第一行机器码。当参数“side”为back时，返回此字段。 
     * @return machineCode1
     */
    public String getMachineCode1() {
        return machineCode1;
    }

    public void setMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
    }

    public VietnamIdCardResult withMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
        return this;
    }

    /**
     * 身份证背面第二行机器码。当参数“side”为back时，返回此字段。 
     * @return machineCode2
     */
    public String getMachineCode2() {
        return machineCode2;
    }

    public void setMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
    }

    public VietnamIdCardResult withMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
        return this;
    }

    /**
     * 身份证背面第三行机器码。当参数“side”为back时，返回此字段。 
     * @return machineCode3
     */
    public String getMachineCode3() {
        return machineCode3;
    }

    public void setMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
    }

    public VietnamIdCardResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。注：置信度由算法给出，不直接等价于对应字段的准确率。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    public VietnamIdCardResult withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /**
     * 当参数return_portrait_image为true时，返回头像的base64编码。 
     * @return portraitImage
     */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public VietnamIdCardResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public VietnamIdCardResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public VietnamIdCardResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        portraitLocationSetter.accept(this.portraitLocation);
        return this;
    }

    /**
     * 当参数return_portrait_location为true时，返回头像在原图上的位置，以列表形式表示，包含头像区域四个顶点的二维坐标（x,y）；坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return portraitLocation
     */
    public List<List<Integer>> getPortraitLocation() {
        return portraitLocation;
    }

    public void setPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
    }

    public VietnamIdCardResult withIdcardType(String idcardType) {
        this.idcardType = idcardType;
        return this;
    }

    /**
     * 输入参数return_idcard_type为true时，返回身份证的类型：normal是身份证原件，copy是复印的身份证，screen是屏幕翻拍。 
     * @return idcardType
     */
    public String getIdcardType() {
        return idcardType;
    }

    public void setIdcardType(String idcardType) {
        this.idcardType = idcardType;
    }

    public VietnamIdCardResult withTextLocation(Object textLocation) {
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
        VietnamIdCardResult that = (VietnamIdCardResult) obj;
        return Objects.equals(this.side, that.side) && Objects.equals(this.number, that.number)
            && Objects.equals(this.fullName, that.fullName) && Objects.equals(this.birthDate, that.birthDate)
            && Objects.equals(this.sex, that.sex) && Objects.equals(this.nationality, that.nationality)
            && Objects.equals(this.originPlace, that.originPlace)
            && Objects.equals(this.residencePlace, that.residencePlace)
            && Objects.equals(this.expiryDate, that.expiryDate)
            && Objects.equals(this.personalIdentification, that.personalIdentification)
            && Objects.equals(this.issueDate, that.issueDate) && Objects.equals(this.machineCode1, that.machineCode1)
            && Objects.equals(this.machineCode2, that.machineCode2)
            && Objects.equals(this.machineCode3, that.machineCode3) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.portraitImage, that.portraitImage)
            && Objects.equals(this.portraitLocation, that.portraitLocation)
            && Objects.equals(this.idcardType, that.idcardType) && Objects.equals(this.textLocation, that.textLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side,
            number,
            fullName,
            birthDate,
            sex,
            nationality,
            originPlace,
            residencePlace,
            expiryDate,
            personalIdentification,
            issueDate,
            machineCode1,
            machineCode2,
            machineCode3,
            confidence,
            portraitImage,
            portraitLocation,
            idcardType,
            textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VietnamIdCardResult {\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    originPlace: ").append(toIndentedString(originPlace)).append("\n");
        sb.append("    residencePlace: ").append(toIndentedString(residencePlace)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    personalIdentification: ").append(toIndentedString(personalIdentification)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    machineCode1: ").append(toIndentedString(machineCode1)).append("\n");
        sb.append("    machineCode2: ").append(toIndentedString(machineCode2)).append("\n");
        sb.append("    machineCode3: ").append(toIndentedString(machineCode3)).append("\n");
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
