package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VehicleLicenseResult
 */
public class VehicleLicenseResult {

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
    @JsonProperty(value = "engine_no")

    private String engineNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vin")

    private String vin;

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
    @JsonProperty(value = "file_no")

    private String fileNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approved_passengers")

    private String approvedPassengers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gross_mass")

    private String grossMass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unladen_mass")

    private String unladenMass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approved_load")

    private String approvedLoad;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private String dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traction_mass")

    private String tractionMass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_record")

    private String inspectionRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_number")

    private String codeNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    public VehicleLicenseResult withNumber(String number) {
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

    public VehicleLicenseResult withVehicleType(String vehicleType) {
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

    public VehicleLicenseResult withName(String name) {
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

    public VehicleLicenseResult withAddress(String address) {
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

    public VehicleLicenseResult withUseCharacter(String useCharacter) {
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

    public VehicleLicenseResult withModel(String model) {
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

    public VehicleLicenseResult withEngineNo(String engineNo) {
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

    public VehicleLicenseResult withVin(String vin) {
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

    public VehicleLicenseResult withRegisterDate(String registerDate) {
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

    public VehicleLicenseResult withIssueDate(String issueDate) {
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

    public VehicleLicenseResult withIssuingAuthority(String issuingAuthority) {
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

    public VehicleLicenseResult withFileNo(String fileNo) {
        this.fileNo = fileNo;
        return this;
    }

    /**
     * 档案编码。 
     * @return fileNo
     */
    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }

    public VehicleLicenseResult withApprovedPassengers(String approvedPassengers) {
        this.approvedPassengers = approvedPassengers;
        return this;
    }

    /**
     * 核定载人数。 
     * @return approvedPassengers
     */
    public String getApprovedPassengers() {
        return approvedPassengers;
    }

    public void setApprovedPassengers(String approvedPassengers) {
        this.approvedPassengers = approvedPassengers;
    }

    public VehicleLicenseResult withGrossMass(String grossMass) {
        this.grossMass = grossMass;
        return this;
    }

    /**
     * 总质量。 
     * @return grossMass
     */
    public String getGrossMass() {
        return grossMass;
    }

    public void setGrossMass(String grossMass) {
        this.grossMass = grossMass;
    }

    public VehicleLicenseResult withUnladenMass(String unladenMass) {
        this.unladenMass = unladenMass;
        return this;
    }

    /**
     * 整备质量。 
     * @return unladenMass
     */
    public String getUnladenMass() {
        return unladenMass;
    }

    public void setUnladenMass(String unladenMass) {
        this.unladenMass = unladenMass;
    }

    public VehicleLicenseResult withApprovedLoad(String approvedLoad) {
        this.approvedLoad = approvedLoad;
        return this;
    }

    /**
     * 核定载质量。 
     * @return approvedLoad
     */
    public String getApprovedLoad() {
        return approvedLoad;
    }

    public void setApprovedLoad(String approvedLoad) {
        this.approvedLoad = approvedLoad;
    }

    public VehicleLicenseResult withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * 外廓尺寸。 
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public VehicleLicenseResult withTractionMass(String tractionMass) {
        this.tractionMass = tractionMass;
        return this;
    }

    /**
     * 准牵引总质量。 
     * @return tractionMass
     */
    public String getTractionMass() {
        return tractionMass;
    }

    public void setTractionMass(String tractionMass) {
        this.tractionMass = tractionMass;
    }

    public VehicleLicenseResult withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注。 
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public VehicleLicenseResult withInspectionRecord(String inspectionRecord) {
        this.inspectionRecord = inspectionRecord;
        return this;
    }

    /**
     * 检验记录。 
     * @return inspectionRecord
     */
    public String getInspectionRecord() {
        return inspectionRecord;
    }

    public void setInspectionRecord(String inspectionRecord) {
        this.inspectionRecord = inspectionRecord;
    }

    public VehicleLicenseResult withCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
        return this;
    }

    /**
     * 条码号。 
     * @return codeNumber
     */
    public String getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    public VehicleLicenseResult withTextLocation(Object textLocation) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VehicleLicenseResult vehicleLicenseResult = (VehicleLicenseResult) o;
        return Objects.equals(this.number, vehicleLicenseResult.number)
            && Objects.equals(this.vehicleType, vehicleLicenseResult.vehicleType)
            && Objects.equals(this.name, vehicleLicenseResult.name)
            && Objects.equals(this.address, vehicleLicenseResult.address)
            && Objects.equals(this.useCharacter, vehicleLicenseResult.useCharacter)
            && Objects.equals(this.model, vehicleLicenseResult.model)
            && Objects.equals(this.engineNo, vehicleLicenseResult.engineNo)
            && Objects.equals(this.vin, vehicleLicenseResult.vin)
            && Objects.equals(this.registerDate, vehicleLicenseResult.registerDate)
            && Objects.equals(this.issueDate, vehicleLicenseResult.issueDate)
            && Objects.equals(this.issuingAuthority, vehicleLicenseResult.issuingAuthority)
            && Objects.equals(this.fileNo, vehicleLicenseResult.fileNo)
            && Objects.equals(this.approvedPassengers, vehicleLicenseResult.approvedPassengers)
            && Objects.equals(this.grossMass, vehicleLicenseResult.grossMass)
            && Objects.equals(this.unladenMass, vehicleLicenseResult.unladenMass)
            && Objects.equals(this.approvedLoad, vehicleLicenseResult.approvedLoad)
            && Objects.equals(this.dimension, vehicleLicenseResult.dimension)
            && Objects.equals(this.tractionMass, vehicleLicenseResult.tractionMass)
            && Objects.equals(this.remarks, vehicleLicenseResult.remarks)
            && Objects.equals(this.inspectionRecord, vehicleLicenseResult.inspectionRecord)
            && Objects.equals(this.codeNumber, vehicleLicenseResult.codeNumber)
            && Objects.equals(this.textLocation, vehicleLicenseResult.textLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,
            vehicleType,
            name,
            address,
            useCharacter,
            model,
            engineNo,
            vin,
            registerDate,
            issueDate,
            issuingAuthority,
            fileNo,
            approvedPassengers,
            grossMass,
            unladenMass,
            approvedLoad,
            dimension,
            tractionMass,
            remarks,
            inspectionRecord,
            codeNumber,
            textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VehicleLicenseResult {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    useCharacter: ").append(toIndentedString(useCharacter)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    engineNo: ").append(toIndentedString(engineNo)).append("\n");
        sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
        sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    fileNo: ").append(toIndentedString(fileNo)).append("\n");
        sb.append("    approvedPassengers: ").append(toIndentedString(approvedPassengers)).append("\n");
        sb.append("    grossMass: ").append(toIndentedString(grossMass)).append("\n");
        sb.append("    unladenMass: ").append(toIndentedString(unladenMass)).append("\n");
        sb.append("    approvedLoad: ").append(toIndentedString(approvedLoad)).append("\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    tractionMass: ").append(toIndentedString(tractionMass)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    inspectionRecord: ").append(toIndentedString(inspectionRecord)).append("\n");
        sb.append("    codeNumber: ").append(toIndentedString(codeNumber)).append("\n");
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
