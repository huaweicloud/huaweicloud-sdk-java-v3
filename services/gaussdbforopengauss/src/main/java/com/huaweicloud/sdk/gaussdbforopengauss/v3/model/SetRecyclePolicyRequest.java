package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RecyclePolicyRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SetRecyclePolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private RecyclePolicyRequestBody body;

    public SetRecyclePolicyRequest withBody(RecyclePolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public SetRecyclePolicyRequest withBody(Consumer<RecyclePolicyRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new RecyclePolicyRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RecyclePolicyRequestBody getBody() {
        return body;
    }

    public void setBody(RecyclePolicyRequestBody body) {
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
        SetRecyclePolicyRequest setRecyclePolicyRequest = (SetRecyclePolicyRequest) o;
        return Objects.equals(this.body, setRecyclePolicyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRecyclePolicyRequest {\n");
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

