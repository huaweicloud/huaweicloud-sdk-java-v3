package com.huaweicloud.sdk.dcs.v2.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.BatchOpsResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchDeleteDCSInstancesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="results")
    
    private List<BatchOpsResult> results = null;
    
    public BatchDeleteDCSInstancesResponse withResults(List<BatchOpsResult> results) {
        this.results = results;
        return this;
    }

    
    public BatchDeleteDCSInstancesResponse addResultsItem(BatchOpsResult resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchDeleteDCSInstancesResponse withResults(Consumer<List<BatchOpsResult>> resultsSetter) {
        if(this.results == null ){
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 删除/重启/清空实例的结果。
     * @return results
     */
    public List<BatchOpsResult> getResults() {
        return results;
    }

    public void setResults(List<BatchOpsResult> results) {
        this.results = results;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteDCSInstancesResponse batchDeleteDCSInstancesResponse = (BatchDeleteDCSInstancesResponse) o;
        return Objects.equals(this.results, batchDeleteDCSInstancesResponse.results);
    }
    @Override
    public int hashCode() {
        return Objects.hash(results);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDCSInstancesResponse {\n");
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

