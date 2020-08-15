package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bssintl.v2.model.OfficialWebsiteRatingResult;
import com.huaweicloud.sdk.bssintl.v2.model.OptionalDiscountRatingResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRateOnPeriodDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_website_rating_result")
    
    private OfficialWebsiteRatingResult officialWebsiteRatingResult = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="optional_discount_rating_results")
    
    private List<OptionalDiscountRatingResult> optionalDiscountRatingResults = null;
    
    public ListRateOnPeriodDetailResponse withCurrency(String currency) {
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

    public ListRateOnPeriodDetailResponse withOfficialWebsiteRatingResult(OfficialWebsiteRatingResult officialWebsiteRatingResult) {
        this.officialWebsiteRatingResult = officialWebsiteRatingResult;
        return this;
    }

    public ListRateOnPeriodDetailResponse withOfficialWebsiteRatingResult(Consumer<OfficialWebsiteRatingResult> officialWebsiteRatingResultSetter) {
        if(this.officialWebsiteRatingResult == null ){
            this.officialWebsiteRatingResult = new OfficialWebsiteRatingResult();
            officialWebsiteRatingResultSetter.accept(this.officialWebsiteRatingResult);
        }
        
        return this;
    }


    /**
     * Get officialWebsiteRatingResult
     * @return officialWebsiteRatingResult
     */
    public OfficialWebsiteRatingResult getOfficialWebsiteRatingResult() {
        return officialWebsiteRatingResult;
    }

    public void setOfficialWebsiteRatingResult(OfficialWebsiteRatingResult officialWebsiteRatingResult) {
        this.officialWebsiteRatingResult = officialWebsiteRatingResult;
    }

    public ListRateOnPeriodDetailResponse withOptionalDiscountRatingResults(List<OptionalDiscountRatingResult> optionalDiscountRatingResults) {
        this.optionalDiscountRatingResults = optionalDiscountRatingResults;
        return this;
    }

    
    public ListRateOnPeriodDetailResponse addOptionalDiscountRatingResultsItem(OptionalDiscountRatingResult optionalDiscountRatingResultsItem) {
        if (this.optionalDiscountRatingResults == null) {
            this.optionalDiscountRatingResults = new ArrayList<>();
        }
        this.optionalDiscountRatingResults.add(optionalDiscountRatingResultsItem);
        return this;
    }

    public ListRateOnPeriodDetailResponse withOptionalDiscountRatingResults(Consumer<List<OptionalDiscountRatingResult>> optionalDiscountRatingResultsSetter) {
        if(this.optionalDiscountRatingResults == null ){
            this.optionalDiscountRatingResults = new ArrayList<>();
        }
        optionalDiscountRatingResultsSetter.accept(this.optionalDiscountRatingResults);
        return this;
    }

    /**
     * |参数名称：存在可选折扣优惠时返回折扣优惠维度询价结果，每个折扣优惠一组询价结果| |参数的约束及描述：存在可选折扣优惠时返回折扣优惠维度询价结果，每个折扣优惠一组询价结果|
     * @return optionalDiscountRatingResults
     */
    public List<OptionalDiscountRatingResult> getOptionalDiscountRatingResults() {
        return optionalDiscountRatingResults;
    }

    public void setOptionalDiscountRatingResults(List<OptionalDiscountRatingResult> optionalDiscountRatingResults) {
        this.optionalDiscountRatingResults = optionalDiscountRatingResults;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRateOnPeriodDetailResponse listRateOnPeriodDetailResponse = (ListRateOnPeriodDetailResponse) o;
        return Objects.equals(this.currency, listRateOnPeriodDetailResponse.currency) &&
            Objects.equals(this.officialWebsiteRatingResult, listRateOnPeriodDetailResponse.officialWebsiteRatingResult) &&
            Objects.equals(this.optionalDiscountRatingResults, listRateOnPeriodDetailResponse.optionalDiscountRatingResults);
    }
    @Override
    public int hashCode() {
        return Objects.hash(currency, officialWebsiteRatingResult, optionalDiscountRatingResults);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRateOnPeriodDetailResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    officialWebsiteRatingResult: ").append(toIndentedString(officialWebsiteRatingResult)).append("\n");
        sb.append("    optionalDiscountRatingResults: ").append(toIndentedString(optionalDiscountRatingResults)).append("\n");
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

