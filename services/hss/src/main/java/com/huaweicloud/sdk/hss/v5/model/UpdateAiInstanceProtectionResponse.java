package com.huaweicloud.sdk.hss.v5.model;

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
public class UpdateAiInstanceProtectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<UpdateAiInstanceProtectionResultItem> results = null;

    public UpdateAiInstanceProtectionResponse withResults(List<UpdateAiInstanceProtectionResultItem> results) {
        this.results = results;
        return this;
    }

    public UpdateAiInstanceProtectionResponse addResultsItem(UpdateAiInstanceProtectionResultItem resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public UpdateAiInstanceProtectionResponse withResults(
        Consumer<List<UpdateAiInstanceProtectionResultItem>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * **参数解释**： 每个智能体的处理结果列表 **取值范围**： 不涉及 
     * @return results
     */
    public List<UpdateAiInstanceProtectionResultItem> getResults() {
        return results;
    }

    public void setResults(List<UpdateAiInstanceProtectionResultItem> results) {
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
        UpdateAiInstanceProtectionResponse that = (UpdateAiInstanceProtectionResponse) obj;
        return Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAiInstanceProtectionResponse {\n");
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
