package com.huaweicloud.sdk.ocr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ocr.v1.model.BankcardResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RecognizeBankcardResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private BankcardResult result;

    public RecognizeBankcardResponse withResult(BankcardResult result) {
        this.result = result;
        return this;
    }

    public RecognizeBankcardResponse withResult(Consumer<BankcardResult> resultSetter) {
        if(this.result == null ){
            this.result = new BankcardResult();
            resultSetter.accept(this.result);
        }
        
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public BankcardResult getResult() {
        return result;
    }

    public void setResult(BankcardResult result) {
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
        RecognizeBankcardResponse recognizeBankcardResponse = (RecognizeBankcardResponse) o;
        return Objects.equals(this.result, recognizeBankcardResponse.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeBankcardResponse {\n");
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

