package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MainlandTravelPermitResult
 */
public class MainlandTravelPermitResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_period")

    private String validPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private String issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_place")

    private String issuePlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_times")

    private String issueTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_name")

    private String idName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    private String idNumber;

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
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private MainlandTravelPermitConfidence confidence;

    public MainlandTravelPermitResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 中文姓名。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainlandTravelPermitResult withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文姓名。 
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public MainlandTravelPermitResult withBirthDate(String birthDate) {
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

    public MainlandTravelPermitResult withSex(String sex) {
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

    public MainlandTravelPermitResult withValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }

    /**
     * 有效期限。 
     * @return validPeriod
     */
    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
    }

    public MainlandTravelPermitResult withIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * 签发机关。 
     * @return issuingAuthority
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public MainlandTravelPermitResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 证件号。 
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MainlandTravelPermitResult withIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
        return this;
    }

    /**
     * 签发地点。 
     * @return issuePlace
     */
    public String getIssuePlace() {
        return issuePlace;
    }

    public void setIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
    }

    public MainlandTravelPermitResult withIssueTimes(String issueTimes) {
        this.issueTimes = issueTimes;
        return this;
    }

    /**
     * 签发次数。 
     * @return issueTimes
     */
    public String getIssueTimes() {
        return issueTimes;
    }

    public void setIssueTimes(String issueTimes) {
        this.issueTimes = issueTimes;
    }

    public MainlandTravelPermitResult withIdName(String idName) {
        this.idName = idName;
        return this;
    }

    /**
     * 回乡证背面的香港/澳门/台湾身份证姓名。 
     * @return idName
     */
    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public MainlandTravelPermitResult withIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /**
     * 回乡证背面的香港/澳门/台湾身份证号码。 
     * @return idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public MainlandTravelPermitResult withMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
        return this;
    }

    /**
     * 机读码第一行。 
     * @return machineCode1
     */
    public String getMachineCode1() {
        return machineCode1;
    }

    public void setMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
    }

    public MainlandTravelPermitResult withMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
        return this;
    }

    /**
     * 机读码第二行。 
     * @return machineCode2
     */
    public String getMachineCode2() {
        return machineCode2;
    }

    public void setMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
    }

    public MainlandTravelPermitResult withMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
        return this;
    }

    /**
     * 机读码第三行。 
     * @return machineCode3
     */
    public String getMachineCode3() {
        return machineCode3;
    }

    public void setMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
    }

    public MainlandTravelPermitResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 证件类别。可选值包括： - “港澳居民来往内地通行证” - “台湾居民来往大陆通行证” 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MainlandTravelPermitResult withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * 证件图片正反面信息。可选值包括： - \"front\"：证件图片为正面 - \"back\"：证件图片为反面 
     * @return side
     */
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public MainlandTravelPermitResult withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /**
     * 头像的base64编码。当输入参数“return_portrait_image”为“true”时，才返回该参数。 
     * @return portraitImage
     */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public MainlandTravelPermitResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public MainlandTravelPermitResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public MainlandTravelPermitResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        portraitLocationSetter.accept(this.portraitLocation);
        return this;
    }

    /**
     * 头像在原图上的位置。 当输入参数“return_portrait_location”为“true”时，才返回该参数。以列表形式显示，包含头像区域四个顶点的二维坐标（x,y），坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return portraitLocation
     */
    public List<List<Integer>> getPortraitLocation() {
        return portraitLocation;
    }

    public void setPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
    }

    public MainlandTravelPermitResult withConfidence(MainlandTravelPermitConfidence confidence) {
        this.confidence = confidence;
        return this;
    }

    public MainlandTravelPermitResult withConfidence(Consumer<MainlandTravelPermitConfidence> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new MainlandTravelPermitConfidence();
            confidenceSetter.accept(this.confidence);
        }

        return this;
    }

    /**
     * Get confidence
     * @return confidence
     */
    public MainlandTravelPermitConfidence getConfidence() {
        return confidence;
    }

    public void setConfidence(MainlandTravelPermitConfidence confidence) {
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
        MainlandTravelPermitResult mainlandTravelPermitResult = (MainlandTravelPermitResult) o;
        return Objects.equals(this.name, mainlandTravelPermitResult.name)
            && Objects.equals(this.nameEn, mainlandTravelPermitResult.nameEn)
            && Objects.equals(this.birthDate, mainlandTravelPermitResult.birthDate)
            && Objects.equals(this.sex, mainlandTravelPermitResult.sex)
            && Objects.equals(this.validPeriod, mainlandTravelPermitResult.validPeriod)
            && Objects.equals(this.issuingAuthority, mainlandTravelPermitResult.issuingAuthority)
            && Objects.equals(this.number, mainlandTravelPermitResult.number)
            && Objects.equals(this.issuePlace, mainlandTravelPermitResult.issuePlace)
            && Objects.equals(this.issueTimes, mainlandTravelPermitResult.issueTimes)
            && Objects.equals(this.idName, mainlandTravelPermitResult.idName)
            && Objects.equals(this.idNumber, mainlandTravelPermitResult.idNumber)
            && Objects.equals(this.machineCode1, mainlandTravelPermitResult.machineCode1)
            && Objects.equals(this.machineCode2, mainlandTravelPermitResult.machineCode2)
            && Objects.equals(this.machineCode3, mainlandTravelPermitResult.machineCode3)
            && Objects.equals(this.type, mainlandTravelPermitResult.type)
            && Objects.equals(this.side, mainlandTravelPermitResult.side)
            && Objects.equals(this.portraitImage, mainlandTravelPermitResult.portraitImage)
            && Objects.equals(this.portraitLocation, mainlandTravelPermitResult.portraitLocation)
            && Objects.equals(this.confidence, mainlandTravelPermitResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            nameEn,
            birthDate,
            sex,
            validPeriod,
            issuingAuthority,
            number,
            issuePlace,
            issueTimes,
            idName,
            idNumber,
            machineCode1,
            machineCode2,
            machineCode3,
            type,
            side,
            portraitImage,
            portraitLocation,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MainlandTravelPermitResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    issuePlace: ").append(toIndentedString(issuePlace)).append("\n");
        sb.append("    issueTimes: ").append(toIndentedString(issueTimes)).append("\n");
        sb.append("    idName: ").append(toIndentedString(idName)).append("\n");
        sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
        sb.append("    machineCode1: ").append(toIndentedString(machineCode1)).append("\n");
        sb.append("    machineCode2: ").append(toIndentedString(machineCode2)).append("\n");
        sb.append("    machineCode3: ").append(toIndentedString(machineCode3)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    portraitImage: ").append(toIndentedString(portraitImage)).append("\n");
        sb.append("    portraitLocation: ").append(toIndentedString(portraitLocation)).append("\n");
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
