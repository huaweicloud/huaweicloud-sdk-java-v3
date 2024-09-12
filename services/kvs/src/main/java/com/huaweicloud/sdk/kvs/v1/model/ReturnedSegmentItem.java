package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * 采样段的起始终止主键对。
 */
public class ReturnedSegmentItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment_min_key")
    @BsonProperty(value = "segment_min_key")

    private Document segmentMinKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment_max_key")
    @BsonProperty(value = "segment_max_key")

    private Document segmentMaxKey;

    public ReturnedSegmentItem withSegmentMinKey(Document segmentMinKey) {
        this.segmentMinKey = segmentMinKey;
        return this;
    }

    /**
     * 采样段区间起始值。
     * @return segmentMinKey
     */
    public Document getSegmentMinKey() {
        return segmentMinKey;
    }

    public void setSegmentMinKey(Document segmentMinKey) {
        this.segmentMinKey = segmentMinKey;
    }

    public ReturnedSegmentItem withSegmentMaxKey(Document segmentMaxKey) {
        this.segmentMaxKey = segmentMaxKey;
        return this;
    }

    /**
     * 采样段区间终止值。
     * @return segmentMaxKey
     */
    public Document getSegmentMaxKey() {
        return segmentMaxKey;
    }

    public void setSegmentMaxKey(Document segmentMaxKey) {
        this.segmentMaxKey = segmentMaxKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReturnedSegmentItem that = (ReturnedSegmentItem) obj;
        return Objects.equals(this.segmentMinKey, that.segmentMinKey)
            && Objects.equals(this.segmentMaxKey, that.segmentMaxKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segmentMinKey, segmentMaxKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReturnedSegmentItem {\n");
        sb.append("    segmentMinKey: ").append(toIndentedString(segmentMinKey)).append("\n");
        sb.append("    segmentMaxKey: ").append(toIndentedString(segmentMaxKey)).append("\n");
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
