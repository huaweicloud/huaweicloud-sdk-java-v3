package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOnDemandResourceRatingsResponse extends SdkResponse {

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
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_rating_results")

    private List<DemandProductRatingResult> productRatingResults = null;

    public ListOnDemandResourceRatingsResponse withAmount(BigDecimal amount) {
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

    public ListOnDemandResourceRatingsResponse withDiscountAmount(BigDecimal discountAmount) {
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

    public ListOnDemandResourceRatingsResponse withOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
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

    public ListOnDemandResourceRatingsResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位标识。 1：元
     * minimum: 1
     * maximum: 4
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ListOnDemandResourceRatingsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种。 USD：美元。 值为空代表美元。
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListOnDemandResourceRatingsResponse withProductRatingResults(
        List<DemandProductRatingResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
        return this;
    }

    public ListOnDemandResourceRatingsResponse addProductRatingResultsItem(
        DemandProductRatingResult productRatingResultsItem) {
        if (this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        this.productRatingResults.add(productRatingResultsItem);
        return this;
    }

    public ListOnDemandResourceRatingsResponse withProductRatingResults(
        Consumer<List<DemandProductRatingResult>> productRatingResultsSetter) {
        if (this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        productRatingResultsSetter.accept(this.productRatingResults);
        return this;
    }

    /**
     * 产品询价结果，具体参见表2。
     * @return productRatingResults
     */
    public List<DemandProductRatingResult> getProductRatingResults() {
        return productRatingResults;
    }

    public void setProductRatingResults(List<DemandProductRatingResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOnDemandResourceRatingsResponse listOnDemandResourceRatingsResponse =
            (ListOnDemandResourceRatingsResponse) o;
        return Objects.equals(this.amount, listOnDemandResourceRatingsResponse.amount)
            && Objects.equals(this.discountAmount, listOnDemandResourceRatingsResponse.discountAmount)
            && Objects.equals(this.officialWebsiteAmount, listOnDemandResourceRatingsResponse.officialWebsiteAmount)
            && Objects.equals(this.measureId, listOnDemandResourceRatingsResponse.measureId)
            && Objects.equals(this.currency, listOnDemandResourceRatingsResponse.currency)
            && Objects.equals(this.productRatingResults, listOnDemandResourceRatingsResponse.productRatingResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, discountAmount, officialWebsiteAmount, measureId, currency, productRatingResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOnDemandResourceRatingsResponse {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    productRatingResults: ").append(toIndentedString(productRatingResults)).append("\n");
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
