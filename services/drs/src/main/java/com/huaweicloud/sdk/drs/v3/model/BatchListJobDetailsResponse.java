package com.huaweicloud.sdk.drs.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.QueryJobResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchListJobDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="results")
    
    private List<QueryJobResp> results = null;
    
    public BatchListJobDetailsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 任务数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public BatchListJobDetailsResponse withResults(List<QueryJobResp> results) {
        this.results = results;
        return this;
    }

    
    public BatchListJobDetailsResponse addResultsItem(QueryJobResp resultsItem) {
        if(this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchListJobDetailsResponse withResults(Consumer<List<QueryJobResp>> resultsSetter) {
        if(this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 任务详细信息
     * @return results
     */
    public List<QueryJobResp> getResults() {
        return results;
    }

    public void setResults(List<QueryJobResp> results) {
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
        BatchListJobDetailsResponse batchListJobDetailsResponse = (BatchListJobDetailsResponse) o;
        return Objects.equals(this.count, batchListJobDetailsResponse.count) &&
            Objects.equals(this.results, batchListJobDetailsResponse.results);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, results);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListJobDetailsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

