package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateReinstallCmdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_node_id")

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_tpm")

    private Boolean enableTpm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateReinstallCmdRequestBody body;

    public CreateReinstallCmdRequest withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    public CreateReinstallCmdRequest withEnableTpm(Boolean enableTpm) {
        this.enableTpm = enableTpm;
        return this;
    }

    /**
     * 是否启用TPM
     * @return enableTpm
     */
    public Boolean getEnableTpm() {
        return enableTpm;
    }

    public void setEnableTpm(Boolean enableTpm) {
        this.enableTpm = enableTpm;
    }

    public CreateReinstallCmdRequest withBody(CreateReinstallCmdRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateReinstallCmdRequest withBody(Consumer<CreateReinstallCmdRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateReinstallCmdRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateReinstallCmdRequestBody getBody() {
        return body;
    }

    public void setBody(CreateReinstallCmdRequestBody body) {
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
        CreateReinstallCmdRequest that = (CreateReinstallCmdRequest) obj;
        return Objects.equals(this.edgeNodeId, that.edgeNodeId) && Objects.equals(this.enableTpm, that.enableTpm)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, enableTpm, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReinstallCmdRequest {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    enableTpm: ").append(toIndentedString(enableTpm)).append("\n");
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
