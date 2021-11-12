package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Data
 */
public class Data  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resultType")
    
    
    private String resultType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    
    private List<String> result = null;
    
    public Data withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    


    /**
     * Get resultType
     * @return resultType
     */
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    

    public Data withResult(List<String> result) {
        this.result = result;
        return this;
    }

    
    public Data addResultItem(String resultItem) {
        if(this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public Data withResult(Consumer<List<String>> resultSetter) {
        if(this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * Get result
     * @return result
     */
    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Data data = (Data) o;
        return Objects.equals(this.resultType, data.resultType) &&
            Objects.equals(this.result, data.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resultType, result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Data {\n");
        sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

