package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.BatchDeleteMqsInstanceTopicReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchDeleteMqsInstanceTopicRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchDeleteMqsInstanceTopicReq body = null;

    public BatchDeleteMqsInstanceTopicRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BatchDeleteMqsInstanceTopicRequest withBody(BatchDeleteMqsInstanceTopicReq body) {
        this.body = body;
        return this;
    }

    public BatchDeleteMqsInstanceTopicRequest withBody(Consumer<BatchDeleteMqsInstanceTopicReq> bodySetter) {
        if(this.body == null ){
            this.body = new BatchDeleteMqsInstanceTopicReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchDeleteMqsInstanceTopicReq getBody() {
        return body;
    }

    public void setBody(BatchDeleteMqsInstanceTopicReq body) {
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
        BatchDeleteMqsInstanceTopicRequest batchDeleteMqsInstanceTopicRequest = (BatchDeleteMqsInstanceTopicRequest) o;
        return Objects.equals(this.instanceId, batchDeleteMqsInstanceTopicRequest.instanceId) &&
            Objects.equals(this.body, batchDeleteMqsInstanceTopicRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteMqsInstanceTopicRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

