package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PersistentVolumeClaim {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PersistentVolumeClaimMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private PersistentVolumeClaimSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private PersistentVolumeClaimStatus status;

    public PersistentVolumeClaim withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /** API版本，固定值**v1**
     * 
     * @return apiVersion */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public PersistentVolumeClaim withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** API类型，固定值**PersistentVolumeClaim**
     * 
     * @return kind */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public PersistentVolumeClaim withMetadata(PersistentVolumeClaimMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public PersistentVolumeClaim withMetadata(Consumer<PersistentVolumeClaimMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PersistentVolumeClaimMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /** Get metadata
     * 
     * @return metadata */
    public PersistentVolumeClaimMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PersistentVolumeClaimMetadata metadata) {
        this.metadata = metadata;
    }

    public PersistentVolumeClaim withSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    public PersistentVolumeClaim withSpec(Consumer<PersistentVolumeClaimSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new PersistentVolumeClaimSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /** Get spec
     * 
     * @return spec */
    public PersistentVolumeClaimSpec getSpec() {
        return spec;
    }

    public void setSpec(PersistentVolumeClaimSpec spec) {
        this.spec = spec;
    }

    public PersistentVolumeClaim withStatus(PersistentVolumeClaimStatus status) {
        this.status = status;
        return this;
    }

    public PersistentVolumeClaim withStatus(Consumer<PersistentVolumeClaimStatus> statusSetter) {
        if (this.status == null) {
            this.status = new PersistentVolumeClaimStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /** Get status
     * 
     * @return status */
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
        PersistentVolumeClaim persistentVolumeClaim = (PersistentVolumeClaim) o;
        return Objects.equals(this.apiVersion, persistentVolumeClaim.apiVersion)
            && Objects.equals(this.kind, persistentVolumeClaim.kind)
            && Objects.equals(this.metadata, persistentVolumeClaim.metadata)
            && Objects.equals(this.spec, persistentVolumeClaim.spec)
            && Objects.equals(this.status, persistentVolumeClaim.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistentVolumeClaim {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
