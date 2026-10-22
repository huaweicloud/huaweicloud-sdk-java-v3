package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateSnapshotGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_group_id")

    private String snapshotGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateSnapshotGroupRequestBody body;

    public UpdateSnapshotGroupRequest withSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
        return this;
    }

    /**
     * **参数解释** 快照一致性组ID。 可通过[查询快照一致性组列表](ListSnapshotGroup.xml)接口获取快照一致性组ID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return snapshotGroupId
     */
    public String getSnapshotGroupId() {
        return snapshotGroupId;
    }

    public void setSnapshotGroupId(String snapshotGroupId) {
        this.snapshotGroupId = snapshotGroupId;
    }

    public UpdateSnapshotGroupRequest withBody(UpdateSnapshotGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateSnapshotGroupRequest withBody(Consumer<UpdateSnapshotGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateSnapshotGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateSnapshotGroupRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateSnapshotGroupRequestBody body) {
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
        UpdateSnapshotGroupRequest that = (UpdateSnapshotGroupRequest) obj;
        return Objects.equals(this.snapshotGroupId, that.snapshotGroupId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotGroupRequest {\n");
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
