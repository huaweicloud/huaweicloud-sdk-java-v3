package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class VehicleLicenseFront {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_type")

    private String vehicleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_character")

    private String useCharacter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vin")

    private String vin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_no")

    private String engineNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "register_date")

    private String registerDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private String issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    public VehicleLicenseFront withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 号牌号码。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleLicenseFront withVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    /**
     * 车辆类型。
     * @return vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleLicenseFront withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 所有人。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleLicenseFront withAddress(String address) {
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

    public VehicleLicenseFront withUseCharacter(String useCharacter) {
        this.useCharacter = useCharacter;
        return this;
    }

    /**
     * 使用性质。
     * @return useCharacter
     */
    public String getUseCharacter() {
        return useCharacter;
    }

    public void setUseCharacter(String useCharacter) {
        this.useCharacter = useCharacter;
    }

    public VehicleLicenseFront withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 品牌型号。
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleLicenseFront withVin(String vin) {
        this.vin = vin;
        return this;
    }

    /**
     * 车辆识别代号。
     * @return vin
     */
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public VehicleLicenseFront withEngineNo(String engineNo) {
        this.engineNo = engineNo;
        return this;
    }

    /**
     * 发动机号码。
     * @return engineNo
     */
    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public VehicleLicenseFront withRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }

    /**
     * 注册日期。
     * @return registerDate
     */
    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public VehicleLicenseFront withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 发证日期。
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public VehicleLicenseFront withIssuingAuthority(String issuingAuthority) {
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

    public VehicleLicenseFront withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /**
     * 文本框在原图位置。输出左上、右上、右下、左下四个点坐标。  当“return_text_location”设置为“true”时才返回。
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
        VehicleLicenseFront that = (VehicleLicenseFront) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.vehicleType, that.vehicleType)
            && Objects.equals(this.name, that.name) && Objects.equals(this.address, that.address)
            && Objects.equals(this.useCharacter, that.useCharacter) && Objects.equals(this.model, that.model)
            && Objects.equals(this.vin, that.vin) && Objects.equals(this.engineNo, that.engineNo)
            && Objects.equals(this.registerDate, that.registerDate) && Objects.equals(this.issueDate, that.issueDate)
            && Objects.equals(this.issuingAuthority, that.issuingAuthority)
            && Objects.equals(this.textLocation, that.textLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,
            vehicleType,
            name,
            address,
            useCharacter,
            model,
            vin,
            engineNo,
            registerDate,
            issueDate,
            issuingAuthority,
            textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VehicleLicenseFront {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    useCharacter: ").append(toIndentedString(useCharacter)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
        sb.append("    engineNo: ").append(toIndentedString(engineNo)).append("\n");
        sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
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
