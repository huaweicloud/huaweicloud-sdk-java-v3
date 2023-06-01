package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DemandProductRatingResult
 */
public class DemandProductRatingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private BigDecimal amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    private BigDecimal discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_amount")

    private BigDecimal officialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_rating_results")

    private List<DemandDiscountRatingResult> discountRatingResults = null;

    public DemandProductRatingResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 同一次询价中不能重复，用于标识返回询价结果和请求的映射关系。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DemandProductRatingResult withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 按需产品的ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public DemandProductRatingResult withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 折扣的金额。
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public DemandProductRatingResult withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 优惠额（官网价和总价的差）。
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public DemandProductRatingResult withOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    /**
     * 按需产品的官网价。
     * @return officialWebsiteAmount
     */
    public BigDecimal getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public DemandProductRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位标识。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public DemandProductRatingResult withDiscountRatingResults(List<DemandDiscountRatingResult> discountRatingResults) {
        this.discountRatingResults = discountRatingResults;
        return this;
    }

    public DemandProductRatingResult addDiscountRatingResultsItem(
        DemandDiscountRatingResult discountRatingResultsItem) {
        if (this.discountRatingResults == null) {
            this.discountRatingResults = new ArrayList<>();
        }
        this.discountRatingResults.add(discountRatingResultsItem);
        return this;
    }

    public DemandProductRatingResult withDiscountRatingResults(
        Consumer<List<DemandDiscountRatingResult>> discountRatingResultsSetter) {
        if (this.discountRatingResults == null) {
            this.discountRatingResults = new ArrayList<>();
        }
        discountRatingResultsSetter.accept(this.discountRatingResults);
        return this;
    }

    /**
     * 折扣优惠明细，包含产品本身的促销信息，同时包含商务或者伙伴折扣的优惠信息，具体参见表3。
     * @return discountRatingResults
     */
    public List<DemandDiscountRatingResult> getDiscountRatingResults() {
        return discountRatingResults;
    }

    public void setDiscountRatingResults(List<DemandDiscountRatingResult> discountRatingResults) {
        this.discountRatingResults = discountRatingResults;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DemandProductRatingResult demandProductRatingResult = (DemandProductRatingResult) o;
        return Objects.equals(this.id, demandProductRatingResult.id)
            && Objects.equals(this.productId, demandProductRatingResult.productId)
            && Objects.equals(this.amount, demandProductRatingResult.amount)
            && Objects.equals(this.discountAmount, demandProductRatingResult.discountAmount)
            && Objects.equals(this.officialWebsiteAmount, demandProductRatingResult.officialWebsiteAmount)
            && Objects.equals(this.measureId, demandProductRatingResult.measureId)
            && Objects.equals(this.discountRatingResults, demandProductRatingResult.discountRatingResults);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, productId, amount, discountAmount, officialWebsiteAmount, measureId, discountRatingResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemandProductRatingResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    discountRatingResults: ").append(toIndentedString(discountRatingResults)).append("\n");
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
