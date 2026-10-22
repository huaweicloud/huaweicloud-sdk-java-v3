package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSnapshotGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_group_id")

    private String snapshotGroupId;

    public DeleteSnapshotGroupRequest withSnapshotGroupId(String snapshotGroupId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteSnapshotGroupRequest that = (DeleteSnapshotGroupRequest) obj;
        return Objects.equals(this.snapshotGroupId, that.snapshotGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSnapshotGroupRequest {\n");
        sb.append("    snapshotGroupId: ").append(toIndentedString(snapshotGroupId)).append("\n");
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
