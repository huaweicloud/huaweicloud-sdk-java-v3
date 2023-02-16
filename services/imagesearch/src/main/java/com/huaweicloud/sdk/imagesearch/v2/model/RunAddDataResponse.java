package com.huaweicloud.sdk.imagesearch.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.AddDataRestInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunAddDataResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    
    private String result;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    
    private AddDataRestInfo data;

    public RunAddDataResponse withResult(String result) {
        this.result = result;
        return this;
    }

    


    /**
     * 添加数据完成返回success。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    

    public RunAddDataResponse withData(AddDataRestInfo data) {
        this.data = data;
        return this;
    }

    public RunAddDataResponse withData(Consumer<AddDataRestInfo> dataSetter) {
        if(this.data == null ){
            this.data = new AddDataRestInfo();
            dataSetter.accept(this.data);
        }
        
        return this;
    }


    /**
     * Get data
     * @return data
     */
    public AddDataRestInfo getData() {
        return data;
    }

    public void setData(AddDataRestInfo data) {
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
        RunAddDataResponse runAddDataResponse = (RunAddDataResponse) o;
        return Objects.equals(this.result, runAddDataResponse.result) &&
            Objects.equals(this.data, runAddDataResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result, data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunAddDataResponse {\n");
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

