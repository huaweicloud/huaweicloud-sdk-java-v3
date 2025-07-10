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
public class EstimateDesktopPoolAddVolumeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_rating_results")

    private List<CloudServiceRatingResult> cloudServiceRatingResults = null;

    public EstimateDesktopPoolAddVolumeResponse withCurrency(String currency) {
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

    public EstimateDesktopPoolAddVolumeResponse withCloudServiceRatingResults(
        List<CloudServiceRatingResult> cloudServiceRatingResults) {
        this.cloudServiceRatingResults = cloudServiceRatingResults;
        return this;
    }

    public EstimateDesktopPoolAddVolumeResponse addCloudServiceRatingResultsItem(
        CloudServiceRatingResult cloudServiceRatingResultsItem) {
        if (this.cloudServiceRatingResults == null) {
            this.cloudServiceRatingResults = new ArrayList<>();
        }
        this.cloudServiceRatingResults.add(cloudServiceRatingResultsItem);
        return this;
    }

    public EstimateDesktopPoolAddVolumeResponse withCloudServiceRatingResults(
        Consumer<List<CloudServiceRatingResult>> cloudServiceRatingResultsSetter) {
        if (this.cloudServiceRatingResults == null) {
            this.cloudServiceRatingResults = new ArrayList<>();
        }
        cloudServiceRatingResultsSetter.accept(this.cloudServiceRatingResults);
        return this;
    }

    /**
     * 询价结果。
     * @return cloudServiceRatingResults
     */
    public List<CloudServiceRatingResult> getCloudServiceRatingResults() {
        return cloudServiceRatingResults;
    }

    public void setCloudServiceRatingResults(List<CloudServiceRatingResult> cloudServiceRatingResults) {
        this.cloudServiceRatingResults = cloudServiceRatingResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EstimateDesktopPoolAddVolumeResponse that = (EstimateDesktopPoolAddVolumeResponse) obj;
        return Objects.equals(this.currency, that.currency)
            && Objects.equals(this.cloudServiceRatingResults, that.cloudServiceRatingResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, cloudServiceRatingResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EstimateDesktopPoolAddVolumeResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    cloudServiceRatingResults: ").append(toIndentedString(cloudServiceRatingResults)).append("\n");
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
