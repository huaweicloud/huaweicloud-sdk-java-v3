package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BucketsRequest
 */
public class BucketsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buckets")

    private List<BucketBean> buckets = null;

    public BucketsRequest withBuckets(List<BucketBean> buckets) {
        this.buckets = buckets;
        return this;
    }

    public BucketsRequest addBucketsItem(BucketBean bucketsItem) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.add(bucketsItem);
        return this;
    }

    public BucketsRequest withBuckets(Consumer<List<BucketBean>> bucketsSetter) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        bucketsSetter.accept(this.buckets);
        return this;
    }

    /**
     * OBS桶列表
     * @return buckets
     */
    public List<BucketBean> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<BucketBean> buckets) {
        this.buckets = buckets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BucketsRequest bucketsRequest = (BucketsRequest) o;
        return Objects.equals(this.buckets, bucketsRequest.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buckets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BucketsRequest {\n");
        sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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
