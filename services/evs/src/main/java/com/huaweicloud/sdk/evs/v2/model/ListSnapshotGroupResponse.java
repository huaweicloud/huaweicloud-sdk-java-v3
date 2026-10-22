package com.huaweicloud.sdk.evs.v2.model;

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
public class ListSnapshotGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_groups")

    private List<SnapshotGroupDetail> snapshotGroups = null;

    public ListSnapshotGroupResponse withSnapshotGroups(List<SnapshotGroupDetail> snapshotGroups) {
        this.snapshotGroups = snapshotGroups;
        return this;
    }

    public ListSnapshotGroupResponse addSnapshotGroupsItem(SnapshotGroupDetail snapshotGroupsItem) {
        if (this.snapshotGroups == null) {
            this.snapshotGroups = new ArrayList<>();
        }
        this.snapshotGroups.add(snapshotGroupsItem);
        return this;
    }

    public ListSnapshotGroupResponse withSnapshotGroups(Consumer<List<SnapshotGroupDetail>> snapshotGroupsSetter) {
        if (this.snapshotGroups == null) {
            this.snapshotGroups = new ArrayList<>();
        }
        snapshotGroupsSetter.accept(this.snapshotGroups);
        return this;
    }

    /**
     * **参数解释** 快照一致性组列表信息。 **取值范围** 不涉及。
     * @return snapshotGroups
     */
    public List<SnapshotGroupDetail> getSnapshotGroups() {
        return snapshotGroups;
    }

    public void setSnapshotGroups(List<SnapshotGroupDetail> snapshotGroups) {
        this.snapshotGroups = snapshotGroups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotGroupResponse that = (ListSnapshotGroupResponse) obj;
        return Objects.equals(this.snapshotGroups, that.snapshotGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotGroupResponse {\n");
        sb.append("    snapshotGroups: ").append(toIndentedString(snapshotGroups)).append("\n");
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
