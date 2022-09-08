package com.huaweicloud.sdk.css.v1.model;

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
public class ListSnapshotsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backups")

    private List<ListSnapshotBackupsResp> backups = null;

    public ListSnapshotsResponse withBackups(List<ListSnapshotBackupsResp> backups) {
        this.backups = backups;
        return this;
    }

    public ListSnapshotsResponse addBackupsItem(ListSnapshotBackupsResp backupsItem) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backupsItem);
        return this;
    }

    public ListSnapshotsResponse withBackups(Consumer<List<ListSnapshotBackupsResp>> backupsSetter) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        backupsSetter.accept(this.backups);
        return this;
    }

    /**
     * 快照列表。
     * @return backups
     */
    public List<ListSnapshotBackupsResp> getBackups() {
        return backups;
    }

    public void setBackups(List<ListSnapshotBackupsResp> backups) {
        this.backups = backups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSnapshotsResponse listSnapshotsResponse = (ListSnapshotsResponse) o;
        return Objects.equals(this.backups, listSnapshotsResponse.backups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotsResponse {\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
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
