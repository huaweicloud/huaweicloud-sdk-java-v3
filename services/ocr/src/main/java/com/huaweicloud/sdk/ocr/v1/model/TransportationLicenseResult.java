package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TransportationLicenseResult
 */
public class TransportationLicenseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license_number")

    private String licenseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_number")

    private String vehicleNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_type")

    private String vehicleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_capacity")

    private String maximumCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_size")

    private String vehicleSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_authority")

    private String issuingAuthority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_address")

    private String ownerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "economic_type")

    private String economicType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_certificate")

    private String businessCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_scope")

    private String businessScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public TransportationLicenseResult withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 业户名称。 
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public TransportationLicenseResult withLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }

    /**
     * 道路运输证号。 
     * @return licenseNumber
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public TransportationLicenseResult withVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        return this;
    }

    /**
     * 车辆号牌。 
     * @return vehicleNumber
     */
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public TransportationLicenseResult withVehicleType(String vehicleType) {
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

    public TransportationLicenseResult withMaximumCapacity(String maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        return this;
    }

    /**
     * 吨(座)位。 
     * @return maximumCapacity
     */
    public String getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(String maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public TransportationLicenseResult withVehicleSize(String vehicleSize) {
        this.vehicleSize = vehicleSize;
        return this;
    }

    /**
     * 车辆尺寸。 
     * @return vehicleSize
     */
    public String getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(String vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public TransportationLicenseResult withIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }

    /**
     * 核发机关（非必有，依赖对应运输证板式）。 
     * @return issuingAuthority
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    public TransportationLicenseResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 签发日期（非必有，依赖对应运输证板式）。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public TransportationLicenseResult withOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
        return this;
    }

    /**
     * 业户地址（非必有，依赖对应运输证板式）。 
     * @return ownerAddress
     */
    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public TransportationLicenseResult withEconomicType(String economicType) {
        this.economicType = economicType;
        return this;
    }

    /**
     * 经济类型（非必有，依赖对应运输证板式）。 
     * @return economicType
     */
    public String getEconomicType() {
        return economicType;
    }

    public void setEconomicType(String economicType) {
        this.economicType = economicType;
    }

    public TransportationLicenseResult withBusinessCertificate(String businessCertificate) {
        this.businessCertificate = businessCertificate;
        return this;
    }

    /**
     * 经营许可证号（非必有，依赖对应运输证板式）。 
     * @return businessCertificate
     */
    public String getBusinessCertificate() {
        return businessCertificate;
    }

    public void setBusinessCertificate(String businessCertificate) {
        this.businessCertificate = businessCertificate;
    }

    public TransportationLicenseResult withBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }

    /**
     * 道路普通货物运输（非必有，依赖对应运输证板式）。 
     * @return businessScope
     */
    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public TransportationLicenseResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。 
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
        TransportationLicenseResult that = (TransportationLicenseResult) obj;
        return Objects.equals(this.ownerName, that.ownerName) && Objects.equals(this.licenseNumber, that.licenseNumber)
            && Objects.equals(this.vehicleNumber, that.vehicleNumber)
            && Objects.equals(this.vehicleType, that.vehicleType)
            && Objects.equals(this.maximumCapacity, that.maximumCapacity)
            && Objects.equals(this.vehicleSize, that.vehicleSize)
            && Objects.equals(this.issuingAuthority, that.issuingAuthority)
            && Objects.equals(this.issueDate, that.issueDate) && Objects.equals(this.ownerAddress, that.ownerAddress)
            && Objects.equals(this.economicType, that.economicType)
            && Objects.equals(this.businessCertificate, that.businessCertificate)
            && Objects.equals(this.businessScope, that.businessScope)
            && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerName,
            licenseNumber,
            vehicleNumber,
            vehicleType,
            maximumCapacity,
            vehicleSize,
            issuingAuthority,
            issueDate,
            ownerAddress,
            economicType,
            businessCertificate,
            businessScope,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransportationLicenseResult {\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
        sb.append("    vehicleNumber: ").append(toIndentedString(vehicleNumber)).append("\n");
        sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
        sb.append("    maximumCapacity: ").append(toIndentedString(maximumCapacity)).append("\n");
        sb.append("    vehicleSize: ").append(toIndentedString(vehicleSize)).append("\n");
        sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    ownerAddress: ").append(toIndentedString(ownerAddress)).append("\n");
        sb.append("    economicType: ").append(toIndentedString(economicType)).append("\n");
        sb.append("    businessCertificate: ").append(toIndentedString(businessCertificate)).append("\n");
        sb.append("    businessScope: ").append(toIndentedString(businessScope)).append("\n");
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
