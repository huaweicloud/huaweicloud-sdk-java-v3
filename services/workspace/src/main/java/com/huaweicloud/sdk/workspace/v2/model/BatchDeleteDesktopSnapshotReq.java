package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除快照请求体。
 */
public class BatchDeleteDesktopSnapshotReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_ids")

    private List<String> snapshotIds = null;

    public BatchDeleteDesktopSnapshotReq withSnapshotIds(List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }

    public BatchDeleteDesktopSnapshotReq addSnapshotIdsItem(String snapshotIdsItem) {
        if (this.snapshotIds == null) {
            this.snapshotIds = new ArrayList<>();
        }
        this.snapshotIds.add(snapshotIdsItem);
        return this;
    }

    public BatchDeleteDesktopSnapshotReq withSnapshotIds(Consumer<List<String>> snapshotIdsSetter) {
        if (this.snapshotIds == null) {
            this.snapshotIds = new ArrayList<>();
        }
        snapshotIdsSetter.accept(this.snapshotIds);
        return this;
    }

    /**
     * 快照id数组，最多支持100。
     * @return snapshotIds
     */
    public List<String> getSnapshotIds() {
        return snapshotIds;
    }

    public void setSnapshotIds(List<String> snapshotIds) {
        this.snapshotIds = snapshotIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteDesktopSnapshotReq that = (BatchDeleteDesktopSnapshotReq) obj;
        return Objects.equals(this.snapshotIds, that.snapshotIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDesktopSnapshotReq {\n");
        sb.append("    snapshotIds: ").append(toIndentedString(snapshotIds)).append("\n");
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
