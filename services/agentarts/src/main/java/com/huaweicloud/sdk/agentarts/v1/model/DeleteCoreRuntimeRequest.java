package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * Request Object
 */
public class DeleteCoreRuntimeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_id")

    private UUID runtimeId;

    public DeleteCoreRuntimeRequest withRuntimeId(UUID runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * 运行时ID，用于唯一标识一个Agent运行时实例。
     * @return runtimeId
     */
    public UUID getRuntimeId() {
        return runtimeId;
    }

    public void setRuntimeId(UUID runtimeId) {
        this.runtimeId = runtimeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCoreRuntimeRequest that = (DeleteCoreRuntimeRequest) obj;
        return Objects.equals(this.runtimeId, that.runtimeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCoreRuntimeRequest {\n");
        sb.append("    runtimeId: ").append(toIndentedString(runtimeId)).append("\n");
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
