package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpgradeClusterRequestBody
 */
public class UpgradeClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private UpgradeClusterRequestMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private UpgradeSpec spec;

    public UpgradeClusterRequestBody withMetadata(UpgradeClusterRequestMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpgradeClusterRequestBody withMetadata(Consumer<UpgradeClusterRequestMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new UpgradeClusterRequestMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public UpgradeClusterRequestMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(UpgradeClusterRequestMetadata metadata) {
        this.metadata = metadata;
    }

    public UpgradeClusterRequestBody withSpec(UpgradeSpec spec) {
        this.spec = spec;
        return this;
    }

    public UpgradeClusterRequestBody withSpec(Consumer<UpgradeSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new UpgradeSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public UpgradeSpec getSpec() {
        return spec;
    }

    public void setSpec(UpgradeSpec spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpgradeClusterRequestBody upgradeClusterRequestBody = (UpgradeClusterRequestBody) o;
        return Objects.equals(this.metadata, upgradeClusterRequestBody.metadata)
            && Objects.equals(this.spec, upgradeClusterRequestBody.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeClusterRequestBody {\n");
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
