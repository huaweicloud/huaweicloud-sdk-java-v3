package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateCoreRuntimeEndpointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_id")

    private UUID runtimeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateCoreRuntimeEndpointRequestBody body;

    public CreateCoreRuntimeEndpointRequest withRuntimeId(UUID runtimeId) {
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

    public CreateCoreRuntimeEndpointRequest withBody(CreateCoreRuntimeEndpointRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateCoreRuntimeEndpointRequest withBody(Consumer<CreateCoreRuntimeEndpointRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateCoreRuntimeEndpointRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateCoreRuntimeEndpointRequestBody getBody() {
        return body;
    }

    public void setBody(CreateCoreRuntimeEndpointRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCoreRuntimeEndpointRequest that = (CreateCoreRuntimeEndpointRequest) obj;
        return Objects.equals(this.runtimeId, that.runtimeId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runtimeId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreRuntimeEndpointRequest {\n");
        sb.append("    runtimeId: ").append(toIndentedString(runtimeId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
