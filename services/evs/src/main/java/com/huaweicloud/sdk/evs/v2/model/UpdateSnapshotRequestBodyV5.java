package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateSnapshotRequestBodyV5
 */
public class UpdateSnapshotRequestBodyV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private CinderUpdateSnapshotOptionV5 snapshot;

    public UpdateSnapshotRequestBodyV5 withSnapshot(CinderUpdateSnapshotOptionV5 snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    public UpdateSnapshotRequestBodyV5 withSnapshot(Consumer<CinderUpdateSnapshotOptionV5> snapshotSetter) {
        if (this.snapshot == null) {
            this.snapshot = new CinderUpdateSnapshotOptionV5();
            snapshotSetter.accept(this.snapshot);
        }

        return this;
    }

    /**
     * Get snapshot
     * @return snapshot
     */
    public CinderUpdateSnapshotOptionV5 getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(CinderUpdateSnapshotOptionV5 snapshot) {
        this.snapshot = snapshot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSnapshotRequestBodyV5 that = (UpdateSnapshotRequestBodyV5) obj;
        return Objects.equals(this.snapshot, that.snapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotRequestBodyV5 {\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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
