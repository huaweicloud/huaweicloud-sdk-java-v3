package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 产品报价项阶梯信息
 */
public class ProductQuotingItemStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_id")

    private String stepId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_no")

    private String stepNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_start")

    private BigDecimal stepStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_measure_id")

    private Integer startMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_end")

    private BigDecimal stepEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_measure_id")

    private Integer endMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferential_type")

    private Integer preferentialType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sales_price")

    private BigDecimal salesPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_ratio")

    private BigDecimal discountRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pricing_basis")

    private String pricingBasis;

    public ProductQuotingItemStep withStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * 阶梯ID
     * @return stepId
     */
    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public ProductQuotingItemStep withStepNo(String stepNo) {
        this.stepNo = stepNo;
        return this;
    }

    /**
     * 阶梯编号
     * @return stepNo
     */
    public String getStepNo() {
        return stepNo;
    }

    public void setStepNo(String stepNo) {
        this.stepNo = stepNo;
    }

    public ProductQuotingItemStep withStepStart(BigDecimal stepStart) {
        this.stepStart = stepStart;
        return this;
    }

    /**
     * 阶梯起始值
     * @return stepStart
     */
    public BigDecimal getStepStart() {
        return stepStart;
    }

    public void setStepStart(BigDecimal stepStart) {
        this.stepStart = stepStart;
    }

    public ProductQuotingItemStep withStartMeasureId(Integer startMeasureId) {
        this.startMeasureId = startMeasureId;
        return this;
    }

    /**
     * 起始值度量单位
     * @return startMeasureId
     */
    public Integer getStartMeasureId() {
        return startMeasureId;
    }

    public void setStartMeasureId(Integer startMeasureId) {
        this.startMeasureId = startMeasureId;
    }

    public ProductQuotingItemStep withStepEnd(BigDecimal stepEnd) {
        this.stepEnd = stepEnd;
        return this;
    }

    /**
     * 阶梯结束值
     * @return stepEnd
     */
    public BigDecimal getStepEnd() {
        return stepEnd;
    }

    public void setStepEnd(BigDecimal stepEnd) {
        this.stepEnd = stepEnd;
    }

    public ProductQuotingItemStep withEndMeasureId(Integer endMeasureId) {
        this.endMeasureId = endMeasureId;
        return this;
    }

    /**
     * 结束值度量单位（1：元/美元）
     * @return endMeasureId
     */
    public Integer getEndMeasureId() {
        return endMeasureId;
    }

    public void setEndMeasureId(Integer endMeasureId) {
        this.endMeasureId = endMeasureId;
    }

    public ProductQuotingItemStep withPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
        return this;
    }

    /**
     * 优惠方式：0：产品折扣，1：固定单价
     * @return preferentialType
     */
    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
    }

    public ProductQuotingItemStep withSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
        return this;
    }

    /**
     * 固定单价（preferential_type=1固定单价时有值）
     * @return salesPrice
     */
    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public ProductQuotingItemStep withDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
        return this;
    }

    /**
     * 折扣率（preferential_type=0产品折扣时有值）
     * @return discountRatio
     */
    public BigDecimal getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
    }

    public ProductQuotingItemStep withPricingBasis(String pricingBasis) {
        this.pricingBasis = pricingBasis;
        return this;
    }

    /**
     * 计费单位
     * @return pricingBasis
     */
    public String getPricingBasis() {
        return pricingBasis;
    }

    public void setPricingBasis(String pricingBasis) {
        this.pricingBasis = pricingBasis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductQuotingItemStep that = (ProductQuotingItemStep) obj;
        return Objects.equals(this.stepId, that.stepId) && Objects.equals(this.stepNo, that.stepNo)
            && Objects.equals(this.stepStart, that.stepStart)
            && Objects.equals(this.startMeasureId, that.startMeasureId) && Objects.equals(this.stepEnd, that.stepEnd)
            && Objects.equals(this.endMeasureId, that.endMeasureId)
            && Objects.equals(this.preferentialType, that.preferentialType)
            && Objects.equals(this.salesPrice, that.salesPrice)
            && Objects.equals(this.discountRatio, that.discountRatio)
            && Objects.equals(this.pricingBasis, that.pricingBasis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepId,
            stepNo,
            stepStart,
            startMeasureId,
            stepEnd,
            endMeasureId,
            preferentialType,
            salesPrice,
            discountRatio,
            pricingBasis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductQuotingItemStep {\n");
        sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
        sb.append("    stepNo: ").append(toIndentedString(stepNo)).append("\n");
        sb.append("    stepStart: ").append(toIndentedString(stepStart)).append("\n");
        sb.append("    startMeasureId: ").append(toIndentedString(startMeasureId)).append("\n");
        sb.append("    stepEnd: ").append(toIndentedString(stepEnd)).append("\n");
        sb.append("    endMeasureId: ").append(toIndentedString(endMeasureId)).append("\n");
        sb.append("    preferentialType: ").append(toIndentedString(preferentialType)).append("\n");
        sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
        sb.append("    discountRatio: ").append(toIndentedString(discountRatio)).append("\n");
        sb.append("    pricingBasis: ").append(toIndentedString(pricingBasis)).append("\n");
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
