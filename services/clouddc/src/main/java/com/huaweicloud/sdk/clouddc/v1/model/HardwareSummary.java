package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 硬件总览信息，包括服务器的制造商、型号、序列号等
 */
public class HardwareSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sn")

    private String sn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer")

    private String manufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_board_manufacturer")

    private String mainBoardManufacturer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_board_serial_number")

    private String mainBoardSerialNumber;

    public HardwareSummary withSn(String sn) {
        this.sn = sn;
        return this;
    }

    /**
     * serial number
     * @return sn
     */
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public HardwareSummary withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * 制造商
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public HardwareSummary withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HardwareSummary withMainBoardManufacturer(String mainBoardManufacturer) {
        this.mainBoardManufacturer = mainBoardManufacturer;
        return this;
    }

    /**
     * 主板厂商
     * @return mainBoardManufacturer
     */
    public String getMainBoardManufacturer() {
        return mainBoardManufacturer;
    }

    public void setMainBoardManufacturer(String mainBoardManufacturer) {
        this.mainBoardManufacturer = mainBoardManufacturer;
    }

    public HardwareSummary withMainBoardSerialNumber(String mainBoardSerialNumber) {
        this.mainBoardSerialNumber = mainBoardSerialNumber;
        return this;
    }

    /**
     * 主板序列号
     * @return mainBoardSerialNumber
     */
    public String getMainBoardSerialNumber() {
        return mainBoardSerialNumber;
    }

    public void setMainBoardSerialNumber(String mainBoardSerialNumber) {
        this.mainBoardSerialNumber = mainBoardSerialNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HardwareSummary that = (HardwareSummary) obj;
        return Objects.equals(this.sn, that.sn) && Objects.equals(this.manufacturer, that.manufacturer)
            && Objects.equals(this.model, that.model)
            && Objects.equals(this.mainBoardManufacturer, that.mainBoardManufacturer)
            && Objects.equals(this.mainBoardSerialNumber, that.mainBoardSerialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sn, manufacturer, model, mainBoardManufacturer, mainBoardSerialNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HardwareSummary {\n");
        sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    mainBoardManufacturer: ").append(toIndentedString(mainBoardManufacturer)).append("\n");
        sb.append("    mainBoardSerialNumber: ").append(toIndentedString(mainBoardSerialNumber)).append("\n");
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
