package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Buckets
 */
@JacksonXmlRootElement(localName = "Buckets")
public class Buckets {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Bucket")

    @JacksonXmlProperty(localName = "Bucket")
    private List<Bucket> bucket = null;

    public Buckets withBucket(List<Bucket> bucket) {
        this.bucket = bucket;
        return this;
    }

    public Buckets addBucketItem(Bucket bucketItem) {
        if (this.bucket == null) {
            this.bucket = new ArrayList<>();
        }
        this.bucket.add(bucketItem);
        return this;
    }

    public Buckets withBucket(Consumer<List<Bucket>> bucketSetter) {
        if (this.bucket == null) {
            this.bucket = new ArrayList<>();
        }
        bucketSetter.accept(this.bucket);
        return this;
    }

    /**
     * 用户所拥有的桶列表。 
     * @return bucket
     */
    public List<Bucket> getBucket() {
        return bucket;
    }

    public void setBucket(List<Bucket> bucket) {
        this.bucket = bucket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Buckets that = (Buckets) obj;
        return Objects.equals(this.bucket, that.bucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Buckets {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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
