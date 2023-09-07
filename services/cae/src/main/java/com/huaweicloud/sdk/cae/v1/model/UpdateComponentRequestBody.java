package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateComponentRequestBody
 */
public class UpdateComponentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionObj apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private ComponentKindObj kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private UpdateComponentRequestMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private UpdateComponentRequestSpec spec;

    public UpdateComponentRequestBody withApiVersion(ApiVersionObj apiVersion) {
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

    public UpdateComponentRequestBody withKind(ComponentKindObj kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get kind
     * @return kind
     */
    public ComponentKindObj getKind() {
        return kind;
    }

    public void setKind(ComponentKindObj kind) {
        this.kind = kind;
    }

    public UpdateComponentRequestBody withMetadata(UpdateComponentRequestMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public UpdateComponentRequestBody withMetadata(Consumer<UpdateComponentRequestMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new UpdateComponentRequestMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public UpdateComponentRequestMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(UpdateComponentRequestMetadata metadata) {
        this.metadata = metadata;
    }

    public UpdateComponentRequestBody withSpec(UpdateComponentRequestSpec spec) {
        this.spec = spec;
        return this;
    }

    public UpdateComponentRequestBody withSpec(Consumer<UpdateComponentRequestSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new UpdateComponentRequestSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public UpdateComponentRequestSpec getSpec() {
        return spec;
    }

    public void setSpec(UpdateComponentRequestSpec spec) {
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
        UpdateComponentRequestBody that = (UpdateComponentRequestBody) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateComponentRequestBody {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
