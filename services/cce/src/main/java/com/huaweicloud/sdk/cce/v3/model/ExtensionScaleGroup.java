package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点池扩展伸缩组配置
 */
public class ExtensionScaleGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ExtensionScaleGroupMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ExtensionScaleGroupSpec spec;

    public ExtensionScaleGroup withMetadata(ExtensionScaleGroupMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ExtensionScaleGroup withMetadata(Consumer<ExtensionScaleGroupMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ExtensionScaleGroupMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ExtensionScaleGroupMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ExtensionScaleGroupMetadata metadata) {
        this.metadata = metadata;
    }

    public ExtensionScaleGroup withSpec(ExtensionScaleGroupSpec spec) {
        this.spec = spec;
        return this;
    }

    public ExtensionScaleGroup withSpec(Consumer<ExtensionScaleGroupSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ExtensionScaleGroupSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ExtensionScaleGroupSpec getSpec() {
        return spec;
    }

    public void setSpec(ExtensionScaleGroupSpec spec) {
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
        ExtensionScaleGroup that = (ExtensionScaleGroup) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionScaleGroup {\n");
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
