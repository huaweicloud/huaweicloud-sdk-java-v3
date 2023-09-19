package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RealEstateCertificateResult
 */
public class RealEstateCertificateResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer")

    private String issuer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_estate_certificate_no")

    private String realEstateCertificateNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mortgage_seals")

    private Integer mortgageSeals;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canceled_mortgage_seals")

    private Integer canceledMortgageSeals;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estate_location")

    private String estateLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_floors")

    private String totalFloors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floor")

    private String floor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "year_built")

    private String yearBuilt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "structure")

    private String structure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revenue_stamps")

    private Integer revenueStamps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownership_certificate_no")

    private String ownershipCertificateNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estate_holder")

    private String estateHolder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obligee")

    private String obligee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownership")

    private String ownership;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property_unit_no")

    private String propertyUnitNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "right_type")

    private String rightType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "right_nature")

    private String rightNature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private String usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intended_usage")

    private String intendedUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    public RealEstateCertificateResult withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * 填发单位。 
     * @return issuer
     */
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public RealEstateCertificateResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 填发日期。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public RealEstateCertificateResult withRealEstateCertificateNo(String realEstateCertificateNo) {
        this.realEstateCertificateNo = realEstateCertificateNo;
        return this;
    }

    /**
     * 不动产证编号。 
     * @return realEstateCertificateNo
     */
    public String getRealEstateCertificateNo() {
        return realEstateCertificateNo;
    }

    public void setRealEstateCertificateNo(String realEstateCertificateNo) {
        this.realEstateCertificateNo = realEstateCertificateNo;
    }

    public RealEstateCertificateResult withMortgageSeals(Integer mortgageSeals) {
        this.mortgageSeals = mortgageSeals;
        return this;
    }

    /**
     * 抵押印章个数。 
     * @return mortgageSeals
     */
    public Integer getMortgageSeals() {
        return mortgageSeals;
    }

    public void setMortgageSeals(Integer mortgageSeals) {
        this.mortgageSeals = mortgageSeals;
    }

    public RealEstateCertificateResult withCanceledMortgageSeals(Integer canceledMortgageSeals) {
        this.canceledMortgageSeals = canceledMortgageSeals;
        return this;
    }

    /**
     * 注销的抵押印章个数。 
     * @return canceledMortgageSeals
     */
    public Integer getCanceledMortgageSeals() {
        return canceledMortgageSeals;
    }

    public void setCanceledMortgageSeals(Integer canceledMortgageSeals) {
        this.canceledMortgageSeals = canceledMortgageSeals;
    }

    public RealEstateCertificateResult withEstateLocation(String estateLocation) {
        this.estateLocation = estateLocation;
        return this;
    }

    /**
     * 房屋坐落。 
     * @return estateLocation
     */
    public String getEstateLocation() {
        return estateLocation;
    }

    public void setEstateLocation(String estateLocation) {
        this.estateLocation = estateLocation;
    }

    public RealEstateCertificateResult withTotalFloors(String totalFloors) {
        this.totalFloors = totalFloors;
        return this;
    }

    /**
     * 总楼层数。 
     * @return totalFloors
     */
    public String getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(String totalFloors) {
        this.totalFloors = totalFloors;
    }

    public RealEstateCertificateResult withFloor(String floor) {
        this.floor = floor;
        return this;
    }

    /**
     * 所在层。 
     * @return floor
     */
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public RealEstateCertificateResult withYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
        return this;
    }

    /**
     * 建成年份。 
     * @return yearBuilt
     */
    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public RealEstateCertificateResult withStructure(String structure) {
        this.structure = structure;
        return this;
    }

    /**
     * 结构。 
     * @return structure
     */
    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public RealEstateCertificateResult withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 建筑面积。 
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public RealEstateCertificateResult withRevenueStamps(Integer revenueStamps) {
        this.revenueStamps = revenueStamps;
        return this;
    }

    /**
     * 印花税票个数。 
     * @return revenueStamps
     */
    public Integer getRevenueStamps() {
        return revenueStamps;
    }

    public void setRevenueStamps(Integer revenueStamps) {
        this.revenueStamps = revenueStamps;
    }

    public RealEstateCertificateResult withOwnershipCertificateNo(String ownershipCertificateNo) {
        this.ownershipCertificateNo = ownershipCertificateNo;
        return this;
    }

    /**
     * 产权证号。 
     * @return ownershipCertificateNo
     */
    public String getOwnershipCertificateNo() {
        return ownershipCertificateNo;
    }

    public void setOwnershipCertificateNo(String ownershipCertificateNo) {
        this.ownershipCertificateNo = ownershipCertificateNo;
    }

    public RealEstateCertificateResult withEstateHolder(String estateHolder) {
        this.estateHolder = estateHolder;
        return this;
    }

    /**
     * 房屋所有权人。 
     * @return estateHolder
     */
    public String getEstateHolder() {
        return estateHolder;
    }

    public void setEstateHolder(String estateHolder) {
        this.estateHolder = estateHolder;
    }

    public RealEstateCertificateResult withObligee(String obligee) {
        this.obligee = obligee;
        return this;
    }

    /**
     * 权利人。 
     * @return obligee
     */
    public String getObligee() {
        return obligee;
    }

    public void setObligee(String obligee) {
        this.obligee = obligee;
    }

    public RealEstateCertificateResult withOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }

    /**
     * 共有情况。 
     * @return ownership
     */
    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public RealEstateCertificateResult withPropertyUnitNo(String propertyUnitNo) {
        this.propertyUnitNo = propertyUnitNo;
        return this;
    }

    /**
     * 不动产单元号。 
     * @return propertyUnitNo
     */
    public String getPropertyUnitNo() {
        return propertyUnitNo;
    }

    public void setPropertyUnitNo(String propertyUnitNo) {
        this.propertyUnitNo = propertyUnitNo;
    }

    public RealEstateCertificateResult withRightType(String rightType) {
        this.rightType = rightType;
        return this;
    }

    /**
     * 权利类型。 
     * @return rightType
     */
    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType;
    }

    public RealEstateCertificateResult withRightNature(String rightNature) {
        this.rightNature = rightNature;
        return this;
    }

    /**
     * 权利性质。 
     * @return rightNature
     */
    public String getRightNature() {
        return rightNature;
    }

    public void setRightNature(String rightNature) {
        this.rightNature = rightNature;
    }

    public RealEstateCertificateResult withUsage(String usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 使用用途。 
     * @return usage
     */
    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public RealEstateCertificateResult withIntendedUsage(String intendedUsage) {
        this.intendedUsage = intendedUsage;
        return this;
    }

    /**
     * 设计、规划用途。 
     * @return intendedUsage
     */
    public String getIntendedUsage() {
        return intendedUsage;
    }

    public void setIntendedUsage(String intendedUsage) {
        this.intendedUsage = intendedUsage;
    }

    public RealEstateCertificateResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 各个字段的置信度。 
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
        RealEstateCertificateResult that = (RealEstateCertificateResult) obj;
        return Objects.equals(this.issuer, that.issuer) && Objects.equals(this.issueDate, that.issueDate)
            && Objects.equals(this.realEstateCertificateNo, that.realEstateCertificateNo)
            && Objects.equals(this.mortgageSeals, that.mortgageSeals)
            && Objects.equals(this.canceledMortgageSeals, that.canceledMortgageSeals)
            && Objects.equals(this.estateLocation, that.estateLocation)
            && Objects.equals(this.totalFloors, that.totalFloors) && Objects.equals(this.floor, that.floor)
            && Objects.equals(this.yearBuilt, that.yearBuilt) && Objects.equals(this.structure, that.structure)
            && Objects.equals(this.area, that.area) && Objects.equals(this.revenueStamps, that.revenueStamps)
            && Objects.equals(this.ownershipCertificateNo, that.ownershipCertificateNo)
            && Objects.equals(this.estateHolder, that.estateHolder) && Objects.equals(this.obligee, that.obligee)
            && Objects.equals(this.ownership, that.ownership)
            && Objects.equals(this.propertyUnitNo, that.propertyUnitNo)
            && Objects.equals(this.rightType, that.rightType) && Objects.equals(this.rightNature, that.rightNature)
            && Objects.equals(this.usage, that.usage) && Objects.equals(this.intendedUsage, that.intendedUsage)
            && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issuer,
            issueDate,
            realEstateCertificateNo,
            mortgageSeals,
            canceledMortgageSeals,
            estateLocation,
            totalFloors,
            floor,
            yearBuilt,
            structure,
            area,
            revenueStamps,
            ownershipCertificateNo,
            estateHolder,
            obligee,
            ownership,
            propertyUnitNo,
            rightType,
            rightNature,
            usage,
            intendedUsage,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealEstateCertificateResult {\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    realEstateCertificateNo: ").append(toIndentedString(realEstateCertificateNo)).append("\n");
        sb.append("    mortgageSeals: ").append(toIndentedString(mortgageSeals)).append("\n");
        sb.append("    canceledMortgageSeals: ").append(toIndentedString(canceledMortgageSeals)).append("\n");
        sb.append("    estateLocation: ").append(toIndentedString(estateLocation)).append("\n");
        sb.append("    totalFloors: ").append(toIndentedString(totalFloors)).append("\n");
        sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
        sb.append("    yearBuilt: ").append(toIndentedString(yearBuilt)).append("\n");
        sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    revenueStamps: ").append(toIndentedString(revenueStamps)).append("\n");
        sb.append("    ownershipCertificateNo: ").append(toIndentedString(ownershipCertificateNo)).append("\n");
        sb.append("    estateHolder: ").append(toIndentedString(estateHolder)).append("\n");
        sb.append("    obligee: ").append(toIndentedString(obligee)).append("\n");
        sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
        sb.append("    propertyUnitNo: ").append(toIndentedString(propertyUnitNo)).append("\n");
        sb.append("    rightType: ").append(toIndentedString(rightType)).append("\n");
        sb.append("    rightNature: ").append(toIndentedString(rightNature)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    intendedUsage: ").append(toIndentedString(intendedUsage)).append("\n");
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
