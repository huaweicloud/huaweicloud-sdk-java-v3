package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Agency
 */
public class Agency {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionObj apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private AgencyKindObj kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private AgencyMetadata metadata;

    public Agency withApiVersion(ApiVersionObj apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get apiVersion
     * @return apiVersion
     */
    public ApiVersionObj getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(ApiVersionObj apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Agency withKind(AgencyKindObj kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get kind
     * @return kind
     */
    public AgencyKindObj getKind() {
        return kind;
    }

    public void setKind(AgencyKindObj kind) {
        this.kind = kind;
    }

    public Agency withMetadata(AgencyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Agency withMetadata(Consumer<AgencyMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new AgencyMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public AgencyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AgencyMetadata metadata) {
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
        Agency that = (Agency) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Agency {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
