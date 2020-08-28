package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.CreateLoadBalancerRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateLoadBalancerRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Auth-Project-Token")
    @com.huaweicloud.sdk.core.json.JsonSensitive
    
    private String xAuthProjectToken;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateLoadBalancerRequestBody body = null;

    public CreateLoadBalancerRequest withXAuthProjectToken(String xAuthProjectToken) {
        this.xAuthProjectToken = xAuthProjectToken;
        return this;
    }

    


    /**
     * Get xAuthProjectToken
     * @return xAuthProjectToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXAuthProjectToken() {
        return xAuthProjectToken;
    }

    public void setXAuthProjectToken(String xAuthProjectToken) {
        this.xAuthProjectToken = xAuthProjectToken;
    }

    public CreateLoadBalancerRequest withBody(CreateLoadBalancerRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateLoadBalancerRequest withBody(Consumer<CreateLoadBalancerRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateLoadBalancerRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateLoadBalancerRequestBody getBody() {
        return body;
    }

    public void setBody(CreateLoadBalancerRequestBody body) {
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
        CreateLoadBalancerRequest createLoadBalancerRequest = (CreateLoadBalancerRequest) o;
        return Objects.equals(this.xAuthProjectToken, createLoadBalancerRequest.xAuthProjectToken) &&
            Objects.equals(this.body, createLoadBalancerRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xAuthProjectToken, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadBalancerRequest {\n");
        sb.append("    xAuthProjectToken: ").append(toIndentedString("******")).append("\n");
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

