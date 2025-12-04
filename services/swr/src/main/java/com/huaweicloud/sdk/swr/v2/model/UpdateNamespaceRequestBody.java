package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateNamespaceRequestBody
 */
public class UpdateNamespaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NamespaceMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_allowlist")

    private UpdateCVEAllowlistRequest cveAllowlist;

    public UpdateNamespaceRequestBody withMetadata(NamespaceMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpdateNamespaceRequestBody withMetadata(Consumer<NamespaceMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NamespaceMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NamespaceMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(NamespaceMetadata metadata) {
        this.metadata = metadata;
    }

    public UpdateNamespaceRequestBody withCveAllowlist(UpdateCVEAllowlistRequest cveAllowlist) {
        this.cveAllowlist = cveAllowlist;
        return this;
    }

    public UpdateNamespaceRequestBody withCveAllowlist(Consumer<UpdateCVEAllowlistRequest> cveAllowlistSetter) {
        if (this.cveAllowlist == null) {
            this.cveAllowlist = new UpdateCVEAllowlistRequest();
            cveAllowlistSetter.accept(this.cveAllowlist);
        }

        return this;
    }

    /**
     * Get cveAllowlist
     * @return cveAllowlist
     */
    public UpdateCVEAllowlistRequest getCveAllowlist() {
        return cveAllowlist;
    }

    public void setCveAllowlist(UpdateCVEAllowlistRequest cveAllowlist) {
        this.cveAllowlist = cveAllowlist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNamespaceRequestBody that = (UpdateNamespaceRequestBody) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.cveAllowlist, that.cveAllowlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, cveAllowlist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNamespaceRequestBody {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    cveAllowlist: ").append(toIndentedString(cveAllowlist)).append("\n");
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
