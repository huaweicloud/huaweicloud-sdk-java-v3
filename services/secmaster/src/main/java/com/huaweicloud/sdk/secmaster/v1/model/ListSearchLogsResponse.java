package com.huaweicloud.sdk.secmaster.v1.model;

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
public class ListSearchLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_results")

    private AnalysisResults analysisResults;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<SearchResult> results = null;

    public ListSearchLogsResponse withAnalysisResults(AnalysisResults analysisResults) {
        this.analysisResults = analysisResults;
        return this;
    }

    public ListSearchLogsResponse withAnalysisResults(Consumer<AnalysisResults> analysisResultsSetter) {
        if (this.analysisResults == null) {
            this.analysisResults = new AnalysisResults();
            analysisResultsSetter.accept(this.analysisResults);
        }

        return this;
    }

    /**
     * Get analysisResults
     * @return analysisResults
     */
    public AnalysisResults getAnalysisResults() {
        return analysisResults;
    }

    public void setAnalysisResults(AnalysisResults analysisResults) {
        this.analysisResults = analysisResults;
    }

    public ListSearchLogsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 查询结果的条数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListSearchLogsResponse withResults(List<SearchResult> results) {
        this.results = results;
        return this;
    }

    public ListSearchLogsResponse addResultsItem(SearchResult resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public ListSearchLogsResponse withResults(Consumer<List<SearchResult>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 返回的查询结果
     * @return results
     */
    public List<SearchResult> getResults() {
        return results;
    }

    public void setResults(List<SearchResult> results) {
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
        ListSearchLogsResponse that = (ListSearchLogsResponse) obj;
        return Objects.equals(this.analysisResults, that.analysisResults) && Objects.equals(this.count, that.count)
            && Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analysisResults, count, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSearchLogsResponse {\n");
        sb.append("    analysisResults: ").append(toIndentedString(analysisResults)).append("\n");
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
