package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerTagsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateListenerTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener_id")
    
    private String listenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateListenerTagsRequestBody body;

    public CreateListenerTagsRequest withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    


    /**
     * Get listenerId
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    

    public CreateListenerTagsRequest withBody(CreateListenerTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateListenerTagsRequest withBody(Consumer<CreateListenerTagsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateListenerTagsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateListenerTagsRequestBody getBody() {
        return body;
    }

    public void setBody(CreateListenerTagsRequestBody body) {
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
        CreateListenerTagsRequest createListenerTagsRequest = (CreateListenerTagsRequest) o;
        return Objects.equals(this.listenerId, createListenerTagsRequest.listenerId) &&
            Objects.equals(this.body, createListenerTagsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(listenerId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateListenerTagsRequest {\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
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

