package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerTagsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateLoadbalancerTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer_id")
    
    private String loadbalancerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateLoadbalancerTagsRequestBody body;

    public CreateLoadbalancerTagsRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    


    /**
     * Get loadbalancerId
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    

    public CreateLoadbalancerTagsRequest withBody(CreateLoadbalancerTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateLoadbalancerTagsRequest withBody(Consumer<CreateLoadbalancerTagsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateLoadbalancerTagsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateLoadbalancerTagsRequestBody getBody() {
        return body;
    }

    public void setBody(CreateLoadbalancerTagsRequestBody body) {
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
        CreateLoadbalancerTagsRequest createLoadbalancerTagsRequest = (CreateLoadbalancerTagsRequest) o;
        return Objects.equals(this.loadbalancerId, createLoadbalancerTagsRequest.loadbalancerId) &&
            Objects.equals(this.body, createLoadbalancerTagsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLoadbalancerTagsRequest {\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
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

