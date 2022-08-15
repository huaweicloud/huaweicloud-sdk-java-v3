package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HkIdCardResult
 */
public class HkIdCardResult {

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
    @JsonProperty(value = "symbols")

    private String symbols;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_telegraph_code")

    private String nameTelegraphCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permanent")

    private Boolean permanent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_issue_date")

    private String initialIssueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public HkIdCardResult withName(String name) {
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

    public HkIdCardResult withNameEn(String nameEn) {
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

    public HkIdCardResult withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别。  男： value值为：M 女： value值为：F 
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public HkIdCardResult withBirthDate(String birthDate) {
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

    public HkIdCardResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 身份证号。 
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public HkIdCardResult withSymbols(String symbols) {
        this.symbols = symbols;
        return this;
    }

    /**
     * 证件符号。 
     * @return symbols
     */
    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }

    public HkIdCardResult withNameTelegraphCode(String nameTelegraphCode) {
        this.nameTelegraphCode = nameTelegraphCode;
        return this;
    }

    /**
     * 中文姓名对应电码。 
     * @return nameTelegraphCode
     */
    public String getNameTelegraphCode() {
        return nameTelegraphCode;
    }

    public void setNameTelegraphCode(String nameTelegraphCode) {
        this.nameTelegraphCode = nameTelegraphCode;
    }

    public HkIdCardResult withPermanent(Boolean permanent) {
        this.permanent = permanent;
        return this;
    }

    /**
     * 是否永久性居民身份证。  永久：value值为true 非永久：value值为false 
     * @return permanent
     */
    public Boolean getPermanent() {
        return permanent;
    }

    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    public HkIdCardResult withInitialIssueDate(String initialIssueDate) {
        this.initialIssueDate = initialIssueDate;
        return this;
    }

    /**
     * 首次领用日期。 
     * @return initialIssueDate
     */
    public String getInitialIssueDate() {
        return initialIssueDate;
    }

    public void setInitialIssueDate(String initialIssueDate) {
        this.initialIssueDate = initialIssueDate;
    }

    public HkIdCardResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 签发日期。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public HkIdCardResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public HkIdCardResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public HkIdCardResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
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

    public HkIdCardResult withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /**
     * 头像的base64编码，默认返回尺寸较大的头像。 当输入参数“return_portrait_image”为true时，才返回该参数。 
     * @return portraitImage
     */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public HkIdCardResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 各个字段的置信度。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
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
        HkIdCardResult hkIdCardResult = (HkIdCardResult) o;
        return Objects.equals(this.name, hkIdCardResult.name) && Objects.equals(this.nameEn, hkIdCardResult.nameEn)
            && Objects.equals(this.sex, hkIdCardResult.sex) && Objects.equals(this.birthDate, hkIdCardResult.birthDate)
            && Objects.equals(this.number, hkIdCardResult.number)
            && Objects.equals(this.symbols, hkIdCardResult.symbols)
            && Objects.equals(this.nameTelegraphCode, hkIdCardResult.nameTelegraphCode)
            && Objects.equals(this.permanent, hkIdCardResult.permanent)
            && Objects.equals(this.initialIssueDate, hkIdCardResult.initialIssueDate)
            && Objects.equals(this.issueDate, hkIdCardResult.issueDate)
            && Objects.equals(this.portraitLocation, hkIdCardResult.portraitLocation)
            && Objects.equals(this.portraitImage, hkIdCardResult.portraitImage)
            && Objects.equals(this.confidence, hkIdCardResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            nameEn,
            sex,
            birthDate,
            number,
            symbols,
            nameTelegraphCode,
            permanent,
            initialIssueDate,
            issueDate,
            portraitLocation,
            portraitImage,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HkIdCardResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
        sb.append("    nameTelegraphCode: ").append(toIndentedString(nameTelegraphCode)).append("\n");
        sb.append("    permanent: ").append(toIndentedString(permanent)).append("\n");
        sb.append("    initialIssueDate: ").append(toIndentedString(initialIssueDate)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    portraitLocation: ").append(toIndentedString(portraitLocation)).append("\n");
        sb.append("    portraitImage: ").append(toIndentedString(portraitImage)).append("\n");
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
