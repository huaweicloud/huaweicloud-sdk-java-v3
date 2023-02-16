package com.huaweicloud.sdk.nlp.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.SegmentRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunSegmentRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private SegmentRequest body;

    public RunSegmentRequest withBody(SegmentRequest body) {
        this.body = body;
        return this;
    }

    public RunSegmentRequest withBody(Consumer<SegmentRequest> bodySetter) {
        if(this.body == null ){
            this.body = new SegmentRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SegmentRequest getBody() {
        return body;
    }

    public void setBody(SegmentRequest body) {
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
        RunSegmentRequest runSegmentRequest = (RunSegmentRequest) o;
        return Objects.equals(this.body, runSegmentRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSegmentRequest {\n");
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

