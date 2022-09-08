package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExitEntryPermitResult
 */
public class ExitEntryPermitResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private String issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_place")

    private String issuePlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_period")

    private String validPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code")

    private String machineCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endorsement_info_hk")

    private ExitEntryPermitEndorsementInfo endorsementInfoHk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endorsement_info_mo")

    private ExitEntryPermitEndorsementInfo endorsementInfoMo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endorsement_info_tw")

    private ExitEntryPermitEndorsementInfo endorsementInfoTw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private ExitEntryPermitConfidence confidence;

    public ExitEntryPermitResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExitEntryPermitResult withNameEn(String nameEn) {
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

    public ExitEntryPermitResult withSex(String sex) {
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

    public ExitEntryPermitResult withBirthDate(String birthDate) {
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

    public ExitEntryPermitResult withNumber(String number) {
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

    public ExitEntryPermitResult withIssuingAuthority(String issuingAuthority) {
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

    public ExitEntryPermitResult withIssuePlace(String issuePlace) {
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

    public ExitEntryPermitResult withValidPeriod(String validPeriod) {
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

    public ExitEntryPermitResult withMachineCode(String machineCode) {
        this.machineCode = machineCode;
        return this;
    }

    /**
     * 机器码。 
     * @return machineCode
     */
    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public ExitEntryPermitResult withPortraitImage(String portraitImage) {
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

    public ExitEntryPermitResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public ExitEntryPermitResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public ExitEntryPermitResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
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

    public ExitEntryPermitResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 证件类型。可选值包括： - \"往来港澳通行证 \" - \"往来台湾通行证\" 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ExitEntryPermitResult withSide(String side) {
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

    public ExitEntryPermitResult withEndorsementInfoHk(ExitEntryPermitEndorsementInfo endorsementInfoHk) {
        this.endorsementInfoHk = endorsementInfoHk;
        return this;
    }

    public ExitEntryPermitResult withEndorsementInfoHk(
        Consumer<ExitEntryPermitEndorsementInfo> endorsementInfoHkSetter) {
        if (this.endorsementInfoHk == null) {
            this.endorsementInfoHk = new ExitEntryPermitEndorsementInfo();
            endorsementInfoHkSetter.accept(this.endorsementInfoHk);
        }

        return this;
    }

    /**
     * Get endorsementInfoHk
     * @return endorsementInfoHk
     */
    public ExitEntryPermitEndorsementInfo getEndorsementInfoHk() {
        return endorsementInfoHk;
    }

    public void setEndorsementInfoHk(ExitEntryPermitEndorsementInfo endorsementInfoHk) {
        this.endorsementInfoHk = endorsementInfoHk;
    }

    public ExitEntryPermitResult withEndorsementInfoMo(ExitEntryPermitEndorsementInfo endorsementInfoMo) {
        this.endorsementInfoMo = endorsementInfoMo;
        return this;
    }

    public ExitEntryPermitResult withEndorsementInfoMo(
        Consumer<ExitEntryPermitEndorsementInfo> endorsementInfoMoSetter) {
        if (this.endorsementInfoMo == null) {
            this.endorsementInfoMo = new ExitEntryPermitEndorsementInfo();
            endorsementInfoMoSetter.accept(this.endorsementInfoMo);
        }

        return this;
    }

    /**
     * Get endorsementInfoMo
     * @return endorsementInfoMo
     */
    public ExitEntryPermitEndorsementInfo getEndorsementInfoMo() {
        return endorsementInfoMo;
    }

    public void setEndorsementInfoMo(ExitEntryPermitEndorsementInfo endorsementInfoMo) {
        this.endorsementInfoMo = endorsementInfoMo;
    }

    public ExitEntryPermitResult withEndorsementInfoTw(ExitEntryPermitEndorsementInfo endorsementInfoTw) {
        this.endorsementInfoTw = endorsementInfoTw;
        return this;
    }

    public ExitEntryPermitResult withEndorsementInfoTw(
        Consumer<ExitEntryPermitEndorsementInfo> endorsementInfoTwSetter) {
        if (this.endorsementInfoTw == null) {
            this.endorsementInfoTw = new ExitEntryPermitEndorsementInfo();
            endorsementInfoTwSetter.accept(this.endorsementInfoTw);
        }

        return this;
    }

    /**
     * Get endorsementInfoTw
     * @return endorsementInfoTw
     */
    public ExitEntryPermitEndorsementInfo getEndorsementInfoTw() {
        return endorsementInfoTw;
    }

    public void setEndorsementInfoTw(ExitEntryPermitEndorsementInfo endorsementInfoTw) {
        this.endorsementInfoTw = endorsementInfoTw;
    }

    public ExitEntryPermitResult withConfidence(ExitEntryPermitConfidence confidence) {
        this.confidence = confidence;
        return this;
    }

    public ExitEntryPermitResult withConfidence(Consumer<ExitEntryPermitConfidence> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new ExitEntryPermitConfidence();
            confidenceSetter.accept(this.confidence);
        }

        return this;
    }

    /**
     * Get confidence
     * @return confidence
     */
    public ExitEntryPermitConfidence getConfidence() {
        return confidence;
    }

    public void setConfidence(ExitEntryPermitConfidence confidence) {
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
        ExitEntryPermitResult exitEntryPermitResult = (ExitEntryPermitResult) o;
        return Objects.equals(this.name, exitEntryPermitResult.name)
            && Objects.equals(this.nameEn, exitEntryPermitResult.nameEn)
            && Objects.equals(this.sex, exitEntryPermitResult.sex)
            && Objects.equals(this.birthDate, exitEntryPermitResult.birthDate)
            && Objects.equals(this.number, exitEntryPermitResult.number)
            && Objects.equals(this.issuingAuthority, exitEntryPermitResult.issuingAuthority)
            && Objects.equals(this.issuePlace, exitEntryPermitResult.issuePlace)
            && Objects.equals(this.validPeriod, exitEntryPermitResult.validPeriod)
            && Objects.equals(this.machineCode, exitEntryPermitResult.machineCode)
            && Objects.equals(this.portraitImage, exitEntryPermitResult.portraitImage)
            && Objects.equals(this.portraitLocation, exitEntryPermitResult.portraitLocation)
            && Objects.equals(this.type, exitEntryPermitResult.type)
            && Objects.equals(this.side, exitEntryPermitResult.side)
            && Objects.equals(this.endorsementInfoHk, exitEntryPermitResult.endorsementInfoHk)
            && Objects.equals(this.endorsementInfoMo, exitEntryPermitResult.endorsementInfoMo)
            && Objects.equals(this.endorsementInfoTw, exitEntryPermitResult.endorsementInfoTw)
            && Objects.equals(this.confidence, exitEntryPermitResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            nameEn,
            sex,
            birthDate,
            number,
            issuingAuthority,
            issuePlace,
            validPeriod,
            machineCode,
            portraitImage,
            portraitLocation,
            type,
            side,
            endorsementInfoHk,
            endorsementInfoMo,
            endorsementInfoTw,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExitEntryPermitResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    issuePlace: ").append(toIndentedString(issuePlace)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("    machineCode: ").append(toIndentedString(machineCode)).append("\n");
        sb.append("    portraitImage: ").append(toIndentedString(portraitImage)).append("\n");
        sb.append("    portraitLocation: ").append(toIndentedString(portraitLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    endorsementInfoHk: ").append(toIndentedString(endorsementInfoHk)).append("\n");
        sb.append("    endorsementInfoMo: ").append(toIndentedString(endorsementInfoMo)).append("\n");
        sb.append("    endorsementInfoTw: ").append(toIndentedString(endorsementInfoTw)).append("\n");
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
