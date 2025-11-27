package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Kustomization
 */
public class Kustomization {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private KustomizationMetaData metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private KustomizationSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private KustomizationStatus status;

    public Kustomization withMetadata(KustomizationMetaData metadata) {
        this.metadata = metadata;
        return this;
    }

    public Kustomization withMetadata(Consumer<KustomizationMetaData> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new KustomizationMetaData();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public KustomizationMetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(KustomizationMetaData metadata) {
        this.metadata = metadata;
    }

    public Kustomization withSpec(KustomizationSpec spec) {
        this.spec = spec;
        return this;
    }

    public Kustomization withSpec(Consumer<KustomizationSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new KustomizationSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public KustomizationSpec getSpec() {
        return spec;
    }

    public void setSpec(KustomizationSpec spec) {
        this.spec = spec;
    }

    public Kustomization withStatus(KustomizationStatus status) {
        this.status = status;
        return this;
    }

    public Kustomization withStatus(Consumer<KustomizationStatus> statusSetter) {
        if (this.status == null) {
            this.status = new KustomizationStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public KustomizationStatus getStatus() {
        return status;
    }

    public void setStatus(KustomizationStatus status) {
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
        Kustomization that = (Kustomization) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Kustomization {\n");
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
