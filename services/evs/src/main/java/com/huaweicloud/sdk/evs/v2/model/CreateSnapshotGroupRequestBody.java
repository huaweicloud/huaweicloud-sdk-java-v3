package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建快照一致性组的请求体。
 */
public class CreateSnapshotGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_group")

    private SnapshotGroup snapshotGroup;

    public CreateSnapshotGroupRequestBody withSnapshotGroup(SnapshotGroup snapshotGroup) {
        this.snapshotGroup = snapshotGroup;
        return this;
    }

    public CreateSnapshotGroupRequestBody withSnapshotGroup(Consumer<SnapshotGroup> snapshotGroupSetter) {
        if (this.snapshotGroup == null) {
            this.snapshotGroup = new SnapshotGroup();
            snapshotGroupSetter.accept(this.snapshotGroup);
        }

        return this;
    }

    /**
     * Get snapshotGroup
     * @return snapshotGroup
     */
    public SnapshotGroup getSnapshotGroup() {
        return snapshotGroup;
    }

    public void setSnapshotGroup(SnapshotGroup snapshotGroup) {
        this.snapshotGroup = snapshotGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSnapshotGroupRequestBody that = (CreateSnapshotGroupRequestBody) obj;
        return Objects.equals(this.snapshotGroup, that.snapshotGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotGroupRequestBody {\n");
        sb.append("    snapshotGroup: ").append(toIndentedString(snapshotGroup)).append("\n");
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
