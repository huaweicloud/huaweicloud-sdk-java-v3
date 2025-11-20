package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 超节点
 */
public class HyperNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private HyperNodeMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private HyperNodeSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private HyperNodeStatus status;

    public HyperNode withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * v3
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public HyperNode withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * HyperNode
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public HyperNode withMetadata(HyperNodeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public HyperNode withMetadata(Consumer<HyperNodeMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new HyperNodeMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public HyperNodeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(HyperNodeMetadata metadata) {
        this.metadata = metadata;
    }

    public HyperNode withSpec(HyperNodeSpec spec) {
        this.spec = spec;
        return this;
    }

    public HyperNode withSpec(Consumer<HyperNodeSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new HyperNodeSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public HyperNodeSpec getSpec() {
        return spec;
    }

    public void setSpec(HyperNodeSpec spec) {
        this.spec = spec;
    }

    public HyperNode withStatus(HyperNodeStatus status) {
        this.status = status;
        return this;
    }

    public HyperNode withStatus(Consumer<HyperNodeStatus> statusSetter) {
        if (this.status == null) {
            this.status = new HyperNodeStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public HyperNodeStatus getStatus() {
        return status;
    }

    public void setStatus(HyperNodeStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HyperNode that = (HyperNode) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HyperNode {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
