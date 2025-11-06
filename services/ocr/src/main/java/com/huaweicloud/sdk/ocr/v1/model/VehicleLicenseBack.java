package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class VehicleLicenseBack {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

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
    @JsonProperty(value = "energy_type")

    private String energyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_result")

    private VehicleLicenseAlarmResult alarmResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_confidence")

    private VehicleLicenseAlarmConfidence alarmConfidence;

    public VehicleLicenseBack withNumber(String number) {
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

    public VehicleLicenseBack withFileNo(String fileNo) {
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

    public VehicleLicenseBack withApprovedPassengers(String approvedPassengers) {
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

    public VehicleLicenseBack withGrossMass(String grossMass) {
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

    public VehicleLicenseBack withUnladenMass(String unladenMass) {
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

    public VehicleLicenseBack withApprovedLoad(String approvedLoad) {
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

    public VehicleLicenseBack withDimension(String dimension) {
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

    public VehicleLicenseBack withTractionMass(String tractionMass) {
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

    public VehicleLicenseBack withRemarks(String remarks) {
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

    public VehicleLicenseBack withInspectionRecord(String inspectionRecord) {
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

    public VehicleLicenseBack withCodeNumber(String codeNumber) {
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

    public VehicleLicenseBack withEnergyType(String energyType) {
        this.energyType = energyType;
        return this;
    }

    /**
     * 能源类型。 
     * @return energyType
     */
    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    public VehicleLicenseBack withTextLocation(Object textLocation) {
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

    public VehicleLicenseBack withAlarmResult(VehicleLicenseAlarmResult alarmResult) {
        this.alarmResult = alarmResult;
        return this;
    }

    public VehicleLicenseBack withAlarmResult(Consumer<VehicleLicenseAlarmResult> alarmResultSetter) {
        if (this.alarmResult == null) {
            this.alarmResult = new VehicleLicenseAlarmResult();
            alarmResultSetter.accept(this.alarmResult);
        }

        return this;
    }

    /**
     * Get alarmResult
     * @return alarmResult
     */
    public VehicleLicenseAlarmResult getAlarmResult() {
        return alarmResult;
    }

    public void setAlarmResult(VehicleLicenseAlarmResult alarmResult) {
        this.alarmResult = alarmResult;
    }

    public VehicleLicenseBack withAlarmConfidence(VehicleLicenseAlarmConfidence alarmConfidence) {
        this.alarmConfidence = alarmConfidence;
        return this;
    }

    public VehicleLicenseBack withAlarmConfidence(Consumer<VehicleLicenseAlarmConfidence> alarmConfidenceSetter) {
        if (this.alarmConfidence == null) {
            this.alarmConfidence = new VehicleLicenseAlarmConfidence();
            alarmConfidenceSetter.accept(this.alarmConfidence);
        }

        return this;
    }

    /**
     * Get alarmConfidence
     * @return alarmConfidence
     */
    public VehicleLicenseAlarmConfidence getAlarmConfidence() {
        return alarmConfidence;
    }

    public void setAlarmConfidence(VehicleLicenseAlarmConfidence alarmConfidence) {
        this.alarmConfidence = alarmConfidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleLicenseBack that = (VehicleLicenseBack) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.fileNo, that.fileNo)
            && Objects.equals(this.approvedPassengers, that.approvedPassengers)
            && Objects.equals(this.grossMass, that.grossMass) && Objects.equals(this.unladenMass, that.unladenMass)
            && Objects.equals(this.approvedLoad, that.approvedLoad) && Objects.equals(this.dimension, that.dimension)
            && Objects.equals(this.tractionMass, that.tractionMass) && Objects.equals(this.remarks, that.remarks)
            && Objects.equals(this.inspectionRecord, that.inspectionRecord)
            && Objects.equals(this.codeNumber, that.codeNumber) && Objects.equals(this.energyType, that.energyType)
            && Objects.equals(this.textLocation, that.textLocation)
            && Objects.equals(this.alarmResult, that.alarmResult)
            && Objects.equals(this.alarmConfidence, that.alarmConfidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,
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
            energyType,
            textLocation,
            alarmResult,
            alarmConfidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VehicleLicenseBack {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
        sb.append("    energyType: ").append(toIndentedString(energyType)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
        sb.append("    alarmResult: ").append(toIndentedString(alarmResult)).append("\n");
        sb.append("    alarmConfidence: ").append(toIndentedString(alarmConfidence)).append("\n");
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
