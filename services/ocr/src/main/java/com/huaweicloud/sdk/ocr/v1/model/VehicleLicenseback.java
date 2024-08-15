package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class VehicleLicenseback {

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

    public VehicleLicenseback withNumber(String number) {
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

    public VehicleLicenseback withFileNo(String fileNo) {
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

    public VehicleLicenseback withApprovedPassengers(String approvedPassengers) {
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

    public VehicleLicenseback withGrossMass(String grossMass) {
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

    public VehicleLicenseback withUnladenMass(String unladenMass) {
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

    public VehicleLicenseback withApprovedLoad(String approvedLoad) {
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

    public VehicleLicenseback withDimension(String dimension) {
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

    public VehicleLicenseback withTractionMass(String tractionMass) {
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

    public VehicleLicenseback withRemarks(String remarks) {
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

    public VehicleLicenseback withInspectionRecord(String inspectionRecord) {
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

    public VehicleLicenseback withCodeNumber(String codeNumber) {
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

    public VehicleLicenseback withEnergyType(String energyType) {
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

    public VehicleLicenseback withTextLocation(Object textLocation) {
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
        VehicleLicenseback that = (VehicleLicenseback) obj;
        return Objects.equals(this.number, that.number) && Objects.equals(this.fileNo, that.fileNo)
            && Objects.equals(this.approvedPassengers, that.approvedPassengers)
            && Objects.equals(this.grossMass, that.grossMass) && Objects.equals(this.unladenMass, that.unladenMass)
            && Objects.equals(this.approvedLoad, that.approvedLoad) && Objects.equals(this.dimension, that.dimension)
            && Objects.equals(this.tractionMass, that.tractionMass) && Objects.equals(this.remarks, that.remarks)
            && Objects.equals(this.inspectionRecord, that.inspectionRecord)
            && Objects.equals(this.codeNumber, that.codeNumber) && Objects.equals(this.energyType, that.energyType)
            && Objects.equals(this.textLocation, that.textLocation);
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
            textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VehicleLicenseback {\n");
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
