package com.huaweicloud.sdk.as.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.ExecuteScalingPoliciesRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExecuteScalingPoliciesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ExecuteScalingPoliciesRequestBody body;

    public ExecuteScalingPoliciesRequest withBody(ExecuteScalingPoliciesRequestBody body) {
        this.body = body;
        return this;
    }

    public ExecuteScalingPoliciesRequest withBody(Consumer<ExecuteScalingPoliciesRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ExecuteScalingPoliciesRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ExecuteScalingPoliciesRequestBody getBody() {
        return body;
    }

    public void setBody(ExecuteScalingPoliciesRequestBody body) {
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
        ExecuteScalingPoliciesRequest executeScalingPoliciesRequest = (ExecuteScalingPoliciesRequest) o;
        return Objects.equals(this.body, executeScalingPoliciesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteScalingPoliciesRequest {\n");
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

