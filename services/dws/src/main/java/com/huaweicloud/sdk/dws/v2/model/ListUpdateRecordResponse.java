package com.huaweicloud.sdk.dws.v2.model;

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
public class ListUpdateRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<ClusterUpdateRecordResp> records = null;

    public ListUpdateRecordResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 集群升级记录总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListUpdateRecordResponse withRecords(List<ClusterUpdateRecordResp> records) {
        this.records = records;
        return this;
    }

    public ListUpdateRecordResponse addRecordsItem(ClusterUpdateRecordResp recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListUpdateRecordResponse withRecords(Consumer<List<ClusterUpdateRecordResp>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 集群升级记录列表
     * @return records
     */
    public List<ClusterUpdateRecordResp> getRecords() {
        return records;
    }

    public void setRecords(List<ClusterUpdateRecordResp> records) {
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
        ListUpdateRecordResponse that = (ListUpdateRecordResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUpdateRecordResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
