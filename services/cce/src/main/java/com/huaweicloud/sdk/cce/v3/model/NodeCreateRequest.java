package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NodeCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NodeMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NodeSpec spec;

    public NodeCreateRequest withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： API类型，固定值“Node”。 **约束限制**： 不涉及 **取值范围**： 只能为固定值“Node”。 **默认取值**： 不涉及 
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public NodeCreateRequest withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： API版本，固定值“v3”。 **约束限制**： 不涉及 **取值范围**： 只能为固定值“v3”。 **默认取值**： 不涉及
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public NodeCreateRequest withMetadata(NodeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public NodeCreateRequest withMetadata(Consumer<NodeMetadata> metadataSetter) {
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

    public NodeCreateRequest withSpec(NodeSpec spec) {
        this.spec = spec;
        return this;
    }

    public NodeCreateRequest withSpec(Consumer<NodeSpec> specSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeCreateRequest that = (NodeCreateRequest) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeCreateRequest {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
