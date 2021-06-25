package com.huaweicloud.sdk.ocr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ocr.v1.model.WebImageResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RecognizeWebImageResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private WebImageResult result;

    public RecognizeWebImageResponse withResult(WebImageResult result) {
        this.result = result;
        return this;
    }

    public RecognizeWebImageResponse withResult(Consumer<WebImageResult> resultSetter) {
        if(this.result == null ){
            this.result = new WebImageResult();
            resultSetter.accept(this.result);
        }
        
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public WebImageResult getResult() {
        return result;
    }

    public void setResult(WebImageResult result) {
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
        RecognizeWebImageResponse recognizeWebImageResponse = (RecognizeWebImageResponse) o;
        return Objects.equals(this.result, recognizeWebImageResponse.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeWebImageResponse {\n");
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

