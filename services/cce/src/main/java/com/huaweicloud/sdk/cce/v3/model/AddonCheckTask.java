package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddonCheckTask
 */
public class AddonCheckTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private CheckTaskMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private CheckTaskSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private CheckTaskStatus status;

    public AddonCheckTask withMetadata(CheckTaskMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public AddonCheckTask withMetadata(Consumer<CheckTaskMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new CheckTaskMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public CheckTaskMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CheckTaskMetadata metadata) {
        this.metadata = metadata;
    }

    public AddonCheckTask withSpec(CheckTaskSpec spec) {
        this.spec = spec;
        return this;
    }

    public AddonCheckTask withSpec(Consumer<CheckTaskSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new CheckTaskSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public CheckTaskSpec getSpec() {
        return spec;
    }

    public void setSpec(CheckTaskSpec spec) {
        this.spec = spec;
    }

    public AddonCheckTask withStatus(CheckTaskStatus status) {
        this.status = status;
        return this;
    }

    public AddonCheckTask withStatus(Consumer<CheckTaskStatus> statusSetter) {
        if (this.status == null) {
            this.status = new CheckTaskStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public CheckTaskStatus getStatus() {
        return status;
    }

    public void setStatus(CheckTaskStatus status) {
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
        AddonCheckTask that = (AddonCheckTask) obj;
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
        sb.append("class AddonCheckTask {\n");
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
