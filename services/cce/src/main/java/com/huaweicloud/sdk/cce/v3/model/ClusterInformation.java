package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ClusterInformation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ClusterInformationSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ClusterMetadataForUpdate metadata;

    public ClusterInformation withSpec(ClusterInformationSpec spec) {
        this.spec = spec;
        return this;
    }

    public ClusterInformation withSpec(Consumer<ClusterInformationSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ClusterInformationSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ClusterInformationSpec getSpec() {
        return spec;
    }

    public void setSpec(ClusterInformationSpec spec) {
        this.spec = spec;
    }

    public ClusterInformation withMetadata(ClusterMetadataForUpdate metadata) {
        this.metadata = metadata;
        return this;
    }

    public ClusterInformation withMetadata(Consumer<ClusterMetadataForUpdate> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ClusterMetadataForUpdate();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ClusterMetadataForUpdate getMetadata() {
        return metadata;
    }

    public void setMetadata(ClusterMetadataForUpdate metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterInformation clusterInformation = (ClusterInformation) o;
        return Objects.equals(this.spec, clusterInformation.spec)
            && Objects.equals(this.metadata, clusterInformation.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterInformation {\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
