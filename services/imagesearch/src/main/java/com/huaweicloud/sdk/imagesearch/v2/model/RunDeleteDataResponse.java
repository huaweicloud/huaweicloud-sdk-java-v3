package com.huaweicloud.sdk.imagesearch.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.DeleteRestInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunDeleteDataResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    
    private String result;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    
    private DeleteRestInfo data;

    public RunDeleteDataResponse withResult(String result) {
        this.result = result;
        return this;
    }

    


    /**
     * 删除数据完成返回success。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    

    public RunDeleteDataResponse withData(DeleteRestInfo data) {
        this.data = data;
        return this;
    }

    public RunDeleteDataResponse withData(Consumer<DeleteRestInfo> dataSetter) {
        if(this.data == null ){
            this.data = new DeleteRestInfo();
            dataSetter.accept(this.data);
        }
        
        return this;
    }


    /**
     * Get data
     * @return data
     */
    public DeleteRestInfo getData() {
        return data;
    }

    public void setData(DeleteRestInfo data) {
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
        RunDeleteDataResponse runDeleteDataResponse = (RunDeleteDataResponse) o;
        return Objects.equals(this.result, runDeleteDataResponse.result) &&
            Objects.equals(this.data, runDeleteDataResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result, data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunDeleteDataResponse {\n");
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

