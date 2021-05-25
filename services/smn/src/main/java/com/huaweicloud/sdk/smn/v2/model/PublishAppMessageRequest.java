package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.smn.v2.model.PublishAppMessageRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class PublishAppMessageRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoint_urn")
    
    private String endpointUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private PublishAppMessageRequestBody body;

    public PublishAppMessageRequest withEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
        return this;
    }

    


    /**
     * Endpoint的唯一资源标识，可通过[查询Application的Endpoint列表](https://support.huaweicloud.com/api-smn/smn_api_58004.html)获取该标识
     * @return endpointUrn
     */
    public String getEndpointUrn() {
        return endpointUrn;
    }

    public void setEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
    }

    

    public PublishAppMessageRequest withBody(PublishAppMessageRequestBody body) {
        this.body = body;
        return this;
    }

    public PublishAppMessageRequest withBody(Consumer<PublishAppMessageRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new PublishAppMessageRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PublishAppMessageRequestBody getBody() {
        return body;
    }

    public void setBody(PublishAppMessageRequestBody body) {
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
        PublishAppMessageRequest publishAppMessageRequest = (PublishAppMessageRequest) o;
        return Objects.equals(this.endpointUrn, publishAppMessageRequest.endpointUrn) &&
            Objects.equals(this.body, publishAppMessageRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endpointUrn, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishAppMessageRequest {\n");
        sb.append("    endpointUrn: ").append(toIndentedString(endpointUrn)).append("\n");
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

