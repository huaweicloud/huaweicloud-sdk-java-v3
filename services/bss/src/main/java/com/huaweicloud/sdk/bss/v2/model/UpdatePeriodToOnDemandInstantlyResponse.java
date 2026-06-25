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
public class UpdatePeriodToOnDemandInstantlyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_ondemand_service_results")

    private List<ToOndemandServiceResult> toOndemandServiceResults = null;

    public UpdatePeriodToOnDemandInstantlyResponse withToOndemandServiceResults(
        List<ToOndemandServiceResult> toOndemandServiceResults) {
        this.toOndemandServiceResults = toOndemandServiceResults;
        return this;
    }

    public UpdatePeriodToOnDemandInstantlyResponse addToOndemandServiceResultsItem(
        ToOndemandServiceResult toOndemandServiceResultsItem) {
        if (this.toOndemandServiceResults == null) {
            this.toOndemandServiceResults = new ArrayList<>();
        }
        this.toOndemandServiceResults.add(toOndemandServiceResultsItem);
        return this;
    }

    public UpdatePeriodToOnDemandInstantlyResponse withToOndemandServiceResults(
        Consumer<List<ToOndemandServiceResult>> toOndemandServiceResultsSetter) {
        if (this.toOndemandServiceResults == null) {
            this.toOndemandServiceResults = new ArrayList<>();
        }
        toOndemandServiceResultsSetter.accept(this.toOndemandServiceResults);
        return this;
    }

    /**
     * |参数名称：包年包月即时转按需结果| |参数约束以及描述：包年包月即时转按需结果。HTTP 200的时候返回该字段，具体参见ToOndemandServiceResult。|
     * @return toOndemandServiceResults
     */
    public List<ToOndemandServiceResult> getToOndemandServiceResults() {
        return toOndemandServiceResults;
    }

    public void setToOndemandServiceResults(List<ToOndemandServiceResult> toOndemandServiceResults) {
        this.toOndemandServiceResults = toOndemandServiceResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePeriodToOnDemandInstantlyResponse that = (UpdatePeriodToOnDemandInstantlyResponse) obj;
        return Objects.equals(this.toOndemandServiceResults, that.toOndemandServiceResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toOndemandServiceResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePeriodToOnDemandInstantlyResponse {\n");
        sb.append("    toOndemandServiceResults: ").append(toIndentedString(toOndemandServiceResults)).append("\n");
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
