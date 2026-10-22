package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 回滚快照请求体。
 */
public class RollbackSnapshotRequestBodyV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollback")

    private RollbackSnapshotRequestBodyNew rollback;

    public RollbackSnapshotRequestBodyV5 withRollback(RollbackSnapshotRequestBodyNew rollback) {
        this.rollback = rollback;
        return this;
    }

    public RollbackSnapshotRequestBodyV5 withRollback(Consumer<RollbackSnapshotRequestBodyNew> rollbackSetter) {
        if (this.rollback == null) {
            this.rollback = new RollbackSnapshotRequestBodyNew();
            rollbackSetter.accept(this.rollback);
        }

        return this;
    }

    /**
     * Get rollback
     * @return rollback
     */
    public RollbackSnapshotRequestBodyNew getRollback() {
        return rollback;
    }

    public void setRollback(RollbackSnapshotRequestBodyNew rollback) {
        this.rollback = rollback;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RollbackSnapshotRequestBodyV5 that = (RollbackSnapshotRequestBodyV5) obj;
        return Objects.equals(this.rollback, that.rollback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollback);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollbackSnapshotRequestBodyV5 {\n");
        sb.append("    rollback: ").append(toIndentedString(rollback)).append("\n");
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
