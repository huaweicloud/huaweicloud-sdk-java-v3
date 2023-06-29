package com.huaweicloud.sdk.bss.v2.model;

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
public class ListRenewRateOnPeriodResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "renew_inquiry_results")

    private List<RenewInquiryResultInfo> renewInquiryResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_rating_result")

    private OfficialWebsiteRatingResultV2 officialWebsiteRatingResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_discount_rating_results")

    private List<OptionalDiscountRatingResultV2> optionalDiscountRatingResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_resource_infos")

    private List<FailResourceInfo> failResourceInfos = null;

    public ListRenewRateOnPeriodResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * |参数名称：币种。CNY：人民币。USD：美元。| |参数约束及描述：币种。CNY：人民币。USD：美元。|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListRenewRateOnPeriodResponse withRenewInquiryResults(List<RenewInquiryResultInfo> renewInquiryResults) {
        this.renewInquiryResults = renewInquiryResults;
        return this;
    }

    public ListRenewRateOnPeriodResponse addRenewInquiryResultsItem(RenewInquiryResultInfo renewInquiryResultsItem) {
        if (this.renewInquiryResults == null) {
            this.renewInquiryResults = new ArrayList<>();
        }
        this.renewInquiryResults.add(renewInquiryResultsItem);
        return this;
    }

    public ListRenewRateOnPeriodResponse withRenewInquiryResults(
        Consumer<List<RenewInquiryResultInfo>> renewInquiryResultsSetter) {
        if (this.renewInquiryResults == null) {
            this.renewInquiryResults = new ArrayList<>();
        }
        renewInquiryResultsSetter.accept(this.renewInquiryResults);
        return this;
    }

    /**
     * |参数名称：主资源（包含从资源）询价结果| |参数约束以及描述：主资源（包含从资源）询价结果|
     * @return renewInquiryResults
     */
    public List<RenewInquiryResultInfo> getRenewInquiryResults() {
        return renewInquiryResults;
    }

    public void setRenewInquiryResults(List<RenewInquiryResultInfo> renewInquiryResults) {
        this.renewInquiryResults = renewInquiryResults;
    }

    public ListRenewRateOnPeriodResponse withOfficialWebsiteRatingResult(
        OfficialWebsiteRatingResultV2 officialWebsiteRatingResult) {
        this.officialWebsiteRatingResult = officialWebsiteRatingResult;
        return this;
    }

    public ListRenewRateOnPeriodResponse withOfficialWebsiteRatingResult(
        Consumer<OfficialWebsiteRatingResultV2> officialWebsiteRatingResultSetter) {
        if (this.officialWebsiteRatingResult == null) {
            this.officialWebsiteRatingResult = new OfficialWebsiteRatingResultV2();
            officialWebsiteRatingResultSetter.accept(this.officialWebsiteRatingResult);
        }

        return this;
    }

    /**
     * Get officialWebsiteRatingResult
     * @return officialWebsiteRatingResult
     */
    public OfficialWebsiteRatingResultV2 getOfficialWebsiteRatingResult() {
        return officialWebsiteRatingResult;
    }

    public void setOfficialWebsiteRatingResult(OfficialWebsiteRatingResultV2 officialWebsiteRatingResult) {
        this.officialWebsiteRatingResult = officialWebsiteRatingResult;
    }

    public ListRenewRateOnPeriodResponse withOptionalDiscountRatingResults(
        List<OptionalDiscountRatingResultV2> optionalDiscountRatingResults) {
        this.optionalDiscountRatingResults = optionalDiscountRatingResults;
        return this;
    }

    public ListRenewRateOnPeriodResponse addOptionalDiscountRatingResultsItem(
        OptionalDiscountRatingResultV2 optionalDiscountRatingResultsItem) {
        if (this.optionalDiscountRatingResults == null) {
            this.optionalDiscountRatingResults = new ArrayList<>();
        }
        this.optionalDiscountRatingResults.add(optionalDiscountRatingResultsItem);
        return this;
    }

    public ListRenewRateOnPeriodResponse withOptionalDiscountRatingResults(
        Consumer<List<OptionalDiscountRatingResultV2>> optionalDiscountRatingResultsSetter) {
        if (this.optionalDiscountRatingResults == null) {
            this.optionalDiscountRatingResults = new ArrayList<>();
        }
        optionalDiscountRatingResultsSetter.accept(this.optionalDiscountRatingResults);
        return this;
    }

    /**
     * |参数名称：存在可选折扣优惠时返回折扣优惠维度询价结果，每个折扣优惠一组询价结果| |参数约束以及描述：存在可选折扣优惠时返回折扣优惠维度询价结果，每个折扣优惠一组询价结果|
     * @return optionalDiscountRatingResults
     */
    public List<OptionalDiscountRatingResultV2> getOptionalDiscountRatingResults() {
        return optionalDiscountRatingResults;
    }

    public void setOptionalDiscountRatingResults(List<OptionalDiscountRatingResultV2> optionalDiscountRatingResults) {
        this.optionalDiscountRatingResults = optionalDiscountRatingResults;
    }

    public ListRenewRateOnPeriodResponse withFailResourceInfos(List<FailResourceInfo> failResourceInfos) {
        this.failResourceInfos = failResourceInfos;
        return this;
    }

    public ListRenewRateOnPeriodResponse addFailResourceInfosItem(FailResourceInfo failResourceInfosItem) {
        if (this.failResourceInfos == null) {
            this.failResourceInfos = new ArrayList<>();
        }
        this.failResourceInfos.add(failResourceInfosItem);
        return this;
    }

    public ListRenewRateOnPeriodResponse withFailResourceInfos(
        Consumer<List<FailResourceInfo>> failResourceInfosSetter) {
        if (this.failResourceInfos == null) {
            this.failResourceInfos = new ArrayList<>();
        }
        failResourceInfosSetter.accept(this.failResourceInfos);
        return this;
    }

    /**
     * |参数名称：失败的资源信息列表| |参数约束以及描述：失败的资源信息列表|
     * @return failResourceInfos
     */
    public List<FailResourceInfo> getFailResourceInfos() {
        return failResourceInfos;
    }

    public void setFailResourceInfos(List<FailResourceInfo> failResourceInfos) {
        this.failResourceInfos = failResourceInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRenewRateOnPeriodResponse that = (ListRenewRateOnPeriodResponse) obj;
        return Objects.equals(this.currency, that.currency)
            && Objects.equals(this.renewInquiryResults, that.renewInquiryResults)
            && Objects.equals(this.officialWebsiteRatingResult, that.officialWebsiteRatingResult)
            && Objects.equals(this.optionalDiscountRatingResults, that.optionalDiscountRatingResults)
            && Objects.equals(this.failResourceInfos, that.failResourceInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency,
            renewInquiryResults,
            officialWebsiteRatingResult,
            optionalDiscountRatingResults,
            failResourceInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRenewRateOnPeriodResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    renewInquiryResults: ").append(toIndentedString(renewInquiryResults)).append("\n");
        sb.append("    officialWebsiteRatingResult: ")
            .append(toIndentedString(officialWebsiteRatingResult))
            .append("\n");
        sb.append("    optionalDiscountRatingResults: ")
            .append(toIndentedString(optionalDiscountRatingResults))
            .append("\n");
        sb.append("    failResourceInfos: ").append(toIndentedString(failResourceInfos)).append("\n");
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
