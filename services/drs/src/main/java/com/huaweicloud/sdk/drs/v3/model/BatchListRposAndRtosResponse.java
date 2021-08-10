package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class BatchListRposAndRtosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<QueryRpoAndRtoResp> results = null;

    public BatchListRposAndRtosResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 总数
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BatchListRposAndRtosResponse withResults(List<QueryRpoAndRtoResp> results) {
        this.results = results;
        return this;
    }

    public BatchListRposAndRtosResponse addResultsItem(QueryRpoAndRtoResp resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchListRposAndRtosResponse withResults(Consumer<List<QueryRpoAndRtoResp>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /** 批量查询RPO&RTO的响应体集合
     * 
     * @return results */
    public List<QueryRpoAndRtoResp> getResults() {
        return results;
    }

    public void setResults(List<QueryRpoAndRtoResp> results) {
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
        BatchListRposAndRtosResponse batchListRposAndRtosResponse = (BatchListRposAndRtosResponse) o;
        return Objects.equals(this.count, batchListRposAndRtosResponse.count)
            && Objects.equals(this.results, batchListRposAndRtosResponse.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListRposAndRtosResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
