package com.huaweicloud.sdk.rabbitmq.v2.model;

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
public class BatchRestartOrDeleteInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    @JacksonXmlProperty(localName = "results")

    private List<BatchRestartOrDeleteInstanceRespResults> results = null;

    public BatchRestartOrDeleteInstancesResponse withResults(List<BatchRestartOrDeleteInstanceRespResults> results) {
        this.results = results;
        return this;
    }

    public BatchRestartOrDeleteInstancesResponse addResultsItem(BatchRestartOrDeleteInstanceRespResults resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchRestartOrDeleteInstancesResponse withResults(
        Consumer<List<BatchRestartOrDeleteInstanceRespResults>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 修改实例的结果。
     * @return results
     */
    public List<BatchRestartOrDeleteInstanceRespResults> getResults() {
        return results;
    }

    public void setResults(List<BatchRestartOrDeleteInstanceRespResults> results) {
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
        BatchRestartOrDeleteInstancesResponse batchRestartOrDeleteInstancesResponse =
            (BatchRestartOrDeleteInstancesResponse) o;
        return Objects.equals(this.results, batchRestartOrDeleteInstancesResponse.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRestartOrDeleteInstancesResponse {\n");
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
