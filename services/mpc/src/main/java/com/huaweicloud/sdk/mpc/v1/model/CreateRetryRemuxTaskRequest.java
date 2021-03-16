package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.RemuxRetryReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateRetryRemuxTaskRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private RemuxRetryReq body;

    public CreateRetryRemuxTaskRequest withBody(RemuxRetryReq body) {
        this.body = body;
        return this;
    }

    public CreateRetryRemuxTaskRequest withBody(Consumer<RemuxRetryReq> bodySetter) {
        if(this.body == null ){
            this.body = new RemuxRetryReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RemuxRetryReq getBody() {
        return body;
    }

    public void setBody(RemuxRetryReq body) {
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
        CreateRetryRemuxTaskRequest createRetryRemuxTaskRequest = (CreateRetryRemuxTaskRequest) o;
        return Objects.equals(this.body, createRetryRemuxTaskRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRetryRemuxTaskRequest {\n");
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

