package com.huaweicloud.sdk.dsc.v1.model;

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
public class ListBucketsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buckets")

    private List<Bucket> buckets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListBucketsResponse withBuckets(List<Bucket> buckets) {
        this.buckets = buckets;
        return this;
    }

    public ListBucketsResponse addBucketsItem(Bucket bucketsItem) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.add(bucketsItem);
        return this;
    }

    public ListBucketsResponse withBuckets(Consumer<List<Bucket>> bucketsSetter) {
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
    public List<Bucket> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<Bucket> buckets) {
        this.buckets = buckets;
    }

    public ListBucketsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * OBS桶总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBucketsResponse listBucketsResponse = (ListBucketsResponse) o;
        return Objects.equals(this.buckets, listBucketsResponse.buckets)
            && Objects.equals(this.total, listBucketsResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buckets, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBucketsResponse {\n");
        sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
