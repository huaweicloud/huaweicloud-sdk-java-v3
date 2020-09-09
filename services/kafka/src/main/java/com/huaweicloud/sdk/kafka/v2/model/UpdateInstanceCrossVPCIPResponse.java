package com.huaweicloud.sdk.kafka.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.UpdateInstanceCrossVPCIPRespResults;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateInstanceCrossVPCIPResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="success")
    
    private String success;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="results")
    
    private List<UpdateInstanceCrossVPCIPRespResults> results = null;
    
    public UpdateInstanceCrossVPCIPResponse withSuccess(String success) {
        this.success = success;
        return this;
    }

    


    /**
     * 修改跨VPC访问结果。
     * @return success
     */
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public UpdateInstanceCrossVPCIPResponse withResults(List<UpdateInstanceCrossVPCIPRespResults> results) {
        this.results = results;
        return this;
    }

    
    public UpdateInstanceCrossVPCIPResponse addResultsItem(UpdateInstanceCrossVPCIPRespResults resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public UpdateInstanceCrossVPCIPResponse withResults(Consumer<List<UpdateInstanceCrossVPCIPRespResults>> resultsSetter) {
        if(this.results == null ){
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 修改broker跨VPC访问的结果列表。
     * @return results
     */
    public List<UpdateInstanceCrossVPCIPRespResults> getResults() {
        return results;
    }

    public void setResults(List<UpdateInstanceCrossVPCIPRespResults> results) {
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
        UpdateInstanceCrossVPCIPResponse updateInstanceCrossVPCIPResponse = (UpdateInstanceCrossVPCIPResponse) o;
        return Objects.equals(this.success, updateInstanceCrossVPCIPResponse.success) &&
            Objects.equals(this.results, updateInstanceCrossVPCIPResponse.results);
    }
    @Override
    public int hashCode() {
        return Objects.hash(success, results);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceCrossVPCIPResponse {\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

