package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateRecordSetWithLineReq
 */
public class BatchUpdateRecordSetWithLineReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordsets")

    private List<BatchUpdateRecordSet> recordsets = null;

    public BatchUpdateRecordSetWithLineReq withRecordsets(List<BatchUpdateRecordSet> recordsets) {
        this.recordsets = recordsets;
        return this;
    }

    public BatchUpdateRecordSetWithLineReq addRecordsetsItem(BatchUpdateRecordSet recordsetsItem) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        this.recordsets.add(recordsetsItem);
        return this;
    }

    public BatchUpdateRecordSetWithLineReq withRecordsets(Consumer<List<BatchUpdateRecordSet>> recordsetsSetter) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        recordsetsSetter.accept(this.recordsets);
        return this;
    }

    /**
     * RecordSet 列表。
     * @return recordsets
     */
    public List<BatchUpdateRecordSet> getRecordsets() {
        return recordsets;
    }

    public void setRecordsets(List<BatchUpdateRecordSet> recordsets) {
        this.recordsets = recordsets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpdateRecordSetWithLineReq batchUpdateRecordSetWithLineReq = (BatchUpdateRecordSetWithLineReq) o;
        return Objects.equals(this.recordsets, batchUpdateRecordSetWithLineReq.recordsets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordsets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateRecordSetWithLineReq {\n");
        sb.append("    recordsets: ").append(toIndentedString(recordsets)).append("\n");
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
