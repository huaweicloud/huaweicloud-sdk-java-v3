package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAutopilotAddonInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private AddonMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private InstanceSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AddonInstanceStatus status;

    public UpdateAutopilotAddonInstanceResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * API类型，固定值“Addon”，该值不可修改。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public UpdateAutopilotAddonInstanceResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本，固定值“v3”，该值不可修改。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public UpdateAutopilotAddonInstanceResponse withMetadata(AddonMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpdateAutopilotAddonInstanceResponse withMetadata(Consumer<AddonMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new AddonMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public AddonMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AddonMetadata metadata) {
        this.metadata = metadata;
    }

    public UpdateAutopilotAddonInstanceResponse withSpec(InstanceSpec spec) {
        this.spec = spec;
        return this;
    }

    public UpdateAutopilotAddonInstanceResponse withSpec(Consumer<InstanceSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new InstanceSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public InstanceSpec getSpec() {
        return spec;
    }

    public void setSpec(InstanceSpec spec) {
        this.spec = spec;
    }

    public UpdateAutopilotAddonInstanceResponse withStatus(AddonInstanceStatus status) {
        this.status = status;
        return this;
    }

    public UpdateAutopilotAddonInstanceResponse withStatus(Consumer<AddonInstanceStatus> statusSetter) {
        if (this.status == null) {
            this.status = new AddonInstanceStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AddonInstanceStatus getStatus() {
        return status;
    }

    public void setStatus(AddonInstanceStatus status) {
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
        UpdateAutopilotAddonInstanceResponse that = (UpdateAutopilotAddonInstanceResponse) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutopilotAddonInstanceResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
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
