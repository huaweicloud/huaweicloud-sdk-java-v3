package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class ItemList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quantity")

    private String quantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_price")

    private String unitPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "license_plate_number")

    private String licensePlateNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_rate")

    private String taxRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax")

    private String tax;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private String endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vehicle_type")

    private String vehicleType;

    public ItemList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 货物或应税劳务、服务名称。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemList withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 规格型号。 
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ItemList withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位。 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ItemList withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * 数量。 
     * @return quantity
     */
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public ItemList withUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * 单价。 
     * @return unitPrice
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ItemList withLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
        return this;
    }

    /**
     * 车牌号码。 当\"type\"被识别为\"toll\"且\"advanced_mode\"设置为“true”时才返回。 
     * @return licensePlateNumber
     */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public ItemList withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 金额。 
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public ItemList withTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * 税率。 
     * @return taxRate
     */
    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public ItemList withTax(String tax) {
        this.tax = tax;
        return this;
    }

    /**
     * 税额。 
     * @return tax
     */
    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public ItemList withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 通行日期止。 当\"type\"被识别为\"toll\"且\"advanced_mode\"设置为“true”时才返回。 
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ItemList withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 通行日期起。 当\"type\"被识别为\"toll\"且\"advanced_mode\"设置为“true”时才返回。 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ItemList withVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    /**
     * 车辆类型。 当\"type\"被识别为\"toll\"且\"advanced_mode\"设置为“true”时才返回。 
     * @return vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemList that = (ItemList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.quantity, that.quantity)
            && Objects.equals(this.unitPrice, that.unitPrice)
            && Objects.equals(this.licensePlateNumber, that.licensePlateNumber)
            && Objects.equals(this.amount, that.amount) && Objects.equals(this.taxRate, that.taxRate)
            && Objects.equals(this.tax, that.tax) && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.vehicleType, that.vehicleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            specification,
            unit,
            quantity,
            unitPrice,
            licensePlateNumber,
            amount,
            taxRate,
            tax,
            endDate,
            startDate,
            vehicleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    licensePlateNumber: ").append(toIndentedString(licensePlateNumber)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
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
