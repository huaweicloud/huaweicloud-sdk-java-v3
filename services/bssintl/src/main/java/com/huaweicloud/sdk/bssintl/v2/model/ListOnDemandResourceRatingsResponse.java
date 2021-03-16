package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.DemandProductRatingResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListOnDemandResourceRatingsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private Double amount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private Double discountAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_website_amount")
    
    private Double officialWebsiteAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_rating_results")
    
    private List<DemandProductRatingResult> productRatingResults = null;
    
    public ListOnDemandResourceRatingsResponse withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：总额| |参数约束及描述：即最终优惠后的金额|
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    

    public ListOnDemandResourceRatingsResponse withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    


    /**
     * |参数名称：优惠额| |参数约束及描述：（官网价和总价的差）|
     * @return discountAmount
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    

    public ListOnDemandResourceRatingsResponse withOfficialWebsiteAmount(Double officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    


    /**
     * |参数名称：官网价| |参数约束及描述：官网价|
     * @return officialWebsiteAmount
     */
    public Double getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(Double officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    

    public ListOnDemandResourceRatingsResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位标识| |参数约束及描述：1：元|
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
     * |参数名称：币种| |参数约束及描述：比如CNY|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    

    public ListOnDemandResourceRatingsResponse withProductRatingResults(List<DemandProductRatingResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
        return this;
    }

    
    public ListOnDemandResourceRatingsResponse addProductRatingResultsItem(DemandProductRatingResult productRatingResultsItem) {
        this.productRatingResults.add(productRatingResultsItem);
        return this;
    }

    public ListOnDemandResourceRatingsResponse withProductRatingResults(Consumer<List<DemandProductRatingResult>> productRatingResultsSetter) {
        if(this.productRatingResults == null ){
            this.productRatingResults = new ArrayList<>();
        }
        productRatingResultsSetter.accept(this.productRatingResults);
        return this;
    }

    /**
     * |参数名称：产品询价结果| |参数的约束及描述：产品询价结果|
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
        ListOnDemandResourceRatingsResponse listOnDemandResourceRatingsResponse = (ListOnDemandResourceRatingsResponse) o;
        return Objects.equals(this.amount, listOnDemandResourceRatingsResponse.amount) &&
            Objects.equals(this.discountAmount, listOnDemandResourceRatingsResponse.discountAmount) &&
            Objects.equals(this.officialWebsiteAmount, listOnDemandResourceRatingsResponse.officialWebsiteAmount) &&
            Objects.equals(this.measureId, listOnDemandResourceRatingsResponse.measureId) &&
            Objects.equals(this.currency, listOnDemandResourceRatingsResponse.currency) &&
            Objects.equals(this.productRatingResults, listOnDemandResourceRatingsResponse.productRatingResults);
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

