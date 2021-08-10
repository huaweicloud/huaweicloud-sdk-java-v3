package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DemandDiscountRatingResult */
public class DemandDiscountRatingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_id")

    private String discountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_type")

    private Integer discountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Double amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_name")

    private String discountName;

    public DemandDiscountRatingResult withDiscountId(String discountId) {
        this.discountId = discountId;
        return this;
    }

    /** 优惠标识ID。
     * 
     * @return discountId */
    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public DemandDiscountRatingResult withDiscountType(Integer discountType) {
        this.discountType = discountType;
        return this;
    }

    /** 折扣优惠类型。 合同商务折扣：605：华为云BE场景下的合同商务折扣606：分销商BE场景下的合同商务折扣 伙伴授予折扣：607：合作伙伴授予折扣-折扣率
     * 
     * @return discountType */
    public Integer getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    public DemandDiscountRatingResult withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /** 折扣的金额。
     * 
     * @return amount */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public DemandDiscountRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /** 度量单位标识。 1：元
     * 
     * @return measureId */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public DemandDiscountRatingResult withDiscountName(String discountName) {
        this.discountName = discountName;
        return this;
    }

    /** 折扣名称。
     * 
     * @return discountName */
    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DemandDiscountRatingResult demandDiscountRatingResult = (DemandDiscountRatingResult) o;
        return Objects.equals(this.discountId, demandDiscountRatingResult.discountId)
            && Objects.equals(this.discountType, demandDiscountRatingResult.discountType)
            && Objects.equals(this.amount, demandDiscountRatingResult.amount)
            && Objects.equals(this.measureId, demandDiscountRatingResult.measureId)
            && Objects.equals(this.discountName, demandDiscountRatingResult.discountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId, discountType, amount, measureId, discountName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemandDiscountRatingResult {\n");
        sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    discountName: ").append(toIndentedString(discountName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
