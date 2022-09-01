package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchSetObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_counts")

    @JacksonXmlProperty(localName = "all_counts")

    private Long allCounts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    @JacksonXmlProperty(localName = "results")

    private List<DatabaseObjectResp> results = null;

    public BatchSetObjectsResponse withAllCounts(Long allCounts) {
        this.allCounts = allCounts;
        return this;
    }

    /**
     * 总数
     * @return allCounts
     */
    public Long getAllCounts() {
        return allCounts;
    }

    public void setAllCounts(Long allCounts) {
        this.allCounts = allCounts;
    }

    public BatchSetObjectsResponse withResults(List<DatabaseObjectResp> results) {
        this.results = results;
        return this;
    }

    public BatchSetObjectsResponse addResultsItem(DatabaseObjectResp resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchSetObjectsResponse withResults(Consumer<List<DatabaseObjectResp>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 批量对象选择响应列表
     * @return results
     */
    public List<DatabaseObjectResp> getResults() {
        return results;
    }

    public void setResults(List<DatabaseObjectResp> results) {
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
        BatchSetObjectsResponse batchSetObjectsResponse = (BatchSetObjectsResponse) o;
        return Objects.equals(this.allCounts, batchSetObjectsResponse.allCounts)
            && Objects.equals(this.results, batchSetObjectsResponse.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allCounts, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetObjectsResponse {\n");
        sb.append("    allCounts: ").append(toIndentedString(allCounts)).append("\n");
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
