package com.huaweicloud.sdk.vod.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BucketAuthorizedReq
 */
public class BucketAuthorizedReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket")
    
    private String bucket;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation")
    
    private String operation;

    public BucketAuthorizedReq withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    


    /**
     * 桶名称 ID 
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    

    public BucketAuthorizedReq withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    


    /**
     * 操作标记，0表示取消授权，1表示授权 
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BucketAuthorizedReq bucketAuthorizedReq = (BucketAuthorizedReq) o;
        return Objects.equals(this.bucket, bucketAuthorizedReq.bucket) &&
            Objects.equals(this.operation, bucketAuthorizedReq.operation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucket, operation);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BucketAuthorizedReq {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

