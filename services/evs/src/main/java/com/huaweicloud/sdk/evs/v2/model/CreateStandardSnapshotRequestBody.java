package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateStandardSnapshotRequestBody
 */
public class CreateStandardSnapshotRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private CreateStandardSnapshot snapshot;

    public CreateStandardSnapshotRequestBody withSnapshot(CreateStandardSnapshot snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    public CreateStandardSnapshotRequestBody withSnapshot(Consumer<CreateStandardSnapshot> snapshotSetter) {
        if (this.snapshot == null) {
            this.snapshot = new CreateStandardSnapshot();
            snapshotSetter.accept(this.snapshot);
        }

        return this;
    }

    /**
     * Get snapshot
     * @return snapshot
     */
    public CreateStandardSnapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(CreateStandardSnapshot snapshot) {
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
        CreateStandardSnapshotRequestBody that = (CreateStandardSnapshotRequestBody) obj;
        return Objects.equals(this.snapshot, that.snapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStandardSnapshotRequestBody {\n");
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
