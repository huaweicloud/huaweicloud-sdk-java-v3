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
public class BatchDeleteRecordSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordsets")

    private List<RecordsetData> recordsets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    public BatchDeleteRecordSetsResponse withRecordsets(List<RecordsetData> recordsets) {
        this.recordsets = recordsets;
        return this;
    }

    public BatchDeleteRecordSetsResponse addRecordsetsItem(RecordsetData recordsetsItem) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        this.recordsets.add(recordsetsItem);
        return this;
    }

    public BatchDeleteRecordSetsResponse withRecordsets(Consumer<List<RecordsetData>> recordsetsSetter) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        recordsetsSetter.accept(this.recordsets);
        return this;
    }

    /**
     * **参数解释：** 记录集列表信息。 **取值范围：** 不涉及。
     * @return recordsets
     */
    public List<RecordsetData> getRecordsets() {
        return recordsets;
    }

    public void setRecordsets(List<RecordsetData> recordsets) {
        this.recordsets = recordsets;
    }

    public BatchDeleteRecordSetsResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public BatchDeleteRecordSetsResponse withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteRecordSetsResponse that = (BatchDeleteRecordSetsResponse) obj;
        return Objects.equals(this.recordsets, that.recordsets) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordsets, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteRecordSetsResponse {\n");
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
