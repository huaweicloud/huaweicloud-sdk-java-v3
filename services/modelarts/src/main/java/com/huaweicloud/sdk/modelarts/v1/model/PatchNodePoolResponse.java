package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class PatchNodePoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PatchNodePoolMetaVO metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NodePoolSpec spec;

    public PatchNodePoolResponse withMetadata(PatchNodePoolMetaVO metadata) {
        this.metadata = metadata;
        return this;
    }

    public PatchNodePoolResponse withMetadata(Consumer<PatchNodePoolMetaVO> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PatchNodePoolMetaVO();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public PatchNodePoolMetaVO getMetadata() {
        return metadata;
    }

    public void setMetadata(PatchNodePoolMetaVO metadata) {
        this.metadata = metadata;
    }

    public PatchNodePoolResponse withSpec(NodePoolSpec spec) {
        this.spec = spec;
        return this;
    }

    public PatchNodePoolResponse withSpec(Consumer<NodePoolSpec> specSetter) {
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
        PatchNodePoolResponse that = (PatchNodePoolResponse) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchNodePoolResponse {\n");
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
