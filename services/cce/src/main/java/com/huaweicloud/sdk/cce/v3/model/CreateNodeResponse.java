package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    @JacksonXmlProperty(localName = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    @JacksonXmlProperty(localName = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private NodeMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    @JacksonXmlProperty(localName = "spec")

    private NodeSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private NodeStatus status;

    public CreateNodeResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * API类型，固定值“Node”，该值不可修改。  
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CreateNodeResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本，固定值“v3”，该值不可修改。  
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreateNodeResponse withMetadata(NodeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateNodeResponse withMetadata(Consumer<NodeMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NodeMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NodeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(NodeMetadata metadata) {
        this.metadata = metadata;
    }

    public CreateNodeResponse withSpec(NodeSpec spec) {
        this.spec = spec;
        return this;
    }

    public CreateNodeResponse withSpec(Consumer<NodeSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new NodeSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public NodeSpec getSpec() {
        return spec;
    }

    public void setSpec(NodeSpec spec) {
        this.spec = spec;
    }

    public CreateNodeResponse withStatus(NodeStatus status) {
        this.status = status;
        return this;
    }

    public CreateNodeResponse withStatus(Consumer<NodeStatus> statusSetter) {
        if (this.status == null) {
            this.status = new NodeStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public NodeStatus getStatus() {
        return status;
    }

    public void setStatus(NodeStatus status) {
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
        CreateNodeResponse createNodeResponse = (CreateNodeResponse) o;
        return Objects.equals(this.kind, createNodeResponse.kind)
            && Objects.equals(this.apiVersion, createNodeResponse.apiVersion)
            && Objects.equals(this.metadata, createNodeResponse.metadata)
            && Objects.equals(this.spec, createNodeResponse.spec)
            && Objects.equals(this.status, createNodeResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNodeResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
