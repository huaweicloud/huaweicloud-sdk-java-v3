package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class UpdateBucketAuthorizedReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    public UpdateBucketAuthorizedReq withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /** OBS桶名称。
     * 
     * @return bucket */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public UpdateBucketAuthorizedReq withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /** 是否进行桶授权。 取值如下： - 0：取消授权。 - 1：授权。
     * 
     * @return operation */
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
        UpdateBucketAuthorizedReq updateBucketAuthorizedReq = (UpdateBucketAuthorizedReq) o;
        return Objects.equals(this.bucket, updateBucketAuthorizedReq.bucket)
            && Objects.equals(this.operation, updateBucketAuthorizedReq.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, operation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBucketAuthorizedReq {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
