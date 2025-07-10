package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class EstimateDesktopPoolExtendVolumeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_params")

    private String extendParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_rating_result")

    private OfficialWebsiteRatingResult officialWebsiteRatingResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_discount_rating_results")

    private List<OptionalDiscountRatingResult> optionalDiscountRatingResults = null;

    public EstimateDesktopPoolExtendVolumeResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种，比如CNY。
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public EstimateDesktopPoolExtendVolumeResponse withExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    /**
     * 扩展参数。
     * @return extendParams
     */
    public String getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(String extendParams) {
        this.extendParams = extendParams;
    }

    public EstimateDesktopPoolExtendVolumeResponse withOfficialWebsiteRatingResult(
        OfficialWebsiteRatingResult officialWebsiteRatingResult) {
        this.officialWebsiteRatingResult = officialWebsiteRatingResult;
        return this;
    }

    public EstimateDesktopPoolExtendVolumeResponse withOfficialWebsiteRatingResult(
        Consumer<OfficialWebsiteRatingResult> officialWebsiteRatingResultSetter) {
        if (this.officialWebsiteRatingResult == null) {
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

    public EstimateDesktopPoolExtendVolumeResponse withOptionalDiscountRatingResults(
        List<OptionalDiscountRatingResult> optionalDiscountRatingResults) {
        this.optionalDiscountRatingResults = optionalDiscountRatingResults;
        return this;
    }

    public EstimateDesktopPoolExtendVolumeResponse addOptionalDiscountRatingResultsItem(
        OptionalDiscountRatingResult optionalDiscountRatingResultsItem) {
        if (this.optionalDiscountRatingResults == null) {
            this.optionalDiscountRatingResults = new ArrayList<>();
        }
        this.optionalDiscountRatingResults.add(optionalDiscountRatingResultsItem);
        return this;
    }

    public EstimateDesktopPoolExtendVolumeResponse withOptionalDiscountRatingResults(
        Consumer<List<OptionalDiscountRatingResult>> optionalDiscountRatingResultsSetter) {
        if (this.optionalDiscountRatingResults == null) {
            this.optionalDiscountRatingResults = new ArrayList<>();
        }
        optionalDiscountRatingResultsSetter.accept(this.optionalDiscountRatingResults);
        return this;
    }

    /**
     * 存在可选折扣优惠时返回折扣优惠维度询价结果，每个折扣优惠一组询价结果。
     * @return optionalDiscountRatingResults
     */
    public List<OptionalDiscountRatingResult> getOptionalDiscountRatingResults() {
        return optionalDiscountRatingResults;
    }

    public void setOptionalDiscountRatingResults(List<OptionalDiscountRatingResult> optionalDiscountRatingResults) {
        this.optionalDiscountRatingResults = optionalDiscountRatingResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EstimateDesktopPoolExtendVolumeResponse that = (EstimateDesktopPoolExtendVolumeResponse) obj;
        return Objects.equals(this.currency, that.currency) && Objects.equals(this.extendParams, that.extendParams)
            && Objects.equals(this.officialWebsiteRatingResult, that.officialWebsiteRatingResult)
            && Objects.equals(this.optionalDiscountRatingResults, that.optionalDiscountRatingResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, extendParams, officialWebsiteRatingResult, optionalDiscountRatingResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EstimateDesktopPoolExtendVolumeResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
        sb.append("    officialWebsiteRatingResult: ")
            .append(toIndentedString(officialWebsiteRatingResult))
            .append("\n");
        sb.append("    optionalDiscountRatingResults: ")
            .append(toIndentedString(optionalDiscountRatingResults))
            .append("\n");
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
