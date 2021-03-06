package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PeriodProductRatingResult
 */
public class PeriodProductRatingResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private Double amount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_website_amount")
    
    private Double officialWebsiteAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private Double discountAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;

    public PeriodProductRatingResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * ID标识，来源于请求中的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public PeriodProductRatingResult withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 包年/包月产品的ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public PeriodProductRatingResult withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * 总额，即最终优惠后的金额。 amount= official_website_amount - discountAmount。
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    

    public PeriodProductRatingResult withOfficialWebsiteAmount(Double officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    


    /**
     * 包年/包月产品的官网价。
     * @return officialWebsiteAmount
     */
    public Double getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(Double officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    

    public PeriodProductRatingResult withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    


    /**
     * 可选折扣优惠额，如商务折扣、伙伴折扣、促销折扣和折扣券选用时的优惠额。
     * @return discountAmount
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    

    public PeriodProductRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * 价格度量单位标识。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PeriodProductRatingResult periodProductRatingResult = (PeriodProductRatingResult) o;
        return Objects.equals(this.id, periodProductRatingResult.id) &&
            Objects.equals(this.productId, periodProductRatingResult.productId) &&
            Objects.equals(this.amount, periodProductRatingResult.amount) &&
            Objects.equals(this.officialWebsiteAmount, periodProductRatingResult.officialWebsiteAmount) &&
            Objects.equals(this.discountAmount, periodProductRatingResult.discountAmount) &&
            Objects.equals(this.measureId, periodProductRatingResult.measureId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, productId, amount, officialWebsiteAmount, discountAmount, measureId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodProductRatingResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
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

