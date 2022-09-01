package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCloudPersistentVolumeClaimsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    @JacksonXmlProperty(localName = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    @JacksonXmlProperty(localName = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private PersistentVolumeClaimMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    @JacksonXmlProperty(localName = "spec")

    private PersistentVolumeClaimSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private PersistentVolumeClaimStatus status;

    public CreateCloudPersistentVolumeClaimsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本，固定值**v1**
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreateCloudPersistentVolumeClaimsResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * API类型，固定值**PersistentVolumeClaim**
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CreateCloudPersistentVolumeClaimsResponse withMetadata(PersistentVolumeClaimMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateCloudPersistentVolumeClaimsResponse withMetadata(
        Consumer<PersistentVolumeClaimMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PersistentVolumeClaimMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public PersistentVolumeClaimMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PersistentVolumeClaimMetadata metadata) {
        this.metadata = metadata;
    }

    public CreateCloudPersistentVolumeClaimsResponse withSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    public CreateCloudPersistentVolumeClaimsResponse withSpec(Consumer<PersistentVolumeClaimSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new PersistentVolumeClaimSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public PersistentVolumeClaimSpec getSpec() {
        return spec;
    }

    public void setSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
    }

    public CreateCloudPersistentVolumeClaimsResponse withStatus(PersistentVolumeClaimStatus status) {
        this.status = status;
        return this;
    }

    public CreateCloudPersistentVolumeClaimsResponse withStatus(Consumer<PersistentVolumeClaimStatus> statusSetter) {
        if (this.status == null) {
            this.status = new PersistentVolumeClaimStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public PersistentVolumeClaimStatus getStatus() {
        return status;
    }

    public void setStatus(PersistentVolumeClaimStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCloudPersistentVolumeClaimsResponse createCloudPersistentVolumeClaimsResponse =
            (CreateCloudPersistentVolumeClaimsResponse) o;
        return Objects.equals(this.apiVersion, createCloudPersistentVolumeClaimsResponse.apiVersion)
            && Objects.equals(this.kind, createCloudPersistentVolumeClaimsResponse.kind)
            && Objects.equals(this.metadata, createCloudPersistentVolumeClaimsResponse.metadata)
            && Objects.equals(this.spec, createCloudPersistentVolumeClaimsResponse.spec)
            && Objects.equals(this.status, createCloudPersistentVolumeClaimsResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPersistentVolumeClaimsResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
