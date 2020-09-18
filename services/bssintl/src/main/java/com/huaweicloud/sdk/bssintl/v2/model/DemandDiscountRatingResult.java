package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DemandDiscountRatingResult
 */
public class DemandDiscountRatingResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_id")
    
    private String discountId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_type")
    
    private Integer discountType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_name")
    
    private String discountName;

    public DemandDiscountRatingResult withDiscountId(String discountId) {
        this.discountId = discountId;
        return this;
    }

    


    /**
     * |参数名称：优惠标识ID| |参数约束及描述：优惠标识ID|
     * @return discountId
     */
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

    


    /**
     * |参数名称：合同商务优惠类型：基于官网价计算优惠605 华为云商务-折扣率，一口价，华为云用户606 渠道商务-折扣率，一口价，BP用户伙伴折扣优惠类型：基于官网价计算优惠607 合作伙伴授予折扣-折扣率|
     * @return discountType
     */
    public Integer getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    public DemandDiscountRatingResult withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * 优惠金额
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public DemandDiscountRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位标识| |参数约束及描述：1：元|
     * @return measureId
     */
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

    


    /**
     * |参数名称：折扣名称| |参数约束及描述：折扣名称|
     * @return discountName
     */
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
        return Objects.equals(this.discountId, demandDiscountRatingResult.discountId) &&
            Objects.equals(this.discountType, demandDiscountRatingResult.discountType) &&
            Objects.equals(this.amount, demandDiscountRatingResult.amount) &&
            Objects.equals(this.measureId, demandDiscountRatingResult.measureId) &&
            Objects.equals(this.discountName, demandDiscountRatingResult.discountName);
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

