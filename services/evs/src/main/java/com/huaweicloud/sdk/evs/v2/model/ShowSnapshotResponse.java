package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.SnapshotDetails;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ShowSnapshotResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshot")
    
    private SnapshotDetails snapshot = null;

    public ShowSnapshotResponse withSnapshot(SnapshotDetails snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    public ShowSnapshotResponse withSnapshot(Consumer<SnapshotDetails> snapshotSetter) {
        if(this.snapshot == null ){
            this.snapshot = new SnapshotDetails();
        }
        snapshotSetter.accept(this.snapshot);
        return this;
    }


    /**
     * Get snapshot
     * @return snapshot
     */
    public SnapshotDetails getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(SnapshotDetails snapshot) {
        this.snapshot = snapshot;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSnapshotResponse showSnapshotResponse = (ShowSnapshotResponse) o;
        return Objects.equals(this.snapshot, showSnapshotResponse.snapshot);
    }
    @Override
    public int hashCode() {
        return Objects.hash(snapshot);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSnapshotResponse {\n");
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

