package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TaxInfo
 */
public class TaxInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taxClass")

    private String taxClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taxRate")

    private String taxRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subTaxClass")

    private String subTaxClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taxAmount")

    private BigDecimal taxAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taxVisibleFlag")

    private String taxVisibleFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taxAccountingFlag")

    private String taxAccountingFlag;

    public TaxInfo withTaxClass(String taxClass) {
        this.taxClass = taxClass;
        return this;
    }

    /**
     * 税种。 VATISSWHTGST
     * @return taxClass
     */
    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public TaxInfo withTaxRate(String taxRate) {
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

    public TaxInfo withSubTaxClass(String subTaxClass) {
        this.subTaxClass = subTaxClass;
        return this;
    }

    /**
     * 税种子类。 PISCOFINSCGSTSGSTIGSTISSWHTVAT
     * @return subTaxClass
     */
    public String getSubTaxClass() {
        return subTaxClass;
    }

    public void setSubTaxClass(String subTaxClass) {
        this.subTaxClass = subTaxClass;
    }

    public TaxInfo withTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * 税金金额。 单位：美元
     * @return taxAmount
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public TaxInfo withTaxVisibleFlag(String taxVisibleFlag) {
        this.taxVisibleFlag = taxVisibleFlag;
        return this;
    }

    /**
     * |参数名称：是否展示| |参数的约束及描述：是否展示。Y：展示 N：不展示|
     * @return taxVisibleFlag
     */
    public String getTaxVisibleFlag() {
        return taxVisibleFlag;
    }

    public void setTaxVisibleFlag(String taxVisibleFlag) {
        this.taxVisibleFlag = taxVisibleFlag;
    }

    public TaxInfo withTaxAccountingFlag(String taxAccountingFlag) {
        this.taxAccountingFlag = taxAccountingFlag;
        return this;
    }

    /**
     * |参数名称：是否入账| |参数的约束及描述：是否入账。Y：入账 N：不入账|
     * @return taxAccountingFlag
     */
    public String getTaxAccountingFlag() {
        return taxAccountingFlag;
    }

    public void setTaxAccountingFlag(String taxAccountingFlag) {
        this.taxAccountingFlag = taxAccountingFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaxInfo that = (TaxInfo) obj;
        return Objects.equals(this.taxClass, that.taxClass) && Objects.equals(this.taxRate, that.taxRate)
            && Objects.equals(this.subTaxClass, that.subTaxClass) && Objects.equals(this.taxAmount, that.taxAmount)
            && Objects.equals(this.taxVisibleFlag, that.taxVisibleFlag)
            && Objects.equals(this.taxAccountingFlag, that.taxAccountingFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxClass, taxRate, subTaxClass, taxAmount, taxVisibleFlag, taxAccountingFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaxInfo {\n");
        sb.append("    taxClass: ").append(toIndentedString(taxClass)).append("\n");
        sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
        sb.append("    subTaxClass: ").append(toIndentedString(subTaxClass)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
        sb.append("    taxVisibleFlag: ").append(toIndentedString(taxVisibleFlag)).append("\n");
        sb.append("    taxAccountingFlag: ").append(toIndentedString(taxAccountingFlag)).append("\n");
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
