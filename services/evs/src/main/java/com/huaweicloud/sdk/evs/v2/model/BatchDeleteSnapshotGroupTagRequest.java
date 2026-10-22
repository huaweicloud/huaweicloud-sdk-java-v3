package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteSnapshotGroupTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_group_id")

    private String snapshotGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteResourceTagsRequestBody body;

    public BatchDeleteSnapshotGroupTagRequest withSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
        return this;
    }

    /**
     * **参数解释** 快照组ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return snapshotGroupId
     */
    public String getSnapshotGroupId() {
        return snapshotGroupId;
    }

    public void setSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
    }

    public BatchDeleteSnapshotGroupTagRequest withBody(BatchDeleteResourceTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteSnapshotGroupTagRequest withBody(Consumer<BatchDeleteResourceTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteResourceTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteResourceTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchDeleteResourceTagsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteSnapshotGroupTagRequest that = (BatchDeleteSnapshotGroupTagRequest) obj;
        return Objects.equals(this.snapshotGroupId, that.snapshotGroupId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteSnapshotGroupTagRequest {\n");
        sb.append("    snapshotGroupId: ").append(toIndentedString(snapshotGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
