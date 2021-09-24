package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListParnterAdjustRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<AdjustRecordV3> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListParnterAdjustRecordsResponse withRecords(List<AdjustRecordV3> records) {
        this.records = records;
        return this;
    }

    public ListParnterAdjustRecordsResponse addRecordsItem(AdjustRecordV3 recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListParnterAdjustRecordsResponse withRecords(Consumer<List<AdjustRecordV3>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /** 调账记录列表。 具体请参见表2。
     * 
     * @return records */
    public List<AdjustRecordV3> getRecords() {
        return records;
    }

    public void setRecords(List<AdjustRecordV3> records) {
        this.records = records;
    }

    public ListParnterAdjustRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 返回总条数。
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListParnterAdjustRecordsResponse listParnterAdjustRecordsResponse = (ListParnterAdjustRecordsResponse) o;
        return Objects.equals(this.records, listParnterAdjustRecordsResponse.records)
            && Objects.equals(this.totalCount, listParnterAdjustRecordsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListParnterAdjustRecordsResponse {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
