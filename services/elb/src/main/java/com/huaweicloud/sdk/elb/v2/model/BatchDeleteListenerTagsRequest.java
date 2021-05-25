package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteListenerTagsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchDeleteListenerTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener_id")
    
    private String listenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchDeleteListenerTagsRequestBody body;

    public BatchDeleteListenerTagsRequest withListenerId(String listenerId) {
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

    

    public BatchDeleteListenerTagsRequest withBody(BatchDeleteListenerTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteListenerTagsRequest withBody(Consumer<BatchDeleteListenerTagsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchDeleteListenerTagsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchDeleteListenerTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteListenerTagsRequestBody body) {
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
        BatchDeleteListenerTagsRequest batchDeleteListenerTagsRequest = (BatchDeleteListenerTagsRequest) o;
        return Objects.equals(this.listenerId, batchDeleteListenerTagsRequest.listenerId) &&
            Objects.equals(this.body, batchDeleteListenerTagsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(listenerId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteListenerTagsRequest {\n");
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

