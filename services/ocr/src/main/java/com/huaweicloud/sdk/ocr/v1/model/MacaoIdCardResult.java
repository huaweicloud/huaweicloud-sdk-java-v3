package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * MacaoIdCardResult
 */
public class MacaoIdCardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    @JacksonXmlProperty(localName = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    @JacksonXmlProperty(localName = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    @JacksonXmlProperty(localName = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    @JacksonXmlProperty(localName = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    @JacksonXmlProperty(localName = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    @JacksonXmlProperty(localName = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_issue_date")

    @JacksonXmlProperty(localName = "initial_issue_date")

    private String initialIssueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    @JacksonXmlProperty(localName = "height")

    private String height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    @JacksonXmlProperty(localName = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "symbols")

    @JacksonXmlProperty(localName = "symbols")

    private String symbols;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code1")

    @JacksonXmlProperty(localName = "machine_code1")

    private String machineCode1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code2")

    @JacksonXmlProperty(localName = "machine_code2")

    private String machineCode2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code3")

    @JacksonXmlProperty(localName = "machine_code3")

    private String machineCode3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    @JacksonXmlProperty(localName = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    @JacksonXmlProperty(localName = "confidence")

    private Object confidence;

    public MacaoIdCardResult withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * 证件图片正反面信息。可选值包括： - \"front\": 证件图片为正面 - \"back\": 证件图片为反面 
     * @return side
     */
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public MacaoIdCardResult withName(String name) {
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

    public MacaoIdCardResult withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文姓名，姓名单词之间使用空格进行间隔。 
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public MacaoIdCardResult withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别，返回“男”或“女”。 
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public MacaoIdCardResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 本次发证日期。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public MacaoIdCardResult withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 证件有效期。 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public MacaoIdCardResult withBirthDate(String birthDate) {
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

    public MacaoIdCardResult withInitialIssueDate(String initialIssueDate) {
        this.initialIssueDate = initialIssueDate;
        return this;
    }

    /**
     * 首次发证日期。 
     * @return initialIssueDate
     */
    public String getInitialIssueDate() {
        return initialIssueDate;
    }

    public void setInitialIssueDate(String initialIssueDate) {
        this.initialIssueDate = initialIssueDate;
    }

    public MacaoIdCardResult withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 身高。 
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public MacaoIdCardResult withNumber(String number) {
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

    public MacaoIdCardResult withSymbols(String symbols) {
        this.symbols = symbols;
        return this;
    }

    /**
     * 身份证上的字母代码，表示出生地等信息。 
     * @return symbols
     */
    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }

    public MacaoIdCardResult withMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
        return this;
    }

    /**
     * 身份证背面第一行机器码。 
     * @return machineCode1
     */
    public String getMachineCode1() {
        return machineCode1;
    }

    public void setMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
    }

    public MacaoIdCardResult withMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
        return this;
    }

    /**
     * 身份证背面第二行机器码。 
     * @return machineCode2
     */
    public String getMachineCode2() {
        return machineCode2;
    }

    public void setMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
    }

    public MacaoIdCardResult withMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
        return this;
    }

    /**
     * 身份证背面第三行机器码。 
     * @return machineCode3
     */
    public String getMachineCode3() {
        return machineCode3;
    }

    public void setMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
    }

    public MacaoIdCardResult withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /**
     * 身份证头像照片的Base64编码。 若入参“return_portrait_image”字段缺失时，则此字段不存在。 
     * @return portraitImage
     */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public MacaoIdCardResult withConfidence(Object confidence) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MacaoIdCardResult macaoIdCardResult = (MacaoIdCardResult) o;
        return Objects.equals(this.side, macaoIdCardResult.side) && Objects.equals(this.name, macaoIdCardResult.name)
            && Objects.equals(this.nameEn, macaoIdCardResult.nameEn) && Objects.equals(this.sex, macaoIdCardResult.sex)
            && Objects.equals(this.issueDate, macaoIdCardResult.issueDate)
            && Objects.equals(this.expiryDate, macaoIdCardResult.expiryDate)
            && Objects.equals(this.birthDate, macaoIdCardResult.birthDate)
            && Objects.equals(this.initialIssueDate, macaoIdCardResult.initialIssueDate)
            && Objects.equals(this.height, macaoIdCardResult.height)
            && Objects.equals(this.number, macaoIdCardResult.number)
            && Objects.equals(this.symbols, macaoIdCardResult.symbols)
            && Objects.equals(this.machineCode1, macaoIdCardResult.machineCode1)
            && Objects.equals(this.machineCode2, macaoIdCardResult.machineCode2)
            && Objects.equals(this.machineCode3, macaoIdCardResult.machineCode3)
            && Objects.equals(this.portraitImage, macaoIdCardResult.portraitImage)
            && Objects.equals(this.confidence, macaoIdCardResult.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side,
            name,
            nameEn,
            sex,
            issueDate,
            expiryDate,
            birthDate,
            initialIssueDate,
            height,
            number,
            symbols,
            machineCode1,
            machineCode2,
            machineCode3,
            portraitImage,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MacaoIdCardResult {\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    initialIssueDate: ").append(toIndentedString(initialIssueDate)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
        sb.append("    machineCode1: ").append(toIndentedString(machineCode1)).append("\n");
        sb.append("    machineCode2: ").append(toIndentedString(machineCode2)).append("\n");
        sb.append("    machineCode3: ").append(toIndentedString(machineCode3)).append("\n");
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
