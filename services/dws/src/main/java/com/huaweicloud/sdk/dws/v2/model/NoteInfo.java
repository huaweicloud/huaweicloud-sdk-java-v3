package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 重分布提示信息。 **取值范围**： 不涉及。
 */
public class NoteInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_split_info")

    private BucketSplitInfo bucketSplitInfo;

    public NoteInfo withBucketSplitInfo(BucketSplitInfo bucketSplitInfo) {
        this.bucketSplitInfo = bucketSplitInfo;
        return this;
    }

    public NoteInfo withBucketSplitInfo(Consumer<BucketSplitInfo> bucketSplitInfoSetter) {
        if (this.bucketSplitInfo == null) {
            this.bucketSplitInfo = new BucketSplitInfo();
            bucketSplitInfoSetter.accept(this.bucketSplitInfo);
        }

        return this;
    }

    /**
     * Get bucketSplitInfo
     * @return bucketSplitInfo
     */
    public BucketSplitInfo getBucketSplitInfo() {
        return bucketSplitInfo;
    }

    public void setBucketSplitInfo(BucketSplitInfo bucketSplitInfo) {
        this.bucketSplitInfo = bucketSplitInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoteInfo that = (NoteInfo) obj;
        return Objects.equals(this.bucketSplitInfo, that.bucketSplitInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucketSplitInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoteInfo {\n");
        sb.append("    bucketSplitInfo: ").append(toIndentedString(bucketSplitInfo)).append("\n");
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
