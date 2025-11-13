package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateRecordSetsTaskRequestBody
 */
public class BatchCreateRecordSetsTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordsets")

    private List<BatchCreateRecordSetsTaskItem> recordsets = null;

    public BatchCreateRecordSetsTaskRequestBody withRecordsets(List<BatchCreateRecordSetsTaskItem> recordsets) {
        this.recordsets = recordsets;
        return this;
    }

    public BatchCreateRecordSetsTaskRequestBody addRecordsetsItem(BatchCreateRecordSetsTaskItem recordsetsItem) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        this.recordsets.add(recordsetsItem);
        return this;
    }

    public BatchCreateRecordSetsTaskRequestBody withRecordsets(
        Consumer<List<BatchCreateRecordSetsTaskItem>> recordsetsSetter) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        recordsetsSetter.accept(this.recordsets);
        return this;
    }

    /**
     * 批量创建记录集列表。
     * @return recordsets
     */
    public List<BatchCreateRecordSetsTaskItem> getRecordsets() {
        return recordsets;
    }

    public void setRecordsets(List<BatchCreateRecordSetsTaskItem> recordsets) {
        this.recordsets = recordsets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateRecordSetsTaskRequestBody that = (BatchCreateRecordSetsTaskRequestBody) obj;
        return Objects.equals(this.recordsets, that.recordsets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordsets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateRecordSetsTaskRequestBody {\n");
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
