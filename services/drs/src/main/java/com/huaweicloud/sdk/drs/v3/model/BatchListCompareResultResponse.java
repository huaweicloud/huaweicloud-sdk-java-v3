package com.huaweicloud.sdk.drs.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.QueryCompareResultResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchListCompareResultResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="results")
    
    private List<QueryCompareResultResp> results = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public BatchListCompareResultResponse withResults(List<QueryCompareResultResp> results) {
        this.results = results;
        return this;
    }

    
    public BatchListCompareResultResponse addResultsItem(QueryCompareResultResp resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchListCompareResultResponse withResults(Consumer<List<QueryCompareResultResp>> resultsSetter) {
        if(this.results == null ){
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 批量查询对比结果请求返回体。默认包含对比任务列表。
     * @return results
     */
    public List<QueryCompareResultResp> getResults() {
        return results;
    }

    public void setResults(List<QueryCompareResultResp> results) {
        this.results = results;
    }

    public BatchListCompareResultResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchListCompareResultResponse batchListCompareResultResponse = (BatchListCompareResultResponse) o;
        return Objects.equals(this.results, batchListCompareResultResponse.results) &&
            Objects.equals(this.count, batchListCompareResultResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(results, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListCompareResultResponse {\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

