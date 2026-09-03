package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除训练作业时的作业标识信息。
 */
public class BatchDeleteJobItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private BatchDeleteJobMetadata metadata;

    public BatchDeleteJobItem withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：训练作业类型。 **取值范围**： - job - edge_job - mrs_job - hetero_job - autosearch_job - diag_job - visualization_job - federated_pool_job
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public BatchDeleteJobItem withMetadata(BatchDeleteJobMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public BatchDeleteJobItem withMetadata(Consumer<BatchDeleteJobMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new BatchDeleteJobMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public BatchDeleteJobMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(BatchDeleteJobMetadata metadata) {
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
        BatchDeleteJobItem that = (BatchDeleteJobItem) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteJobItem {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
