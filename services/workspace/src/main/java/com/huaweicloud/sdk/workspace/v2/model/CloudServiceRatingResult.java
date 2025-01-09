package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 询价结果
 */
public class CloudServiceRatingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_request_id")

    private String orderRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_rating_result")

    private OfficialWebsiteRatingResult officialWebsiteRatingResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_discount_rating_results")

    private List<OptionalDiscountRatingResult> optionalDiscountRatingResults = null;

    public CloudServiceRatingResult withOrderRequestId(String orderRequestId) {
        this.orderRequestId = orderRequestId;
        return this;
    }

    /**
     * 下单请求体中的orderRequestId
     * @return orderRequestId
     */
    public String getOrderRequestId() {
        return orderRequestId;
    }

    public void setOrderRequestId(String orderRequestId) {
        this.orderRequestId = orderRequestId;
    }

    public CloudServiceRatingResult withOfficialWebsiteRatingResult(
        OfficialWebsiteRatingResult officialWebsiteRatingResult) {
        this.officialWebsiteRatingResult = officialWebsiteRatingResult;
        return this;
    }

    public CloudServiceRatingResult withOfficialWebsiteRatingResult(
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

    public CloudServiceRatingResult withOptionalDiscountRatingResults(
        List<OptionalDiscountRatingResult> optionalDiscountRatingResults) {
        this.optionalDiscountRatingResults = optionalDiscountRatingResults;
        return this;
    }

    public CloudServiceRatingResult addOptionalDiscountRatingResultsItem(
        OptionalDiscountRatingResult optionalDiscountRatingResultsItem) {
        if (this.optionalDiscountRatingResults == null) {
            this.optionalDiscountRatingResults = new ArrayList<>();
        }
        this.optionalDiscountRatingResults.add(optionalDiscountRatingResultsItem);
        return this;
    }

    public CloudServiceRatingResult withOptionalDiscountRatingResults(
        Consumer<List<OptionalDiscountRatingResult>> optionalDiscountRatingResultsSetter) {
        if (this.optionalDiscountRatingResults == null) {
            this.optionalDiscountRatingResults = new ArrayList<>();
        }
        optionalDiscountRatingResultsSetter.accept(this.optionalDiscountRatingResults);
        return this;
    }

    /**
     * 优惠询价结果
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
        CloudServiceRatingResult that = (CloudServiceRatingResult) obj;
        return Objects.equals(this.orderRequestId, that.orderRequestId)
            && Objects.equals(this.officialWebsiteRatingResult, that.officialWebsiteRatingResult)
            && Objects.equals(this.optionalDiscountRatingResults, that.optionalDiscountRatingResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderRequestId, officialWebsiteRatingResult, optionalDiscountRatingResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudServiceRatingResult {\n");
        sb.append("    orderRequestId: ").append(toIndentedString(orderRequestId)).append("\n");
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
