package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckObsBucketsRequestBody
 */
public class CheckObsBucketsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buckets")

    private List<CheckBucketRequest> buckets = null;

    public CheckObsBucketsRequestBody withBuckets(List<CheckBucketRequest> buckets) {
        this.buckets = buckets;
        return this;
    }

    public CheckObsBucketsRequestBody addBucketsItem(CheckBucketRequest bucketsItem) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.add(bucketsItem);
        return this;
    }

    public CheckObsBucketsRequestBody withBuckets(Consumer<List<CheckBucketRequest>> bucketsSetter) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        bucketsSetter.accept(this.buckets);
        return this;
    }

    /**
     * 请求检查的OBS桶列表。
     * @return buckets
     */
    public List<CheckBucketRequest> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<CheckBucketRequest> buckets) {
        this.buckets = buckets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckObsBucketsRequestBody that = (CheckObsBucketsRequestBody) obj;
        return Objects.equals(this.buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buckets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckObsBucketsRequestBody {\n");
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
