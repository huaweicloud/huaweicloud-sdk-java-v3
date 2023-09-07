package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateComponentRequestBody
 */
public class CreateComponentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionObj apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private ComponentKindObj kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private CreateComponentRequestBodyMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private CreateComponentRequestBodySpec spec;

    public CreateComponentRequestBody withApiVersion(ApiVersionObj apiVersion) {
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

    public CreateComponentRequestBody withKind(ComponentKindObj kind) {
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

    public CreateComponentRequestBody withMetadata(CreateComponentRequestBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateComponentRequestBody withMetadata(Consumer<CreateComponentRequestBodyMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new CreateComponentRequestBodyMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public CreateComponentRequestBodyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CreateComponentRequestBodyMetadata metadata) {
        this.metadata = metadata;
    }

    public CreateComponentRequestBody withSpec(CreateComponentRequestBodySpec spec) {
        this.spec = spec;
        return this;
    }

    public CreateComponentRequestBody withSpec(Consumer<CreateComponentRequestBodySpec> specSetter) {
        if (this.spec == null) {
            this.spec = new CreateComponentRequestBodySpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public CreateComponentRequestBodySpec getSpec() {
        return spec;
    }

    public void setSpec(CreateComponentRequestBodySpec spec) {
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
        CreateComponentRequestBody that = (CreateComponentRequestBody) obj;
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
        sb.append("class CreateComponentRequestBody {\n");
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
