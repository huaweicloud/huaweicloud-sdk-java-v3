package com.huaweicloud.sdk.ocr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ocr.v1.model.HandwritingRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RecognizeHandwritingRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private HandwritingRequestBody body;

    public RecognizeHandwritingRequest withBody(HandwritingRequestBody body) {
        this.body = body;
        return this;
    }

    public RecognizeHandwritingRequest withBody(Consumer<HandwritingRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new HandwritingRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public HandwritingRequestBody getBody() {
        return body;
    }

    public void setBody(HandwritingRequestBody body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecognizeHandwritingRequest recognizeHandwritingRequest = (RecognizeHandwritingRequest) o;
        return Objects.equals(this.body, recognizeHandwritingRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeHandwritingRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

