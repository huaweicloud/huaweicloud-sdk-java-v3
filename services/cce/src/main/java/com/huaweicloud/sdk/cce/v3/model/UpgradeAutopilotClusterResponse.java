package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpgradeAutopilotClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private UpgradeCluserResponseMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private UpgradeResponseSpec spec;

    public UpgradeAutopilotClusterResponse withMetadata(UpgradeCluserResponseMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpgradeAutopilotClusterResponse withMetadata(Consumer<UpgradeCluserResponseMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new UpgradeCluserResponseMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public UpgradeCluserResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(UpgradeCluserResponseMetadata metadata) {
        this.metadata = metadata;
    }

    public UpgradeAutopilotClusterResponse withSpec(UpgradeResponseSpec spec) {
        this.spec = spec;
        return this;
    }

    public UpgradeAutopilotClusterResponse withSpec(Consumer<UpgradeResponseSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new UpgradeResponseSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public UpgradeResponseSpec getSpec() {
        return spec;
    }

    public void setSpec(UpgradeResponseSpec spec) {
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
        UpgradeAutopilotClusterResponse that = (UpgradeAutopilotClusterResponse) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeAutopilotClusterResponse {\n");
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
