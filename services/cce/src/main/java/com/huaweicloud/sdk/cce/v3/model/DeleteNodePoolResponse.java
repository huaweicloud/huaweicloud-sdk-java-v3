package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class DeleteNodePoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NodePoolMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NodePoolSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private NodePoolStatus status;

    public DeleteNodePoolResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** API类型，固定值“NodePool”。
     * 
     * @return kind */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DeleteNodePoolResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /** API版本，固定值“v3”。
     * 
     * @return apiVersion */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public DeleteNodePoolResponse withMetadata(NodePoolMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public DeleteNodePoolResponse withMetadata(Consumer<NodePoolMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NodePoolMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /** Get metadata
     * 
     * @return metadata */
    public NodePoolMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(NodePoolMetadata metadata) {
        this.metadata = metadata;
    }

    public DeleteNodePoolResponse withSpec(NodePoolSpec spec) {
        this.spec = spec;
        return this;
    }

    public DeleteNodePoolResponse withSpec(Consumer<NodePoolSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new NodePoolSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /** Get spec
     * 
     * @return spec */
    public NodePoolSpec getSpec() {
        return spec;
    }

    public void setSpec(NodePoolSpec spec) {
        this.spec = spec;
    }

    public DeleteNodePoolResponse withStatus(NodePoolStatus status) {
        this.status = status;
        return this;
    }

    public DeleteNodePoolResponse withStatus(Consumer<NodePoolStatus> statusSetter) {
        if (this.status == null) {
            this.status = new NodePoolStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /** Get status
     * 
     * @return status */
    public NodePoolStatus getStatus() {
        return status;
    }

    public void setStatus(NodePoolStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteNodePoolResponse deleteNodePoolResponse = (DeleteNodePoolResponse) o;
        return Objects.equals(this.kind, deleteNodePoolResponse.kind)
            && Objects.equals(this.apiVersion, deleteNodePoolResponse.apiVersion)
            && Objects.equals(this.metadata, deleteNodePoolResponse.metadata)
            && Objects.equals(this.spec, deleteNodePoolResponse.spec)
            && Objects.equals(this.status, deleteNodePoolResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNodePoolResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
