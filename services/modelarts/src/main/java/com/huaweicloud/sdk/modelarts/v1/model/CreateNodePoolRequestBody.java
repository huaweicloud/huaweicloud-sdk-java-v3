package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建资源池请求体。
 */
public class CreateNodePoolRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private CreateNodePoolMetaVO metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NodePoolSpec spec;

    public CreateNodePoolRequestBody withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**：API版本。 **取值范围**：可选值如下： - v2
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreateNodePoolRequestBody withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：节点池类型。 **取值范围**：可选值如下： -  NodePool：节点池
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CreateNodePoolRequestBody withMetadata(CreateNodePoolMetaVO metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateNodePoolRequestBody withMetadata(Consumer<CreateNodePoolMetaVO> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new CreateNodePoolMetaVO();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public CreateNodePoolMetaVO getMetadata() {
        return metadata;
    }

    public void setMetadata(CreateNodePoolMetaVO metadata) {
        this.metadata = metadata;
    }

    public CreateNodePoolRequestBody withSpec(NodePoolSpec spec) {
        this.spec = spec;
        return this;
    }

    public CreateNodePoolRequestBody withSpec(Consumer<NodePoolSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new NodePoolSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public NodePoolSpec getSpec() {
        return spec;
    }

    public void setSpec(NodePoolSpec spec) {
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
        CreateNodePoolRequestBody that = (CreateNodePoolRequestBody) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNodePoolRequestBody {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
