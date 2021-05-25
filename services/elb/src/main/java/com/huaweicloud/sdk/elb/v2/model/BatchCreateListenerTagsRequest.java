package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateListenerTagsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchCreateListenerTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener_id")
    
    private String listenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchCreateListenerTagsRequestBody body;

    public BatchCreateListenerTagsRequest withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    


    /**
     * 监听器ID。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    

    public BatchCreateListenerTagsRequest withBody(BatchCreateListenerTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateListenerTagsRequest withBody(Consumer<BatchCreateListenerTagsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchCreateListenerTagsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchCreateListenerTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateListenerTagsRequestBody body) {
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
        BatchCreateListenerTagsRequest batchCreateListenerTagsRequest = (BatchCreateListenerTagsRequest) o;
        return Objects.equals(this.listenerId, batchCreateListenerTagsRequest.listenerId) &&
            Objects.equals(this.body, batchCreateListenerTagsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(listenerId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateListenerTagsRequest {\n");
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

