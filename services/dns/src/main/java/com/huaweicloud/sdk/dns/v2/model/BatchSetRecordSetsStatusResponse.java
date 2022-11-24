package com.huaweicloud.sdk.dns.v2.model;

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
public class BatchSetRecordSetsStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordsets")

    private List<RecordsetData> recordsets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metedata metadata;

    public BatchSetRecordSetsStatusResponse withRecordsets(List<RecordsetData> recordsets) {
        this.recordsets = recordsets;
        return this;
    }

    public BatchSetRecordSetsStatusResponse addRecordsetsItem(RecordsetData recordsetsItem) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        this.recordsets.add(recordsetsItem);
        return this;
    }

    public BatchSetRecordSetsStatusResponse withRecordsets(Consumer<List<RecordsetData>> recordsetsSetter) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        recordsetsSetter.accept(this.recordsets);
        return this;
    }

    /**
     * 待删除zone类型，当前仅支持 public 或 private
     * @return recordsets
     */
    public List<RecordsetData> getRecordsets() {
        return recordsets;
    }

    public void setRecordsets(List<RecordsetData> recordsets) {
        this.recordsets = recordsets;
    }

    public BatchSetRecordSetsStatusResponse withMetadata(Metedata metadata) {
        this.metadata = metadata;
        return this;
    }

    public BatchSetRecordSetsStatusResponse withMetadata(Consumer<Metedata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metedata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metedata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metedata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchSetRecordSetsStatusResponse batchSetRecordSetsStatusResponse = (BatchSetRecordSetsStatusResponse) o;
        return Objects.equals(this.recordsets, batchSetRecordSetsStatusResponse.recordsets)
            && Objects.equals(this.metadata, batchSetRecordSetsStatusResponse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordsets, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetRecordSetsStatusResponse {\n");
        sb.append("    recordsets: ").append(toIndentedString(recordsets)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
