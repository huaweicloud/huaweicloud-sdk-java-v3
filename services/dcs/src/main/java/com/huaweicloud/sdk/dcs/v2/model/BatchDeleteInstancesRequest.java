package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchDeleteInstancesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="all_failure")
    
    private Boolean allFailure;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchDeleteBody body = null;

    public BatchDeleteInstancesRequest withAllFailure(Boolean allFailure) {
        this.allFailure = allFailure;
        return this;
    }

    


    /**
     * Get allFailure
     * @return allFailure
     */
    public Boolean getAllFailure() {
        return allFailure;
    }

    public void setAllFailure(Boolean allFailure) {
        this.allFailure = allFailure;
    }

    public BatchDeleteInstancesRequest withBody(BatchDeleteBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteInstancesRequest withBody(Consumer<BatchDeleteBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchDeleteBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchDeleteBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteBody body) {
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
        BatchDeleteInstancesRequest batchDeleteInstancesRequest = (BatchDeleteInstancesRequest) o;
        return Objects.equals(this.allFailure, batchDeleteInstancesRequest.allFailure) &&
            Objects.equals(this.body, batchDeleteInstancesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(allFailure, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteInstancesRequest {\n");
        sb.append("    allFailure: ").append(toIndentedString(allFailure)).append("\n");
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

