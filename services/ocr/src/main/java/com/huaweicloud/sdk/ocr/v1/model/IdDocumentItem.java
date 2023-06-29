package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IdDocumentItem
 */
public class IdDocumentItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_region")

    private String countryRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_type")

    private String idType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "side")

    private String side;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_name")

    private String firstName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_name")

    private String lastName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nationality")

    private String nationality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_number")

    private String documentNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private String issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public IdDocumentItem withCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
        return this;
    }

    /**
     * 证件签发国家或地区代码，命名遵循ISO-3166 3位代码。当前支持国家列表见表1。 
     * @return countryRegion
     */
    public String getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public IdDocumentItem withIdType(String idType) {
        this.idType = idType;
        return this;
    }

    /**
     * 证件类型，可选值如下： - PP: passport，国际护照。 - DL: driving license，驾驶证。 - ID: identification card，各国颁发的身份证类型证件，比如身份证、选民卡、社保卡等。 
     * @return idType
     */
    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public IdDocumentItem withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * 证件正面或反面,可选值： - front: 正面，一般是包含人像的那面 - back: 背面 对于只有一面的卡证，返回front 
     * @return side
     */
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public IdDocumentItem withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * 名 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public IdDocumentItem withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * 姓氏 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IdDocumentItem withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别，可选值： M:男性 F:女性 X:中性 
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public IdDocumentItem withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    /**
     * 持有人国籍 
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public IdDocumentItem withBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * 生日，格式为yyyy-mm-dd 
     * @return birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public IdDocumentItem withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 签发日期，yyyy-mm-dd 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public IdDocumentItem withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 有效日期，yyyy-mm-dd 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public IdDocumentItem withDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * 证件号码 
     * @return documentNumber
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public IdDocumentItem withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 持有人通讯地址 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public IdDocumentItem withIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * 签发机关 
     * @return issuingAuthority
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public IdDocumentItem withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /**
     * 可选返回，证件头像图像base64编码 
     * @return portraitImage
     */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public IdDocumentItem withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 字段置信度，为0~1之间的小数，值越大，表明识别结果越可靠 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdDocumentItem that = (IdDocumentItem) obj;
        return Objects.equals(this.countryRegion, that.countryRegion) && Objects.equals(this.idType, that.idType)
            && Objects.equals(this.side, that.side) && Objects.equals(this.firstName, that.firstName)
            && Objects.equals(this.lastName, that.lastName) && Objects.equals(this.sex, that.sex)
            && Objects.equals(this.nationality, that.nationality) && Objects.equals(this.birthDate, that.birthDate)
            && Objects.equals(this.issueDate, that.issueDate) && Objects.equals(this.expiryDate, that.expiryDate)
            && Objects.equals(this.documentNumber, that.documentNumber) && Objects.equals(this.address, that.address)
            && Objects.equals(this.issuingAuthority, that.issuingAuthority)
            && Objects.equals(this.portraitImage, that.portraitImage)
            && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryRegion,
            idType,
            side,
            firstName,
            lastName,
            sex,
            nationality,
            birthDate,
            issueDate,
            expiryDate,
            documentNumber,
            address,
            issuingAuthority,
            portraitImage,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdDocumentItem {\n");
        sb.append("    countryRegion: ").append(toIndentedString(countryRegion)).append("\n");
        sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
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
