package com.huaweicloud.sdk.oms.v2.model;

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
public class ShowBucketObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_page")

    private Boolean nextPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<ShowBucketRecord> records = null;

    public ShowBucketObjectsResponse withNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    /**
     * 是否存在下一页
     * @return nextPage
     */
    public Boolean getNextPage() {
        return nextPage;
    }

    public void setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
    }

    public ShowBucketObjectsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 查询下一页所需要的标记（此页末尾对象名，偏移量）
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ShowBucketObjectsResponse withRecords(List<ShowBucketRecord> records) {
        this.records = records;
        return this;
    }

    public ShowBucketObjectsResponse addRecordsItem(ShowBucketRecord recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ShowBucketObjectsResponse withRecords(Consumer<List<ShowBucketRecord>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 查询桶信息返回的record
     * @return records
     */
    public List<ShowBucketRecord> getRecords() {
        return records;
    }

    public void setRecords(List<ShowBucketRecord> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBucketObjectsResponse that = (ShowBucketObjectsResponse) obj;
        return Objects.equals(this.nextPage, that.nextPage) && Objects.equals(this.nextMarker, that.nextMarker)
            && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextPage, nextMarker, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBucketObjectsResponse {\n");
        sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
