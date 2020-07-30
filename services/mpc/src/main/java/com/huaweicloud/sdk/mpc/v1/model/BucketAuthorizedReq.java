package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BucketAuthorizedReq
 */
public class BucketAuthorizedReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket")
    
    private String bucket;
    /**
     * 操作标记，取值[0,1]，0表示取消授权，1表示授权 
     */
    public static class OperationEnum {

        
        /**
         * Enum _0 for value: "0"
         */
        public static final OperationEnum _0 = new OperationEnum("0");
        
        /**
         * Enum _1 for value: "1"
         */
        public static final OperationEnum _1 = new OperationEnum("1");
        

        public static final Map<String, OperationEnum> staticFields = new HashMap<String, OperationEnum>() {
            { 
                put("0", _0);
                put("1", _1);
            }
        };

        private String value;

        OperationEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OperationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OperationEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OperationEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OperationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OperationEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OperationEnum) {
                return this.value.equals(((OperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation")
    
    private OperationEnum operation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;

    public BucketAuthorizedReq withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    


    /**
     * 桶名 
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public BucketAuthorizedReq withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    


    /**
     * 操作标记，取值[0,1]，0表示取消授权，1表示授权 
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public BucketAuthorizedReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户Id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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
            Objects.equals(this.operation, bucketAuthorizedReq.operation) &&
            Objects.equals(this.projectId, bucketAuthorizedReq.projectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucket, operation, projectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BucketAuthorizedReq {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

