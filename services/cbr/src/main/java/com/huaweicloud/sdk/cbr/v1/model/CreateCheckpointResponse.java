package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCheckpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint")

    private CheckpointCreate checkpoint;

    public CreateCheckpointResponse withCheckpoint(CheckpointCreate checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }

    public CreateCheckpointResponse withCheckpoint(Consumer<CheckpointCreate> checkpointSetter) {
        if (this.checkpoint == null) {
            this.checkpoint = new CheckpointCreate();
            checkpointSetter.accept(this.checkpoint);
        }

        return this;
    }

    /**
     * Get checkpoint
     * @return checkpoint
     */
    public CheckpointCreate getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(CheckpointCreate checkpoint) {
        this.checkpoint = checkpoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCheckpointResponse createCheckpointResponse = (CreateCheckpointResponse) o;
        return Objects.equals(this.checkpoint, createCheckpointResponse.checkpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCheckpointResponse {\n");
        sb.append("    checkpoint: ").append(toIndentedString(checkpoint)).append("\n");
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
