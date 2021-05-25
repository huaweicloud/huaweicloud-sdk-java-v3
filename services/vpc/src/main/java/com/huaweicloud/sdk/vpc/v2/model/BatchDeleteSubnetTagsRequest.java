package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.BatchDeleteSubnetTagsRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchDeleteSubnetTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchDeleteSubnetTagsRequestBody body;

    public BatchDeleteSubnetTagsRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public BatchDeleteSubnetTagsRequest withBody(BatchDeleteSubnetTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteSubnetTagsRequest withBody(Consumer<BatchDeleteSubnetTagsRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchDeleteSubnetTagsRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchDeleteSubnetTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteSubnetTagsRequestBody body) {
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
        BatchDeleteSubnetTagsRequest batchDeleteSubnetTagsRequest = (BatchDeleteSubnetTagsRequest) o;
        return Objects.equals(this.subnetId, batchDeleteSubnetTagsRequest.subnetId) &&
            Objects.equals(this.body, batchDeleteSubnetTagsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subnetId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteSubnetTagsRequest {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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

