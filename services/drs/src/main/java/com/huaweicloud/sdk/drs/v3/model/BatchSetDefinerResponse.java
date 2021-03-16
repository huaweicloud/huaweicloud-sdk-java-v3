package com.huaweicloud.sdk.drs.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.ModifyJobResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchSetDefinerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="results")
    
    private List<ModifyJobResp> results = null;
    
    public BatchSetDefinerResponse withCount(Integer count) {
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

    

    public BatchSetDefinerResponse withResults(List<ModifyJobResp> results) {
        this.results = results;
        return this;
    }

    
    public BatchSetDefinerResponse addResultsItem(ModifyJobResp resultsItem) {
        this.results.add(resultsItem);
        return this;
    }

    public BatchSetDefinerResponse withResults(Consumer<List<ModifyJobResp>> resultsSetter) {
        if(this.results == null ){
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 批量修改任务返回列表
     * @return results
     */
    public List<ModifyJobResp> getResults() {
        return results;
    }

    public void setResults(List<ModifyJobResp> results) {
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
        BatchSetDefinerResponse batchSetDefinerResponse = (BatchSetDefinerResponse) o;
        return Objects.equals(this.count, batchSetDefinerResponse.count) &&
            Objects.equals(this.results, batchSetDefinerResponse.results);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, results);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetDefinerResponse {\n");
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

