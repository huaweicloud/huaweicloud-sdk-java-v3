package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.PreheatingResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPreheatingAssetResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preheating_results")
    
    private List<PreheatingResult> preheatingResults = null;
    
    public ShowPreheatingAssetResponse withPreheatingResults(List<PreheatingResult> preheatingResults) {
        this.preheatingResults = preheatingResults;
        return this;
    }

    
    public ShowPreheatingAssetResponse addPreheatingResultsItem(PreheatingResult preheatingResultsItem) {
        if(this.preheatingResults == null) {
            this.preheatingResults = new ArrayList<>();
        }
        this.preheatingResults.add(preheatingResultsItem);
        return this;
    }

    public ShowPreheatingAssetResponse withPreheatingResults(Consumer<List<PreheatingResult>> preheatingResultsSetter) {
        if(this.preheatingResults == null) {
            this.preheatingResults = new ArrayList<>();
        }
        preheatingResultsSetter.accept(this.preheatingResults);
        return this;
    }

    /**
     * 预热任务数组<br/> 
     * @return preheatingResults
     */
    public List<PreheatingResult> getPreheatingResults() {
        return preheatingResults;
    }

    public void setPreheatingResults(List<PreheatingResult> preheatingResults) {
        this.preheatingResults = preheatingResults;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPreheatingAssetResponse showPreheatingAssetResponse = (ShowPreheatingAssetResponse) o;
        return Objects.equals(this.preheatingResults, showPreheatingAssetResponse.preheatingResults);
    }
    @Override
    public int hashCode() {
        return Objects.hash(preheatingResults);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPreheatingAssetResponse {\n");
        sb.append("    preheatingResults: ").append(toIndentedString(preheatingResults)).append("\n");
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

