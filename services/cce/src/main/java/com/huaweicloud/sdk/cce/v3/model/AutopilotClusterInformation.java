package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AutopilotClusterInformation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private AutopilotClusterInformationSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private AutopilotClusterMetadataForUpdate metadata;

    public AutopilotClusterInformation withSpec(AutopilotClusterInformationSpec spec) {
        this.spec = spec;
        return this;
    }

    public AutopilotClusterInformation withSpec(Consumer<AutopilotClusterInformationSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new AutopilotClusterInformationSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public AutopilotClusterInformationSpec getSpec() {
        return spec;
    }

    public void setSpec(AutopilotClusterInformationSpec spec) {
        this.spec = spec;
    }

    public AutopilotClusterInformation withMetadata(AutopilotClusterMetadataForUpdate metadata) {
        this.metadata = metadata;
        return this;
    }

    public AutopilotClusterInformation withMetadata(Consumer<AutopilotClusterMetadataForUpdate> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new AutopilotClusterMetadataForUpdate();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public AutopilotClusterMetadataForUpdate getMetadata() {
        return metadata;
    }

    public void setMetadata(AutopilotClusterMetadataForUpdate metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutopilotClusterInformation that = (AutopilotClusterInformation) obj;
        return Objects.equals(this.spec, that.spec) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutopilotClusterInformation {\n");
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
