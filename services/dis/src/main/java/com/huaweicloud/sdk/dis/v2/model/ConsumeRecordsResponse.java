package com.huaweicloud.sdk.dis.v2.model;

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
public class ConsumeRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<Record> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_partition_cursor")

    private String nextPartitionCursor;

    public ConsumeRecordsResponse withRecords(List<Record> records) {
        this.records = records;
        return this;
    }

    public ConsumeRecordsResponse addRecordsItem(Record recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ConsumeRecordsResponse withRecords(Consumer<List<Record>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 下载的记录列表。
     * @return records
     */
    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public ConsumeRecordsResponse withNextPartitionCursor(String nextPartitionCursor) {
        this.nextPartitionCursor = nextPartitionCursor;
        return this;
    }

    /**
     * 下一个迭代器。  说明：  数据游标有效期为5分钟。
     * @return nextPartitionCursor
     */
    public String getNextPartitionCursor() {
        return nextPartitionCursor;
    }

    public void setNextPartitionCursor(String nextPartitionCursor) {
        this.nextPartitionCursor = nextPartitionCursor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumeRecordsResponse that = (ConsumeRecordsResponse) obj;
        return Objects.equals(this.records, that.records)
            && Objects.equals(this.nextPartitionCursor, that.nextPartitionCursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, nextPartitionCursor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumeRecordsResponse {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    nextPartitionCursor: ").append(toIndentedString(nextPartitionCursor)).append("\n");
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
