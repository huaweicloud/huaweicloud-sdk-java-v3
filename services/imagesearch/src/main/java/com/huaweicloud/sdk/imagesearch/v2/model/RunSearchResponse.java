package com.huaweicloud.sdk.imagesearch.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.SearchRestInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunSearchResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    
    private String result;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    
    private SearchRestInfo data;

    public RunSearchResponse withResult(String result) {
        this.result = result;
        return this;
    }

    


    /**
     * 搜索完成返回success。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    

    public RunSearchResponse withData(SearchRestInfo data) {
        this.data = data;
        return this;
    }

    public RunSearchResponse withData(Consumer<SearchRestInfo> dataSetter) {
        if(this.data == null ){
            this.data = new SearchRestInfo();
            dataSetter.accept(this.data);
        }
        
        return this;
    }


    /**
     * Get data
     * @return data
     */
    public SearchRestInfo getData() {
        return data;
    }

    public void setData(SearchRestInfo data) {
        this.data = data;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunSearchResponse runSearchResponse = (RunSearchResponse) o;
        return Objects.equals(this.result, runSearchResponse.result) &&
            Objects.equals(this.data, runSearchResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result, data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSearchResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

