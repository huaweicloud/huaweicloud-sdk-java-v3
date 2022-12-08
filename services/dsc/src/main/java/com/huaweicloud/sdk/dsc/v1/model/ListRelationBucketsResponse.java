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
public class ListRelationBucketsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_list")

    private List<RelationSimpleInfo> bucketList = null;

    public ListRelationBucketsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 关系信息总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRelationBucketsResponse withBucketList(List<RelationSimpleInfo> bucketList) {
        this.bucketList = bucketList;
        return this;
    }

    public ListRelationBucketsResponse addBucketListItem(RelationSimpleInfo bucketListItem) {
        if (this.bucketList == null) {
            this.bucketList = new ArrayList<>();
        }
        this.bucketList.add(bucketListItem);
        return this;
    }

    public ListRelationBucketsResponse withBucketList(Consumer<List<RelationSimpleInfo>> bucketListSetter) {
        if (this.bucketList == null) {
            this.bucketList = new ArrayList<>();
        }
        bucketListSetter.accept(this.bucketList);
        return this;
    }

    /**
     * 关系信息列表
     * @return bucketList
     */
    public List<RelationSimpleInfo> getBucketList() {
        return bucketList;
    }

    public void setBucketList(List<RelationSimpleInfo> bucketList) {
        this.bucketList = bucketList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRelationBucketsResponse listRelationBucketsResponse = (ListRelationBucketsResponse) o;
        return Objects.equals(this.total, listRelationBucketsResponse.total)
            && Objects.equals(this.bucketList, listRelationBucketsResponse.bucketList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, bucketList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelationBucketsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    bucketList: ").append(toIndentedString(bucketList)).append("\n");
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
