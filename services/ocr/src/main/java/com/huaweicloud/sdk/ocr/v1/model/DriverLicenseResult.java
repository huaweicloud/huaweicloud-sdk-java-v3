package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DriverLicenseResult */
public class DriverLicenseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nationality")

    private String nationality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth")

    private String birth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "class")

    private String propertyClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_from")

    private String validFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_to")

    private String validTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private String issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_number")

    private String fileNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record")

    private String record;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    public DriverLicenseResult withNumber(String number) {
        this.number = number;
        return this;
    }

    /** 驾驶证号。
     * 
     * @return number */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public DriverLicenseResult withName(String name) {
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

    public DriverLicenseResult withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /** 性别。
     * 
     * @return sex */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public DriverLicenseResult withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    /** 国籍。
     * 
     * @return nationality */
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public DriverLicenseResult withAddress(String address) {
        this.address = address;
        return this;
    }

    /** 住址。
     * 
     * @return address */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DriverLicenseResult withBirth(String birth) {
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

    public DriverLicenseResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /** 初次领证日期。
     * 
     * @return issueDate */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public DriverLicenseResult withPropertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
        return this;
    }

    /** 准驾类型。
     * 
     * @return propertyClass */
    public String getPropertyClass() {
        return propertyClass;
    }

    public void setPropertyClass(String propertyClass) {
        this.propertyClass = propertyClass;
    }

    public DriverLicenseResult withValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /** 有效起始日期。
     * 
     * @return validFrom */
    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public DriverLicenseResult withValidTo(String validTo) {
        this.validTo = validTo;
        return this;
    }

    /** 有效结束日期。
     * 
     * @return validTo */
    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public DriverLicenseResult withIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /** 发证机关。
     * 
     * @return issuingAuthority */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public DriverLicenseResult withFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
        return this;
    }

    /** 档案编号。
     * 
     * @return fileNumber */
    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public DriverLicenseResult withRecord(String record) {
        this.record = record;
        return this;
    }

    /** 记录。
     * 
     * @return record */
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public DriverLicenseResult withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /** 文本框在原图位置。输出左上、右上、右下、左下四个点坐标。当“return_text_location”设置为“true”时才返回。
     * 
     * @return textLocation */
    public Object getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Object textLocation) {
        this.textLocation = textLocation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DriverLicenseResult driverLicenseResult = (DriverLicenseResult) o;
        return Objects.equals(this.number, driverLicenseResult.number)
            && Objects.equals(this.name, driverLicenseResult.name) && Objects.equals(this.sex, driverLicenseResult.sex)
            && Objects.equals(this.nationality, driverLicenseResult.nationality)
            && Objects.equals(this.address, driverLicenseResult.address)
            && Objects.equals(this.birth, driverLicenseResult.birth)
            && Objects.equals(this.issueDate, driverLicenseResult.issueDate)
            && Objects.equals(this.propertyClass, driverLicenseResult.propertyClass)
            && Objects.equals(this.validFrom, driverLicenseResult.validFrom)
            && Objects.equals(this.validTo, driverLicenseResult.validTo)
            && Objects.equals(this.issuingAuthority, driverLicenseResult.issuingAuthority)
            && Objects.equals(this.fileNumber, driverLicenseResult.fileNumber)
            && Objects.equals(this.record, driverLicenseResult.record)
            && Objects.equals(this.textLocation, driverLicenseResult.textLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,
            name,
            sex,
            nationality,
            address,
            birth,
            issueDate,
            propertyClass,
            validFrom,
            validTo,
            issuingAuthority,
            fileNumber,
            record,
            textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DriverLicenseResult {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
        sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    fileNumber: ").append(toIndentedString(fileNumber)).append("\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
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
