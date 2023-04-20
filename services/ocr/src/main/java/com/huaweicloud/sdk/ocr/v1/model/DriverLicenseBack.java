package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DriverLicenseBack
 */
public class DriverLicenseBack {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private String issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_number")

    private String fileNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record")

    private String record;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    public DriverLicenseBack withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 驾驶证类型。 normal：纸质驾驶证 electronic：电子驾驶证 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DriverLicenseBack withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 驾驶证号。 
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public DriverLicenseBack withName(String name) {
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

    public DriverLicenseBack withIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * 发证机关。 
     * @return issuingAuthority
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public DriverLicenseBack withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 住址。 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DriverLicenseBack withFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
        return this;
    }

    /**
     * 档案编号。 
     * @return fileNumber
     */
    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public DriverLicenseBack withRecord(String record) {
        this.record = record;
        return this;
    }

    /**
     * 记录。 
     * @return record
     */
    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public DriverLicenseBack withTextLocation(Object textLocation) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DriverLicenseBack driverLicenseBack = (DriverLicenseBack) o;
        return Objects.equals(this.type, driverLicenseBack.type)
            && Objects.equals(this.number, driverLicenseBack.number)
            && Objects.equals(this.name, driverLicenseBack.name)
            && Objects.equals(this.issuingAuthority, driverLicenseBack.issuingAuthority)
            && Objects.equals(this.address, driverLicenseBack.address)
            && Objects.equals(this.fileNumber, driverLicenseBack.fileNumber)
            && Objects.equals(this.record, driverLicenseBack.record)
            && Objects.equals(this.textLocation, driverLicenseBack.textLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, number, name, issuingAuthority, address, fileNumber, record, textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DriverLicenseBack {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    fileNumber: ").append(toIndentedString(fileNumber)).append("\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
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
