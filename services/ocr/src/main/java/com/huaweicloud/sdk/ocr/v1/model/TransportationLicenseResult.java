package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

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
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_expiry_date")

    private String reviewExpiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assessed_technical_level")

    private String assessedTechnicalLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_location")

    private List<List<Integer>> imageLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjusted_image")

    private String adjustedImage;

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
     * 核发机关。 
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
     * 发证日期。 
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
     * 业户地址。 
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
     * 经济类型。 
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
     * 经营许可证号。 
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
     * 经营范围。 
     * @return businessScope
     */
    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public TransportationLicenseResult withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 有效期。 
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public TransportationLicenseResult withReviewExpiryDate(String reviewExpiryDate) {
        this.reviewExpiryDate = reviewExpiryDate;
        return this;
    }

    /**
     * 审验有效期。 
     * @return reviewExpiryDate
     */
    public String getReviewExpiryDate() {
        return reviewExpiryDate;
    }

    public void setReviewExpiryDate(String reviewExpiryDate) {
        this.reviewExpiryDate = reviewExpiryDate;
    }

    public TransportationLicenseResult withAssessedTechnicalLevel(String assessedTechnicalLevel) {
        this.assessedTechnicalLevel = assessedTechnicalLevel;
        return this;
    }

    /**
     * 技术等级评定。 
     * @return assessedTechnicalLevel
     */
    public String getAssessedTechnicalLevel() {
        return assessedTechnicalLevel;
    }

    public void setAssessedTechnicalLevel(String assessedTechnicalLevel) {
        this.assessedTechnicalLevel = assessedTechnicalLevel;
    }

    public TransportationLicenseResult withImageLocation(List<List<Integer>> imageLocation) {
        this.imageLocation = imageLocation;
        return this;
    }

    public TransportationLicenseResult addImageLocationItem(List<Integer> imageLocationItem) {
        if (this.imageLocation == null) {
            this.imageLocation = new ArrayList<>();
        }
        this.imageLocation.add(imageLocationItem);
        return this;
    }

    public TransportationLicenseResult withImageLocation(Consumer<List<List<Integer>>> imageLocationSetter) {
        if (this.imageLocation == null) {
            this.imageLocation = new ArrayList<>();
        }
        imageLocationSetter.accept(this.imageLocation);
        return this;
    }

    /**
     * 道路运输证在原图中的坐标位置，输出左上、右上、右下、左下四个点坐标。仅在return_image_location设置为true时返回该字段。 
     * @return imageLocation
     */
    public List<List<Integer>> getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(List<List<Integer>> imageLocation) {
        this.imageLocation = imageLocation;
    }

    public TransportationLicenseResult withAdjustedImage(String adjustedImage) {
        this.adjustedImage = adjustedImage;
        return this;
    }

    /**
     * 道路运输证图片的base64编码结果。仅在return_adjusted_image设置为true时返回该字段。 
     * @return adjustedImage
     */
    public String getAdjustedImage() {
        return adjustedImage;
    }

    public void setAdjustedImage(String adjustedImage) {
        this.adjustedImage = adjustedImage;
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
            && Objects.equals(this.expiryDate, that.expiryDate)
            && Objects.equals(this.reviewExpiryDate, that.reviewExpiryDate)
            && Objects.equals(this.assessedTechnicalLevel, that.assessedTechnicalLevel)
            && Objects.equals(this.imageLocation, that.imageLocation)
            && Objects.equals(this.adjustedImage, that.adjustedImage)
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
            expiryDate,
            reviewExpiryDate,
            assessedTechnicalLevel,
            imageLocation,
            adjustedImage,
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
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    reviewExpiryDate: ").append(toIndentedString(reviewExpiryDate)).append("\n");
        sb.append("    assessedTechnicalLevel: ").append(toIndentedString(assessedTechnicalLevel)).append("\n");
        sb.append("    imageLocation: ").append(toIndentedString(imageLocation)).append("\n");
        sb.append("    adjustedImage: ").append(toIndentedString(adjustedImage)).append("\n");
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
