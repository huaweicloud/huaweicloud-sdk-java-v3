package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.RollbackSnapshotOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class RollbackSnapshotRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rollback")
    
    private RollbackSnapshotOption rollback = null;

    public RollbackSnapshotRequestBody withRollback(RollbackSnapshotOption rollback) {
        this.rollback = rollback;
        return this;
    }

    public RollbackSnapshotRequestBody withRollback(Consumer<RollbackSnapshotOption> rollbackSetter) {
        if(this.rollback == null ){
            this.rollback = new RollbackSnapshotOption();
        }
        rollbackSetter.accept(this.rollback);
        return this;
    }


    /**
     * Get rollback
     * @return rollback
     */
    public RollbackSnapshotOption getRollback() {
        return rollback;
    }

    public void setRollback(RollbackSnapshotOption rollback) {
        this.rollback = rollback;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RollbackSnapshotRequestBody rollbackSnapshotRequestBody = (RollbackSnapshotRequestBody) o;
        return Objects.equals(this.rollback, rollbackSnapshotRequestBody.rollback);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rollback);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollbackSnapshotRequestBody {\n");
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

