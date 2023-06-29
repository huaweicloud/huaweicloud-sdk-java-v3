package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行复制请求体
 */
public class CheckpointReplicateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicate")

    private CheckpointReplicateParam replicate;

    public CheckpointReplicateReq withReplicate(CheckpointReplicateParam replicate) {
        this.replicate = replicate;
        return this;
    }

    public CheckpointReplicateReq withReplicate(Consumer<CheckpointReplicateParam> replicateSetter) {
        if (this.replicate == null) {
            this.replicate = new CheckpointReplicateParam();
            replicateSetter.accept(this.replicate);
        }

        return this;
    }

    /**
     * Get replicate
     * @return replicate
     */
    public CheckpointReplicateParam getReplicate() {
        return replicate;
    }

    public void setReplicate(CheckpointReplicateParam replicate) {
        this.replicate = replicate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckpointReplicateReq that = (CheckpointReplicateReq) obj;
        return Objects.equals(this.replicate, that.replicate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointReplicateReq {\n");
        sb.append("    replicate: ").append(toIndentedString(replicate)).append("\n");
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
