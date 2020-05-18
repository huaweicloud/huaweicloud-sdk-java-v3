package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.CreateSnapshotOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class CreateSnapshotRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshot")
    
    private CreateSnapshotOption snapshot = null;

    public CreateSnapshotRequestBody withSnapshot(CreateSnapshotOption snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    public CreateSnapshotRequestBody withSnapshot(Consumer<CreateSnapshotOption> snapshotSetter) {
        if(this.snapshot == null ){
            this.snapshot = new CreateSnapshotOption();
        }
        snapshotSetter.accept(this.snapshot);
        return this;
    }


    /**
     * Get snapshot
     * @return snapshot
     */
    public CreateSnapshotOption getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(CreateSnapshotOption snapshot) {
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
        CreateSnapshotRequestBody createSnapshotRequestBody = (CreateSnapshotRequestBody) o;
        return Objects.equals(this.snapshot, createSnapshotRequestBody.snapshot);
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

