package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 创建快照对象。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class CreateSnapshotRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private Snapshot snapshot;

    public CreateSnapshotRequestBody withSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    public CreateSnapshotRequestBody withSnapshot(Consumer<Snapshot> snapshotSetter) {
        if (this.snapshot == null) {
            this.snapshot = new Snapshot();
            snapshotSetter.accept(this.snapshot);
        }

        return this;
    }

    /**
     * Get snapshot
     * @return snapshot
     */
    public Snapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(Snapshot snapshot) {
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
        CreateSnapshotRequestBody that = (CreateSnapshotRequestBody) obj;
        return Objects.equals(this.snapshot, that.snapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotRequestBody {\n");
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
