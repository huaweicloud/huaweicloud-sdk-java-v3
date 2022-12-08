package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BucketBean
 */
public class BucketBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_policy")

    private String bucketPolicy;

    public BucketBean withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 资产名称
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public BucketBean withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 桶位置
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BucketBean withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public BucketBean withBucketPolicy(String bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
        return this;
    }

    /**
     * 桶策略
     * @return bucketPolicy
     */
    public String getBucketPolicy() {
        return bucketPolicy;
    }

    public void setBucketPolicy(String bucketPolicy) {
        this.bucketPolicy = bucketPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BucketBean bucketBean = (BucketBean) o;
        return Objects.equals(this.assetName, bucketBean.assetName)
            && Objects.equals(this.location, bucketBean.location)
            && Objects.equals(this.bucketName, bucketBean.bucketName)
            && Objects.equals(this.bucketPolicy, bucketBean.bucketPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetName, location, bucketName, bucketPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BucketBean {\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
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
