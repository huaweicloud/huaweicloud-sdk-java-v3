package com.huaweicloud.sdk.scm.v3.model;

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
public class BatchPushCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<BatchPushCertificateResponseBodyResults> results = null;

    public BatchPushCertificateResponse withResults(List<BatchPushCertificateResponseBodyResults> results) {
        this.results = results;
        return this;
    }

    public BatchPushCertificateResponse addResultsItem(BatchPushCertificateResponseBodyResults resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public BatchPushCertificateResponse withResults(
        Consumer<List<BatchPushCertificateResponseBodyResults>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 部署结果。
     * @return results
     */
    public List<BatchPushCertificateResponseBodyResults> getResults() {
        return results;
    }

    public void setResults(List<BatchPushCertificateResponseBodyResults> results) {
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
        BatchPushCertificateResponse that = (BatchPushCertificateResponse) obj;
        return Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchPushCertificateResponse {\n");
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
