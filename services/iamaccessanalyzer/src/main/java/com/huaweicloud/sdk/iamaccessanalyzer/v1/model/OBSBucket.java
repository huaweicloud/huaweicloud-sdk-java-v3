package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OBSBucket
 */
public class OBSBucket {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_acl")

    private String bucketAcl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_policy")

    private String bucketPolicy;

    public OBSBucket withBucketAcl(String bucketAcl) {
        this.bucketAcl = bucketAcl;
        return this;
    }

    /**
     * 此ACL xml文件的string格式
     * @return bucketAcl
     */
    public String getBucketAcl() {
        return bucketAcl;
    }

    public void setBucketAcl(String bucketAcl) {
        this.bucketAcl = bucketAcl;
    }

    public OBSBucket withBucketPolicy(String bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
        return this;
    }

    /**
     * 此策略的json格式策略文档。
     * @return bucketPolicy
     */
    public String getBucketPolicy() {
        return bucketPolicy;
    }

    public void setBucketPolicy(String bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OBSBucket that = (OBSBucket) obj;
        return Objects.equals(this.bucketAcl, that.bucketAcl) && Objects.equals(this.bucketPolicy, that.bucketPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketAcl, bucketPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBSBucket {\n");
        sb.append("    bucketAcl: ").append(toIndentedString(bucketAcl)).append("\n");
        sb.append("    bucketPolicy: ").append(toIndentedString(bucketPolicy)).append("\n");
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
