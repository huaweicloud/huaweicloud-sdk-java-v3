package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新网络资源的请求体。
 */
public class PoolUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PoolMetadataUpdate metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private PoolSpecUpdate spec;

    public PoolUpdateRequest withMetadata(PoolMetadataUpdate metadata) {
        this.metadata = metadata;
        return this;
    }

    public PoolUpdateRequest withMetadata(Consumer<PoolMetadataUpdate> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PoolMetadataUpdate();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public PoolMetadataUpdate getMetadata() {
        return metadata;
    }

    public void setMetadata(PoolMetadataUpdate metadata) {
        this.metadata = metadata;
    }

    public PoolUpdateRequest withSpec(PoolSpecUpdate spec) {
        this.spec = spec;
        return this;
    }

    public PoolUpdateRequest withSpec(Consumer<PoolSpecUpdate> specSetter) {
        if (this.spec == null) {
            this.spec = new PoolSpecUpdate();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public PoolSpecUpdate getSpec() {
        return spec;
    }

    public void setSpec(PoolSpecUpdate spec) {
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
        PoolUpdateRequest that = (PoolUpdateRequest) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolUpdateRequest {\n");
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
