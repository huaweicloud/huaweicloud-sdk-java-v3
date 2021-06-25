package com.huaweicloud.sdk.ocr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ocr.v1.model.GeneralTextResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RecognizeGeneralTextResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private GeneralTextResult result;

    public RecognizeGeneralTextResponse withResult(GeneralTextResult result) {
        this.result = result;
        return this;
    }

    public RecognizeGeneralTextResponse withResult(Consumer<GeneralTextResult> resultSetter) {
        if(this.result == null ){
            this.result = new GeneralTextResult();
            resultSetter.accept(this.result);
        }
        
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public GeneralTextResult getResult() {
        return result;
    }

    public void setResult(GeneralTextResult result) {
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
        RecognizeGeneralTextResponse recognizeGeneralTextResponse = (RecognizeGeneralTextResponse) o;
        return Objects.equals(this.result, recognizeGeneralTextResponse.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeGeneralTextResponse {\n");
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

