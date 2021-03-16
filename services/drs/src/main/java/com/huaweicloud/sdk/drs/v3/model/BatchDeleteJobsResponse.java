package com.huaweicloud.sdk.drs.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.DeleteJobResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchDeleteJobsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="results")
    
    private List<DeleteJobResp> results = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public BatchDeleteJobsResponse withResults(List<DeleteJobResp> results) {
        this.results = results;
        return this;
    }

    
    public BatchDeleteJobsResponse addResultsItem(DeleteJobResp resultsItem) {
        this.results.add(resultsItem);
        return this;
    }

    public BatchDeleteJobsResponse withResults(Consumer<List<DeleteJobResp>> resultsSetter) {
        if(this.results == null ){
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 批量结束任务或删除任务的响应体集合。
     * @return results
     */
    public List<DeleteJobResp> getResults() {
        return results;
    }

    public void setResults(List<DeleteJobResp> results) {
        this.results = results;
    }

    

    public BatchDeleteJobsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 总数
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
        BatchDeleteJobsResponse batchDeleteJobsResponse = (BatchDeleteJobsResponse) o;
        return Objects.equals(this.results, batchDeleteJobsResponse.results) &&
            Objects.equals(this.count, batchDeleteJobsResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(results, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteJobsResponse {\n");
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

