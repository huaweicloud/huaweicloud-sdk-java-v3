package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CertItem
 */
public class CertItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private MetaCert metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecCert spec;

    public CertItem withMetadata(MetaCert metadata) {
        this.metadata = metadata;
        return this;
    }

    public CertItem withMetadata(Consumer<MetaCert> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new MetaCert();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public MetaCert getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaCert metadata) {
        this.metadata = metadata;
    }

    public CertItem withSpec(SpecCert spec) {
        this.spec = spec;
        return this;
    }

    public CertItem withSpec(Consumer<SpecCert> specSetter) {
        if (this.spec == null) {
            this.spec = new SpecCert();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public SpecCert getSpec() {
        return spec;
    }

    public void setSpec(SpecCert spec) {
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
        CertItem that = (CertItem) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertItem {\n");
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
