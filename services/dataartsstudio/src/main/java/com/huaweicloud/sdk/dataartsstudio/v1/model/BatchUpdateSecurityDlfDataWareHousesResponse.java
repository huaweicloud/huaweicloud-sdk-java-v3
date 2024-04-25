package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class BatchUpdateSecurityDlfDataWareHousesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<FgacUpdateResult> results = null;

    public BatchUpdateSecurityDlfDataWareHousesResponse withResults(List<FgacUpdateResult> results) {
        this.results = results;
        return this;
    }

    public BatchUpdateSecurityDlfDataWareHousesResponse addResultsItem(FgacUpdateResult resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchUpdateSecurityDlfDataWareHousesResponse withResults(Consumer<List<FgacUpdateResult>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 细粒度认证更新结果
     * @return results
     */
    public List<FgacUpdateResult> getResults() {
        return results;
    }

    public void setResults(List<FgacUpdateResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateSecurityDlfDataWareHousesResponse that = (BatchUpdateSecurityDlfDataWareHousesResponse) obj;
        return Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateSecurityDlfDataWareHousesResponse {\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
