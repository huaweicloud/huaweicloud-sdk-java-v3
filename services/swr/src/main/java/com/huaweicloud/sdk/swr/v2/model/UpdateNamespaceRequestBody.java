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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNamespaceRequestBody that = (UpdateNamespaceRequestBody) obj;
        return Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNamespaceRequestBody {\n");
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
