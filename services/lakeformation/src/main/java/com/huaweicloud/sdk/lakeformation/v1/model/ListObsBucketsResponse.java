package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListObsBucketsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buckets")

    private List<BucketDetail> buckets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListObsBucketsResponse withBuckets(List<BucketDetail> buckets) {
        this.buckets = buckets;
        return this;
    }

    public ListObsBucketsResponse addBucketsItem(BucketDetail bucketsItem) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        this.buckets.add(bucketsItem);
        return this;
    }

    public ListObsBucketsResponse withBuckets(Consumer<List<BucketDetail>> bucketsSetter) {
        if (this.buckets == null) {
            this.buckets = new ArrayList<>();
        }
        bucketsSetter.accept(this.buckets);
        return this;
    }

    /**
     * obs桶列表
     * @return buckets
     */
    public List<BucketDetail> getBuckets() {
        return buckets;
    }

    public void setBuckets(List<BucketDetail> buckets) {
        this.buckets = buckets;
    }

    public ListObsBucketsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * obs桶总数
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListObsBucketsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListObsBucketsResponse listObsBucketsResponse = (ListObsBucketsResponse) o;
        return Objects.equals(this.buckets, listObsBucketsResponse.buckets)
            && Objects.equals(this.total, listObsBucketsResponse.total)
            && Objects.equals(this.xRequestId, listObsBucketsResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buckets, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObsBucketsResponse {\n");
        sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
