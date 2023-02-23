package com.huaweicloud.sdk.aos.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.CreateStackRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateStackRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Client-Request-Id")
    

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private CreateStackRequestBody body;

    public CreateStackRequest withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    


    /**
     * 用户指定的，对于此请求的唯一ID，用于定位某个请求，推荐使用UUID
     * @return clientRequestId
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    

    public CreateStackRequest withBody(CreateStackRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateStackRequest withBody(Consumer<CreateStackRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateStackRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateStackRequestBody getBody() {
        return body;
    }

    public void setBody(CreateStackRequestBody body) {
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
        CreateStackRequest createStackRequest = (CreateStackRequest) o;
        return Objects.equals(this.clientRequestId, createStackRequest.clientRequestId) &&
            Objects.equals(this.body, createStackRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStackRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
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

