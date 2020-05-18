package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.RollbackInfo;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class RollbackSnapshotResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rollback")
    
    private RollbackInfo rollback = null;

    public RollbackSnapshotResponse withRollback(RollbackInfo rollback) {
        this.rollback = rollback;
        return this;
    }

    public RollbackSnapshotResponse withRollback(Consumer<RollbackInfo> rollbackSetter) {
        if(this.rollback == null ){
            this.rollback = new RollbackInfo();
        }
        rollbackSetter.accept(this.rollback);
        return this;
    }


    /**
     * Get rollback
     * @return rollback
     */
    public RollbackInfo getRollback() {
        return rollback;
    }

    public void setRollback(RollbackInfo rollback) {
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
        RollbackSnapshotResponse rollbackSnapshotResponse = (RollbackSnapshotResponse) o;
        return Objects.equals(this.rollback, rollbackSnapshotResponse.rollback);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rollback);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollbackSnapshotResponse {\n");
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

