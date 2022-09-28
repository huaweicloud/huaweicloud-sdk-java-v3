package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListBucketResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buckets")

    private List<ProjectBucketRsp> buckets = null;

    public ListBucketResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 桶个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListBucketResponse withBuckets(List<ProjectBucketRsp> buckets) {
        this.buckets = buckets;
        return this;
    }

    public ListBucketResponse addBucketsItem(ProjectBucketRsp bucketsItem) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.add(bucketsItem);
        return this;
    }

    public ListBucketResponse withBuckets(Consumer<List<ProjectBucketRsp>> bucketsSetter) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        bucketsSetter.accept(this.buckets);
        return this;
    }

    /**
     * 桶列表
     * @return buckets
     */
    public List<ProjectBucketRsp> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<ProjectBucketRsp> buckets) {
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
        ListBucketResponse listBucketResponse = (ListBucketResponse) o;
        return Objects.equals(this.count, listBucketResponse.count)
            && Objects.equals(this.buckets, listBucketResponse.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, buckets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBucketResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
